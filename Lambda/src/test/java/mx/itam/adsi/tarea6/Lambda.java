package mx.itam.adsi.tarea6;

public class Lambda {
	public static void main(String args[]) {
	      Lambda tester = new Lambda();
			
	      //with type declaration
	      MathOperation suma = (int a, int b) -> a + b;
			
	      //with out type declaration
	      MathOperation resta = (a, b) -> a - b;
			
	      //with return statement along with curly braces
	      MathOperation multiplicacion = (int a, int b) -> { return a * b; };
			
	      //without return statement and without curly braces
	      MathOperation division = (int a, int b) -> a / b;
			
	      System.out.println("10 + 5 = " + tester.operate(10, 5, suma));
	      System.out.println("10 - 5 = " + tester.operate(10, 5, resta));
	      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplicacion));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
			
	      //without parenthesis
	      GreetingService greetService1 = message ->
	      System.out.println("Hello " + message);
			
	      //with parenthesis
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);
			
	      greetService1.sayMessage("Beto");
	      greetService2.sayMessage("Gus");
	   }
		
	   interface MathOperation {
	      int operation(int a, int b);
	   }
		
	   interface GreetingService {
	      void sayMessage(String message);
	   }
		
	   private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
}
