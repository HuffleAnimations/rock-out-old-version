package be.huffle.rockout.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import be.huffle.rockout.R;
import be.huffle.rockout.adapters.GymListAdapter;
import be.huffle.rockout.repositories.MockGymRepository;

public class GymListActivity extends AppCompatActivity
{
	private GymListAdapter adapter;
	private MockGymRepository repository = new MockGymRepository();

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gym_list_activity);

		RecyclerView gymList = findViewById(R.id.rv_gyms);
		LinearLayoutManager layoutManager = new LinearLayoutManager(this);
		gymList.setLayoutManager(layoutManager);
		gymList.setHasFixedSize(true);

		adapter = new GymListAdapter(repository.getGyms());
		gymList.setAdapter(adapter);

		DividerItemDecoration itemDecoration = new DividerItemDecoration(gymList.getContext(),
				layoutManager.getOrientation());
		gymList.addItemDecoration(itemDecoration);
		gymList.setVisibility(View.VISIBLE);
	}
}
