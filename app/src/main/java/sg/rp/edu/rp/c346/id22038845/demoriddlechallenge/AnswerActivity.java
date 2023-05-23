package sg.rp.edu.rp.c346.id22038845.demoriddlechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView tvAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvAns = findViewById(R.id.textView);
        Intent intentReceived =getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");

        if(questionsSelected.equals("Q1")){
            tvAns.setText(questionsSelected+" answer is: Queue");
        }else if(questionsSelected.equals("Q2")){
            tvAns.setText(questionsSelected+ " answer is: Gone");
        }


    }
}