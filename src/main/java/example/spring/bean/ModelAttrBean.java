package example.spring.bean;

public class ModelAttrBean {

    private String username;
    private String password;
    private int age;

    public ModelAttrBean() {

    }

    public ModelAttrBean(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ModelAttrBean{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public ModelAttrBean setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ModelAttrBean setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getAge() {
        return age;
    }

    public ModelAttrBean setAge(int age) {
        this.age = age;
        return this;
    }
}
