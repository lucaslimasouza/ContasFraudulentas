package conta.filtro;
import conta.model.Conta;


public class DataDeAberturaNoMesCorrente extends TemplateFiltroCondicional {

	public DataDeAberturaNoMesCorrente(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public DataDeAberturaNoMesCorrente() {}
	
	@Override
	protected boolean deveObterAnaliseDetalhada(Conta conta) {
		if(conta.getDataDeAbertura().equals("JANEIRO")) return true;
		return false;
	}

}
