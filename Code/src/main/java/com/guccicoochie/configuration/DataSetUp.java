package com.guccicoochie.configuration;

import com.guccicoochie.entities.User;
import com.guccicoochie.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSetUp implements CommandLineRunner {

    UserRepository userRepository;
    DBSetUp dbSetup = new DBSetUp();

    @Override
    public void run(String... args) throws Exception {
        System.out.println("---------------------->   ");
        /*userRepository.save(new User("Patrik","Alcoholic, Pussyholic, Audioholic","Flintholm"));
        userRepository.save(new User("Chiara","Italian beauty to the bone","Somewhere past Hellerup"));
        userRepository.save(new User("Samuel","fellow slavic brother","Not a clue"));
        userRepository.save(new User("Gloria","Stoner, Pussyholic, Workaholic","Hvidovre"));*/
    }
}
