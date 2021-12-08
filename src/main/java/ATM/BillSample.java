package ATM;

public class BillSample implements Bill{
    private final int denomination;
    private Bill next;

    public BillSample(int denomination){
        this.denomination = denomination;
    }

    @Override
    public void setNext(Bill bill) {
        this.next = bill;
    }

    @Override
    public int process(int amount) {
        int balance = amount % this.denomination;

        if (next != null){
            next.process(balance);
        } else if (balance > 0) {
            throw new IllegalArgumentException("Invalid amount of money");
        }
        System.out.println("Please receive " + amount / denomination + " of " + denomination + " UAH bills ");
        return amount / denomination;
    }
}
