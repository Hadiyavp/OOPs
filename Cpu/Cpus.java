class Cpu{
int price=3400;
class Processor{
int noOfcores=8;
String manufactures="intel";
void display()
{
System.out.println("no of coreses:"+noOfcores);
System.out.println("manufactures:"+manufactures);
}
}
void display()
{
Processor p=new Processor();
p.display();
System.out.println("Price:"+price);
}
static class Ram{
int memory=8;
String manufacturer="Crosair";
void display()
{
System.out.println("memory:"+memory);
System.out.println("manufacturer:"+manufacturer);
}
}
}
class Cpus{
public static void main(String[]args){
Cpu c1=new Cpu();
c1.display();
Cpu.Ram r1=new Cpu.Ram();
r1.display();
}
}



