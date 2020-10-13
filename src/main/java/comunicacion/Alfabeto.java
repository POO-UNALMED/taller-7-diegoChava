package comunicacion;

public class Alfabeto extends Pictograma {
	
	static int N;
	private static String[] letras = new String[N];
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}

	public static String[] getLetras() {
		return letras;
	}

	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}



	@Override
	public String interpretacion() {
		return this.interpretacion;
	}

	@Override
	public String toString() {
		String r = "";
		for (int i = 0 ; i<letras.length;i++) {
			if (i == letras.length-1) {
				r = r + letras[i];
			}
			else {
				r = r + letras[i] + ", ";
			}
		}
		return r;
	}

	public int cantidadLetras() {
		return letras.length;
	}

}
