package comunicacion;

public class Fabula extends Escrito {

	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = enseñanza;
		this.interpretacion = interpretacion;
	}

	public String getEnsenanza() {
		return ensenanza;
	}
	public void setEnsenanza(String enseñanza) {
		this.ensenanza = enseñanza;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}


	@Override
	public int palabrasTotales(int palabrasPagina) {
		int factor = 1;
		int total = palabrasPagina*factor*this.getPaginas();
		return total;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		return resumen() + "\n" + this.enseñanza ;
	}

}
