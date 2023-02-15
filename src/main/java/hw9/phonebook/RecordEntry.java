package hw9.phonebook;

public class Record {
    private String name;
    private String phone;

    public Record(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "name= " + name + ", phone= " + phone;
    }

    public String getName() {
        return name;
    }
}
