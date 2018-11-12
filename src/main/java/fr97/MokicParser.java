package fr97;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MokicParser implements LinkedinParser{

    @Override
    public List<Person> parsePerson(String linkedInPage) {

        Person p = new Person("filip", "ristic", "Asd", "Master");
        Person p1 = new Person("milos", "vulic", "Asd", "Executioner");
        Person p2 = new Person("rus", "korotkij", "Drugi Company", "Slave");

        List<Person> persons = new ArrayList<>();
        persons.add(p);
        persons.add(p1);
        persons.add(p2);

        return persons;
    }

    @Override
    public List<Company> parseCompany(String linkedInPage) {
        Company p = new Company("Asd");
        Company p1 = new Company("Asd");
        Company p2 = new Company("Drugi Company");

        List<Company> companies = new ArrayList<>();
        companies.add(p);
        companies.add(p1);
        companies.add(p2);

        return companies;
    }
}
