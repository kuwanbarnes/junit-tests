import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {
    Cohort kuwan;
    Student ku;
    Student da;
    //creates classes
    @Before
    public void setup() {
        kuwan = new Cohort();
        ku = new Student(1l, "kuwan");
        da = new Student(1l, "da");
    }

    @Test
    public void testAddStudent() {
        kuwan.addStudent(ku);
        assertEquals(1, kuwan.getStudents().size());
    }

    @Test
    public void testToGetList() {

        kuwan.addStudent(ku);
        assertEquals(1,kuwan.getStudents().get(0).getId());
        kuwan.addStudent(da);
        assertEquals(1,kuwan.getStudents().get(1).getId());

    }

    @Test
    public void getTheAverage() {
        kuwan.addStudent(ku);
        kuwan.addStudent(da);
        ku.addGrade(100);
        ku.addGrade(40);
        da.addGrade(80);
        da.addGrade(90);
        assertEquals(77.5, kuwan.getCohortAverage(), 0);
    }
}

