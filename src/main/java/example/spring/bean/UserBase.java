package example.spring.bean;

public class UserBase {

    private String name;
    private String passwd;
    private int age;
    private Address address;

    public UserBase() {
    }

    public UserBase(String name, String passwd, int age) {
        this.name = name;
        this.passwd = passwd;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserBase{" +
                "name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public UserBase setName(String name) {
        this.name = name;
        return this;
    }

    public String getPasswd() {
        return passwd;
    }

    public UserBase setPasswd(String passwd) {
        this.passwd = passwd;
        return this;
    }

    public int getAge() {
        return age;
    }

    public UserBase setAge(int age) {
        this.age = age;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public UserBase setAddress(Address address) {
        this.address = address;
        return this;
    }
}
