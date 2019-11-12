package be.huffle.rockout.models;

public class LocalTime
{
	private int hours;
	private int minutes;

	public static LocalTime of(int hours, int minutes)
	{
		if (hours < 0 || hours > 23)
		{
			throw new RuntimeException();
		}
		else if (minutes < 0 || minutes > 59)
		{
			throw new RuntimeException();
		}
		LocalTime time = new LocalTime();
		time.setHours(hours);
		time.setMinutes(minutes);
		return time;
	}

	public int getHours()
	{
		return hours;
	}

	public void setHours(int hours)
	{
		this.hours = hours;
	}

	public int getMinutes()
	{
		return minutes;
	}

	public void setMinutes(int minutes)
	{
		this.minutes = minutes;
	}
}
