package be.huffle.rockout.repositories;

import java.util.ArrayList;
import java.util.List;

import be.huffle.rockout.models.Level;

public class MockLevelRepository
{
	private List<Level> levels = new ArrayList<>();

	public MockLevelRepository()
	{
		addLevel("3", "#000000");
		addLevel("4",  "#329146");
		addLevel("5",  "#BD65EB");
		addLevel("6a",  "#5677FA");
		addLevel("6b", "#EB3C3B");
		addLevel("6c",  "#7D7979");
		addLevel("7a",  "#EC8C1E");
		addLevel("7b", "#F0DC1F");
		addLevel("8", "#F0DC1A");
	}

	public void addLevel(String name, String colourCode)
	{
		levels.add(new Level(name, colourCode));
	}

	public List<Level> getLevels()
	{
		return levels;
	}
}
