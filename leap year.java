import java.util.Scanner;
public class leapyear
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("Enter year: ");
String year=input.next();
String a[]=year.split("/");
String d=a[2];
int num=Integer.parseInt(d);
if((num%4==0 && num%100!=0)|| num%400==0)
System.out.println("It is a leap year");
else
System.out.println("Not a leap year");
}
}



OUTPUT:
Enter year: 04/11/1947
Not a leap year
