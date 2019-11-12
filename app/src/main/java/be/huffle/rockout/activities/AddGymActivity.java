package be.huffle.rockout.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

import be.huffle.rockout.R;

public class AddGymActivity extends AppCompatActivity implements View.OnClickListener
{
	private Button addScheduleButton;

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
