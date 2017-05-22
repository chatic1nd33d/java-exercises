public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName() {
        return name;
    }
    public void setName(String aName) {
        name = aName;
    }
    public int getStudentId() {
        return studentId;
    }
    private void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double aGpa) {
        gpa = aGpa;
    }
    public static void main(String[] args) {
        Student student = new Student();
        Scanner in = new Scanner(System.in);
        String newStudent;
    }
}