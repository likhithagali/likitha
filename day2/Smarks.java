import java.util.Scanner;
class Smarks{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int sno,m,p,c,total;
String sname;float avg;
System.out.println("Enter Student Number");
sno=s.nextInt();
System.out.println("Enter Student Name");
sname=s.next();
System.out.println("Enter marks of maths,physics and chemistry");
m=s.nextInt();
p=s.nextInt();
c=s.nextInt();
total=m+p+c;
avg=total/3;
System.out.println("Average marks of Student is "+avg);
}
}

