package com.example.android.romaniaquiz;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static java.util.regex.Pattern.matches;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score = 0;


    public void getResult (View View) {
        // Check if answer 1 is Europe
        String answer1 = ((EditText) findViewById(R.id.answer1)).getText().toString();
        boolean answer1true = answer1.matches("Europe");
        if (answer1true) {
            score += 1;
        }
        // Check if answer 2 is Bucharest
        boolean answer2 = ((RadioButton) findViewById(R.id.radio_bucharest)).isChecked();
        if (answer2) {
            score += 1;
        }
        // Check if answer 3 is all selected
        boolean answer3a = ((CheckBox) findViewById(R.id.answer3a)).isChecked();
        boolean answer3b = ((CheckBox) findViewById(R.id.answer3b)).isChecked();
        boolean answer3c = ((CheckBox) findViewById(R.id.answer3c)).isChecked();
        if ((answer3a) && (answer3b) && (answer3c)){
            score += 1;
        }
        // Check if answer 4 is Republic
        boolean answer4 = ((RadioButton) findViewById(R.id.radio_republic)).isChecked();
        if (answer4) {
            score += 1;
        }
        // Check if answer 5 is all 3 cities
        boolean timisoara = ((CheckBox) findViewById(R.id.timisoara)).isChecked();
        boolean iasi = ((CheckBox) findViewById(R.id.iasi)).isChecked();
        boolean constanta = ((CheckBox) findViewById(R.id.constanta)).isChecked();
        if ((timisoara) && (iasi) && (constanta)){
            score += 1;
        }
        // Check if answer 6 is false
        boolean answer6 = ((RadioButton) findViewById(R.id.radio_false)).isChecked();
        if (answer6) {
            score += 1;
        }
        // Check if answer 7 is Leu
        boolean answer7 = ((RadioButton) findViewById(R.id.radio_Leu)).isChecked();
        if (answer7) {
            score += 1;
        }
        // Check if answer 8 is Dracula
        EditText answer8Field = (EditText) findViewById(R.id.answer8);
        String answer8 = answer8Field.getText().toString();
        boolean answer8true = answer8.matches("Dracula");
        if (answer8true) {
            score += 1;
        }
        Toast.makeText(this,"You scored " + score + " out of 8 questions",Toast.LENGTH_SHORT).show();
        score = 0;
    }
}
