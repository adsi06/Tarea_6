package Tarea6;

public class AbstractFactory {
	public static void main(String[] args) {

		String op="Operacion", conc="Concatenar";
		int a=2,b=3;
		String alfa="Hola", beta="Como", gama="Estas";
		
	      Abstract_Factory opFactory = FactoryProducer.getFactory(op);

	      Operacion op1 = opFactory.getOp("Suma", a, b);

	      Operacion op2 = opFactory.getOp("Resta",a,b);
	      
	      Operacion op3 = opFactory.getOp("Multiplicacion",a,b);

	      Abstract_Factory concFactory = FactoryProducer.getFactory(conc);

	      Concatenar conc1 = concFactory.getConc("Normal",alfa,beta,gama);

	      Concatenar conc2 = concFactory.getConc("Inverso",alfa,beta,gama);

	   }
}
