import java.util.ArrayList;

public class StudentTest {
    long id;
    String name;
    ArrayList<Integer> grades;


    public StudentTest(long id, String name) {
        this.id = id;
        this.name = name;
    }


    public StudentTest(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Integer> getGrades(){
        return grades;}
    public double getGradeAverage() {
        double total = 0;
        for (int i = 0; i < grades.size(); i++) {
            total = total + grades.get(i);
        }
        double average = total / grades.size();
        return average;
    }
}
