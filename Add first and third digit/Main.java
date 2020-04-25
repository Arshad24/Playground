import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
        Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
    
      int t_l = n1%10;
      n1 = n1/100;
      
      int add = t_l + n1;

       System.out.println(add);
      
      
	}
}