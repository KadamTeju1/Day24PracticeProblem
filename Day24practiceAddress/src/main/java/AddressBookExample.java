import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Object getFirstName() {
        return null;
    }

    public Object getLastName() {
        return null;
    }

    // Getters and setters (omitted for brevity)
}

class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    // ... (same methods as before)

    public void deleteContact(String firstNameToDelete, String lastNameToDelete) {
        List<Contact> updatedContacts = contacts.stream()
                .filter(contact -> !(contact.getFirstName().equals(firstNameToDelete) && contact.getLastName().equals(lastNameToDelete)))
                .collect(Collectors.toList());

        contacts = updatedContacts;
    }

    public void addContact(Contact contact) {
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

        // Deleting a contact
        addressBook.deleteContact("John", "Doe");

        // Display all contacts
        List<Contact> allContacts = addressBook.getAllContacts();
        allContacts.forEach(System.out::println);
    }
}