package epam.java.model.entity;

public class RecordInJournal {
    private String name;
    private String surname;
    private String dateOfBirth;
    private String telephoneNumber;
    private String homeAddress;

    public RecordInJournal(String name, String surname, String dateOfBirth, String telephoneNumber, String homeAddress) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.telephoneNumber = telephoneNumber;
        this.homeAddress = homeAddress;
    }

    public RecordInJournal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "RecordInJournal{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }
}
