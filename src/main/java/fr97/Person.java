package fr97;

public class Person {

    private String firstname;
    private String lastname;
    private String company;
    private String jobTitle;

    public Person(String firstname, String lastname, String company, String jobTitle) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCompany() {
        return company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (firstname != null ? !firstname.equals(person.firstname) : person.firstname != null) return false;
        if (lastname != null ? !lastname.equals(person.lastname) : person.lastname != null) return false;
        if (company != null ? !company.equals(person.company) : person.company != null) return false;
        return jobTitle != null ? jobTitle.equals(person.jobTitle) : person.jobTitle == null;
    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (jobTitle != null ? jobTitle.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", company='" + company + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
