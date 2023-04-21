package model;

public class Cliente {

	public String Nome;
	public int QtdPecas;
	public double ValorPecas;
	public double Valorapagar;
	
	@Override
	public String toString() {
		return Nome + ", QtdPecas = " + QtdPecas + ", ValorPecas = " + ValorPecas + ", Total a pagar: " + Valorapagar + "]";
	}
	
	

}
