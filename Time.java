public class Time{
  
  private int hour, min, sec;
  
  public Time(){
    setHour(0);
    setMinute(0);
    setSecond(0);
  }
  public Time(int h,int m,int s){
    setHour(h);
    setMinute(m);
    setSecond(s);
  }
  
  public void setHour(int h){
    if (h >= 0 && h < 24){
      hour = h;
    }
    else{
      System.out.println("error");
      System.exit(1);
    }
  }
  public void setMinute(int m){
    if (m >= 0 && m < 60){
      min = m;
    }
    else{
      System.out.println("error");
      System.exit(1);
    }
  }
  public void setSecond(int s){
    if (s >= 0 && s < 60){
      sec = s;
    }
    else{
      System.out.println("error");
      System.exit(1);
    }
  }
  
  public int getHour(){
    return hour;
  }
  public int getMinute(){
    return min;
  }
  public int getSecond(){
    return sec;
  }
  
  public String toString(){
    return ((hour == 12 || hour == 0)?12:hour % 12) + ":" + (min < 10?"0":"") + min + ":" + (sec < 10?"0":"") + sec + " " + (hour < 12?"AM":"PM");
  }
  
  public void addMinute(int m){
    hour += (min + m) / 60;
    if (hour >= 24){
      hour %= 24;
    }
    min = (min + m) % 60;
  }
  
  public static void main(String[] args){
    Time t = new Time();
    t.setHour(23);
    t.setMinute(20);
    t.setSecond(9);
    t.addMinute(1450);
    System.out.println(t);
  }
}