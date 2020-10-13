package comunicacion;

public class Tesis extends Escrito {
	static int N;
	private String idea;
	private static String[] argumentos = new String[N];
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas) {
		super(origen, titulo, autor, paginas);
		// TODO Auto-generated constructor stub
	}

	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion,
			String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		Tesis.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}
	public static String[] getArgumentos() {
		return argumentos;
	}

	public static void setArgumentos(String[] argumentos) {
		Tesis.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		int factor = 5;
		int total = palabrasPagina*factor*this.getPaginas();
		return total;
	}
	@Override
	 public String interpretacion() {
		return interpretacion;
	}
	@Override
	public String toString() {
		return resumen() + "\n" + this.idea+ "\n" + Tesis.argumentos.length + "\n" + this.conclusion+ "\n" + this.referencias;
	}


}
