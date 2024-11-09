import java.util.Scanner;
class Area{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int r;
System.out.println("Enter radius of circle");
r=sc.nextInt();
float area= 3.14f*r*r;
System.out.println("Area of circle is :" +area);
}
}