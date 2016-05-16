import java.util.*;

public class TRAVELAGENT0_4
{
    private HOLIDAY0_2[] holidayList;
    private int winner;

    private Random random;

    public TRAVELAGENT0_4()
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

        random = new Random();
    }

    public void processHoliday()
    {
        winner = random.nextInt(5);

        for (int i = 0; i<5 ; i++)
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
