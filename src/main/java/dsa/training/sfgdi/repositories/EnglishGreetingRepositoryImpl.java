package dsa.training.sfgdi.repositories;

import org.springframework.stereotype.Repository;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
