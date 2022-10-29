import java.util.*;

class Number{
    Random obj=new Random();
    Scanner sc=new Scanner(System.in);
    public void Unlimited (){
        int num=obj.nextInt(1,101);
        System.out.println("Number generated Successfully");
        System.out.println("             X               ");
        System.out.print("Guess the number : " );
        int flag=0;
        boolean isit=true;
        while (isit){
            int b=sc.nextInt();
            if (b<num){
                System.out.print("The Actual number is greater than "+b+"\nGuess again : ");
                flag+=1;
                continue;
            }
            else if (b>num){
                System.out.print("The Actual number is smaller than "+b+"\nGuess again : ");
                flag+=1;
                continue;
            }
            else if (b==num) {
                System.out.println("Congratulations , the guessed number is correct!!!");
                flag += 1;
                System.out.println("Total Attempts taken : "+flag);
                System.out.print("Your score is : ");
                if (flag == 1) {
                    System.out.print(flag * 100);
                } else if (flag > 1 && flag <= 5) {
                    System.out.println(flag * 10);
                } else if (flag > 5 && flag <= 15) {
                    System.out.println(flag * 2.5);
                } else if (flag > 15) {
                    System.out.println(flag * 1.5);
                }
                break;
            }
        }
    }
    public void Limited(){
        System.out.println("Enter number of attempts : ");
        int n=sc.nextInt();
        int flag=0;
        int extra=n;
        boolean isit=false;
        int num=obj.nextInt(1,101);
        System.out.println("Number generated Successfully");
        System.out.println("             X               ");
        while (!isit){
            for (int i=extra;i>0;i--) {
                System.out.print("Guess the number : ");
                int b=sc.nextInt();
                if (b < num) {
                    System.out.println("The Actual number is greater than " + b);
                    flag += 1;
                    System.out.println(--extra + " Attempts remaining ");
                    continue;
                } else if (b > num) {
                    System.out.println("The Actual number is smaller than " + b);
                    flag += 1;
                    System.out.println(--extra+ " Attempts remaining ");
                    continue;
                } else if (b == num) {
                    System.out.println("Congratulations , the guessed number is correct!!!");
                    flag += 1;
                    isit = true;
                    System.out.println("Total Attempts taken : " + flag);
                    System.out.print("Your score is : ");
                    if (flag == 1) {
                        System.out.print(flag * 100);
                        System.out.println("\n");
                    } else if (flag > 1 && flag <= 5) {
                        System.out.println(flag * 10);
                        System.out.println("\n");
                    } else if (flag > 5 && flag <= 15) {
                        System.out.println(flag * 2.5);
                        System.out.println("\n");
                    } else if (flag > 15) {
                        System.out.println(flag * 1.5);
                        System.out.println("\n");
                    }
                    break;
                }
            }
            if (!isit){
                System.out.println("|------------------------|");
                System.out.println("| 1 - Add more Attempts  |");
                System.out.println("|------------------------|");
                System.out.println("| 2 - Exit               |");
                System.out.println("|------------------------|\n");
                System.out.print("Enter choice : ");
                int choice =sc.nextInt();
                switch (choice){
                    case 1:{
                        System.out.print("Enter extra attempts : ");
                        int more=sc.nextInt();
                        extra=more;
                        continue;
                    }
                    case 2:{
                        System.out.println("The actual number was "+num+"\nBetter luck next time!!!");
                        isit=true;
                        break;
                    }
                    default:{
                        System.out.println("Please enter valid choice!!! \n" );
                    }
                }
            }
            else{
                break;
            }
        }
    }
}
public class Num_guess {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Number obj1=new Number();
        boolean p=true;
        while (p){
            System.out.println("\n******** NUMBER GUESSING GAME ********\n");
            System.out.println("|------------------------------------|");
            System.out.println("|     How many attempts you want     |");
            System.out.println("|------------------------------------|");
            System.out.println("|     1 - Unlimited                  |");
            System.out.println("|------------------------------------|");
            System.out.println("|     2 - Limited                    |");
            System.out.println("|------------------------------------|");
            System.out.println("|     3 - Exit                       |");
            System.out.println("|------------------------------------|\n");
            System.out.print("Please select an option : ");
            int option=sc.nextInt();
            switch (option){
                case 1:{
                    obj1.Unlimited();
                    break;
                }
                case 2:{
                    obj1.Limited();
                    break;
                }
                case 3:{
                    System.exit(0);
                }
                default:{
                    System.out.println("Please enter valid option !!!");
                }
            }
        }
    }
}
