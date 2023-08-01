import java.io.*;
import java.lang.Thread;
class Five extends Thread {
  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println(i + "*5=" + (i * 5));
}
}
}
class Seven extends Thread {
public void run() {
for (int i = 1; i <= 7; i++) {
System.out.println(i + "*7=" + (i * 7));
}
}
}
class Thirteen extends Thread {
  public void run() {
    for (int i = 1; i <= 13; i++) {
      System.out.println(i + "*13=" + (i * 13));
  }
  }
}
class pgm4 {
  public static void main(String[] args)
 {
    Five f = new Five();
    Seven s = new Seven();
    Thirteen t = new Thirteen();
    t.setPriority(Thread.NORM_PRIORITY);
    s.setPriority(Thread.NORM_PRIORITY - 3);
    f.setPriority(Thread.NORM_PRIORITY + 3);
    s.start();
    f.start();
    t.start();
}
}
