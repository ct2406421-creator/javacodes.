class Account {
    private double BALANCE;

    // Method to set the balance
    public void setBalance(double balance) {
        this.BALANCE = balance;
    }

    // Method to get the balance
    public double getBalance() {
        return this.BALANCE;
    }

    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.setBalance(1500.50);
        
        // Display the balance
        System.out.println("Current Balance: " + myAccount.getBalance());
    }
}
