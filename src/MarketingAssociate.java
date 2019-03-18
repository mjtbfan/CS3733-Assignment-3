import java.util.ArrayList;

public class MarketingAssociate extends Employee {
    protected MarketingManager manager;
    protected long marketingID;
    protected String employeeName;

    MarketingAssociate(String employeeName, long marketingID) {
        this.employeeName = employeeName;
        this.manager = null;
        this.marketingID = marketingID;
    }

    public double bonus() {
        return (this.getClients().size() * 250);
    }

    public MarketingManager getManager() {
        return this.manager;
    }

    public long getMarketingID() {
        return this.marketingID;
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

