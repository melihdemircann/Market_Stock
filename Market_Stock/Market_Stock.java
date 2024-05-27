package com.mycompany.odev;
import java.util.Scanner;
public class Odev {
public static void main(String[] args)
{
int pay;
int payda;
int pay1;
int payda1;
Scanner scanner = new Scanner(System.in);
while(true)
{
System.out.println("Ilk Kesirin Payını Giriniz:");
pay = scanner.nextInt();
System.out.println("Ilk Kesirin Paydasını Giriniz:");
payda = scanner.nextInt();
System.out.println("Ikinci Kesirin Payını Giriniz:");
pay1 = scanner.nextInt();
System.out.println("Ikinci Kesirin Paydasını Giriniz:");
payda1 = scanner.nextInt();
if(payda == 0 || payda1 == 0)
{
System.out.println("----------------");
System.out.println("Payda 0'dan farklı bir değer olmalıdır! Tekrar Giriniz");
System.out.println("----------------");
}
else
{
PaydalarıTopla(payda,payda1,pay,pay1);
}
}
}
private static void PaydalarıTopla(int payda,int payda1,int pay ,int pay1) {
if(payda == payda1)
{
PaylarıTopla(pay,pay1,payda);
}
else
{
int YeniPayda = payda * payda1;
int YeniPay = pay * payda1;
int YeniPay1 = pay1 * payda;
PaylarıTopla(YeniPay,YeniPay1,YeniPayda);
}
}
private static void PaylarıTopla(int pay,int pay1,int payda)
{
int YeniPay = pay + pay1;
System.out.println("----------------");
System.out.println("Sonuç:"+YeniPay + "/" +payda );
System.out.println("----------------");
}
}