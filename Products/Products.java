import java.util.Scanner;
class Product {
int pCode,price;
String pName;
Product(int pCode, String pName,int price){
this.pCode=pCode;
this.pName=pName;
this.price=price;
}
}
class Products{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the product code:");
int pCode=sc.nextInt();
System.out.println("enter the product name:");
String pName=sc.next();
System.out.println("enter the product price:");
int price=sc.nextInt();
Product[] ps=new Product[3];
ps[0]=new Product(pCode,pName,price);
ps[1]=new Product(1,"book",50);
ps[2]=new Product(2,"pen",10);
int minprice=ps[0].price;
System.out.print("\nCode\tName\tprice\n");
System.out.print("\n*******************\n");
for(Product p:ps)
{
System.out.println(p.pCode+"\t"+p.pName+"\t"+p.price);
if(minprice > p.price)
{
minprice=p.price;
}
}
for(Product p:ps)
{
if(minprice==p.price)
{
System.out.print("\n");
System.out.print("\nlowest product details");
System.out.print("\n**************************");
System.out.print("\nproduct code="+p.pCode);
System.out.print("\nproduct name="+p.pName);
System.out.print("\nproduct price="+p.price+"\n");
}
}
System.out.println("*****************");
}
}

