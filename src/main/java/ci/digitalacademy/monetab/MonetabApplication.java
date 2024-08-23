package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.models.Adresse;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.AdresseService;
import ci.digitalacademy.monetab.services.UserService;
import jakarta.persistence.Id;
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
	private AdresseService adresseService;

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(MonetabApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {

		Adresse adresse = new Adresse(null, "France", "Abidjan", "Rue fanny");

		User user = new User(null, "ange", "291020", Instant.now(), adresse);

		adresseService.save(adresse);
	    userService.save(user);


	  List<User> users = userService.findAll();
	   System.out.println(users);


	//Optional<User> optionalUser = userService.findOne(1L);
	//System.out.println(optionalUser);

	//Optional<User> optionalUser = userService.findOne(1L);
	//System.out.println(optionalUser);

	//	user.setPseudo("ange29");

	//	userService.save(user);

	//	userService.delete(user.getId());





}


}
