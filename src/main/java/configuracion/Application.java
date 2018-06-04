package configuracion;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import implementaciones.EquipoMillosXML;
import interfaces.BandaMusicaXML;
import interfaces.EquipoXML;

@SpringBootApplication
public class Application {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		AbstractApplicationContext ap = new ClassPathXmlApplicationContext("Bean.xml");
		
		/*EquipoMillosXML p = (EquipoMillosXML) ap.getBean("EquipoMillos");
		p.nombre();
		
		for(String a : p.getListaXML()){
			System.out.println(a);
		}*/
        ClaseContenedoraAutowireByName contenedora = (ClaseContenedoraAutowireByName) ap.getBean("ClaseContenedoraByName");
        
        contenedora.bandaMusica.nombreBanda();
	}
}
