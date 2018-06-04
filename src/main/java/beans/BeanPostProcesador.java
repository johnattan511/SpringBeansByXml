package beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcesador implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Antes de procesar : " + beanName);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
}
