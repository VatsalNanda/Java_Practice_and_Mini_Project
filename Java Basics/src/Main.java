import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void printJava()
    {
        System.out.println("Hello Java");
    }

    public static void print_name(String name)
    {
        System.out.println(name);
    }

    public static void add_num(int a,int b)
    {
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.print("Hello World");

        //Variables

        String name="Vatsal";
        int age=21;
        String last="Nanda";

        String last_name=last;//assigning variables to another

        //Primitive
        // byte -1 [-128 to 127]
        // short -2
        //int -4
        //long-8
        //float-4
        //double-8
        //char-2
        //boolean-1

        byte age_new=30;
        int phone=1234567890;
        long phone2=12345678900L;
        //L tells java that this a long type integer, otherwise java treats it as a normal integer
        float pi=3.14F;
        char letter='@';
        boolean isAdult=true;

        //Non-primitive
        //1. Strings

        String name_new="Vatsal";
        System.out.println(name_new.length());

        //use new keyword

        String name2=new String("Vatsal");
        String friend=new String("abc");

        //String methods
        //1.Concatenate
        String name3="abc";
        String name4="def";
        String name5=name3+name4;

        System.out.println(name5);

        //2. charAt

        System.out.println(name5.charAt(0));

        //3. length

        System.out.println(name5.length());

        //4. replace

        String replaced_name=name5.replace("b","r");
        System.out.println(replaced_name);

        //5. substring

        System.out.println(replaced_name.substring(0,4));

        //ARRAYS

        //Declare an array

        int [] marks=new int[3];
        marks[0]=95;
        marks[1]=98;
        marks[2]=99;

        System.out.println(marks[0]);

        //Functions
        //1. length
        System.out.println(marks.length);

        //2. sort
        Arrays.sort(marks);

        //another way of initialisation
        int [] marks_new={99,98,95};

        //2-d arrays
        int [] [] marks_2d={{98,97,96},{96,90,98}};

        System.out.println(marks_2d[1][1]);

        //casting

        //1. Implicit
        double price=100.00;
        double final_price=price+18;

        System.out.println(final_price);

        //2. Explicit

        int p=100;
        int fp=p+(int)18.99;
        System.out.println(fp);

        //Constants

        final float PI=3.14F;
        System.out.println(PI);

        //Operators
        //1. Arithmetic- +,-,*,/,%

        int a=1;
        int b=2;
        int add=a+b;
        int diff=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;

        System.out.println(mod);

        //2. Assignment
        int numb=5;

        //Unary
        System.out.println(numb++);
        System.out.println(numb);
        System.out.println(++numb);


        System.out.println(numb--);
        System.out.println(numb);
        System.out.println(--numb);

        //Math class
        System.out.println(Math.max(10,11));
        System.out.println(Math.min(10,11));
        System.out.println(Math.random());

        //Taking input in Java

        Scanner sc=new Scanner(System.in);
        System.out.println("Input your age");
        int age_in=sc.nextInt();
        System.out.println(age_in);

        //String input

        System.out.println("Enter your name");
        String name_in=sc.next();
        System.out.println(name_in);
        System.out.println("Enter your full name");
        String name_in2=sc.nextLine();
        System.out.println(name_in2);

        //Comparison operators

        //1. ==
        //2.!=
        //3.<
        //4. >
        //5. <=
        //6. >=

        //Conditional statements

        boolean isSunUp=true;

        if(isSunUp==true)
            System.out.println("Day");
        else
            System.out.println("Night");

        int age_vote=30;

        if(age_vote>=18)
            System.out.println("Can vote");
        else
            System.out.println("Can't vote");

        //Logical operators

        //1. &&
        int c=10;
        int d=50;
        if(a<60&&d<60)
            System.out.println("Both less than 60");
        else
            System.out.println("One or both not less than 60");

        //2. ||

        if(a<60||d<60)
            System.out.println("One or both less than 60");
        else
            System.out.println("None less than 60");

        //3. !

        boolean isNew=true;

        if(!isNew)
            System.out.println("Not new");
        else
            System.out.println("New");

        //Conditional statements

        int pen=10, notebook=40;

        Scanner sc_new=new Scanner(System.in);
        System.out.println("Enter the cash you have");
        int cash= sc.nextInt();

        if(cash<10)
        {
            System.out.println("Can't buy anything");
            System.out.println("Bring more cash");
        }

        else if(cash>10&&cash<50)
        {
            System.out.println("Can buy only one");
        }
        else
        {
            System.out.println("Can buy both");

        }

        //Switch

        int day=1;

        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Wed-sun");
        }

        //LOOPS
        //1. For loop

        for(int i=1;i<=100;i++)
        {
            System.out.println(i);
        }

        for(int i=100;i>=1;i--)
        {
            System.out.println(i);
        }

        //2. while loop

        int j=1;
        while(j<=100)
        {
            System.out.println(j);
            j++;
        }

        //3. Do while loop

        int k=100;
        do{
            System.out.println(k);
            k--;
        } while(k>=1);

        //Do while exercise

        Scanner sc_loop=new Scanner(System.in);
        int num=0;

        do{
            num=sc_loop.nextInt();
            System.out.println(num);
        } while(num>=0);

        //Break and continue statement

        int var=0;
        while(true)
        {
            if(var==3)
            {
                var++;
                continue;
            }
            System.out.println(var);
            var++;

            if(var>5)
            {
                break;//break out of the loop
            }
        }

        //Try catch exception handling

        int [] marks_new1={78,90,87};

        try{
            System.out.println(marks_new1[5]);
        }
        catch(Exception exception)
        {
            //do something after catching
        }

        System.out.println("Execute this statement after exception");

        //Functions/Methods

        printJava();

        print_name("Vatsal");

        add_num(5,6);



    }
}