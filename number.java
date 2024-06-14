import java.util.*;
public class number 
{
    public static void main(String args[])
    {
        int guess=0,attempts=0;
        System.out.println("Welcome To The Game");
        Random ran=new Random();
        int num=ran.nextInt(101);
        System.out.println("Enter the number between 0 to 100");
        Scanner sc=new Scanner(System.in);
        while(attempts<3)
        {
            System.out.println("Enter your guess:");
            guess=sc.nextInt();
            attempts++;
            if(guess>num)
            {
                System.out.println("Sorry,but your guess is too High\n Try Again");
            }
            else if(guess<num)
            {
                System.out.println("Sorry,but your guess is too Low\n Try Again");
            }
            else
            {
                System.out.println("Congrats, your answer is correct");
                break;
            }
        }
        if(attempts>=3 && guess!=num)
        {
            System.out.println("The number was:"+num);
            System.out.println("Sorry but you have exceeded the number of attemps\n Try Again Sometime later");
        }
    }
}
