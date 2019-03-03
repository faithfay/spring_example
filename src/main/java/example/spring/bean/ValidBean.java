package example.spring.bean;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class ValidBean {


    @NotEmpty
    private String name;

    @NumberFormat(pattern = "#####")
    private int age;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @Email
    private String email;

    @Override
    public String toString() {
        return "ValidBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public ValidBean setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public ValidBean setAge(int age) {
        this.age = age;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public ValidBean setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ValidBean setEmail(String email) {
        this.email = email;
        return this;
    }
}
