import java.util.Scanner; 
class Divde 
{ 
int a,b; 
Scanner sc= new Scanner(System.in); 
void Setdata() 
{ 
int a,b; 
System.out.print("Enter the value of A: ") 
a=Integer.parseInt(sc.nextLine()); 
System.out.print("Enter the value of B: ") 
b=Integer.parseInt(sc.nextLine()); 
  this.a=a; 
  this.b=b; 
} 
 
void Showresult() 
 { 
System.out.println("The Division of A and B are:"+(a/b)); 
  } 
} 
public class Test 
{ 
public static void main(String[], num) 
{ 
Divde d= new Divde(); 
 try{ 
   d.Setdata(); 
   d.Showresult(); 
   } 
 catch(ArithmeticExcepetion r) 
{ 
System.out.println("This is an Arithmetic Exception ") 
} 
 catch(NumberformateException r) 
 { 
  System.out.println(" Number format Exception!.."); 
} 
} 
} 