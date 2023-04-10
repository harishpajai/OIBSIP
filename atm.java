// package At.*;
import java.util.*;

public class index{
        public static void main(String[] args) {
            int Pin;
            int Balance = 100000;
            int Withdraw = 0;
            int Deposit = 0;
            int TransferAmount = 0;
            int next = 1;

            Scanner sc = new Scanner(System.in);
            System.out.println("Insert your Debit Card");
            System.out.println("Enter your Pin:");
            Pin = sc.nextInt();

                if (Pin == 8421){
                    System.out.println("Please Select your Transaction-");
                    while(next == 1){
                        System.out.println("Choose 1 to Withdraw");
                        System.out.println("Choose 2 to Deposit");
                        System.out.println("Choose 3 to Check Balance");
                        System.out.println("Choose 4 to Transfer Money");
                        System.out.println("Choose 5 to Transaction History");
                        System.out.println("Choose 6 to Quit");
                        int choice = sc.nextInt();

                        switch(choice){
                            case 1:
                                System.out.println("\n* * * * * * * * * * * * * Withdraw * * * * * * * * * * * * *");
                                System.out.println("\nEnter the amount to be Withdrawn:");
                                Withdraw = sc.nextInt();
                                if (Balance >= Withdraw){
                                    System.out.println("\nWithdraw Operations :\n");
                                    System.out.println("Withdraw Money : " +Withdraw);
                                    Balance -= Withdraw;
                                    System.out.println("Please Collect Your Cash");
                                    System.out.println("Available Balance is : "+Balance);
                                }
                                else System.out.println("Insufficient Balance");
                                System.out.println("\nDo you want to continue Yes[1] / No[0] :");
                                next = sc.nextInt();
                                System.out.println("");
                                break;

                            case 2:
                                System.out.println("\n* * * * * * * * * * * * * Deposit * * * * * * * * * * * * *");
                                System.out.println("\nEnter the amount to be Deposited");
                                Deposit = sc.nextInt();
                                System.out.println("\nDeposit Operation :\n");
                                Balance += Deposit;
                                System.out.println("Deposit Money : "+Deposit);
                                System.out.println("Your Money has been successfully deposited");
                                System.out.println("Balance : "+Balance);
                                System.out.println("\nDo you want to continue Yes[1] / No[2]: ");
                                next = sc.nextInt();
                                System.out.println("");
                                break;

                            case 3:
                                System.out.println("\nBalance : "+Balance);
                                System.out.println("\nDo you want to continue Yes[1] / No[0]: ");
                                next = sc.nextInt();
                                System.out.println("");
                                break;

                            case 4:
                                System.out.println("\n* * * * * * * * * * * * * Transfer Amount * * * * * * * * * * * * *");
                                Long Accno;
                                System.out.println("\nEnter the Account Number");
                                Accno = sc.nextLong();
                                int ifsc;
                                System.out.println("\nEnter the IFSC Code");
                                ifsc = sc.nextInt();
                                System.out.println("\nEnter the amount for Transfer");
                                TransferAmount = sc.nextInt();
                                Balance -= TransferAmount;
                                System.out.println("\nYour amount has been Successfully transfered to this account" +Accno);
                                int tr;
                                System.out.println("\nEnter 1 for transaction receipt");
                                tr = sc.nextInt();
                                if (tr==1){
                                    System.out.println("\nAccount Number : "+Accno);
                                    System.out.println("IFSC Code : "+ifsc);
                                    System.out.println("Tranfer Amount : "+TransferAmount);
                                }
                                System.out.println("\nDo you want to continue Yes[1] / No[0]");
                                next = sc.nextInt();
                                System.out.println("");
                                break;

                            case 5:
                                System.out.println("\n* * * * * * * * * * * * * Transaction History * * * * * * * * * * * * *");
                                System.out.println("Deposit Amount :"+Deposit);
                                System.out.println("Withdraw Amount :"+Withdraw);
                                System.out.println("Transfer Amount :"+TransferAmount);
                                System.out.println("Balance Amount :"+Balance);
                                System.out.println("\nDo you want to continue Yes[1] / No[0]: ");
                                next = sc.nextInt();
                                System.out.println("");
                                break;

                            case 6:
                                next = 0;
                        }
                    }
                    if (next==0){
                        System.out.println("***********************************************************");
                        System.out.println("Please Collect your Card \n Thank You!");
                        System.out.println("***********************************************************");
                        System.exit(0);
                    }
        }
                else System.out.println("Please Enter Correct Pin!");
    }
}