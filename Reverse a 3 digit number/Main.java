import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int first_digit = (num/100);
    int sec_digit = ((num/10)%10);
    int third_digit = (num%10);
    int reverse = (third_digit*100)+(sec_digit*10)+first_digit;
    System.out.println(reverse);
    //Type your code here
  }
}