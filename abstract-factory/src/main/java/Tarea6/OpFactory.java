package Tarea6;

public class OpFactory extends Abstract_Factory {

	@Override
	Operacion getOp(String tipo, int a, int b) {
		if(tipo == null){
	         return null;
	      }		
	      
	      if(tipo.equalsIgnoreCase("Suma")){
	         new Suma().operacion(a, b);
	         
	      }else if(tipo.equalsIgnoreCase("Resta")){
	         new Resta().operacion(a, b);
	         
	      }else if(tipo.equalsIgnoreCase("Multiplicacion")){
	         new Multiplicacion().operacion(a, b);
	      }
	      
	      return null;
	}

	@Override
	Concatenar getConc(String tipo, String a, String b, String c) {
		// TODO Auto-generated method stub
		return null;
	}

}
