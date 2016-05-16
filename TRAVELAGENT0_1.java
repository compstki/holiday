
public class TRAVELAGENT0_1
{

    //private HOLIDAY holiday;
    private HOLIDAY0_2[] holidayList;

    public TRAVELAGENT0_1()
    {
        setUp();
    }

    public void setUp()
    {
        //holiday = new HOLIDAY();
        holidayList = new HOLIDAY0_2[5];
        
        holidayList[0] = new HOLIDAY0_2();
    }

    public void processHoliday()
    {
        holidayList[0].enterName();
        holidayList[0].enterNights();
        holidayList[0].calculateTotalCost();
        holidayList[0].displayResult();
    }
}
