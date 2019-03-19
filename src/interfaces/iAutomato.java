package interfaces;

import java.util.ArrayList;

import EstruturaAutomato.Estado;

public interface iAutomato {

	abstract public void setBehaviorOperator(iOperador oper);

	public void addEstado(Estado estado);

	public void removeEstado(Estado estado);

	abstract public int getSizeEstado();

	abstract public void gerarEstados(String nameTransiction);

	abstract public ArrayList<iEstado> getEstado();
//	abstract public void desenha(int Width, int Height);
}
