import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {
    Cohort kuwan;
    //creates classes
    @Before
    public void setup(){
        kuwan =new Cohort();
    }
    Student ku;
    //creates classes
    @Before
    public void setup1(){
        ku =new Student(1l,"kuwan");
    }
    @Test
    public void testAddStudent(){
kuwan.addStudent(ku);
ku.addGrade(90);
assertEquals("kuwan",ku.getName() );
}

@Test
    public void testToGetList(){
        kuwan.getStudents();
        assertNotNull(kuwan);
}
@Test
    public void getTheAverage(){
    kuwan.addStudent(ku);
    ku.addGrade(90);
    ku.addGrade(80);
        kuwan.getCohortAverage();
        assertEquals(85,kuwan.getCohortAverage(),0);
}
    }

