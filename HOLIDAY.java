
public class HOLIDAY extends SimpleUI
{
    private String name;
    private int nights;
    private float cost;

    public HOLIDAY()
    {
        name = "";
        nights = 0;
        cost = 0.0f;
    }

    public void enterName()
    {
        name = enterText("Please enter the name");
    }

    public void TenterNights()
    {
        nights = enterInt("Please enter the nights");
    }

    public void calculateTotalCost()
    {
        cost = (nights * 100.0f) - 20.0f;
    }

    public void TdisplayResult()
    {
        System.out.println(name);
        System.out.println(cost);
    }

    public void enterValidNights()
    {
        nights = enterInt("Please enter the nights");
        while ((nights<1) || (nights>7))
        {
            nights = enterInt("Error: please re-enter the nights");
        }
    }

}
