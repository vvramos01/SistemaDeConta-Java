public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        if (amount > withdrawLimit) {
            System.out.println("erro: valor do saque maior que o limite.");
        }
        else if (amount > balance) {
            System.out.println("erro: saldo insuficiente.");
        }
        else {
            balance -= amount;
            System.out.println("novo saldo: " + balance);
        }
    }

    public Double getBalance() {
        return balance;
    }
}
