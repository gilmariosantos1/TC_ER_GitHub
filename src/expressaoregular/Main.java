package expressaoregular;

import java.util.ArrayList;

import EstruturaAutomato.AFN;
import interfaces.iEstado;
import interfaces.iTransicao;

public class Main {

	private static ArrayList<iEstado> estados;

	public static void main(String[] args) {
		// lembrar de colocar AVISO: A representação na expressao Regular do OU é dada
		// por | = pipe
		String expressaoR = "a*";

		AFN afn = new AFN(expressaoR);
		// afn.desenha(800, 600);

		System.out.println("AFN Estados gerados algorítimo de Thompson da expressão:" + expressaoR);
		System.out.println("ESTADO INICIAL:" + afn.getEstadoInicial().getNome());
		System.out.println("ESTADO FINAL:" + afn.getEstadoFinal().getNome());

		estados = afn.getEstado();
		for (int i = 0; i < estados.size(); i++) {
			ArrayList<iTransicao> t = estados.get(i).getTransicao();
			System.out.println(estados.get(i).getNome());
			for (int x = 0; x < t.size(); x++) {
				System.out.println("  OJETO TRANSIÇÃO:\n\t\t>>><EstouEm>" + t.get(x).getLendo().getNome());
//				if (t.get(x).getNome() == "") {
//					System.out.println("\t\t>>" + "λ");
//			}else {
//				System.out.println("\t\t>>" + t.get(x).getNome());
//			}
//				System.out.println("\t\t>>><PRÓX.>" + t.get(x).getPara().getNome());
//			}
				System.out.println("\t\t>>" + t.get(x).getNome());
				System.out.println("\t\t>>><PRÓX.>" + t.get(x).getPara().getNome());
			}
		}

	}

}
