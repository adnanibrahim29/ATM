import java.util.Scanner;

public class Version3 {

    /**
     * This is the final version of the ATM program
     * This final version is the atm optimized
     */

    private static int balance = 1000;
    public static void main(String [] args){

        /*  Choice 1: To Check Balance
            Choice 2: To Deposit
            Choice 3: To Withdraw
            Choice 4: To Exit
        */

        // Version 1 -> Getting the Welcome Screen Working

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your Password: ");
        String Password = sc.nextLine();

        while(!Password.matches("[0-9]{4}")){
            System.out.println("Incorrect Password!");
            System.out.println("Please Enter the Password: ");
            Password = sc.nextLine();
        }

        System.out.println("Welcome User!");
        System.out.println();

        boolean userExit = false;

        while(!userExit){
            WelcomeScreen();
            System.out.println("\nPlease Enter 1,2,3,4\n");

            int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Your Balance is: " + checkBalance() + "\n");
                    break;

                case 2:
                    System.out.println("Enter the amount you want to deposit: ");
                    int amount = sc.nextInt();
                    deposit(amount);
                    break;

                case 3:
                    System.out.println("Enter the amount you want to withdraw: ");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    break;

                case 4:
                    userExit = true;
                    System.out.println("Thank You for using the ATM!");
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("Invalid Choice!" + "\n" + "Enter 1,2,3,4");
                    break;
            }
        }
        sc.close();
    }

    /**
     * 
     * This is Version 2 -> Getting all the methods working
     * 
     * WelcomeScreen -> This method will display the Welcome Screen
     * CheckBalance -> This method will display the Balance
     * Withdraw -> This method will allow the user to withdraw money
     * Exit -> This method will allow the user to exit the program
     * 
     * 
     */

    public static void WelcomeScreen(){
        System.out.println("Press 1 -> To Check Balance"); 
        System.out.println("Press 2 -> To Deposit");
        System.out.println("Press 3 -> To Withdraw");
        System.out.println("Press 4 -> To Exit");
    }

    public static int checkBalance(){
        return balance;
    }

    public static void deposit (int amount) {
        if(amount > 0){
            balance += amount;
            System.out.println("You have deposited: " + amount + "\n");
            System.out.println("Your new balance is: " + balance + "\n");
        }else {
            System.out.println("Invalid Amount!" + "\n");
        }
    }

    public static void withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("You have withdrawn: " + amount + "\n");
            System.out.println("Your new balance is: " + balance + "\n");
        }else{
            System.out.println("Invalid Transaction!" + "\n");
        }
    }
}
