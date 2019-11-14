package be.huffle.rockout.models;

public class Level
{
	private String levelName;
	private String levelColour;
	private String levelColourCode;

	public Level(String name)
	{
		levelName = name;
	}

	public Level(String name, String colour, String colourCode)
	{
		levelName = name;
		levelColour = colour;
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

	public String getLevelColour()
	{
		return levelColour;
	}

	public void setLevelColour(String levelColour)
	{
		this.levelColour = levelColour;
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
