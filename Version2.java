import java.util.Scanner;

public class Version2 {

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

        boolean passCheck = false;

        while(passCheck == false){
            if(Password.matches("[0-9]{4}")){
                passCheck = true;
                System.out.println();
                System.out.println("Welcome User!");
                System.out.println();
            }else{
                passCheck = false;
                System.out.println("Incorrect Password!");
                System.out.println("Please Enter the Password: ");
                Password = sc.nextLine();
            }
        }
        sc.close();
    }

    /**
     * This is Version 2 -> Getting all the methods working
     * 
     * WelcomeScreen -> This method will display the Welcome Screen
     * CheckBalance -> This method will display the Balance
     * Withdraw -> This method will allow the user to withdraw money
     * Exit -> This method will allow the user to exit the program
     * 
     * 
     */

    // Methods for the user menu
    public static void WelcomeScreen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 -> To Check Balance"); 
        System.out.println("Press 2 -> To Deposit");
        System.out.println("Press 3 -> To Withdraw");
        System.out.println("Press 4 -> To Exit");
        sc.close();
    }

    public static int checkBalance(){
        return balance;
    }

    public static void deposit (int amount) {
        if(amount > 0){
            balance += amount;
            System.out.println("You have deposited: " + amount + "\n");
            System.out.println("Your new balance is: " + balance);
        }else {
            System.out.println("Invalid Amount!" + "\n");
        }
    }

    public static void withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("You have withdrawn: " + amount + "\n");
            System.out.println("Your new balance is: " + balance);
        }else{
            System.out.println("Invalid Transaction!" + "\n");
        }
    }
}
