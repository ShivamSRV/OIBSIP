import java.util.Scanner;
import java.util.ArrayList;

class ATM{
    int balance = 0,withdraw,deposit;
    int flag=0;
    Scanner sc=new Scanner(System.in);
    ArrayList <String> History=new ArrayList<>();
    public void Withdraw(){
        System.out.println("Enter amount : ");
        withdraw = sc.nextInt();
        if(balance >= withdraw)
        {
            balance = balance - withdraw;
            System.out.println("Transaction successful!!!!");
            System.out.println("Please collect your money!!!!");
            String q="Withdraw : -"+withdraw;
            History.add(q);
            flag+=1;
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
        System.out.println("");
    }
    public void Deposit(){
        System.out.print("Enter amount : ");

        deposit = sc.nextInt();

        balance = balance + deposit;
        System.out.println("Your Money has been deposited successfully!!!!");
        String s="Deposit : +"+deposit;
        History.add(s);
        System.out.println("");
        flag+=1;
    }
    public void Balance(){
        System.out.println("Balance : "+balance);
        System.out.println("");
    }

    public void Trans_history(){
        System.out.println("Your last recent transactions....");
        for (int j=0;j<flag;j++){
            System.out.println(History.get(j));
        }
    }

    public void transfer(){
        System.out.print("Enter reciever's account no : ");
        int a=sc.nextInt();
        System.out.print("Enter amount : ");
        int b=sc.nextInt();
        if (b>balance){
            System.out.println("Sorry, insufficient balance !!!!");
        }
        else{
            balance-=b;
            System.out.println("Transfer successfull!!!!");
            String r="Transfer : -"+b;
            History.add(r);
            flag+=1;
        }
    }
}

public class MyATM
{
    public static void main(String[]args )
    {
        ArrayList <Integer> User=new ArrayList<>();
        User.add(12345);
        User.add(54321);
        User.add(10010);
        User.add(11011);

        ArrayList <Integer> Pin=new ArrayList<>();
        Pin.add(1111);
        Pin.add(2222);
        Pin.add(3333);
        Pin.add(4444);

        int balance = 0;

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            ATM obj=new ATM();
            System.out.print("Enter Account number : ");
            int a=sc.nextInt();
            System.out.print("Enter PIN : ");
            int b=sc.nextInt();

            for (int i=0;i<4;i++){
                if (User.get(i).equals(a) && Pin.get(i).equals(b)){
                    System.out.println("Login Successful............");
                    boolean isit=true;
                    while (isit=true){
                        System.out.println("\n");
                        System.out.println("****** WELCOME TO ATM ******");
                        System.out.println("|--------------------------|");
                        System.out.println("| 1 - Withdraw             |");
                        System.out.println("|--------------------------|");
                        System.out.println("| 2 - Deposit              |");
                        System.out.println("|--------------------------|");
                        System.out.println("| 3 - Balance              |");
                        System.out.println("|--------------------------|");
                        System.out.println("| 4 - Transaction History  |");
                        System.out.println("|--------------------------|");
                        System.out.println("| 5 - Transfer             |");
                        System.out.println("|--------------------------|");
                        System.out.println("| 6 - Exit                 |");
                        System.out.println("|--------------------------|");
                        System.out.println("\n");
                        System.out.print("Choose the operation you want to perform : ");

                        int option = sc.nextInt();
                        switch(option)
                        {
                            case 1: {
                                obj.Withdraw();
                                break;
                            }
                            case 2:{
                                obj.Deposit();
                                break;
                            }
                            case 3:{
                                obj.Balance();
                                break;
                            }
                            case 4:{
                                obj.Trans_history();
                                break;
                            }
                            case 5:{
                                obj.transfer();
                                break;
                            }
                            case 6:{
                                System.exit(0);
                            }
                        }
                    }
                }
                else {
                    System.out.println("Invalid Login Details..........");
                    break;
                }
            }
        }
    }
}
