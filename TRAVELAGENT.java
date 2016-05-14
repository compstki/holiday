import java.util.*;

public class TRAVELAGENT
{

    //private HOLIDAY holiday;
    private HOLIDAY[] holidayList;
    private Random random = new Random();
    int winner = random.nextInt(5);

    public TRAVELAGENT()
    {
        setUpHolidays();
    }

    public void setUpHolidays()
    {
        //holiday = new HOLIDAY();
        holidayList = new HOLIDAY[5];
        for (int i = 0; i<5 ; i++)
        {
            holidayList[i] = new HOLIDAY();
        }
    }

    public void processHoliday()
    {
        for (int i = 0; i<5 ; i++)
        {
            holidayList[i].enterName();
            holidayList[i].enterNights();
            holidayList[i].calculateTotalCost();
            holidayList[i].displayResult();
            if (i == winner)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}
