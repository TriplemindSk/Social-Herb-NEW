package sk.s5630213008.socialherb;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class ArticleDetailPActivity extends AppCompatActivity {

    ImageView imgkk;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imgkk = (ImageView)findViewById(R.id.im);
        imgkk.setImageResource(R.drawable.at);

        button = (Button)findViewById(R.id.btRATEart);

        // seekBar1
        final RatingBar rating_Bar = (RatingBar)findViewById(R.id.ratingBarARTICAL);
        rating_Bar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
            }
        });



        // button1
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(ArticleDetailPActivity.this,
                        String.valueOf("Complete!! Your Selected : " + rating_Bar.getRating()),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

}
