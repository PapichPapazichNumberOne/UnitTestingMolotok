package third_task_test;
import third_task.AddressBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddressBookTest {

    private AddressBook addressBook;

    @BeforeEach
    public void setUp() {
        addressBook = new AddressBook();
    }

    @Test
    public void testAddContact() {
        addressBook.addContact("Леха", "79022523321");
        assertEquals("79022523321", addressBook.getPhone("Леха"));
    }

    @Test
    public void testGetPhone() {
        addressBook.addContact("Артем", "79522113444");
        assertEquals("79522113444", addressBook.getPhone("Артем"));
    }

    @Test
    public void testRemoveContact() {
        addressBook.addContact("Миша", "891113251");
        addressBook.removeContact("Миша");
        assertNull(addressBook.getPhone("Миша"));
    }

    @Test
    public void testUpdateContact() {
        addressBook.addContact("Лиза", "79113213311");
        addressBook.addContact("Лиза", "79523012266");
        assertEquals("79523012266", addressBook.getPhone("Лиза"));
    }

    @Test
    public void testRemoveNonExistentContact() {
        addressBook.removeContact("Несуществует");
        assertNull(addressBook.getPhone("Несуществует"));
    }
}
