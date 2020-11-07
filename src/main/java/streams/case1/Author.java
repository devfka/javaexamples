package streams.case1;

import java.util.Objects;

public class Author {

    String surname;
    int age;

    public Author(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return surname + "  " + age;
     }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
