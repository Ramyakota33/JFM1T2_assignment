import java.util.Scanner;

import javax.net.ssl.SSLException;
class Boolean
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      boolean a=sc.nextBoolean();
      System.out.println("enter b value");
      boolean b=sc.nextBoolean();
      boolean c=a&&b;
      boolean d=a||b;
      boolean e=!a;
      boolean f=!b;
      System.out.println("c="+c);
      System.out.println("d="+d);
      System.out.println("e="+e);
      System.out.println("f="+f);
    }
  }