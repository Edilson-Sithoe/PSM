package projecto.jhpiego.ett.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import projecto.jhpiego.ett.R;
import projecto.jhpiego.ett.model.IdentInterView;

public class IdentInterViewAdapter extends RecyclerView.Adapter<IdentInterViewAdapter.ViewHolder> {
    int lastPosition = -1;
    private ArrayList<IdentInterView> identInterViewArrayList;
    private Context context;
    private IdentIntViewClickInterface identIntViewClickInterface;

    public IdentInterViewAdapter(ArrayList<IdentInterView> identInterViews, Context context, IdentIntViewClickInterface identIntViewClickInterface) {
        this.identInterViewArrayList = identInterViews;
        this.context = context;
        this.identIntViewClickInterface = identIntViewClickInterface;
    }

    @NonNull
    @Override
    public IdentInterViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.identitentview_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IdentInterViewAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        IdentInterView identInterView = identInterViewArrayList.get(position);
        holder.identIntViewTV.setText(identInterView.getNome());
        setAnimation(holder.itemView,position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                identIntViewClickInterface.onIdentIntViewClick(position);
            }
        });
    }

    public void setAnimation(View itemView, int position){
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            itemView.setAnimation(animation);
            lastPosition = position;
        }
    }

    @Override
    public int getItemCount() {
        return identInterViewArrayList.size();
    }

    public interface IdentIntViewClickInterface{
        void onIdentIntViewClick(int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView identIntViewTV;
        private ImageView identIntIV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            identIntViewTV = itemView.findViewById(R.id.idTVIdenIntName);
            identIntIV = itemView.findViewById(R.id.idIVIdentIntView);
        }
    }
}