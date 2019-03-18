public class Marketing {

    public static void main(String[] args) {
        MarketingManager John = new MarketingManager("John", 1);
        MarketingManager Mary = new MarketingManager("Mary", 2);
        MarketingAssociate Peter = new MarketingAssociate("Peter", 3);
        MarketingAssociate Jim = new MarketingAssociate("Jim", 4);
        MarketingAssociate Janet = new MarketingAssociate("Janet", 5);

        Peter.setManager(John);
        Mary.setManager(John);
        Jim.setManager(Mary);
        Janet.setManager(Mary);

        Client Andrew = new Client(3, "Andrew");
        Client Cole = new Client(9, "Cole");
        Client Kyle = new Client(42, "Kyle");

        John.addClient(Cole);
        Mary.addClient(Andrew);
        Mary.addClient(Kyle);

        System.out.println("Marketing Manager: " + John.getEmployeeName() + ". Employees: " + ((MarketingAssociate)John.getEmployeeList().get(0)).getEmployeeName() + "," + ((MarketingManager)John.getEmployeeList().get(1)).getEmployeeName() + ". Clients: " + John.getClients().get(0).getID());
        System.out.println("Marketing Manager: " + ((MarketingManager)John.getEmployeeList().get(1)).getEmployeeName() + ". Employees: " + ((MarketingAssociate)((MarketingManager) John.getEmployeeList().get(1)).getEmployeeList().get(0)).getEmployeeName() + "," +
                ((MarketingAssociate)((MarketingManager) John.getEmployeeList().get(1)).getEmployeeList().get(1)).getEmployeeName() + ". Clients: " + John.getEmployeeList().get(1).getClients().get(0).getID() + "," + John.getEmployeeList().get(1).getClients().get(1).getID());
        System.out.println("Employee: " + Peter.getEmployeeName() + ". MarketingManager: " + Peter.getManager().getEmployeeName() + ".");
        System.out.println("Employee: " + Jim.getEmployeeName() + ". MarketingManager: " + Jim.getManager().getEmployeeName() + ".");
        System.out.println("Employee: " + Janet.getEmployeeName() + ". MarketingManager: " + Janet.getManager().getEmployeeName() + ".");
        System.out.println("Client ID: " + Andrew.getID() + ". Marketing Employee: " + ((MarketingManager)Andrew.getEmployeeList().get(0)).getEmployeeName());
        System.out.println("Client ID: " + Cole.getID() + ". Marketing Employee: " + ((MarketingManager)Cole.getEmployeeList().get(0)).getEmployeeName());
        System.out.println("Client ID: " + Kyle.getID() + ". Marketing Employee: " + ((MarketingManager)Kyle.getEmployeeList().get(0)).getEmployeeName());
        }
    }
