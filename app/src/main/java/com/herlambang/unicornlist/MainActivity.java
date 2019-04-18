package com.herlambang.unicornlist;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.herlambang.unicornlist.adapter.CardStartupAdapter;
import com.herlambang.unicornlist.adapter.GridStartupAdapter;
import com.herlambang.unicornlist.adapter.ListStartupAdapter;
import com.herlambang.unicornlist.data.StartupData;
import com.herlambang.unicornlist.model.Startup;
import com.herlambang.unicornlist.utils.DrawerMenu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<Startup> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Unicorn List");
//        ab.setDisplayHomeAsUpEnabled(true);

        DrawerMenu drawer = new DrawerMenu();
        drawer.createDrawer(this,this,mToolbar);

        rvCategory = findViewById(R.id.main_recyclerview);
        rvCategory.setHasFixedSize(true);

        list.addAll(StartupData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListStartupAdapter listStartupAdapter = new ListStartupAdapter(this);
        listStartupAdapter.setListStartup(list);
        rvCategory.setAdapter(listStartupAdapter);
    }

    private void showRecyclerCard(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardStartupAdapter cardStartupAdapter = new CardStartupAdapter(this);
        cardStartupAdapter.setListStartup(list);
        rvCategory.setAdapter(cardStartupAdapter);
    }

    private void showRecyclerGrid(){
        rvCategory.setLayoutManager(new GridLayoutManager(this,2));
        GridStartupAdapter gridStartupAdapter = new GridStartupAdapter(this);
        gridStartupAdapter.setListStartup(list);
        rvCategory.setAdapter(gridStartupAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                showRecyclerCard();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
