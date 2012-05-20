
public class SaldoMaiorQue500MIl extends TemplateFiltroCondicional{


	
	public SaldoMaiorQue500MIl(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public SaldoMaiorQue500MIl() {}
	
	@Override
	protected boolean deveObterAnaliseDetalhada(Conta conta) {
		if(conta.getSaldo() > 500000)return true;
		return false;
	}

}
