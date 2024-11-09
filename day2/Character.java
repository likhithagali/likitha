import java.util.Scanner;
class Character{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
char ch;
System.out.println("Enter character");
ch=s.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
System.out.println("vowel");
}
else
{
System.out.println("consonent");
}
}
}
