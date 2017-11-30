package com.example.wendy.umqasho;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Tenant_Recycler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenant_recycler);

    }

    public class InfomationAdapter extends RecyclerView.Adapter<ViewHolder>{
        Context context;
        List<Information>mInformationlist;

        public InfomationAdapter(Context context, List<Information>mInformationlist){
            this.context=context;
            this.mInformationlist=mInformationlist;

        }


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.tanent,parent,false);
            ViewHolder viewHolder=new ViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            Information information=mInformationlist.get(position);
            holder.location.setText(information.getLocation());
            holder.description.setText(information.getDescription());
//            holder.image.setImageResource(information.getPicture());

        }

        @Override
        public int getItemCount() {
            return mInformationlist.size();
        }
    }

    private class ViewHolder extends RecyclerView.ViewHolder {
        TextView description;
        TextView location;
        ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            CardView cardView;




        }
    }
}
