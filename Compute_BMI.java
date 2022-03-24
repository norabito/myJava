public class Compute_BMI{
    
    private String name;
    private String sex;
    private double waistline;
    private double weight;
    private double height;
    double result;
    String abnormal;
    
    public void setName(String n){
      name = n;
    }
    public void setSex(String n){
      sex = n;
    }
    public void setWaistline(double n){
      waistline = n;
    }
    public void setWeight(double n){
      weight = n;
    }
    public void setHeight(double n){
      height = n;
    }
    public String getName(String n){
      return name;
    }
    public String getSex(String n){
      return sex;
    }
    public double getWaistline(double n){
      return waistline;
    }
    public double getWeight(double n){
      return weight;
    }
    public double getHeight(double n){
      return height;
    }
    public double compute_BMI(){
     result = weight/(height*height);
     System.out.println(result);
     return result;
    }
    public boolean isNormal(){
      if (18.5 <= result && result < 24.0){
        return true;
      }
      else {
        abNormal();
        return false;
      }
    }
    public String abNormal(){
      if( result < 18.5){
        abnormal = "過輕";
        System.out.println(abnormal);
        return abnormal;
      }
       else if (27.0 <= result && result < 30.0){
         abnormal = "輕度";
         System.out.println(abnormal);
         return abnormal;
      }
       else if (30.0 <= result && result < 35.0){
         abnormal = "中度";
         System.out.println(abnormal);
         return abnormal;
      }
       else {
         abnormal = "重度";
         System.out.println(abnormal);
         return abnormal;
       }
    }
}