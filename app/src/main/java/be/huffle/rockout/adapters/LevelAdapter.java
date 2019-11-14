package be.huffle.rockout.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import be.huffle.rockout.R;
import be.huffle.rockout.models.Level;

public class LevelAdapter extends RecyclerView.Adapter<LevelAdapter.LevelViewHolder>
{
	private List<Level> levels = new ArrayList<>();

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
		View view = inflater.inflate(layoutIdForListItem, parent, false);
		return new LevelViewHolder(view);
	}

	@Override
	public void onBindViewHolder(LevelViewHolder holder, int position)
	{
		Level currentLevel = levels.get(position);
		holder.level = currentLevel;
		holder.levelName.setText(currentLevel.getLevelName());
		holder.levelColourName.setText(currentLevel.getLevelColour());
		holder.levelColour.setBackgroundColor(Color.parseColor(currentLevel.getLevelColourCode()));
	}

	@Override
	public int getItemCount()
	{
		return levels.size();
	}

	public class LevelViewHolder extends RecyclerView.ViewHolder
	{
		private Level level;
		private TextView levelName;
		private TextView levelColourName;
		private Button levelColour;

		public LevelViewHolder(View itemView)
		{
			super(itemView);

			levelName = itemView.findViewById(R.id.tv_level_name);
			levelColourName = itemView.findViewById(R.id.tv_level_colour);
			levelColour = itemView.findViewById(R.id.b_colour);
		}
	}
}
