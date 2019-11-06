package be.huffle.rockout.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import be.huffle.rockout.R;
import be.huffle.rockout.models.Gym;

public class GymListAdapter extends RecyclerView.Adapter<GymListAdapter.GymListViewHolder>
{
	private List<Gym> gyms = new ArrayList<>();

	public GymListAdapter(List<Gym> gyms)
	{
		this.gyms = gyms;
	}

	@Override
	public GymListViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{
		Context context = parent.getContext();
		int layoutIdForListItem = R.layout.gym_list_item;
		LayoutInflater inflater = LayoutInflater.from(context);
		View view = inflater.inflate(layoutIdForListItem, parent, false);
		return new GymListViewHolder(view);
	}

	@Override
	public void onBindViewHolder(GymListViewHolder holder, int position)
	{
		Gym currentGym = gyms.get(position);
		holder.gym = currentGym;
		holder.gymName.setText(currentGym.getName());
	}

	@Override
	public int getItemCount()
	{
		return gyms.size();
	}

	public class GymListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
	{
		private Gym gym;
		private TextView gymName;

		public GymListViewHolder(View itemView)
		{
			super(itemView);

			gymName = itemView.findViewById(R.id.tv_gym_name);

			itemView.setOnClickListener(this);
		}

		@Override
		public void onClick(View v)
		{
			Toast toast = Toast.makeText(itemView.getContext(), gymName.getText().toString(), Toast.LENGTH_LONG);
			toast.show();
		}
	}
}
