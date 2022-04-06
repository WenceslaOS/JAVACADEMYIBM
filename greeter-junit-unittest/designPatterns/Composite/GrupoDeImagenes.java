package Composite;

import java.util.ArrayList;
import java.util.List;

public class GrupoDeImagenes implements Grafico {
	
	private List < Grafico > childGrafico;

	public GrupoDeImagenes () {
		
		super ();
		this.childGrafico = new ArrayList < Grafico >();
		
	}
	public GrupoDeImagenes ( List<Grafico> childGrafico ) {
		
		this.childGrafico = childGrafico;
		
	}
	
	public void addGrafico ( Grafico grupo ) {
		
		this.childGrafico.add ( grupo );
	}
	
	public void removeGrafico ( Grafico grupo ) {
		
		this.childGrafico.remove ( grupo );
		
	}

	@Override
	public void pintar () {
		
		for ( Grafico grafico : this.childGrafico ) {
			
			grafico.pintar ();
			
		}
		
	}
}
