package ci.digitalacademy.monetab;
import ci.digitalacademy.monetab.models.*;
import ci.digitalacademy.monetab.services.AdresseService;
import ci.digitalacademy.monetab.services.EleveService;
import ci.digitalacademy.monetab.services.ProfesseurService;
import ci.digitalacademy.monetab.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.Instant;
import java.util.List;


@SpringBootApplication
public class MonetabApplication implements CommandLineRunner {


	@Autowired
	private AdresseService adresseService;

	@Autowired
	private UserService userService;

	@Autowired
	private ProfesseurService professeurService;

	@Autowired
	private EleveService eleveService;


	public static void main(String[] args) {
		SpringApplication.run(MonetabApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Eleve eleve = new Eleve();
		eleve.setMatricule("E2024001");
		eleve.setNom("Dibi");
		eleve.setPrenom("Ange Herve");
		eleve.setGenre("M");
		eleve.setClasse("Tle D1");
		eleve.setAge("18");
		eleve.setTelephone("0173809750");
		eleve.setEmail("hervedibi29@gmail.com");


		Eleve eleve2 = new Eleve();
		eleve2.setMatricule("E2024002");
		eleve2.setNom("Bamba");
		eleve2.setPrenom("Donourouh Ahmed");
		eleve2.setGenre("M");
		eleve2.setClasse("Tle C");
		eleve2.setAge("19");
		eleve2.setTelephone("0714006416");
		eleve2.setEmail("bambahmed@gmail.com");


		eleveService.save(eleve);
		eleveService.save(eleve2);


		Professeur professeur = new Professeur();
		professeur.setNom("Goli");
		professeur.setPrenom("Michel");
		professeur.setMatiere("Physique/Chimie");
		professeur.setAge("47");
		professeur.setGenre("M");
		professeur.setTelephone("0708932434");
		professeur.setEmail("michelgoli@gmail.com");
		professeur.setVacant("Non");


		Professeur professeur2 = new Professeur();
		professeur2.setNom("Konan");
		professeur2.setPrenom("Jacques");
		professeur2.setMatiere("Mathematiques");
		professeur2.setAge("52");
		professeur2.setGenre("M");
		professeur2.setTelephone("0708226231");
		professeur2.setEmail("konanjak@gmail.com");
		professeur2.setVacant("Non");


		professeurService.save(professeur);
		professeurService.save(professeur2);


		User user = new User();
		user.setPseudo("admin");
		user.setPassword("admin");
		user.setCreationDate(Instant.now());

		User user2 = new User();
		user2.setPseudo("ange");
		user2.setPassword("29102001");
		user2.setCreationDate(Instant.now());

		userService.save(user);
		userService.save(user2);








		/*
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

		 */


	}

}



