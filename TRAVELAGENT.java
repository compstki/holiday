import java.util.*;

public class TRAVELAGENT
{
    private HOLIDAY[] holidayList;
    private Random random;
    private int winner;

    public TRAVELAGENT()
    {
        setUp();
    }

    public void setUp()
    {
        holidayList = new HOLIDAY[5];
        for (int i = 0; i<5 ; i++)
        {
            holidayList[i] = new HOLIDAY();
        }

        random = new Random();
    }

    public void processHoliday()
    {
        winner = random.nextInt(5);

        for (int i = 0; i<5 ; i++)
        {
            holidayList[i].enterName();
            holidayList[i].enterValidNights();
            holidayList[i].calculateTotalCost();
            holidayList[i].TdisplayResult();
            
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
