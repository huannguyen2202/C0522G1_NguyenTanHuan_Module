package bai_lam_them.bank.model;

public class PaymentBankAccount extends BankAccount {
    private int cardNumber;
    private int money;

    public PaymentBankAccount() {
    }

    public PaymentBankAccount(int id, String code, String name,
                              String date, int cardNumber,
                              int money) {
        super(id, code, name, date);
        this.cardNumber = cardNumber;
        this.money = money;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s\n",
                this.getId(),
                this.getCode(),
                this.getName(),
                this.getDate(),
                this.getCardNumber(),
                this.getMoney());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", card number: " + getCardNumber() +
                ", money: " + getMoney();
    }
}
