package sk.s5630213008.socialherb;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ArticleSearchPActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnNEXTaa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_search_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnNEXTaa = (Button)findViewById(R.id.btnNEXTaa);
        btnNEXTaa.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(getApplicationContext(),ArticleDetailPActivity.class);
        startActivity(intent);
    }
}
