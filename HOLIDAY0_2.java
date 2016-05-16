
public class HOLIDAY0_2 extends SimpleUI
{
    private String name;
    private int nights;
    private float cost;

    public HOLIDAY0_2()
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

}
