package be.huffle.rockout.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeSchedule
{
	private LocalDate beginDate;
	private LocalDate endDate;
	private OpeningClosingTime[] openingClosingTimes = new OpeningClosingTime[Day.values().length];

	public TimeSchedule(LocalDate beginDate, LocalDate endDate)
	{
		this.beginDate = beginDate;
		this.endDate = endDate;
		openingClosingTimes[Day.MONDAY.ordinal()] = new OpeningClosingTime(LocalTime.of(9, 30),
				LocalTime.of(18, 30));
		openingClosingTimes[Day.TUESDAY.ordinal()] = new OpeningClosingTime(LocalTime.of(9, 30),
				LocalTime.of(18, 30));
		openingClosingTimes[Day.WEDNESDAY.ordinal()] = new OpeningClosingTime(LocalTime.of(9, 30),
				LocalTime.of(18, 30));
		openingClosingTimes[Day.THURSDAY.ordinal()] = new OpeningClosingTime(LocalTime.of(9, 30),
				LocalTime.of(18, 30));
		openingClosingTimes[Day.FRIDAY.ordinal()] = new OpeningClosingTime(LocalTime.of(9, 30),
				LocalTime.of(18, 30));
		openingClosingTimes[Day.SATURDAY.ordinal()] = new OpeningClosingTime(LocalTime.of(9, 30),
				LocalTime.of(18, 30));
		openingClosingTimes[Day.SUNDAY.ordinal()] = new OpeningClosingTime(LocalTime.of(9, 30),
				LocalTime.of(18, 30));
	}

	public OpeningClosingTime[] getOpeningClosingTimes()
	{
		return openingClosingTimes;
	}

	public OpeningClosingTime getOpeningClosingTime(Day day)
	{
		return openingClosingTimes[day.ordinal()];
	}

	public void setOpeningClosingTime(LocalTime openingTime, LocalTime closingTime, Day day)
	{
		openingClosingTimes[day.ordinal()].setOpeningTime(openingTime);
		openingClosingTimes[day.ordinal()].setClosingTime(closingTime);
	}

	public LocalDate getBeginDate()
	{
		return beginDate;
	}

	public void setBeginDate(LocalDate beginDate)
	{
		this.beginDate = beginDate;
	}

	public LocalDate getEndDate()
	{
		return endDate;
	}

	public void setEndDate(LocalDate endDate)
	{
		this.endDate = endDate;
	}

	public boolean isActive(LocalDate currentDate)
	{
		return (currentDate.isAfter(beginDate) && currentDate.isBefore(endDate));
	}
}
