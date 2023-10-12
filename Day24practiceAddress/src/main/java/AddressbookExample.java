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

    // Getters and setters (omitted for brevity)
}

public class AddressBookExample {
    public static void main(String[] args) {
        List<Contact> contacts = createContacts();

        // Display the created contacts
        contacts.forEach(System.out::println);
    }

    public static List<Contact> createContacts() {
        return List.of(
                new Contact("Shilpa", "Bhonde", "Ambika Nagar", "Yavatmal", "MH", "10001", "555-123-4567", "shilpa@example.com"),
                new Contact("Aarti", "Nachan", "Chetak Ghoda", "Aurangabad", "MH", "90001", "555-987-6543", "aarti@example.com"),
                new Contact("Vaishnavi", "Waghmode", "Sainagar", "Amravati", "MH", "60601", "555-789-1234", "vaishu@example.com")
        );
    }
}