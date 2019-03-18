import java.util.ArrayList;

public class Client {
    private int clientID;
    private String clientName;
    private ArrayList<Employee> employeeList;

    Client(int clientID, String clientName) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.employeeList = new ArrayList<Employee>();
    }

    public double totalSales() {
        // theres no description on what to do here so idk
        return 0;
    }

    public int getID() {
        return this.clientID;
    }

    public String getClientName() {
        return this.clientName;
    }

    public ArrayList<Employee> getEmployeeList() {
        return this.employeeList;
    }

    public void setID(int clientID) {
        this.clientID = clientID;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
