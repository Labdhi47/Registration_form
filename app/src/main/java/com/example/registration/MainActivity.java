package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fullname;
    EditText email;
    EditText password;
    ImageButton display;
    RatingBar rating;
    ProgressBar progress;
    CalendarView calender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fullname=findViewById(R.id.editTextTextPersonName4);
        email=findViewById(R.id.editTextTextEmailAddress);
        password=findViewById(R.id.editTextTextPassword);
        rating=findViewById(R.id.ratingBar);
        progress=findViewById(R.id.progressBar2);
        display=findViewById(R.id.imageButton2);
        calender=findViewById(R.id.calendarView);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String rt=String.valueOf(rating.getRating());
                String fn = fullname.getText().toString();
                String em = email.getText().toString();
                String pw = password.getText().toString();
                progress.setVisibility(View.VISIBLE);
                String cl=calender.toString();
                Toast.makeText(MainActivity.this, rt+fn+em+pw+cl, Toast.LENGTH_LONG).show();
//                display.setText(rt+"\n"+fn+"\n"+ct+"\n"+em+"\n"+pw);
            }
        });

    }
}