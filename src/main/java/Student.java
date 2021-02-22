import java.util.ArrayList;

public class Student {


    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {

        return grades;
    }

    public long getId() {
        return id;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double result = 0;
        for (int grade : this.grades) {
            result += grade;
        }
        return result / this.grades.size();

//    public void  {

    }
}


//
//    public static String getname() {
//        return name;
//    }
//
//    public static long getId() {
//        return id;
//    }
//
//    public static int addgrades(int grade) {
//        ArrayList<Integer>grades =new ArrayList<>();
//            grades.add(grade);
//        return grade;
//
//    }
//
//    public void StudentTest(long id, String name) {
//        Student.id = id;
//        Student.name = name;
//    }
//
//
//    public ArrayList<Integer> StudentTest() {
//        return grades;
//    }
//
//    public ArrayList<Integer> getGrades(){
//        return grades;}
//    
//}
//
