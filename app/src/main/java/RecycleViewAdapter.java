import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.therussells.tourmycityproject5.R;


public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private String[] fragmentArrayList;

    // Provide a suitable constructor (depends on the kind of dataset)
    public RecycleViewAdapter(String[] myDataset) {
        fragmentArrayList = myDataset;

    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public RecycleViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                            int viewType) {
        // create a new view
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.final_list_view, parent, false);

        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.image.setImageResource(fragmentArrayList[position]);
        holder.title.setText(fragmentArrayList[position]);
        holder.description.setText(fragmentArrayList[position]);
        holder.address.setText(fragmentArrayList[position]);
        holder.phonenumber.setText(fragmentArrayList[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return fragmentArrayList.length;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        ImageView image;
        TextView title;
        TextView description;
        TextView address;
        TextView phonenumber;

        ViewHolder(View v) {
            super(v);

            image = v.findViewById(R.id.image);
            title = v.findViewById(R.id.title);
            description = v.findViewById(R.id.description);
            address = v.findViewById(R.id.address);
            phonenumber = v.findViewById(R.id.phonenumber);

        }
    }
}






