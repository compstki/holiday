
public class TRAVELAGENT
{

    private HOLIDAY holiday;

    public TRAVELAGENT()
    {
        setUpHolidays();
    }

    public void setUpHolidays()
    {
        holiday = new HOLIDAY();
    }

    public void processHoliday()
    {
        holiday.enterName();
        holiday.enterNights();
        holiday.calculateTotalCost();
        holiday.displayResult();
    }
}
