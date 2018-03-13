package mx.itam.adsi.tarea6;

public class Factory
{
	//use getShape method to get object of type shape 
	public int getOp(String tipo, int a, int b)
	{
	 if(tipo == null){
	    return 0;
	 }		
	 if(tipo.equalsIgnoreCase("Suma"))
	 {
	    return new Suma().draw(a,b);    
	 } else if(tipo.equalsIgnoreCase("Resta"))
	 {
	    return new Resta().draw(a,b);	        
	 } else if(tipo.equalsIgnoreCase("Multiplicacion"))
	 {
	    return new Multiplicacion().draw(a, b);
	 } 
	 return 0;
	}
}
