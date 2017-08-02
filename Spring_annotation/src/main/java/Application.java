import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.invivoo.service.CustomerService;

public class Application {

	private static ApplicationContext appContext;

	public static void main(String[] args) {

		appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerService service = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service.findAll().get(0).getFirstname());
	}

}
