import java.util.Scanner;

class Operations {
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number");
  int num1=sc.nextInt();
  System.out.println("enter second number");
  int num2=sc.nextInt();
  int diff=num1-num2;
  System.out.println("Difference of"+num1 +num2+diff);
// product of 2 numbers
  System.out.println("enter first number");
  int num3=sc.nextInt();
  System.out.println("Enter second number");
  int num4=sc.nextInt();
  int product=num3*num4;
  System.out.println("product of"+num3+"and"+num4+":"+product);
  //Division of 2 numbers
  System.out.println("enter divident:");
  int num5=sc.nextInt();
  System.out.println("enter divisior:");
  int num6=sc.nextInt();
   float division =num5%num6;
        System.out.println("Division of " + num5+ " and " + num6 + ": " + division);

        // Increment and Decrement the number
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int incrementedNum = num + 1;
        int decrementedNum = num - 1;
        System.out.println("Incremented number: " + incrementedNum);
        System.out.println("Decremented number: " + decrementedNum);

        // Remainder of 2 numbers
        System.out.println("Enter first number:");
        int num7 = sc.nextInt();
        System.out.println("Enter second number:");
        int num8 = sc.nextInt();
        int remainder = num7 % num8;
        System.out.println("Remainder of " + num5 + " and " + num6 + ": " + remainder);
    }
}