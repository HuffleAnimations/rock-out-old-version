package be.huffle.rockout.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.Objects;

import be.huffle.rockout.R;
import be.huffle.rockout.adapters.GymListAdapter;
import be.huffle.rockout.repositories.MockGymRepository;

public class GymListActivity extends AppCompatActivity implements Drawer.OnDrawerItemClickListener, View.OnClickListener
{
	private GymListAdapter adapter;
	private MockGymRepository repository = new MockGymRepository();
	private FloatingActionButton addGymButton;

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

		Toolbar toolbar = findViewById(R.id.tb_main);
		setSupportActionBar(toolbar);

		new DrawerBuilder()
				.withActivity(this)
				.withTranslucentNavigationBar(true)
				.withActionBarDrawerToggle(true)
				.withToolbar(toolbar)
				.withSelectedItem(-1)
				.addDrawerItems(
						new PrimaryDrawerItem().withName(getString(R.string.return_string))
						.withOnDrawerItemClickListener(this)
						.withSelectable(false)
				)
				.build();

		addGymButton = findViewById(R.id.fb_add_gym);
		addGymButton.setOnClickListener(this);
	}

	@Override
	public boolean onItemClick(View view, int position, IDrawerItem drawerItem)
	{
		return false;
	}

	@Override
	public void onClick(View view)
	{
		switch (view.getId())
		{
			case R.id.fb_add_gym:
				openAddGymActivity();
				break;
		}
	}

	private void openAddGymActivity()
	{
		Intent intent = new Intent(this, AddGymActivity.class);
		startActivity(intent);
	}
}
