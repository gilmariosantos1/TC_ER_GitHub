package EstruturaAutomato;

import interfaces.iEstado;


public final class AFN extends Automato {
	
	public AFN(String ExpressaoRegular) {
		this.expressaoRegular = ExpressaoRegular.toCharArray();
		this.operarEstado(ExpressaoRegular);
	}
	public iEstado getEstadoFinal() {
		return this.estados.get( (this.estados.size() -1) );
	}
	public iEstado getEstadoInicial() {
		return this.estados.get(0);
	}
	
	private void operarEstado(String er) {
		String stringAux = "";
		
		char[] expressao= er.toCharArray();
		
		char atual, prox;
		//Definição do comportamento a ser utilizado inicialmente caso não entre no switch case ou só tenha informação de 2 caracteres no máximo 
		this.setBehaviorOperator(new OperadorDefualt());
		if(expressao.length > 2) {
			for(int i = 0; i <(expressao.length -1); i++) {
				atual = expressao[i];
				//Tratamento para geração de estados dos parênteses
				if(atual == '(') {
					stringAux = "";
					int x;
					for(x = (i+1); (x < expressao.length && expressao[x] != ')'); x++)
						stringAux += expressao[x];
					i = (i + stringAux.length());
					this.operarEstado(stringAux);
				}
				else {
					prox = expressao[(i + 1)];
					switch (prox) {
					case '+':
							this.setBehaviorOperator(new OperadorAdicao());
							i++;
						break;
					case '*':
							this.setBehaviorOperator(new OperadorEstrela());
							i++;
						break;
					case '|':
							this.setBehaviorOperator(new OperadorOu());
							i++;
						break;
					default:
						this.setBehaviorOperator(new OperadorDefualt());
						break;
					}
					this.gerarEstados(""+ atual);
				}
			}
		}
		 if(expressao.length == 2) {
			this.gerarEstados(""+expressao[0]);
			this.gerarEstados(""+expressao[1]);
		}
		else
			this.gerarEstados(""+expressao[0]);
	}
	public final void gerarEstados(String nomeTransicao) {
		this.operador.gerarEstados(nomeTransicao, this);
	}
}
