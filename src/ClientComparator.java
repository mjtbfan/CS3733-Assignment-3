import java.util.Comparator;

public class ClientComparator implements Comparator<Client> {
    public int compare(Client c1, Client c2) {
        if (c1.getID() > c2.getID()) {
            return 1;
        } else if (c1.getID() == c2.getID()) {
            return 0;
        } else {
            return -1;
        }
    }
}
