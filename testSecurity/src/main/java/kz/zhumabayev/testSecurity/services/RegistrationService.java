package kz.zhumabayev.testSecurity.services;

import kz.zhumabayev.testSecurity.models.Person;
import kz.zhumabayev.testSecurity.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegistrationService {

    private final PeopleRepository personRepository;

    @Autowired
    public RegistrationService(PeopleRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Transactional
    public void register(Person person){
        personRepository.save(person);
    }
}
