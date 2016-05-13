
public class HOLIDAY extends SimpleUI
{

    private String name;
    private int nights;
    private float cost;

    public HOLIDAY()
    {
        name = "";
        nights = 0;

    }

    public void enterName()
    {
        name = enterText("Please enter the name");
    }

    public void enterNights()
    {
        nights = enterInt("Please enter the nights");
    }

    public void calculateTotalCost()
    {
        cost = (nights * 100.0f) - 20.0f;
    }

    public void displayResult()
    {
        System.out.println(name);
        System.out.println(cost);
    }

}
