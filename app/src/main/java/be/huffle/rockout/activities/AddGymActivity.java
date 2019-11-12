package be.huffle.rockout.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

import be.huffle.rockout.R;
import be.huffle.rockout.models.Gym;

public class AddGymActivity extends AppCompatActivity implements View.OnClickListener
{
	private Button addScheduleButton;
	private Gym gym;
	private EditText nameText;
	private EditText addressText;
	private EditText siteText;
	private RecyclerView scheduleRecyclerView;
	private RecyclerView levelRecyclerView;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_gym_activity);

		Toolbar toolbar = findViewById(R.id.tb_main);
		setSupportActionBar(toolbar);
		Objects.requireNonNull(getSupportActionBar());
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		addScheduleButton = findViewById(R.id.b_add_schedule);
		addScheduleButton.setOnClickListener(this);

		gym = new Gym();

		nameText = findViewById(R.id.ed_gym_name);
		addressText = findViewById(R.id.ed_gym_address);
		siteText = findViewById(R.id.ed_gym_site);
		scheduleRecyclerView = findViewById(R.id.rv_gym_schedules);
		levelRecyclerView = findViewById(R.id.rv_gym_courses);
	}

	@Override
	public void onClick(View view)
	{
		switch (view.getId())
		{
			case R.id.b_add_schedule:
				openAddTimeScheduleActivity();
				break;
		}
	}

	private void openAddTimeScheduleActivity()
	{
		Intent intent = new Intent(this, AddTimeScheduleActivity.class);
		startActivity(intent);
	}
}
