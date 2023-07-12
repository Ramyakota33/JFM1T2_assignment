import java.util.Scanner;
class expression {
 public static void main(String args[]){
     Scanner s=new Scanner(System.in);
     System.out.println("enter a value");
    int a=s.nextInt();
    System.out.println("enter b value");
    int b=s.nextInt();
    
//print appropriate result for Expression operators
     int f= a-- - --a;
      int c=a--;
      int d=a>>2;
      int e=a&b;
    System.out.println("the value of"+ f +" " );
    System.out.println("the value of "+ c + " ");
    System.out.println("the value of "+ d + " ");
    System.out.println(" the value of "+ e +" ");
    
}
}