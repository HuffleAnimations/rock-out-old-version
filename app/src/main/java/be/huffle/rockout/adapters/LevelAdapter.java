package be.huffle.rockout.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import be.huffle.rockout.R;
import be.huffle.rockout.models.Level;
import yuku.ambilwarna.AmbilWarnaDialog;

public class LevelAdapter extends RecyclerView.Adapter<LevelAdapter.LevelViewHolder>
{
	private List<Level> levels = new ArrayList<>();
	private View view;
	private int defaultColour;

	public LevelAdapter(List<Level> levels)
	{
		this.levels = levels;
	}

	@Override
	public LevelViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{
		Context context = parent.getContext();
		int layoutIdForListItem = R.layout.course_list_item;
		LayoutInflater inflater = LayoutInflater.from(context);
		view = inflater.inflate(layoutIdForListItem, parent, false);
		return new LevelViewHolder(view);
	}

	@Override
	public void onBindViewHolder(final LevelViewHolder holder, int position)
	{
		Level currentLevel = levels.get(position);
		holder.level = currentLevel;
		holder.levelName.setText(currentLevel.getLevelName());
		holder.levelColour.setBackgroundColor(Color.parseColor(currentLevel.getLevelColourCode()));
		holder.levelColour.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				openColourPicker(holder);
			}
		});
		holder.deleteButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				removeLevel(holder.getAdapterPosition());
			}
		});
	}

	private void openColourPicker(final LevelViewHolder holder)
	{
		AmbilWarnaDialog colorPicker = new AmbilWarnaDialog(view.getContext(), defaultColour, new AmbilWarnaDialog.OnAmbilWarnaListener() {
			@Override
			public void onCancel(AmbilWarnaDialog dialog) {

			}

			@Override
			public void onOk(AmbilWarnaDialog dialog, int colour) {
				defaultColour = colour;
				holder.levelColour.setBackgroundColor(defaultColour);
			}
		});
		colorPicker.show();
	}

	@Override
	public int getItemCount()
	{
		return levels.size();
	}

	public void removeLevel(int position)
	{
		levels.remove(position);
		notifyDataSetChanged();
	}

	public class LevelViewHolder extends RecyclerView.ViewHolder
	{
		private Level level;
		private EditText levelName;
		private Button levelColour;
		private ImageButton deleteButton;

		public LevelViewHolder(View itemView)
		{
			super(itemView);

			levelName = itemView.findViewById(R.id.tv_level_name);
			levelColour = itemView.findViewById(R.id.b_colour);
			deleteButton = itemView.findViewById(R.id.ib_delete);
		}
	}
}
