import java.util.Scanner;
public class Change_Money{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int money = s.nextInt();
    int hundred = money/100;
    int fifty = (money - hundred*100)/50;
    int ten = (money - hundred*100 - fifty*50)/10;
    int five = (money - hundred*100 - fifty*50 - ten*10)/5;
    int one = money - hundred*100 - fifty*50 - ten*10 - five*5;
    System.out.print(hundred);
    System.out.print(fifty);
    System.out.print(ten);
    System.out.print(five);   
    System.out.print(one);
  }
}