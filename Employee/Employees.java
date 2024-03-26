import java.util.Scanner;
class Employee{
int empId,salary;
String name,address;
Employee(int empId,String name,String address,int salary){
this.empId=empId;
this.name=name;
this.address=address;
this.salary=salary;
}
Employee(){}
}
class Teacher extends Employee{
String department;
String subject;
Teacher(int empId,String name,String address,int salary,String department,String subject){
super(empId,name,address,salary);
this.department=department;
this.subject=subject;
}
Teacher()
{
super();
}

//fuction to display all teachers
void displayTeachers(Teacher[] teachers){
String format="%-10s %-20s %-20s %-10s %-20s %-20s";
System.out.format(format,"empId","Name","Address","Salary","Department","Subjects");
System.out.println();
System.out.format(format,"-----","----","-------","------","----------","---------");
System.out.println();
for(Teacher t: teachers){
System.out.format(format,t.empId,t.name,t.address,t.salary,t.department,t.subject);
System.out.println();
}
}
}
//main class
class Employees{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of employees:");
int eCount=sc.nextInt();
Teacher[] teachers=new Teacher[eCount];
for(int i=0;i<eCount;i++){
System.out.println("Enter empId:");
int empId=sc.nextInt();
sc.nextLine();
System.out.println("Enter name:");
String name=sc.nextLine();

System.out.println("Enter Address:");
String address=sc.nextLine();

System.out.println("Enter Salary:");
int salary=sc.nextInt();

System.out.println("Enter Department:");
String department=sc.nextLine();
sc.nextLine();
System.out.println("Enter Subject:");
String subject=sc.nextLine();

teachers[i]=new Teacher(empId,name,address,salary,department,subject);
}
Teacher t1=new Teacher();
t1.displayTeachers(teachers);
}
}





