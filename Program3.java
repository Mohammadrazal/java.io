import java.util.Scanner;
import java.io.IOException;
class Program3 {
public static void main(String[] args) throws IOException {
int payamt;
Scanner scanner = new Scanner(System.in);
System.out.println("\n\nPay out of bound exception");
System.out.println("* * *");
System.out.println("\n Enter a basic pay amount");
payamt = scanner.nextInt();
try {
if (payamt > 1000) {
throw new PayOutOfBoundException("Basic pay is out of bound");
}
else {
System.out.println("\n Given basic pay is: " + payamt);
}
}
catch (Exception e) {
System.out.println("Caught: " + e);
}
scanner.close();
}
}
class PayOutOfBoundException extends IOException {
public PayOutOfBoundException(String message) {
System.out.println(message);
}
}