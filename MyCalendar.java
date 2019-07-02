

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar extends GregorianCalendar{
	
	// Constructor that sets month and year to the user-entered values
	public MyCalendar(int month, int year, int day) {
		super(month, year, day);
	}
	
	// If user enter enters only month, the year defaults to current year
	public MyCalendar(int month) {
		super(month, Calendar.getInstance().get(Calendar.YEAR), 1);
	}
	
	public String getMonthName(int month) {
		if(month == 1)	return "January";
		if(month == 2)	return "February";
		if(month == 3)	return "March";
		if(month == 4)	return "April";
		if(month == 5)	return "May";
		if(month == 6)	return "June";
		if(month == 7)	return "July";
		if(month == 8)	return "August";
		if(month == 9)	return "September";
		if(month == 10)	return "October";
		if(month == 11)	return "November";
		else				return "December";
		
	}

}
