import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest {
    //creates classes
    @Test
    public void testIfStudentObjectCanBeCreated(){
        Student fer =new Student(1L, "fer");
        Student david=null;
assertNotNull(fer);
        assertNull(david);
    }

    @Test
    public void testIfFieldsWork(){
Student fer =new Student(1L,"fer");
assertEquals(1L,fer.getId());
assertEquals("fer",fer.getName());
assertNotNull(fer.getGrades());


    }
    @Test
    public void testIfAddGradeWorks(){
        Student fer =new Student(1l,"fer");
        assertEquals(0,fer.getGrades().size());
        fer.addGrade(90);
        assertEquals(1,fer.getGrades().size());
        fer.addGrade(100);
        assertEquals(2,fer.getGrades().size());
        assertEquals(90,(int) fer.getGrades().get(0));
        assertEquals(100,(int)fer.getGrades().get(1));

    }
    @Test
    public void testIfGradeAverageworks(){
        Student fer =new Student(1l,"fer");
        fer.addGrade(80);
        fer.addGrade(100);
        assertEquals(90, fer.getGradeAverage(),0);
        fer.addGrade(60);
        assertEquals(80, fer.getGradeAverage(),0);

    }

}