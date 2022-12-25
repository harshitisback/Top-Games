package com.example.topgames;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    //1- Data
    private Context context;
    private ArrayList<GameModel> gamesList;
    String gname;

    //2- Constructor
    public MyAdapter(Context context, ArrayList<GameModel> gamesList) {
        this.context = context;
        this.gamesList = gamesList;
    }



    //3- ViewHolder class
    public  class  ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gameImg;
        private TextView gameText;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gameImg = itemView.findViewById(R.id.cardviewImg);
            gameText = itemView.findViewById(R.id.textviewCard);
        }
    }

    //4- rest of constructor
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent, false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        GameModel model = gamesList.get(position);
        holder.gameText.setText(model.getGameName());
        holder.gameImg.setImageResource(model.getGameImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(context, "Game: "+gamesList.get(position).getGameName(), Toast.LENGTH_SHORT).show();

                 gname = gamesList.get(position).getGameName();

                 if(gname=="Pubg"){
                     String url = "https://play.google.com/store/apps/details?id=com.dts.freefiremax";
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        context.startActivity(i);
                 }else if (gname=="Horizon Chase"){
                     String url2 = "https://play.google.com/store/apps/details?id=com.aquiris.horizonchase";
                        Intent i2 = new Intent(Intent.ACTION_VIEW);
                        i2.setData(Uri.parse(url2));
                        context.startActivity(i2);
                 }else if(gname == "Head Ball"){
                     String url3 = "https://play.google.com/store/apps/details?id=com.masomo.headball2";
                        Intent i3 = new Intent(Intent.ACTION_VIEW);
                        i3.setData(Uri.parse(url3));
                        context.startActivity(i3);
                 }

//                switch (name){
//                    case "Pubg":
//                        String url = "https://play.google.com/store/apps/details?id=com.dts.freefiremax";
//                        Intent i = new Intent(Intent.ACTION_VIEW);
//                        i.setData(Uri.parse(url));
//                        context.startActivity(i);
//                    case "Horizon Chase":
//                        String url2 = "https://play.google.com/store/apps/details?id=com.aquiris.horizonchase";
//                        Intent i2 = new Intent(Intent.ACTION_VIEW);
//                        i2.setData(Uri.parse(url2));
//                        context.startActivity(i2);
//                    case "Head Ball":
//                        String url3 = "https://play.google.com/store/apps/details?id=com.masomo.headball2";
//                        Intent i3 = new Intent(Intent.ACTION_VIEW);
//                        i3.setData(Uri.parse(url3));
//                        context.startActivity(i3);
//                    default:
//
//                }




//                String url = "https://play.google.com/store/apps/details?id=com.tencent.ig&hl=en_IN&gl=US&pli=1";
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(url));
//                startActivity(i);
//                context.startActivity(i);
//                  Intent i = new Intent(context, ViewGames.class);


            }


        });

    }

    @Override
    public int getItemCount() {
        return gamesList.size();
    }

}
