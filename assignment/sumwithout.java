import java.util.Scanner;

public class sumwithout {

//main method
  public static void main(String args[]){

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/
    Scanner s=new Scanner(System.in);

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/
    System.out.println("enter first number:");
    int a=s.nextInt();
    System.out.println("enter second number");
    int b=s.nextInt();
    int sum=0;

//check if the second number is greater than zero then increase first number and decrease second number
    if(b>0)
    {
      a++;
      b--;
      sum=a+b;
    }

//check if the second number is less than zero then decrease first number and increase second number
    else
    {
      a--;
      b++;
      sum=a+b;
    }

//print result
    System.out.println("the sum of two numbers is: " +sum);
  

}
}