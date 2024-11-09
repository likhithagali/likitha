import java.util.Scanner;
class Product{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int pno;String pname;float pcost;float pqnt;
System.out.println("Product Number");
pno=sc.nextInt();
System.out.println("Product Name");
pname=sc.next();
System.out.println("Product cost");
pcost=sc.nextFloat();
System.out.println("Product Quantity");
pqnt=sc.nextFloat();
float bill=pqnt*pcost;
System.out.println("Product Number: " +pno);
System.out.println("Product Name: " +pname);
System.out.println("Product Cost: " +pcost);
System.out.println("Product Quantity: " +pqnt);
System.out.println("-------------------------");
System.out.println("Bill: " +bill);
}
}
