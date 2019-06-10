package com.dunk.linkup;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private RecyclerView postList;
    private android.support.v7.widget.Toolbar mtoolbar;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtoolbar =findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setTitle("Home");


        drawerLayout = (DrawerLayout)findViewById(R.id.drawable_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView = (NavigationView)findViewById(R.id.navigation_view);
        View navView = navigationView.inflateHeaderView(R.layout.navigation_header);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                userMenuSelector(menuItem);
                return false;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (actionBarDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void userMenuSelector(MenuItem menuItem)
    {

        switch (menuItem.getItemId())
        {
            case R.id.nav_profile:
                Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();

            case R.id.home:
                Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();

            case R.id.friends:
                Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();

            case R.id.find_friends:
                Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();

            case R.id.messages:
                Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();

            case R.id.settings:
                Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();

            case R.id.logout:
                Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();

            case R.id.nav_post:
                Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();
        }

    }
}
