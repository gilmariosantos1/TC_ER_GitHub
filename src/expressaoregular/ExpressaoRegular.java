//package expressaoregular;
//
//import EstruturaAutomato.*;
////import JFF.GerarArquivo;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//
//import javax.swing.JOptionPane;
//
////import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
//
//public class ExpressaoRegular {
//	ArrayList<String> expressaoRegular = new ArrayList<String>();
//	private Automato automato = new Automato();
//
//	// Retornar um Automato
//	public void ExecutaExpressao(String er) throws Exception {
//
//		if (ValidaExpressao(er) == true) {
//			System.out.println("Expressao Validada ");
//			System.out.println(er);
//			expressaoRegular.add(er);
//			System.out.println("Expressão Regular" + expressaoRegular);
//		}
//
//	}
//
//	private boolean ValidaExpressao(String er) throws Exception {
//		// Verifica se possui uma mesma quantidade de parenteses, ou seja, verifica
//		// apenas os parênteses
//		int pa = 0; // parenteses abrindo
//		int pf = 0; // parenteses fechando
//		for (int i = 0; i < er.length(); i++) {
//			if (er.charAt(i) == '(')
//				pa++;
//			if (er.charAt(i) == ')')
//				pf++;
//		}
//		if (pa != pf) {
//			String msg = "";
//			if (pa > pf) {
//				msg = "Quantidade de paranteses '(' e ')' diferente !!! Possui " + (pa - pf) + " '(' a mais que ')'";
//			} else if (pa < pf) {
//				msg = "Quantidade de paranteses '(' e ')' diferente !!! Possui " + (pf - pa) + " '(' a menos que ')'";
//			}
//			JOptionPane.showMessageDialog(null, msg);
//
//			return false;
//		}
//		// validando a o restante da expressão
//		if (er.length() == 0)
//			throw new UnsupportedOperationException("String da Expressao Regular deve não está vazia !");
////		if (ValidaParenteses(er) != true)
////			throw new UnsupportedOperationException("Parenteses não balançeados !");
//		char inicialString = er.charAt(0);
//		if (inicialString == ')' || inicialString == '+' || inicialString == '*' || inicialString == '|') {
//			System.out.println("É necessário começar a STRING da EXPRESSAO com '(' ou com alguma letra ");
//
//			for (int i = 1; i < er.length(); i++) {
//				char atual = er.charAt(i);
//				char anterior = er.charAt(i - 1);
//				switch (atual) {
//				case '|':
//					if ((i == er.length() - 1) || anterior == '(' && (atual == '|'))
//						throw new UnsupportedOperationException("Erro 1");
//				case ')':
//					if (anterior == '|' && atual == ')')
//						throw new UnsupportedOperationException("Erro 2");
//				case '+':
//					if (anterior == '|' || anterior == '+' && atual == '+')
//						throw new UnsupportedOperationException("Erro 3");
//				case '*':
//					if (anterior == '|' || anterior == '*' && atual == '*')
//						throw new UnsupportedOperationException("Erro 4");
//				}
//			}
//			return false;
//		}
//		return true;
//	}
//
//}
