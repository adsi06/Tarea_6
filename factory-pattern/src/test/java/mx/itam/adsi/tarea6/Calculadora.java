package mx.itam.adsi.tarea6;

public class Calculadora
{
	 public static void main(String[] args)
	 {
	   Factory factory = new Factory();
	   int op1 = factory.getOp("Suma",2,3);
	   System.out.println(op1);
	   
	   int op2 = factory.getOp("Resta",2,3);
	   System.out.println(op2);

	   int op3 = factory.getOp("Multiplicacion",2,3);
	   System.out.println(op3);
	 }
}
