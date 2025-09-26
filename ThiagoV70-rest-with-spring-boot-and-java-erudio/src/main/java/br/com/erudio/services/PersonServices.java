package br.com.erudio.services;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person findById(String id) {
        logger.info("Finding one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFristname("Thiago");
        person.setLastname("Santos");
        person.setAddress("Recife - Pernambuco - Brasil");
        person.setGenter("Male");
        return person;
    }

    private Person mockPerson(int i) {

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFristname("Fristname " + i);
        person.setLastname("Lastname " + i);
        person.setAddress("Some Address in Brasil");
        person.setGenter("Male");
        return person;
    }
}
