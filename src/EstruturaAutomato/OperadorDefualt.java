package EstruturaAutomato;

import interfaces.iOperador;

public class OperadorDefualt implements iOperador {

	public void gerarEstados(String nomeTransicao, Automato automato) {
		// variável local para contar os estados
		int contEstados, contEstadosInicial;
		contEstados = contEstadosInicial = automato.getSizeEstado();
		
		//tratando os conectores
		
		if(contEstadosInicial > 0) {
			contEstados++;
			Transicao tConector = new Transicao("");
			tConector.setLendo(automato.getEstado().get((contEstadosInicial -1) ));
			Estado qConector = new Estado("Q"+contEstadosInicial);
			tConector.setPara(qConector);
			
			automato.getEstado().get((contEstadosInicial -1)).addTransicao(tConector);
			
			Estado q0 = new Estado("Q"+contEstados);
			
			Transicao t0 = new Transicao(nomeTransicao);
			t0.setLendo(qConector);
			t0.setPara(q0);
			
			qConector.addTransicao(t0);
			
			automato.addEstado(qConector);
			automato.addEstado(q0);
		}
		else {
			Estado q0 = new Estado("Q"+contEstados);
			contEstados++;
			Estado q1 = new Estado("Q"+contEstados);
			
			Transicao t0 = new Transicao(nomeTransicao);
			t0.setLendo(q0);
			t0.setPara(q1);
			q0.addTransicao(t0);
			
			automato.addEstado(q0);
			automato.addEstado(q1);
		}
	}

}
