import java.util.Scanner;
public class Practice{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("input");
    double a = s.nextDouble();
    double max = a;
    double min = a;
    double sum = a;
    double ave = 0;
    int i = 1;
    
    while(a != 0){
      double b = s.nextDouble();
      if (b == 0){
        ave = sum/i;
        System.out.println(max);
        System.out.println(min);
        System.out.println(ave);
        break;
      }
      sum += b;
      i++;
      if (b > max){
        max = b;
      }
      if (b < min){
        min = b;
      }
     
      
    }
  }
}