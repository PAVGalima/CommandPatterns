package LabAssignment5SingletonPattern;
public class HelpDesk {

    private String deskName;
    private CentralizedQueSystem queueSystem;

    public HelpDesk(String deskName) {
        this.deskName = deskName;
        this.queueSystem = CentralizedQueSystem.getInstance();
    }
    public void serveNextCustomer() {
        int queueNumber = queueSystem.getNextQueueNumber();
        System.out.println(deskName + " is now serving queue number: " + queueNumber);
    }
    public void resetQueue(int resetNumber) {
        queueSystem.resetQueueNumber(resetNumber);
    }
}
