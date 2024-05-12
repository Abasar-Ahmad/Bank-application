public interface BankInterface {
    int getMoney();
    String depositMoney(int amount);
    String withdraw(int amount, String passw);
    double calculateIntrest(int time);
}
