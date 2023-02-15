package hw9.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

private final List<RecordEntry> recordEntries = new ArrayList<>();

    public void add(RecordEntry recordEntry) {
        recordEntries.add(recordEntry);
    }

    public RecordEntry find(String nameFind) {
        for (RecordEntry recordEntry : recordEntries) {
            if (recordEntry.getName().equals(nameFind)) return recordEntry;
        }
        return null;
    }
}
