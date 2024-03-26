import java.util.*;
class ArraySearch
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter size of elements:");
int size=sc.nextInt();
int numbers[]=new int[size];
System.out.println("enter the numbers:");
for(int i=0;i<size;i++)
{
numbers[i]=sc.nextInt();
}
ArraySearch as = new ArraySearch();
System.out.println("enter the element to be searched:");
int se= sc.nextInt();
System.out.println("\n1.linear search \n2.simple binary search \n3.recursive binary search \n4. built in method");
System.out.println("enter the choice:");
int ch=sc.nextInt();
int result=-1;
switch(ch)
{
case 1:
System.out.println("\n Linear search\n");
result=as.linearsearch(se,numbers);
break;
case 2:
Arrays.sort(numbers);
System.out.println("\n Binary search\n");
result=as.simplebinarysearch(se,numbers);
break;
case 3:
System.out.println("\n Recursive binary search\n");
Arrays.sort(numbers);
result=as.recursivebinarysearch(numbers,0,size-1,se);
break;
case 4:
System.out.println("\n Built in method \n");
Arrays.sort(numbers);
result=Arrays.binarySearch(numbers,se);
break;
default:
System.out.println("\ninvalid choice");
break;
}
if(result>-1)
{
System.out.println(se+ " is found");
}
else
{
System.out.println(se+ " is not found");
}
}




int linearsearch(int n,int[] numbers)
{
for(int i=0;i<numbers.length;i++)
{
if(numbers[i]==n)
{
return i;
}
}
return -1;
}
int simplebinarysearch(int n,int[] numbers)
{
int first=0;
int last=numbers.length-1;
int mid=(first+last)/2;
while(first<=last)
{
if(numbers[mid]<n)
{
first=mid+1;
}
else if(numbers[mid]>n)
{
last=mid-1;
}
else
{
return mid;
}
mid=(first+last)/2;
}
return -1;
}
int recursivebinarysearch(int[] numbers,int first,int last,int x)
{
if(first<=last && first<numbers.length-1)
{
int mid=first+(last-first)/2;
if(numbers[mid]<x)
{
return recursivebinarysearch(numbers,mid+1,last,x);
}
if(numbers[mid]>x)
{
return recursivebinarysearch(numbers,first,mid-1,x);
}
return mid;
}
return -1;
}
}






