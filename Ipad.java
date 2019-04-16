package core.java;

public class Ipad {
 int year;
 String model;
 String display = "11 inch";
 static String keys = "36";
 
 
  public Ipad() {
	  
  }
  
   public Ipad(int year) {
	   this.year = year;
	   System.out.println(year);
   }
   
   public Ipad(String model) {
	   this.model = model;
	   System.out.println(model);
	   
   }

}
