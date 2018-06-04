package implementaciones;

import java.util.List;

import interfaces.EquipoXML;

public class EquipoMillosXML implements EquipoXML{
	
	private List<String> listaXML = null;

	@Override
	public void nombre() {
		System.out.println("Mi nombre es Millonarios");
		
	}

	public List<String> getListaXML() {
		return listaXML;
	}

	public void setListaXML(List<String> listaXML) {
		this.listaXML = listaXML;
	}
	
	

}
