package com.herlambang.unicornlist.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.herlambang.unicornlist.DetailStartupActivity;
import com.herlambang.unicornlist.R;
import com.herlambang.unicornlist.model.Startup;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListStartupAdapter extends RecyclerView.Adapter<ListStartupAdapter.CategoryViewHolder> {

    private Context context;
    private ArrayList<Startup> listStartup;

    public ArrayList<Startup> getListStartup() {
        return listStartup;
    }

    public void setListStartup(ArrayList<Startup> listStartup) {
        this.listStartup = listStartup;
    }

    public ListStartupAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_startup_list, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {

        Glide.with(context)
                .load(getListStartup().get(position).getLogo())
                .thumbnail(Glide.with(context).load(R.drawable.placeholder))
                .into(categoryViewHolder.mLogo);

        categoryViewHolder.mName.setText(getListStartup().get(position).getName());
        categoryViewHolder.mType.setText(getListStartup().get(position).getType());

        categoryViewHolder.mContainer.setTag(position);
        categoryViewHolder.mContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (int) v.getTag();
                Startup data = getListStartup().get(position);

                Bundle extras = new Bundle();
                extras.putString("name",data.getName());
                extras.putString("image",data.getImage());
                extras.putString("founder",data.getFounder());
                extras.putString("founderimage",data.getFounderimage());
                extras.putString("type",data.getType());
                extras.putString("overview",data.getOverview());
                extras.putString("valuation",data.getValuation());
                extras.putString("investors",data.getInvestors());
                extras.putString("logo",data.getLogo());
                Intent intent = new Intent(context, DetailStartupActivity.class);
                intent.putExtras(extras);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return getListStartup().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        CircleImageView mLogo;
        TextView mName, mType;
        LinearLayout mContainer;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            mLogo = itemView.findViewById(R.id.item_startup_logo);
            mName = itemView.findViewById(R.id.item_startup_title);
            mType = itemView.findViewById(R.id.item_startup_subtitle);
            mContainer = itemView.findViewById(R.id.item_startup_container);

        }
    }


}
