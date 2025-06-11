package Controller;
import Models.Contact;
import Models.LinkedList;
import Models.Node;

public class ContactManager<T, U> {
    private LinkedList<Contact<T, U>> contacts;

    public ContactManager() {
        contacts = new LinkedList<>();
    }

    public void addContact(Contact<T, U> contact) {
        contacts.agregarAlFinal(contact);
    }

    public Contact<T,U> findContactByName(String name) {
        Node<Contact<T, U>> current = contacts.cabeza; // Cambiado para usar getter
        while (current != null) {
            if (current.valor.getNombre().toString().equalsIgnoreCase(name)) {
                return current.valor;
            }
            current = current.siguiente;
        }
        return null;
    }

    public boolean deleteContactByName(String name) {
        Node<Contact<T, U>> current = contacts.cabeza;
        while (current != null) {
            if (current.valor.getNombre().toString().equalsIgnoreCase(name)) {
                return contacts.eliminarPorValor(current.valor);
            }
            current = current.siguiente;
        }
        return false;
    }

    public void printContacts() {
        contacts.imprimir();
    }
}
