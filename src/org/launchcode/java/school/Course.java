import java.util.Scanner;

public class Course {
    private String name;
    private String description;
    private int numberOfCredits = 0;
    private ArrayList<String> roster;


    public String getName() {
        return name;
    }
    private void setName(String aName) {
        name = aName;
    }
    public String getDescription() {
        return description;
    }
    private void setDescription(String aDescription) {
        description = aDescription;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    private void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }
    public getRoster() {
        return roster
    }
    private setRoster() {
        ArrayList<String> aRoster = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Press enter to add another student to the roster ('Finish' to quit')";

        do {
            newStudent = in.nextLine();

            if (!newStudent.equals("Finish")) {
                Student student = new Student();
                String name = student.getName();
                aRoster.add(name);
            }
        } while(!newStudent.equals("Finish"));


        roster = aRoster;
    }

}