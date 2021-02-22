import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest {
    @Test
    public void getName(){

       assertEquals("jash",Student.getname());
    }

    @Test
    public void getId(){

        assertEquals(Student.getId(),0);
    }
    @Test
    public void addgrade(){
        assertEquals(90,Student.addgrades(90));
    }
}