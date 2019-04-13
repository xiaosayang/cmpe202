
public class Tester {
	  public static void main(String[] args) {
		  
		  Operations addition = (int a, int b) -> a + b;
		  Operations substraction = (int a, int b) -> a - b;
		  Operations multiplication = (int a, int b) -> a * b;
		  Strategy strategy = new Strategy();
		  
		  int sum = strategy.performOperations(10, 5, addition);
		  Message m1 = num -> System.out.println("10 + 5 = "+ num);
		  m1.printMessage(Integer.toString(sum));
		  
		  int difference = strategy.performOperations(10, 5, substraction);
		  Message m2 = num -> System.out.println("10 - 5 = "+ num);
		  m2.printMessage(Integer.toString(difference));
		  
		  int product = strategy.performOperations(10, 5, multiplication);
		  Message m3 = num -> System.out.println("10 * 5 = "+ num);
		  m3.printMessage(Integer.toString(product));
	   }
}
