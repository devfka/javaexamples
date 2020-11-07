package streams.case2;

import java.util.Objects;

public class Author2 {

    String sex;
    int age;


    public Author2(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author2 author2 = (Author2) o;
        return age == author2.age &&
                sex.equals(author2.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sex, age);
    }
}
