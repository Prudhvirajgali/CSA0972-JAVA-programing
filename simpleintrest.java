import java.util.Scanner;
class simpleinterest
{
 public static void main(String[] args) 
{
 Scanner sc=new Scanner(System.in);
 float P=sc.nextFloat();
 float R=sc.nextFloat();
 float T=sc.nextFloat();
 float SI = (P * T * R) / 100;
 System.out.println("Simple interest = " + SI);
 }
}


OUTPUT:
enter the principal amount:200000
enter no. of years:3
is customers senior citizen:10
Simple interest = 60000.0
