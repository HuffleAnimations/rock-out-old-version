package be.huffle.rockout.repositories;

import java.util.ArrayList;
import java.util.List;

import be.huffle.rockout.models.Level;

public class MockLevelRepository
{
	private List<Level> levels = new ArrayList<>();

	public MockLevelRepository()
	{
		addLevel("3", "black", "#000000");
		addLevel("4", "green", "#329146");
		addLevel("5", "purple", "#BD65EB");
		addLevel("6a", "blue", "#5677FA");
		addLevel("6b", "red", "#EB3C3B");
		addLevel("6c", "gray", "#7D7979");
		addLevel("7a", "orange", "#EC8C1E");
		addLevel("7b", "yellow", "#F0DC1F");
	}

	public void addLevel(String name, String colour, String colourCode)
	{
		levels.add(new Level(name, colour, colourCode));
	}

	public List<Level> getLevels()
	{
		return levels;
	}
}
