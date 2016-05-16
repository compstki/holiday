
public class TRAVELAGENT0_3
{
    private HOLIDAY0_2[] holidayList;
    private int winner;

    public TRAVELAGENT0_3()
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
        winner = 2;

        for (int i = 0; i<3 ; i++)
        {
            holidayList[i].enterName();
            holidayList[i].enterNights();
            holidayList[i].calculateTotalCost();
            holidayList[i].displayResult();

            if (i == winner)
            {
                System.out.println("winner: yes");
            }
            else
            {
                System.out.println("winner: no");
            }

        }
    }
}
