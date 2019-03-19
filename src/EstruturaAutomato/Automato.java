package EstruturaAutomato;

import interfaces.iAutomato;
import interfaces.iEstado;
import interfaces.iOperador;

import java.util.ArrayList;

public class Automato implements iAutomato {

	protected iOperador operador;
	protected char expressaoRegular[];
	protected String alfabeto;
	protected ArrayList<iEstado> estados = new ArrayList<iEstado>();

	public Automato() {
	}

	public void setBehaviorOperator(iOperador oper) {
		this.operador = oper;
	}

	public String getExpressaoRegular() {
		return expressaoRegular.toString();
	}

	public void setExpressaoRegular(String expressaoRegular) {
		this.expressaoRegular = expressaoRegular.toCharArray();
	}

	public String getAlfabeto() {
		return alfabeto;
	}

	public void setAlfabeto(String alfabeto) {
		this.alfabeto = alfabeto;
	}

	@Override
	public ArrayList<iEstado> getEstado() {
		// TODO Auto-generated method stub
		return this.estados;
	}

	@Override
	public void addEstado(Estado estado) {
		this.estados.add(estado);
	}

	@Override
	public void removeEstado(Estado estado) {
		this.estados.remove(estado);
	}

	@Override
	public int getSizeEstado() {

		return this.estados.size();
	}

	@Override
	public void gerarEstados(String nomeTransicao) {
		// TODO Auto-generated method stub

	}
}
