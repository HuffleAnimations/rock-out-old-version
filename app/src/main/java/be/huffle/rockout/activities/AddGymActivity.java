package be.huffle.rockout.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import java.util.Objects;

import be.huffle.rockout.R;

public class AddGymActivity extends AppCompatActivity
{

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

	}
}
