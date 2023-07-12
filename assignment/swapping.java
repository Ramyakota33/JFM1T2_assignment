import java.util.Scanner;
 class swapping 
 {

//main method
  public static void main(String args[])
  {

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
    System.out.println("enter first number: ");
    int a=s.nextInt();
    System.out.println("enter second number:");
    int b=s.nextInt();
    System.out.println("before swapping");
    System.out.println(a);
    System.out.println(b);

//swapping two numbers without using third variable
    int temp=a;
    a=b;
    b=temp;

//print result
    System.out.println("after swapping");
    System.out.println(a);
    System.out.println(b);

}
}