import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest {
    Student fer;
    //creates classes
    @Before
    public void setup(){
        fer =new Student(1l,"fer");
    }
    @Test
    public void testIfStudentObjectCanBeCreated(){
        Student david=null;
assertNotNull(fer);
        assertNull(david);
    }

    @Test
    public void testIfFieldsWork(){
assertEquals(1L,fer.getId());
assertEquals("fer",fer.getName());
assertNotNull(fer.getGrades());


    }
    @Test
    public void testIfAddGradeWorks(){
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
        fer.addGrade(80);
        fer.addGrade(100);
        assertEquals(90, fer.getGradeAverage(),0);
        fer.addGrade(60);
        assertEquals(80, fer.getGradeAverage(),0);

    }

}