import java.util.ArrayList;

public class MarketingManager extends Employee {
    protected ArrayList<Employee> employeeList;
    protected MarketingManager manager;
    protected long marketingID;
    protected String employeeName;

    MarketingManager(String employeeName, long marketingID) {
        this.employeeName = employeeName;
        this.employeeList = new ArrayList<Employee>();
        this.manager = null;
        this.marketingID = marketingID;
    }

    public double bonus() {
        return (this.employeeList.size() * 500);
    }

    public ArrayList<Employee> getEmployeeList() {
        return this.employeeList;
    }

    public MarketingManager getManager() {
        return this.manager;
    }

    public long getMarketingID() {
        return this.marketingID;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setManager(MarketingManager manager) {
        this.manager = manager;
        ArrayList<Employee> temp = manager.getEmployeeList();
        temp.add(this);
        manager.setEmployeeList(temp);
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setMarketingID(long marketingID) {
        this.marketingID = marketingID;
    }
}
