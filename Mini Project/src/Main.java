import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int myRandomNum=(int) (Math.random()*100);
        int user_num=0;

        do{
            System.out.println("Please enter a number between 0-100");
             user_num=sc.nextInt();

            if(myRandomNum==user_num)
            {
                System.out.println("Numbers matched");
                break;
            }
            else if(user_num>myRandomNum)
            {
                System.out.println("Your number is greater than the Random Number");
            }
            else {
                System.out.println("Your number is smaller than the Random Number");
            }
        } while (user_num>=0);

        System.out.println("The random number is");
        System.out.println(myRandomNum);

    }
}