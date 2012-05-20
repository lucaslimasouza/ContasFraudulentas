package conta.filtro;
import conta.model.Conta;



public class SaldoMenorQue100Reais extends TemplateFiltroCondicional {


	public SaldoMenorQue100Reais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public SaldoMenorQue100Reais() {}
	
	
	@Override
	protected boolean deveObterAnaliseDetalhada(Conta conta) {
		if(conta.getSaldo() < 100) return true;
		return false;
	}

}
