import java.util.Scanner;
class EvenOdd{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n;
System.out.println("Enter number");
n=s.nextInt();
if(n%2==0)
{
System.out.println("Given number is even");
}
else
{
System.out.println("Given number is odd");
}
}
}
