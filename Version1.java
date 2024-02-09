import java.util.Scanner;

public class Version1{
    public static void main(String [] args){

         /**
         * This project will be a Waterfall based programming
         * Consists of 3 parts (versions)
         * 
         */
        
        /*  Choice 1: Check Balance
            Choice 2: Deposit
            Choice 3: Withdraw
            Choice 4: 
        */

        // Version 1 -> Getting user to Enter a 4 Digit Password

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your Password: ");
        String Password = sc.nextLine();

        boolean passCheck = false;
        while(passCheck == false){
            if(Password.matches("[0-9]{4}")){
                passCheck = true;
                System.out.println("Welcome!");
            }else{
                passCheck = false;
                System.out.println("Incorrect Password!");
                System.out.println("Please Enter the Password: ");
                Password = sc.nextLine();
            }
        }
        sc.close();
    }
}