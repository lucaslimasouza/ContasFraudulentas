import java.util.List;


public abstract class Filtro {
	
	protected Filtro outroFiltro;
	
	public Filtro() {}

	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public abstract List<Conta> filtra(List<Conta> contas);
	
	protected final List<Conta> analiseDoProximoFiltro(List<Conta> contas){
		if(outroFiltro == null) return null;
		return outroFiltro.filtra(contas);
	}

}
