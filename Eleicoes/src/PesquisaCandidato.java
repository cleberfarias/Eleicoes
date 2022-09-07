
public class PesquisaCandidato extends Candidato{
	private Candidato candidato;
	private Pesquisa pesquisa;
	
	public PesquisaCandidato(Candidato candidato, Pesquisa pesquisa) {
		super();
		this.candidato = candidato;
		this.pesquisa = pesquisa;
		
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public Pesquisa getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(Pesquisa pesquisa) {
		this.pesquisa = pesquisa;
	}
	
	
	

}
