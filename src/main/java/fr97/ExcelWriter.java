package fr97;

import java.util.List;
import java.util.Map;

public interface ExcelWriter {

    void writePerson(List<Person> persons);

    void writeCompanies(List<Company> companies);
}
