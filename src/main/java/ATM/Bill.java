package ATM;

public interface Bill {
    void setNext(Bill next);
    int process(int amount);
}
