package be.huffle.rockout.models;

import java.util.ArrayList;
import java.util.List;

public class Gym
{
	private String name;
	private String address;
	private String site;
	private List<TimeSchedule> timeSchedules = new ArrayList<>();
	private List<Level> levels = new ArrayList<>();

	public Gym(){}

	public Gym(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getSite()
	{
		return site;
	}

	public void setSite(String site)
	{
		this.site = site;
	}

	public void addTimeSchedule(TimeSchedule timeSchedule)
	{
		timeSchedules.add(timeSchedule);
	}

	public List<TimeSchedule> getTimeSchedules()
	{
		return timeSchedules;
	}

	public void setTimeSchedules(List<TimeSchedule> timeSchedules)
	{
		this.timeSchedules = timeSchedules;
	}

	public void addLevel(Level level)
	{
		levels.add(level);
	}

	public List<Level> getLevels()
	{
		return levels;
	}

	public void setLevels(List<Level> levels)
	{
		this.levels = levels;
	}
}
