package view;

import controller.OperacaoController;
import docarmo.FilaObject.Fila;
import model.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Fila f = new Fila();
		OperacaoController control = new OperacaoController();	
	
		for(int i = 1; i <= 20; i++) {
			Cliente c = new Cliente();
			c.Nome = ("Cliente " + i);
			c.QtdPecas = (int) (Math.random() * 31 ) + 20;
			c.ValorPecas = (double)((Math.random() * 96.0 ) + 5.0);
			f.insert(c);
		}
		
		control.Calcula(f);
		
		

	}

}
