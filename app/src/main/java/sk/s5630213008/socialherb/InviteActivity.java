package sk.s5630213008.socialherb;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class InviteActivity extends AppCompatActivity implements View.OnClickListener {

    AutoCompleteTextView email;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        email = (AutoCompleteTextView)findViewById(R.id.email);

        send = (Button)findViewById(R.id.send);
        send.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {

        String to = email.getText().toString();
        //String subject = textSubject.getText().toString();
       // String message = textMessage.getText().toString();


        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
        //email.putExtra(Intent.EXTRA_CC, new String[]{ to});
        //email.putExtra(Intent.EXTRA_BCC, new String[]{to});
        email.putExtra(Intent.EXTRA_SUBJECT, "SocialHerb Application");
        email.putExtra(Intent.EXTRA_TEXT, "sssssssssssssssssssssssssssssssssssss");
        //email.putExtras(Intent.EXTRA_SHORTCUT_ICON, new ImageItem() ;

        //need this to prompts email client only
        email.setType("message/rfc822");

        startActivity(Intent.createChooser(email, "Choose an Email client :"));

    }
}



