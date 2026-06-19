package library.model;

//inheritance PremiumMember IS-A Member

public class PremiumMember extends Member{

    public PremiumMember(String memberId, String name) {
        super(memberId, name); // Call the parent constructor to initialize memberId and name.
    }

    @Override
    public int borrowLimit() {
        return 10; //premium members can borrow up to 10 books.

}
@Override //override is used to change the behaviour of the parent class method in the child class
    public String toString() {
        return super.toString() + " [Premium Member]";
    }


}
