package controller;

import docarmo.FilaObject.Fila;
import model.Cliente;

public class OperacaoController {

	public OperacaoController() {

	}

	public void Calcula(Fila f) {
		while (!f.isEmpty()) {
			try {
				Cliente c = (Cliente) f.remove();
				c.Valorapagar = (c.QtdPecas * c.ValorPecas);
				System.out.println(c);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
