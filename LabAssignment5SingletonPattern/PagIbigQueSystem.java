package LabAssignment5SingletonPattern;

public class PagIbigQueSystem {
    public static void main(String[] args) {

        System.out.println();
        HelpDesk helpDesk1 = new HelpDesk("HelpDesk 1");
        HelpDesk helpDesk2 = new HelpDesk("HelpDesk 2");
        HelpDesk helpDesk3 = new HelpDesk("HelpDesk 3");

        System.out.println();

        OnlineMonitoringSystem monitor = new OnlineMonitoringSystem();

        System.out.println();
        
        helpDesk1.serveNextCustomer();
        helpDesk2.serveNextCustomer();
        helpDesk3.serveNextCustomer();

        System.out.println();

        monitor.displayCurrentQueueNumber();
        
        System.out.println();
        
        helpDesk1.resetQueue(10);
        System.out.println();
        monitor.displayCurrentQueueNumber();
        System.out.println();
        helpDesk2.serveNextCustomer();
        helpDesk3.serveNextCustomer();
    }
}
