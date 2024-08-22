package aplicacao;
import java.util.ArrayList;
import java.util.List;

import entidade.conta;
import entidade.contacomercial;

public class principal {

	public static void main(String[] args) {
		
		contacomercial cc = new contacomercial("Toshio", 1937, 0, cores.BLACK, 0);
		contacomercial cc1 = new contacomercial("Toshio", 1937, 0, cores.BLACK, 0);
		
		cc.depositar(1000);
		
		System.out.println(cc);
		
		System.out.println(cc.agua());
		
		List<conta> lista = new ArrayList<>();
		
		
		lista.add(cc);
		lista.add(cc1);
		
		System.out.println(lista);

	}

}
