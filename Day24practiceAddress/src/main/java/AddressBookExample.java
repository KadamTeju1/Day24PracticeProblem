import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Contact {
    public Contact(String john, String doe, String s, String newYork, String ny, String number, String s1, String mail) {
    }
    // ... (same as before)
}

class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    // ... (same methods as before)

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getAllContacts() {
        return null;
    }
}

public class AddressBookExample {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        // Adding existing contacts
        addressBook.addContact(new Contact("John", "Doe", "123 Main St", "New York", "NY", "10001", "555-123-4567", "john@example.com"));
        addressBook.addContact(new Contact("Jane", "Smith", "456 Elm St", "Los Angeles", "CA", "90001", "555-987-6543", "jane@example.com"));

        // Adding a new contact
        Contact newContact = new Contact("Alice", "Johnson", "789 Oak St", "Chicago", "IL", "60601", "555-789-1234", "alice@example.com");
        addressBook.addContact(newContact);

        // Display all contacts
        List<Contact> allContacts = addressBook.getAllContacts();
        allContacts.forEach(System.out::println);
    }
}