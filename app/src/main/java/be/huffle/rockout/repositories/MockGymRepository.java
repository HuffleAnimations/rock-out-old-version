package be.huffle.rockout.repositories;

import java.util.ArrayList;
import java.util.List;

import be.huffle.rockout.models.Gym;

public class MockGymRepository
{
	private List<Gym> gyms = new ArrayList<>();

	public MockGymRepository()
	{
		addGym("Crux");
		addGym("Boulder");
		addGym("Boulder Mania");
		addGym("City Lizard");
		addGym("Klimax");
		addGym("Maniak");
	}

	public void addGym(String name)
	{
		gyms.add(new Gym(name));
	}

	public List<Gym> getGyms()
	{
		return gyms;
	}
}
