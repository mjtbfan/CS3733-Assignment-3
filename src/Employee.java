import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Employee {
    private ArrayList<Client> clientList;

    Employee() {
        this.clientList = new ArrayList<Client>();
    }

    public Boolean addClient(Client client) {
        for (Client i : this.clientList) {
            if (i.getID() == client.getID()) {
                return false;
            }
        }
        this.clientList.add(client);
        Collections.sort(this.clientList, new ClientComparator());
        ArrayList<Employee> temp = client.getEmployeeList();
        temp.add(this);
        client.setEmployeeList(temp);
        return true;
    }

    public ArrayList<Client> getClients() {
        return this.clientList;
    }

    public void setClients(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }
}

