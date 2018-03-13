package Tarea6;

public abstract class Abstract_Factory {
	abstract Operacion getOp(String tipo, int a, int b);
	abstract Concatenar getConc(String tipo, String a, String b, String c);
}
