package library.model;

import java.util.ArrayList;
import java.util.List;

// This class represents a library member. It keeps track of the member's ID, name,
public class Member {

    private final String memberId;
    private final String name;
    protected List<String> borrowedBookIsbns;
// The constructor initializes the member's ID, name, and an empty list of borrowed book ISBNs.
    public Member(String memberId, String name) {
        this.memberId          = memberId;
        this.name              = name;
        this.borrowedBookIsbns = new ArrayList<>();
    }

    // Regular members can borrow 3 books max.
    // PremiumMember will OVERRIDE this — that's polymorphism.
    public int borrowLimit() {
        return 3;
    }
// This method checks if the member has reached their borrowing limit.
    public boolean hasReachedBorrowLimit() {
        return borrowedBookIsbns.size() >= borrowLimit();
    }

    public void recordBorrow(String isbn) {
        borrowedBookIsbns.add(isbn);
    }

    public void recordReturn(String isbn) {
        borrowedBookIsbns.remove(isbn);
    }

    public boolean hasBorrowed(String isbn) {
        return borrowedBookIsbns.contains(isbn);
    }
// Getters and toString() for easy display.
    public String       getMemberId()          { return memberId; }
    public String       getName()              { return name;     }
    public List<String> getBorrowedBookIsbns() { return borrowedBookIsbns; }

    @Override
    public String toString() {
        return name + " (ID: " + memberId + ") ["
             + borrowedBookIsbns.size() + "/" + borrowLimit() + " books]";
    }
}