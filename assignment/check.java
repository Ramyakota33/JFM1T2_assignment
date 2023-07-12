import java.util.Scanner;

class CheckingEquality {

public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter first number");
    int firstnumber=sc.nextInt();
    System.out.println("enter Second number");
    int secondnumber=sc.nextInt();
    if(firstnumber==secondnumber)
    {
      System.out.println(firstnumber+"and"+secondnumber+"is equal");
      
    }
else    {
    System.out.println(firstnumber+"and"+secondnumber+"is not equal");
}
  }

}