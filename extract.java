import java.util.Scanner;
class Extract { 
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);    
String s, m;
int start, end;   
System.out.println("\t******************************");
System.out.println("\t EXTRACTION OF CHARACTER");
System.out.println("\t*******************************");
System.out.println("\tENTER ANY STRING:");    
s = scanner.nextLine().trim();    
System.out.println("\t ENTER STARTING POSITION:");
start = scanner.nextInt();    
System.out.println("\t ENTER ENDING POSITION:");
end = scanner.nextInt();    
m = s.substring(start, end);
System.out.println(m);
scanner.close();
  }
}