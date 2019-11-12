package be.huffle.rockout.models;

public class OpeningClosingTime
{
	private LocalTime openingTime;
	private LocalTime closingTime;

	public OpeningClosingTime(LocalTime openingTime, LocalTime closingTime)
	{
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}

	public LocalTime getOpeningTime()
	{
		return openingTime;
	}

	public void setOpeningTime(LocalTime openingTime)
	{
		this.openingTime = openingTime;
	}

	public LocalTime getClosingTime()
	{
		return closingTime;
	}

	public void setClosingTime(LocalTime closingTime)
	{
		this.closingTime = closingTime;
	}
}
