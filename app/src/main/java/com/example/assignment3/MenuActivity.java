package com.example.assignment3;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.assignment3.Fragment.aboutFragment;
import com.example.assignment3.Fragment.contactFragment;
import com.example.assignment3.Fragment.helpFragment;
import com.example.assignment3.Fragment.primaryFragment;
import com.example.assignment3.Fragment.sendFragment;


public class MenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, helpFragment.OnFragmentInteractionListener {

    DrawerLayout layout;
    NavigationView navigationView;
    Activity context;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuactivity);
        context = this;
        layout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.menu);
        navigationView.setNavigationItemSelectedListener(this);
    }


    public boolean onNavigationItemSelected(MenuItem menuItem) {
        layout.closeDrawer(GravityCompat.START);
        switch(menuItem.getItemId()){
            case R.id.primary:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new primaryFragment()).commit();
                break;
            case R.id.sent:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new sendFragment()).commit();
                break;
            case R.id.contact:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new contactFragment()).commit();
                break;
            case R.id.about:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new aboutFragment()).commit();
                break;
            case R.id.help:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new helpFragment()).commit();
                break;
        }
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
