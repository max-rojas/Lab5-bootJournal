package com.cenfotec.boot;

import com.cenfotec.boot.domain.Journal;
import com.cenfotec.boot.repository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootJournalApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootJournalApplication.class, args);
    }

    @Bean
    InitializingBean saveData(JournalRepository repo){
        return () -> {
            repo.save(new Journal("First entry","Primer lab de Spring boot","01/01/2016"));
            repo.save(new Journal("Second entry","Second step","01/02/2016"));
            repo.save(new Journal("Reading","Reading about Spring","02/01/2016"));
            repo.save(new Journal("More SpringBoot","This is spring boot","03/01/2016"));
        };
    }

}
