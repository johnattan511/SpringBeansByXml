package beans;

import org.springframework.beans.factory.DisposableBean;

public class BeanEliminador implements DisposableBean{

	@Override
	public void destroy() throws Exception {
		System.out.println("Eliminando el Bean");
		
	}

}
