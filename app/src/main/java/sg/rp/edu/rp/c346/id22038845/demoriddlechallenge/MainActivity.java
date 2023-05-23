package sg.rp.edu.rp.c346.id22038845.demoriddlechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnQ1;
    Button btnQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnQ1 =findViewById(R.id.btnRevealQ1);
        btnQ2 =findViewById(R.id.btnRevealQ2);

        Intent intent = new Intent(MainActivity.this, AnswerActivity.class);

        btnQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("Question","Q1");
                startActivity(intent);
            }
        });

        btnQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("Question","Q2");
                startActivity(intent);
            }
        });


    }
}