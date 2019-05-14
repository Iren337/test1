import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;

public class MainClassTest extends MainClass
{


    @Test
    public void testGetLocalNumber()
    {
        Assert.assertTrue("Число не равно 14", getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber()
    {

        Assert.assertTrue("Число меньше 45",  getClassNumber() > 45);

    }

    @Test
    public void testGetClassString()
    {
        String x = getClassString();
        //String class_string = "Hello, world";

        boolean contains = x.matches(".*\\bHello\\b.*");
        boolean contains1 = x.matches(".*\\bhello\\b.*");
        Assert.assertTrue("Cannot find words 'hello' or 'Hello'", contains == true | contains1 == true);
    }


}
