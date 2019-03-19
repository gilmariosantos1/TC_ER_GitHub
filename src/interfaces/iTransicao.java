package interfaces;

public interface iTransicao {
	  	public void setNome(String nome);
	  	public String getNome();
	    public void setPara(iEstado para);
	    public iEstado getPara();
	    public void setLendo(iEstado lendo);
	    public iEstado getLendo();
	    
	    
}