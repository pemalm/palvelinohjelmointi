package fi.malm.Pelikanta;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.malm.Pelikanta.domain.Peli;
import fi.malm.Pelikanta.domain.PeliRepository;



@SpringBootApplication
public class PelikantaApplication {
	public static void main(String[] args) {
		SpringApplication.run(PelikantaApplication.class, args);
	}
	@Bean
	public CommandLineRunner peliDemo(PeliRepository repository){
		return args -> {
			repository.save(new Peli("Super Mario", "Nintendo (NES) / Famicon", "Moduli", "1985", "Super Mario sarjan ensimmäinen"));
			repository.save(new Peli("Zarch", "Acorn Archimedes", "3.5’ levyke", "1987", "Julkaistu Atari ST:lle nimellä Virus"));
			repository.save(new Peli("River Raid", "Atari 2600", "Moduli", "1982", "Myöhemmin julkaistu monelle eri alustalle"));
		};
	}
 }
