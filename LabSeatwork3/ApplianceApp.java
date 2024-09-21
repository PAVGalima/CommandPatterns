public class ApplianceApp {

    public static void main(String[] args){


        AttendanceSystem attendanceSystem = new AttendanceSystem();
        SchoolManagementApp attendanceSystemSchoolApp = new AttendanceAdaptee(attendanceSystem);
        

        GradingSys gradingSystem = new GradingSys();
        SchoolManagementApp gradingSystemSchoolApp = new GradingAdaptee(gradingSystem);


        LibrarySys librarySystem = new LibrarySys();
        SchoolManagementApp librarySystemSchoolApp = new LibraryAdaptee(librarySystem);

            
            System.out.println(attendanceSystemSchoolApp.integrate());
            System.out.println(gradingSystemSchoolApp.integrate());
            System.out.println(librarySystemSchoolApp.integrate());
 
    }
}
