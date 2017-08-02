import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.invivoo.repository.CustomerRepository;
import com.invivoo.repository.HibernateCustomerRepositoryImpl;
import com.invivoo.service.CustomerService;
import com.invivoo.service.CustomerServiceImpl;

@Configuration
@ComponentScan({ "com.invivoo" })
public class AppConfig {

	// @Bean(name = "customerService")
	// public CustomerService getCustomerService() {
	//
	//
	// // Constructor injection
	// CustomerServiceImpl service = new
	// CustomerServiceImpl(getCustomerRepository());
	//
	//// setter injection
	//// CustomerServiceImpl service = new CustomerServiceImpl();
	//// service.setCustomerRepository(getCustomerRepository());
	// return service;
	// }
	//
	// @Bean(name = "customerRepository")
	// public CustomerRepository getCustomerRepository() {
	// return new HibernateCustomerRepositoryImpl();
	// }

	/*
	 * Cette partie est commentée lorsqu'on choisi d'effectuer l'injection de
	 * dépendences par l'approche de "Autowired" ==> on ajoue @Service à notre
	 * classe service et @epository à notre classe Dao et @Autowired àl'attribut
	 * injecté dans le service
	 */
}
