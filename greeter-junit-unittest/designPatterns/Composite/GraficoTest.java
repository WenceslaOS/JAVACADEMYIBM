package Composite;

public class GraficoTest {

	public static void main(String[] args) {
		
		Grafico circulo = new Circulo ( 10.5F );
		Grafico cuadrado = new Cuadrado ( 20F );
		Grafico triangulo = new Triangulo ( 15.1F, 40F );
		
		GrupoDeImagenes grupoDeImagenes = new GrupoDeImagenes ();
		grupoDeImagenes.addGrafico ( circulo );
		grupoDeImagenes.addGrafico ( cuadrado );
		grupoDeImagenes.addGrafico ( triangulo );
		grupoDeImagenes.pintar ();
		
	}

}
