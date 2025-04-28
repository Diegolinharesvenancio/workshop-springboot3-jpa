package diegovenancio.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import diegovenancio.course.entites.Order;
import diegovenancio.course.entites.User;
import diegovenancio.course.repositories.OrderRepository;
import diegovenancio.course.repositories.UserRepository;

@Configuration
@Profile("testdb")
 public class TestConfig implements CommandLineRunner {

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository; 

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),u1,u2); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),u2,u1); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),u1,u2); 
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	

	
}