package LabAssignment5SingletonPattern;

public class OnlineMonitoringSystem {

    private CentralizedQueSystem queueSystem;

    public OnlineMonitoringSystem() {
        this.queueSystem = CentralizedQueSystem.getInstance();
    }
    public void displayCurrentQueueNumber() {
        int currentQueue = queueSystem.getCurrentQueueNumber();
        System.out.println("Current queue number (monitor): " + currentQueue);
    }

}
