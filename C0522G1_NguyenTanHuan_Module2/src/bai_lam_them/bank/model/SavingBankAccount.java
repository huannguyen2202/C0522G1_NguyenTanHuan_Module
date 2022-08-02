package bai_lam_them.bank.model;

public class SavingBankAccount extends BankAccount{
    private int moneySaving;
    private String dateSaving;
    private double interestRate;
    private int time;

    public SavingBankAccount() {
    }

    public SavingBankAccount(int id, String code, String name,
                             String date, int moneySaving,
                             String dateSaving, double interestRate,
                             int time) {
        super(id, code, name, date);
        this.moneySaving = moneySaving;
        this.dateSaving = dateSaving;
        this.interestRate = interestRate;
        this.time = time;
    }

    public int getMoneySaving() {
        return moneySaving;
    }

    public void setMoneySaving(int moneySaving) {
        this.moneySaving = moneySaving;
    }

    public String getDateSaving() {
        return dateSaving;
    }

    public void setDateSaving(String dateSaving) {
        this.dateSaving = dateSaving;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                this.getId(),
                this.getCode(),
                this.getName(),
                this.getDate(),
                this.getMoneySaving(),
                this.getDateSaving(),
                this.getInterestRate(),
                this.getTime());
    }
    @Override
    public String toString() {
        return super.toString()+
                ", money saving: "+ getMoneySaving()+
                ", date saving: "+ getDateSaving()+
                ", interest rate: "+ getInterestRate()+
                ", time: "+ getTime();
    }
}
