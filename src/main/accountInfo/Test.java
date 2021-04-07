package main.accountInfo;

class Test {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);

        account.withDraw(2500);
        account.deposit(3000);

        System.out.println("Balance: " + account.getBalance());
        System.out.println("Monthly Interest Rate: " + account.getMonthlyInterestRate() + "%");
        System.out.println("Date Created: " + account.getDateCreated());
    }
}