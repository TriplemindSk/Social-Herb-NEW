package sk.s5630213008.socialherb;

import android.content.Intent;
import android.os.Bundle;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {


    Button btnHERB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        btnHERB = (Button)findViewById(R.id.btnHERB);
        btnHERB.setOnClickListener(this);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }







    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {


        switch (item.getItemId()){


            //Replacing the main content with ContentFragment Which is our Inbox View;

            case R.id.nav_setting:
                Intent intent = new Intent(getApplicationContext(),EditProfileActivity.class);
                startActivity(intent);
                return true;
            case R.id.nav_personADD:
                Intent intentA = new Intent(getApplicationContext(),InviteActivity.class);
                startActivity(intentA);
                return true;
            case R.id.nav_menu:
                Intent intentB = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(intentB);
                return true;
            case R.id.nav_logout:
                Intent intentC = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intentC);
                Toast.makeText(getApplicationContext(),"Logout Complete",Toast.LENGTH_SHORT).show();
                return true;



        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),HerbSearchPActivity.class);
        startActivity(intent);
    }

    public void btnClickDISEASE(View vv){
        Intent intent = new Intent(getApplicationContext(),DiseaseSearchPActivity.class);
        startActivity(intent);

    }

    public void btnClickARTICLE(View av){
        Intent intent = new Intent(getApplicationContext(),ArticleSearchPActivity.class);
        startActivity(intent);

    }

    public void btnClickINFO(View nv){
        Intent intent = new Intent(getApplicationContext(),InfoSearchPActivity.class);
        startActivity(intent);

    }
}
