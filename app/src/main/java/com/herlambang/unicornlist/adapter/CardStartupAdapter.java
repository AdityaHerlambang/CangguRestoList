package com.herlambang.unicornlist.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.herlambang.unicornlist.DetailStartupActivity;
import com.herlambang.unicornlist.R;
import com.herlambang.unicornlist.model.Startup;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import mehdi.sakout.fancybuttons.FancyButton;

public class CardStartupAdapter extends RecyclerView.Adapter<CardStartupAdapter.CategoryViewHolder> {

    private Context context;
    private ArrayList<Startup> listStartup;

    public ArrayList<Startup> getListStartup() {
        return listStartup;
    }

    public void setListStartup(ArrayList<Startup> listStartup) {
        this.listStartup = listStartup;
    }

    public CardStartupAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_startup, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {

        Glide.with(context)
                .load(getListStartup().get(position).getImage())
                .thumbnail(Glide.with(context).load(R.drawable.placeholder))
                .into(categoryViewHolder.mImage);

        Glide.with(context)
                .load(getListStartup().get(position).getFounderimage())
                .thumbnail(Glide.with(context).load(R.drawable.placeholder))
                .into(categoryViewHolder.mFounderImage);

        categoryViewHolder.mName.setText(getListStartup().get(position).getName());
        categoryViewHolder.mFounder.setText(getListStartup().get(position).getFounder());
        categoryViewHolder.mType.setText(getListStartup().get(position).getType());

        categoryViewHolder.mContainer.setTag(position);
        categoryViewHolder.mContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (int) v.getTag();
                Startup data = getListStartup().get(position);

                //    String name, image, founder, founderimage, type, overview, valuation, investors, logo;

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

        categoryViewHolder.mRate.setTag(position);
        categoryViewHolder.mRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (int) v.getTag();
                Startup data = getListStartup().get(position);

                //    String name, image, founder, founderimage, type, overview, valuation, investors, logo;

                Toast.makeText(context,"Anda memberi rating ke startup "+data.getName()+" !",Toast.LENGTH_LONG).show();
            }
        });

        categoryViewHolder.mRate.setTag(position);
        categoryViewHolder.mRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (int) v.getTag();
                Startup data = getListStartup().get(position);

                Toast.makeText(context,"Anda memberi rating ke startup "+data.getName()+" !",Toast.LENGTH_LONG).show();
            }
        });

        categoryViewHolder.mShare.setTag(position);
        categoryViewHolder.mShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (int) v.getTag();
                Startup data = getListStartup().get(position);

                //    String name, image, founder, founderimage, type, overview, valuation, investors, logo;

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Halo ! berikut salah satu startup unicorn di dunia : "+data.getName()+".");
                sendIntent.setType("text/plain");
                context.startActivity(sendIntent);

//                Toast.makeText(context,"Anda memberi share ke startup "+data.getName()+" !",Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return getListStartup().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        //    String name, image, founder, founderimage, type, overview, valuation, investors;

        LinearLayout mContainer;
        ImageView mImage;
        CircleImageView mFounderImage;
        TextView mName, mFounder, mType;
        FancyButton mRate, mShare;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            mImage = itemView.findViewById(R.id.item_startup_image);
            mFounderImage = itemView.findViewById(R.id.item_startup_founder_image);
            mName = itemView.findViewById(R.id.item_startup_title);
            mFounder = itemView.findViewById(R.id.item_startup_founder);
            mType = itemView.findViewById(R.id.item_startup_subtitle);
            mContainer = itemView.findViewById(R.id.item_startup_container);

            mRate = itemView.findViewById(R.id.item_startup_rate);
            mShare = itemView.findViewById(R.id.item_startup_share);

        }
    }


}
