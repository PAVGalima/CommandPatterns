package LabAssignment5SingletonPattern;

public class CentralizedQueSystem {
    
    private static CentralizedQueSystem instance;
    private int currentQueueNumber;
    private CentralizedQueSystem() {
        this.currentQueueNumber = 1;
    }
    public static synchronized CentralizedQueSystem getInstance() {
        if (instance == null) {
            instance = new CentralizedQueSystem();
        }
        return instance;
    }
    public synchronized int getNextQueueNumber() {
        return currentQueueNumber++;
    }
    public synchronized void resetQueueNumber(int resetNumber) {
        this.currentQueueNumber = resetNumber;
        System.out.println("Queue number reset to " + resetNumber);
    }
    public synchronized int getCurrentQueueNumber() {
        return currentQueueNumber;
    }

}
