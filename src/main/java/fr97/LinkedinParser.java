package fr97;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LinkedinParser {

    /**
     *
     * @param linkedInPage
     * @return key -> ime/prezime/kompanija/pozicija
     */
    List<Person> parsePerson(String linkedInPage);

    List<Company> parseCompany(String linkedInPage);

}
