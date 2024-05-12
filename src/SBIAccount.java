import java.util.UUID;
//Universily uniqye Identifier

public class SBIAccount implements BankInterface{

    private String name;
    private String accountNo;
    private int balanace;
    private String password;
    private double rateOfInterest;

    // ALT + Insert = for automatic setter and getter , constructor and many
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalanace() {
        return balanace;
    }

    public void setBalanace(int balanace) {
        this.balanace = balanace;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public SBIAccount(String name, int balanace, String password) {
        this.name = name;
        this.balanace = balanace;
        this.password = password;

        this.rateOfInterest= 6.6;
        this.accountNo= String.valueOf(UUID.randomUUID());
    }

    @Override
    public int getMoney() {
        return this.balanace;
    }

    @Override
    public String depositMoney(int amount) {
        this.balanace+=amount;
        return "DepositedMoney is "+amount;
    }

    @Override
    public String withdraw(int amount,String pass) {
        if(pass.equals(this.password))
        {
            if(balanace<amount)
            {
                return "Insufficient Amount\n ";
            }
            else{
                this.balanace-=amount;
                return "Money has Withdraw\n";
            }
        }
        else{
            return "You have entered wrong password\n";
        }
    }

    @Override
    public double calculateIntrest(int time) {
        return (balanace*rateOfInterest*time)/100.0;
    }
}
