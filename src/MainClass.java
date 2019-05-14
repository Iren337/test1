

public class MainClass
{

    private int class_number = 20;
    private String class_string = "Hello, world";

    public int getLocalNumber()
    {
        int a = 14;
        return a;
    }

    public int getClassNumber()
    {
        int class_number = this.class_number;
        return class_number;
    }


    public String getClassString()
    {
        String class_string = this.class_string;
        return class_string;
    }


}
