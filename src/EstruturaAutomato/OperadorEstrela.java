package EstruturaAutomato;

import EstruturaAutomato.Estado;
import EstruturaAutomato.Transicao;
import interfaces.iOperador;

public class OperadorEstrela implements iOperador {

	@Override
	public void gerarEstados(String nomeTransicao, Automato automato) {
		// variável local para contar os estados
		int contEstados, contEstadosInicial;
		contEstados = contEstadosInicial = automato.getSizeEstado();

		// tratando os conectores

		if (contEstadosInicial > 0) {
			contEstados++; // porque esse incremento?

			// Tratando os conectores, para receber estados, caso já exista
			Estado q0 = new Estado("Q" + contEstados);
			contEstados++;

			// criando novos estados para realizar a operação Estrela
			Estado q1 = new Estado("Q" + contEstados);
			contEstados++;

			Estado q2 = new Estado("Q" + contEstados);
			contEstados++;

			Estado qConector = new Estado("Q" + contEstadosInicial);
			Transicao tConector = new Transicao(" ");// criando um objeto transição vazia
			tConector.setLendo(automato.getEstado().get((contEstadosInicial - 1)));
			automato.getEstado().get((contEstadosInicial - 1)).addTransicao(tConector);

			Transicao t0 = new Transicao("");
			t0.setLendo(qConector);
			t0.setPara(q0); // pega uma transição e adiciona ao estado

			Transicao t1 = new Transicao("");
			t1.setLendo(qConector);
			t1.setPara(q2); // pega uma transição vazia voltando do antigo estado final para o estado
							// inicial e adiciona ao estado

			qConector.addTransicao(t0);
			qConector.addTransicao(t1);

			Transicao t2 = new Transicao(nomeTransicao);
			t2.setLendo(q0);
			t2.setPara(q1);
			q0.addTransicao(t2);

			Transicao t3 = new Transicao("");
			t3.setLendo(q1);
			t3.setPara(q2);

			Transicao t4 = new Transicao("");
			t4.setLendo(q1);
			t4.setPara(q0);

			q1.addTransicao(t3);
			q1.addTransicao(t4);

			automato.addEstado(qConector);
			automato.addEstado(q0);
			automato.addEstado(q1);
			automato.addEstado(q2);
		} else {
			// Bloco para tratamento de conectores
			Estado q0 = new Estado("Q" + contEstados);
			contEstados++;

			Estado q1 = new Estado("Q" + contEstados);
			contEstados++;

			Estado q2 = new Estado("Q" + contEstados);
			contEstados++;

			Estado q3 = new Estado("Q" + contEstados);

			Transicao t0 = new Transicao("");
			t0.setPara(q1);
			t0.setLendo(q0);

			Transicao t1 = new Transicao("");
			t1.setPara(q3);
			t1.setLendo(q0);

			q0.addTransicao(t0);
			q0.addTransicao(t1);

			Transicao t2 = new Transicao(nomeTransicao);
			t2.setLendo(q1);
			t2.setPara(q2);

			q1.addTransicao(t2);

			Transicao t4 = new Transicao("");
			t4.setLendo(q2);
			t4.setPara(q3);

			Transicao t5 = new Transicao("");
			t5.setLendo(q2);
			t5.setPara(q1);

			q2.addTransicao(t4);
			q2.addTransicao(t5);

			automato.addEstado(q0);
			automato.addEstado(q1);
			automato.addEstado(q2);
			automato.addEstado(q3);
		}
	}

}
