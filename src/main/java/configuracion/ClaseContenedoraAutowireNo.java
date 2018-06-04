package configuracion;

import implementaciones.EquipoMillosXML;
import interfaces.BandaMusicaXML;

public class ClaseContenedoraAutowireNo {
	
     public BandaMusicaXML bandaMusica;
     
     public EquipoMillosXML equipoMillos;

	public BandaMusicaXML getBandaMusica() {
		return bandaMusica;
	}

	public void setBandaMusica(BandaMusicaXML bandaMusica) {
		this.bandaMusica = bandaMusica;
	}

	public EquipoMillosXML getEquipoMillos() {
		return equipoMillos;
	}

	public void setEquipoMillos(EquipoMillosXML equipoMillos) {
		this.equipoMillos = equipoMillos;
	}
     
     
     
}
