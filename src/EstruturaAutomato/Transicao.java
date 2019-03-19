package EstruturaAutomato;

import interfaces.iTransicao;
import interfaces.iEstado;

public class Transicao implements iTransicao{
    private String nome;
    private iEstado lendo;
    private iEstado para;
    
    //construtor default
    public Transicao () { }
    
    //construtor com todas as variáveis, caso precise ser utilizada todas
    public Transicao(String nome, iEstado para, iEstado lendo){
        this.nome = nome;
        this.para = para;
        this.lendo = lendo;
    }
    //construtor específico para operadorDefault gerando um objeto lá na classe.
    public Transicao(String nome) {
    	this.nome = nome;
    }
    
    
    //Gets and Sets 
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public iEstado getPara() {
        return para;
    }

    public void setPara(iEstado para) {
        this.para = para;
    }

    public iEstado getLendo() {
        return lendo;
    }

    public void setLendo(iEstado lendo) {
        this.lendo = lendo;
    }
    
}
