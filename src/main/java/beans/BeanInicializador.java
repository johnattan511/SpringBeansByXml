package beans;

import org.springframework.beans.factory.InitializingBean;

public class BeanInicializador implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Entrando al Bean por el Bean Initializer");
		
	}

}
