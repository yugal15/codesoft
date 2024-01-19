import java.util.*;

import javax.swing.SwingConstants;


class Account
{
    Scanner sobj = new Scanner(System.in);
    int Balance = 5000;
    int Pin = 1234;

    void Withdraw(int iValue)
    {
        System.out.println("--------------------------------------------------------------------\n");
        if(iValue > Balance)
        {
            System.out.println("insufficient Balance for your current withdrawal !!....");
            return;
        }
        else
        {
            Balance = Balance - iValue;
            System.out.println(iValue+" /- amount has been successfully withdrawed from your account.");
            System.out.println("\nYour current Balance is : "+Balance+" /-");
        }
        System.out.println("\n--------------------------------------------------------------------\n");
    }

    void CheckBalance()
    {
        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("your Current Balance is : "+Balance+" /-");
        System.out.println("\n--------------------------------------------------------------------\n");
    }

    void Deposit(int iValue)
    {
        System.out.println("\n--------------------------------------------------------------------\n");
        Balance = Balance + iValue;
        System.out.println(iValue+" /- amount successfully deposited in your account.");
        System.out.println("\n Your current Balance is : "+Balance+" /-");
        System.out.println("\n--------------------------------------------------------------------\n");
    }

    boolean CheckPin(int userpin)
    {
        if(userpin == Pin)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    void ChangePin(int newpin)
    {
        System.out.println("\n--------------------------------------------------------------------\n");
        
        if(newpin == Pin)
        {
            System.out.print("ENTER THE NEW PIN : ");
            newpin = sobj.nextInt();
            Pin = newpin;
            System.out.println("Your Pin is Successfully updated.");
        }
        else
        {
            System.out.println("INVALID PIN TRY AGAIN !!!");
        }
        System.out.println("\n--------------------------------------------------------------------\n");
    }
}

class UserInterface extends Account
{ 
    Scanner sobj = new Scanner(System.in);
    public UserInterface()
    {
        Welcome();
    }
    void Welcome()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");
        System.out.println("Welcome to State Bank how Can we help you...\n");
        
        System.out.print("PLEASE ENTER THE PIN TO AVAIL SERVICES : ");
        int userpin = sobj.nextInt();

        if(CheckPin(userpin) == true)
        {
            while(true)
            {
                System.out.println("\n Please Choose Services by aprropriate number");

                System.out.println("\n-----------------------------------\n");

                System.out.println("1 : BALANCE INQUIRY");  
                System.out.println("2 : CASH WITHDRAWAL");
                System.out.println("3 : CASH DEPOSIT");
                System.out.println("4 : CHANGE PIN");
                System.out.println("5 : EXIT");

                System.out.println("\n-----------------------------------\n");

                System.out.print("Enter the option here : ");
                int option = sobj.nextInt();

                int amount;   //use to accept amount of withdrawal and diposit
                switch(option)
                {
                    case 1 : 
                        CheckBalance();
                        break;

                    case 2 :
                        System.out.print("ENTER THE AMOUNT OF WITHDRAWAL : ");
                        amount = sobj.nextInt();
                        Withdraw(amount);
                        break;

                    case 3 :
                        System.out.print("ENTER THE AMOUNT OF DEPOSIT : ");
                        amount = sobj.nextInt();
                        Deposit(amount);
                        break;

                    case 4 : 
                        System.out.print("ENTER THE CURRENT PIN : ");
                        userpin = sobj.nextInt();
                        ChangePin(userpin);
                        break;

                    case 5:
                        System.out.println("                   THANK YOU !!                   ");
                        System.out.println("------------------------------------------------------------");
                        return;
                }
            }
        }
        else
        {
            System.out.println("ENTERED WRONG PIN TRY AGAIN !!!");
        }

        System.out.println("\n--------------------------------------------------------------------\n");
    }
}

class Task3
{
    public static void main(String[] args) 
    {
        UserInterface uobj = new UserInterface();
    }
}