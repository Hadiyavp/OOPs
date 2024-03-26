import java.util.*;
import java.util.Scanner;
interface Student{
int score=10;
void displayscore();
}
interface Sports{
int score=25;
void displaysports();
}
class Results implements Student,Sports{
public void displayscore(){
System.out.println("academic Score:"+Student.score);
}
public void displaysports(){
System.out.println("sports score;"+Sports.score);
}
}
class SportsStudent{
public static void main(String[] args){
Results r= new Results();
r.displayscore();
r.displaysports();
}
}

