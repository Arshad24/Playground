import java.util.Scanner;
class Main {
public static void main(String[] args)
{
  Scanner in = new Scanner(System.in);
  int base = in.nextInt();
  int exponent = in.nextInt();
  System.out.println(power(base,exponent));
}
  public static int power(int b , int e)
  {
     int a = 1;
    for(int i=1; i<=e; i++)
    {
     
      a = b * a;
      
    }
    return a;
  }
}