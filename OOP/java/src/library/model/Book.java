package library.model;

public class Book{
     private final String isbn;
    private final String title;
    private final String author;
    private boolean available;


 public Book(String isbn, String title, String author) {
        this.isbn      = isbn;
        this.title     = title;
        this.author    = author;
        this.available = true;
    }
      public void checkOut()   { this.available = false; }
    public void returnBook() { this.available = true;  }

    public boolean isAvailable() { return available; }
    public String  getIsbn()     { return isbn;      }
    public String  getTitle()    { return title;     }
    public String  getAuthor()   { return author;    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author
             + (available ? " [Available]" : " [Checked Out]");
    }
}