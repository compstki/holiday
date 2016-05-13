
public class HOLIDAY
{

    private String name;
    private int nights;

    public HOLIDAY()
    {
        name = "";
        nights = 0;

    }
    
    public void enterName()
    {
        name = enterText("Please enter the name");
    }

}
