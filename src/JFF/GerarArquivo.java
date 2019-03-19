//package JFF;
//
//import EstruturaAutomato.*;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class GerarArquivo {
//    private Automato automato;
//    public GerarArquivo(Automato automato){
//        this.automato = automato;
//        AFN auto = new AFN(automato);
//    }
//    
//    private String Cabecalho(){
//        return "<?xml version="+'"'+"1.0"+'"'+" encoding="+'"'+"UTF-8"+'"'+ 
//                " standalone="+'"'+"no"+'"'+"?>" +
//                "<!--Criado Alunos Teoria da Computação/Turma 2018.2/Expressão Regular -->";
//    }
//    
//    private String MeioBody(){
//        String retorno = "";
//        retorno += "\t<automaton>&#13;\n\t"
//                + "\t<!--Lista de Estado-->&#13;\n";
//        for(Estado e : automato.getEstados()){
//            retorno += "\t\t<state id="+'"'+e.getId()+'"'+" name="+'"'+e.getNome()+'"'+">&#13;" ;
//            if(e.isInicial(e))
//                retorno += "<initial/>&#13;";
//            if(e.isFinal(e))
//                retorno += "<final/>&#13;";
//            retorno += "</state>&#13;\n";
//        }
//        retorno += "\t\t<!-- Lista de Transição --> &#13;\n";
//        for(Transicao t : automato.getTransicoes()){
//            retorno += "\t\t<transition>&#13;\n\t"
//                    + "\t\t<from>"+t.getDe()+"</from>&#13;\n"
//                    + "\t\t\t<to>"+t.getPara()+"</to>&#13;\n"
//                    + "\t\t\t<read>"+t.getLendo()+"</read>&#13;\n"
//                    + "\t\t</transition>&#13;\n";
//        }
//        retorno += "\t</automaton>&#13;\n";
//        return retorno;
//    }
//    
//    private String IniciaBody(){
//        return "\n<structure>&#13;\n\t<type>fa</type>&#13;\n";
//    }
//    
//    private String FechaBody(){
//        return "</structure>";
//    }
//    
//    public void CriarArquivoJFF(String nomeArquivo) throws IOException{
//        File newArq = new File(nomeArquivo + ".jff");
//        if (newArq.exists()) {
//            newArq.delete();
//        }
//        newArq.createNewFile();
//
//        FileWriter fw = new FileWriter(newArq);
//        BufferedWriter bw = new BufferedWriter(fw);
//
//        // Criando arquivo
//        bw.write(Cabecalho());
//        bw.write(IniciaBody());
//        bw.write(MeioBody());
//        bw.write(FechaBody());
//        
//        
//        // fechando arquivo
//        bw.close();
//        fw.close();
//    }
//}
