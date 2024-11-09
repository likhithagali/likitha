import java.util.Scanner;
public class Salary
{
public static void main(String[] args) 
{ 
Scanner scanner = new Scanner(System.in);
double basicSalary = scanner.nextDouble();
double hra = 0.0, da = 0.0;
if (basicSalary <= 10000) 
{
hra = 0.20 * basicSalary;
da = 0.80 * basicSalary;
}
else if (basicSalary <= 20000) 
{
hra = 0.25 * basicSalary;
da = 0.90 * basicSalary; 
} 
else 
{
hra = 0.30 * basicSalary;
da = 0.95 * basicSalary; 
}
double grossSalary = basicSalary + hra + da;
System.out.println("Basic Salary: " + basicSalary);
System.out.println("HRA: " + hra);
System.out.println("DA: " + da);
System.out.println("Gross Salary: " + grossSalary);
scanner.close();
}
}
