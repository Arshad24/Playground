import java.util.Scanner;
class Main{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  int temp = n;
  while(temp > 0)
  {
    if(temp < 99)
    {
      System.out.println(temp%10);
      break;
      
    }
    else
      temp = temp/10;
  }
}
}

  