import java.util.ArrayList;

public class Student {
    public static String name;

    public static long id;

    public static ArrayList<Integer> grades;

    public static String getname() {
        return name;
    }

    public static long getId() {
        return id;
    }

    public static int addgrades(int grade) {
        ArrayList<Integer>grades =new ArrayList<>();
            grades.add(grade);
        return grade;

    }

//    public StudentTest(long id, String name) {
//        this.id = id;
//        this.name = name;
//    }


    public ArrayList<Integer> StudentTest() {
        return grades;
    }
//    public long getId() {
//        return id;
//    }
//    public String getName() {
//        return name;
//    }
//    public ArrayList<Integer> getGrades(){
//        return grades;}
//    public double getGradeAverage() {
//        double total = 0;
//        for (int i = 0; i < grades.size(); i++) {
//            total = total + grades.get(i);
//        }
//        double average = total / grades.size();
//        return average;
//    }
}

