package se.cygni.springdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import se.cygni.springdata.entity.Admin;
import se.cygni.springdata.entity.Presenter;
import se.cygni.springdata.repository.AdminRepository;
import se.cygni.springdata.repository.PresenterRepository;

@SpringBootApplication
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner initData(final PresenterRepository presenterRepository,
                               final AdminRepository adminRepository) {
        return args -> {
            final Admin sven = adminRepository.save(new Admin("Sven", "Wesley"));

            presenterRepository.save(new Presenter("Axel", "Borgden", sven));
            presenterRepository.save(new Presenter("Horv", "Horvius", sven));

        };
    }
}