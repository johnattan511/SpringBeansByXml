package configuracion;

import interfaces.BandaMusicaXML;

public class ClaseContenedoraAutowireByName {

	 public BandaMusicaXML bandaMusica;
	 
	 

	public ClaseContenedoraAutowireByName(BandaMusicaXML bandaMusica) {
		super();
		this.bandaMusica = bandaMusica;
	}

	public BandaMusicaXML getBandaMusica() {
		return bandaMusica;
	}

	public void setBandaMusica(BandaMusicaXML bandaMusica) {
		this.bandaMusica = bandaMusica;
	}
	 
	 
}
