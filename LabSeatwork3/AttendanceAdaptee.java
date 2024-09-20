public class AttendanceAdaptee implements SchoolManagementApp{

    private AttendanceSystem attendanceSystem;

    public AttendanceAdaptee (AttendanceSystem attendanceSystem){
        this.attendanceSystem = attendanceSystem;
    }

    @Override
    public String integrate(){
        return attendanceSystem.markAttendance();
    }

}
