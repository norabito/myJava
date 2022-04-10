import java.util.Scanner;
public class For_While_Loop{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int start = s.nextInt();
    int finish = s.nextInt();
    
    if(finish > start){
      int count = 0;
      for(int i = start; i <= finish; i++){
        count++;
        if(count%7 == 0){  //如果輪到第七個
          if(i < 10){
            System.out.println(" " + i + " ");
          }
          else{
            System.out.println(i + " ");
          }
        }
        else{
          if(i < 10){
            System.out.print(" " + i + " ");
          }
          else{
            System.out.print(i + " ");
          }
        }   
      }
    }
  }
}