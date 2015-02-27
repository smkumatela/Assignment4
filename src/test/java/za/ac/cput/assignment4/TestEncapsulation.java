package za.ac.cput.assignment4;

import junit.framework.Assert;
import junit.framework.TestCase;
import za.ac.cput.assignment4.objectOrientedProgramming.Encapsulation.Student_info;

/**
 * Created by student on 2015/02/27.
 */
public class TestEncapsulation extends TestCase{
    public void testEncapsulation() throws Exception{
        Student_info stdIn = new Student_info();
        stdIn.setSurname("Mkumatela");
        stdIn.setStdNo("213054277");
        stdIn.setYear(3);

        Assert.assertEquals("Mkumatela", stdIn.getSurname());
        Assert.assertEquals("213054277", stdIn.getStdNo());
        Assert.assertEquals(3, stdIn.getYear());
    }
}
