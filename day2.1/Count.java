import java.util.Scanner;
public class Count
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);  
System.out.print("Enter the amount: ");
int amount = scanner.nextInt();
int[] denominations = {100, 50, 20, 10, 5, 1};
int totalNotes = 0;
System.out.println("Breakdown of notes:");
for (int denomination : denominations)
{
int count = amount / denomination;
if (count > 0)
{ 
System.out.println(denomination + " : " + count); 
totalNotes += count; 
  }
amount = amount % denomination;
}
System.out.println("Total number of notes: " + totalNotes);
scanner.close();
}
}