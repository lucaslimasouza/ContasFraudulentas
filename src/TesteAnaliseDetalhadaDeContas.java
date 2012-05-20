import java.util.ArrayList;
import java.util.List;


public class TesteAnaliseDetalhadaDeContas {

	public static void main(String[] args) {
		
		Filtro saldoMenorQue100 = new SaldoMenorQue100Reais(new SaldoMaiorQue500MIl(new DataDeAberturaNoMesCorrente()));
		
		Conta conta1 = new Conta("AURÉLIO","1234",90.0,"DEZEMBRO");
		Conta conta2 = new Conta("JOÃO","12454",600000,"MARÇO");
		Conta conta3 = new Conta("PEDRO","8658",100.0,"JANEIRO");
		
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(conta1);
		contas.add(conta3);
		contas.add(conta2);
		
		List<Conta> contasParaAnaliseDetalhada = saldoMenorQue100.filtra(contas);

	}
}
