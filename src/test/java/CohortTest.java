import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {

    @Test
    public void testAddStudent(){
Cohort kuwan = new Cohort();
Student ku = new Student(1,"kuwan");
kuwan.addStudent(ku);
ku.addGrade(90);
assertEquals("kuwan",ku.getName() );
}

@Test
    public void testToGetList(){
        Cohort list = new Cohort();
        list.getStudents();
        assertNotNull(list);
}
@Test
    public void getTheAverage(){
        Cohort average = new Cohort();
    Student ku = new Student(1,"kuwan");
    average.addStudent(ku);
    ku.addGrade(90);
    ku.addGrade(80);
        average.getCohortAverage();
        assertEquals(85,average.getCohortAverage(),0);
}
    }

