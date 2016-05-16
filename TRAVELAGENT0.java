
public class TRAVELAGENT0
{
    private HOLIDAY0_2 holiday;

    public TRAVELAGENT0()
    {
        setUp();
    }

    public void setUp()
    {
        holiday = new HOLIDAY0_2();
    }

    public void processHoliday()
    {
        holiday.enterName();
        holiday.enterNights();
        holiday.calculateTotalCost();
        holiday.displayResult();
    }
}
