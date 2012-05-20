import java.util.ArrayList;
import java.util.List;


public abstract class TemplateFiltroCondicional extends Filtro{
	
	protected List<Conta> contasParaAnaliseDetalhada;
	
	public TemplateFiltroCondicional(Filtro outroFiltro) {
		super(outroFiltro);
		contasParaAnaliseDetalhada = new ArrayList();
	}
	
	public TemplateFiltroCondicional() {
		contasParaAnaliseDetalhada = new ArrayList();
	}

	public final List<Conta> filtra(List<Conta> contas){
		
		for(Conta conta :contas){
			if(deveObterAnaliseDetalhada(conta))adicionaContaParaAnaliseDetalahda(conta);
		}
		
		if(analiseDoProximoFiltro(contas)== null)return contasParaAnaliseDetalhada;
		return analiseDoProximoFiltro(contas);
	}

	
	protected abstract boolean deveObterAnaliseDetalhada(Conta conta);


	protected final void adicionaContaParaAnaliseDetalahda(Conta conta){
		if(!contasParaAnaliseDetalhada.contains(conta))	contasParaAnaliseDetalhada.add(conta);
	}
	
	
}
