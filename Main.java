import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("numero da conta: ");
        int number = sc.nextInt();

        System.out.print("titular: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("saldo inicial: ");
        double balance = sc.nextDouble();

        System.out.print("limite de saque: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.print("valor do saque: ");
        double amount = sc.nextDouble();

        acc.withdraw(amount);

        sc.close();
    }
}
