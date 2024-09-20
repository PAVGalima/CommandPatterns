public class GradingAdaptee implements SchoolManagementApp{

    private GradingSys gradingSystem;

    public GradingAdaptee(GradingSys gradingSystem){
        this.gradingSystem = gradingSystem;
    }

    @Override
    public String integrate() {
        return gradingSystem.recordGrades();
    }

}
