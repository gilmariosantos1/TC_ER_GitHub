package EstruturaAutomato;

import interfaces.iEstado;
import interfaces.iTransicao;
import java.util.ArrayList;

public class Estado implements iEstado {
	public String nome;
	private ArrayList<iTransicao> transicao = new ArrayList<iTransicao>();

	public Estado() {
	}

	public Estado(String nome) {
		this.nome = nome;
	}

	// Gets and Sets

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void addTransicao(iTransicao elem) {
		this.transicao.add(elem);

	}

	@Override
	public void removeTransicao(iTransicao elem) {
		this.transicao.add(elem);
	}

	@Override
	public ArrayList<iTransicao> getTransicao() {
		return this.transicao;
	}

	@Override
	public boolean getEstadoFinal() {
		throw new UnsupportedOperationException("Não suportado!");
	}

	@Override
	public iTransicao getTransicao(int index) {
		throw new UnsupportedOperationException("Não suportado!");
	}

}
