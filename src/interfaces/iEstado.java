package interfaces;

import interfaces.iTransicao;
import java.util.ArrayList;

public interface iEstado {
	
	public void setNome(String nome);
	public String getNome();
	public boolean getEstadoFinal();
	public iTransicao getTransicao(int index);
	abstract public void addTransicao(iTransicao elem);
	abstract public void removeTransicao(iTransicao elem);
	abstract public ArrayList<iTransicao> getTransicao();
}
