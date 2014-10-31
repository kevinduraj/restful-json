package kduraj.component;

import org.springframework.stereotype.Component;

import kduraj.Person;

@Component
public class PersonService implements IPersonService {

    /*--------------------------------------------------------------------------------------------
     http://localhost:8084/data/person?id=42
     */
    @Override
    public Person getPersonDetail(Integer id) {

        Person person = new Person();
        person.setId(id);
        person.setLocation("Agoura Hills, CA");
        person.setName("Kevin Duraj");
        return person;
    }
    /*--------------------------------------------------------------------------------------------*/

    @Override
    public Person getPersonInfo(Integer id) {
        Person person = new Person();
        person.setId(id);
        person.setLocation("Santa Monica, CA");
        person.setName("Java Developer");
        return person;
    }
}
