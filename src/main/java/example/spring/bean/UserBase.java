package example.spring.bean;

public class UserBase {

    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public UserBase setName(String name) {
        this.name = name;
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
