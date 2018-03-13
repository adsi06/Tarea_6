package Tarea6;

public class FactoryProducer {
	public static Abstract_Factory getFactory(String choice){
		   
	      if(choice.equalsIgnoreCase("Operacion")){
	         return new OpFactory();
	         
	      }else if(choice.equalsIgnoreCase("Concatenar")){
	         return new ConcFactory();
	      }
	      
	      return null;
	   }
}
