import java.util.Date;
import java.util.Calendar;
class M95
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -7);
		Date d1 = cal.getTime();
		System.out.println(d1);
	}
}
