package com.example.topgames;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //1- Data
    ArrayList<GameModel> gameLists;
    //2- Adapter View
    RecyclerView recyclerView;

    //3- Adapter
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        gameLists = new ArrayList<>();
        gameLists.add(new GameModel("Pubg", R.drawable.card2));
        gameLists.add(new GameModel("Horizon Chase", R.drawable.card1));
        gameLists.add(new GameModel("Head Ball", R.drawable.card3));
        gameLists.add(new GameModel("Hooked on You", R.drawable.card4));
        gameLists.add(new GameModel("Fifa 2022", R.drawable.card5));
        gameLists.add(new GameModel("Fortnite", R.drawable.card6));

        adapter = new MyAdapter(this,gameLists);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);





    }
}