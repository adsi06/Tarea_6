package Tarea6;

public class ConcFactory extends Abstract_Factory {

	@Override
	Operacion getOp(String tipo, int a, int b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Concatenar getConc(String tipo, String a, String b, String c) {
		if(tipo == null){
	         return null;
	      }		
	      
	      if(tipo.equalsIgnoreCase("Normal")){
	         new Normal().concat(a, b, c);
	         
	      }else if(tipo.equalsIgnoreCase("Inverso")){
	         new Inverso().concat(a, b, c);
	         
	      }	      
	      return null;
	}

}
