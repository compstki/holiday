
public class TRAVELAGENT0_2
{
    private HOLIDAY0_2[] holidayList;

    public TRAVELAGENT0_2()
    {
        setUp();
    }

    public void setUp()
    {
        holidayList = new HOLIDAY0_2[5];

        for (int i = 0; i<5 ; i++)
        {
            holidayList[i] = new HOLIDAY0_2();
        }
    }

    public void processHoliday()
    {
        for (int i = 0; i<3 ; i++)
        {
            holidayList[i].enterName();
            holidayList[i].TenterNights();
            holidayList[i].calculateTotalCost();
            holidayList[i].TdisplayResult();
            
        }
    }
}
