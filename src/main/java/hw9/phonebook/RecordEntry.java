package hw9.phonebook;

public class RecordEntry {
    private final String name;
    private final String phone;

    public RecordEntry(String name, String phone) {
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
