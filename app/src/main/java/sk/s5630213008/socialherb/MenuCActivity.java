package sk.s5630213008.socialherb;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MenuCActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnHERB;
    Button btnDISEASE;
    Button btnARTICLE;
    Button btnINFO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_c);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        btnHERB = (Button)findViewById(R.id.btnHERB);
        btnHERB.setOnClickListener(this);

        btnDISEASE = (Button)findViewById(R.id.btnDisease);
        btnARTICLE = (Button)findViewById(R.id.btnARTICLE);
        btnINFO = (Button)findViewById(R.id.btnINFO);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),HerbSearchCActivity.class);
        startActivity(intent);
    }

    public void btnClickDISEASE(View vv){
        Intent intent = new Intent(getApplicationContext(),DiseaseSearchCActivity.class);
        startActivity(intent);

    }

    public void btnClickARTICLE(View av){
        Intent intent = new Intent(getApplicationContext(),ArticleSearchCActivity.class);
        startActivity(intent);

    }

    public void btnClickINFO(View nv){
        Intent intent = new Intent(getApplicationContext(),InfoSearchPActivity.class);
        startActivity(intent);

    }

}
