import java.util.Scanner;
class Sevenodd{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n;
System.out.println("Enter a number  ");
n=s.nextInt();
switch(n%2)
{
case 0:
	System.out.println("Even");
	break;
case 1:
	System.out.println("odd ");
	break;
default:
	System.out.println("Wrong input");break;
}
}
}