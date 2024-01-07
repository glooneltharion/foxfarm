package com.gfa.springplussql;

import com.gfa.springplussql.model.Fox;
import com.gfa.springplussql.repository.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringplussqlApplication implements CommandLineRunner {

    private final FoxRepository foxRepository;

    @Autowired
    public SpringplussqlApplication(FoxRepository foxRepository) {
        this.foxRepository = foxRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringplussqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        foxRepository.save(new Fox("Silver Fox", "Silver-Black", 24));
        foxRepository.save(new Fox("Fennec Fox", "Sandy", 15));
        foxRepository.save(new Fox("Iberian Fox", "Red", 4));
        foxRepository.save(new Fox("Cherry Red Fox", "Red", 3));
        foxRepository.save(new Fox("Arctic Fox", "White", 26));
        foxRepository.save(new Fox("Gold Platinum Fox", "Pale-Orange", 14));
        foxRepository.save(new Fox("Turkestan Fox", "Pale-Orange", 6));
        foxRepository.save(new Fox("Rüppell’s Fox", "Sandy", 10));
        foxRepository.save(new Fox("Anadyr Fox", "Red", 18));
        foxRepository.save(new Fox("Japanese Red Fox", "Red", 12));
    }
}
