package core.java;

public class execution {
 public static void main(String [] args) {
	 Ipad refVar1 = new Ipad();
	 
	 
	 refVar1.model = "Mac";
	 System.out.println(refVar1.year);
	 System.out.println(refVar1.model);
	 Ipad refVar2 = new Ipad (2019);
	 Ipad refVar3 = new Ipad ("Mac");
	 
	 System.out.println(refVar1.display);
	 System.out.println(Ipad.keys);
	 
	 
	 Math math = new Math()
	int newvalue = math.calculator1(7,8);
	 int newValue3 = math.calculator1(7.98);
	 System.out.println(newValue);
	 
	 int newValue2 =Math.calculator2(10,5);
	 System.out.println(newValue2);
			 
 }
}
