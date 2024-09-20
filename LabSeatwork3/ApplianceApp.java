public class ApplianceApp {

    public static void main(String[] args){


        AttendanceSystem attendanceSystem = new AttendanceSystem();
        SchoolManagementApp attendanceSystemSMA = new AttendanceAdaptee(attendanceSystem);

        GradingSys gradingSystem = new GradingSys();
        SchoolManagementApp gradingSystemSMA = new GradingAdaptee(gradingSystem);

        LibrarySys librarySystem = new LibrarySys();
        SchoolManagementApp librarySystemSMA = new LibraryAdaptee(librarySystem);

            
            System.out.println(attendanceSystemSMA.integrate());
            System.out.println(gradingSystemSMA.integrate());
            System.out.println(librarySystemSMA.integrate());
 
    }
}
