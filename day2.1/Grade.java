import java.util.Scanner;
public class Grade
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
int physics, chemistry, biology, mathematics, computer;
System.out.print("Enter marks for Physics: ");
physics = scanner.nextInt();
System.out.print("Enter marks for Chemistry: "); 
chemistry = scanner.nextInt(); 
System.out.print("Enter marks for Biology: ");
biology = scanner.nextInt();
System.out.print("Enter marks for Mathematics: ");
mathematics = scanner.nextInt();
System.out.print("Enter marks for Computer: ");
computer = scanner.nextInt();
int totalMarks = physics + chemistry + biology + mathematics+computer;
double percentage = (totalMarks / 500.0) * 100;
System.out.println("Total Marks: " + totalMarks);
System.out.println("Percentage: " + percentage + "%");
char grade;
if (percentage >= 90)
{
grade = 'A';
}
else if (percentage >= 80) 
{ 
grade = 'B';
} 
else if (percentage >= 70) 
{
grade = 'C';
} 
else if (percentage >= 60) 
{
grade = 'D';
}
else if (percentage >= 40) 
{
grade = 'E';
} 
else 
{
grade = 'F';
}
System.out.println("Grade: " + grade);
        scanner.close();
    }
}

