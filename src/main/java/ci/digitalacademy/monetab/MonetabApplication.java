package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class MonetabApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(MonetabApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {
	User user = new User(null, "ange", "291020", Instant.now());
	userService.save(user);


	   List<User> users = userService.findAll();
	   System.out.println(users);


	Optional<User> optionalUser = userService.findOne(1L);
		System.out.println(optionalUser);

		user.setPseudo("ange29");

		userService.save(user);

		userService.delete(user.getId());


}


}
