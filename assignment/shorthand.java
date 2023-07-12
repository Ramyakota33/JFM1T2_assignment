import java.util.Scanner;
 class shorthand
 {
public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value");
    int a=sc.nextInt();
  System.out.println("enter b value");
    int b=sc.nextInt();
    int result1=a*=b;
    int result2=a-=b;
    int result3=a/=b;
    int result4=a%=b;
    System.out.println("a*=b"+result1);
    System.out.println("a-=b"+result2);
  System.out.println("a/=b"+result3);
    System.out.println("a%=b"+result4);
  }





//print appropriate result for assignment operators

}