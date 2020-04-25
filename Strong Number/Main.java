import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int last,fact=1,sum=0,i,a;
      a = num;
     while(num>0)
     {
       last = num%10;
       for(i=1; i<=last; i++)
       {
         fact =  fact * i;
       }
     
       num = num/10;
       sum = fact + sum;
         fact=1;
     }
      //stem.out.println(sum);
      if(a==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
        
        
	    // Type your code here
	}
}