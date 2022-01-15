/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	 
	 System.out.println("ENTER THREE NUMBERS :");
	 int number1,number2,number3;
	 Scanner object = new Scanner(System.in);
	 number1 = object.nextint();
	 number2 = object.nextint();
	 number3 = object.nextint();
	 if(number1>number2 && number2>number3){
	    System.out.println("THE GREATEST NUMBER IS : " + number1); 
	 }else if(number2>number1&&number1>number3) {
	     System.out.println("THE GREATEST NUMBER IS : " + number2);
	 }else{
	     System.out.println("THE GREATEST NUMBER IS : " + number3);
	 }
	 
	}
}
