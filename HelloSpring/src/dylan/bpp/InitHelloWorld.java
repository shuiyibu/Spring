/**
 * 
 */
package dylan.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author langdylan
 *Feb 6, 2016 11:21:00 PM
 */
public class InitHelloWorld implements BeanPostProcessor
{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
	{
		// TODO Auto-generated method stub
		System.out.println("AfterInitialization: "+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
	{
		// TODO Auto-generated method stub
		System.out.println("BeforeInitialization:"+beanName);
		return bean;
	}

}
