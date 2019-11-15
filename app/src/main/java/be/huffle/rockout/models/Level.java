package be.huffle.rockout.models;

public class Level
{
	private String levelName;
	private String levelColourCode;

	public Level(String name)
	{
		levelName = name;
	}

	public Level(String name, String colourCode)
	{
		levelName = name;
		levelColourCode = colourCode;
	}

	public String getLevelName()
	{
		return levelName;
	}

	public void setLevelName(String levelName)
	{
		this.levelName = levelName;
	}

	public String getLevelColourCode()
	{
		return levelColourCode;
	}

	public void setLevelColourCode(String levelColourCode)
	{
		this.levelColourCode = levelColourCode;
	}
}
