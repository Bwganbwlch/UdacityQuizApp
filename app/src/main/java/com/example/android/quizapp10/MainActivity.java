package com.example.android.quizapp10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int totalScore = 0;
    final String q4Answer = "something";

    // method that is called when submit button is clicked
    public void submitAnswers(View v) {
        //creats the checkbox objects and assigning them a boolean value
        CheckBox q1CB1 = findViewById(R.id.checkBox1Question1);
        boolean q1CB1Checked = q1CB1.isChecked();

        CheckBox q1CB2 = findViewById(R.id.checkBox2Question1);
        boolean q1CB2Checked = q1CB2.isChecked();

        CheckBox q1CB3 = findViewById(R.id.checkBox3Question1);
        boolean q1CB3Checked = q1CB3.isChecked();

        CheckBox q2CB1 = findViewById(R.id.checkBox1Question2);
        boolean q2CB1Checked = q2CB1.isChecked();

        CheckBox q2CB2 = findViewById(R.id.checkBox2Question2);
        boolean q2CB2Checked = q2CB2.isChecked();

        CheckBox q2CB3 = findViewById(R.id.checkBox3Question2);
        boolean q2CB3Checked = q2CB3.isChecked();

        RadioButton q3RB = findViewById(R.id.radioButton2Question3);
        boolean q3RBChecked = q3RB.isChecked();


        //checks what the score is and if the score isn't at 0 toasts to reset quiz
        if (totalScore != 0){
            Toast.makeText(this, "Please Reset Quiz.", Toast.LENGTH_SHORT).show();
            return;
            }
        // add one point if the check box is checked.
        if (q1CB1Checked) {
            totalScore++;
            }

        if (q1CB2Checked){
            totalScore++;
            }
        if (q1CB3Checked){
            totalScore++;
            }

        if(q2CB1Checked) {
            totalScore++;
            }

        if(q2CB2Checked) {
            totalScore++;
           }

        if(q2CB3Checked) {
            totalScore++;
           }

        if (q3RBChecked){
            totalScore++;
        }

        if (q4ETchecked()){
            totalScore++;
        }

        displayPoints(totalScore);
        }

    private boolean q4ETchecked () {
        EditText et = findViewById(R.id.question4Message);

        return et.getText().toString().equalsIgnoreCase(q4Answer);
    }

   //button calling method to reset quiz
    public void reset(View v) {
        resetQuiz();

    }

    // resetting the quiz
    private void resetQuiz() {
        //resets total score to 0
        totalScore = 0;
            //unchecks checkboxes
            CheckBox q1CB1 = findViewById(R.id.checkBox1Question1);
            q1CB1.setChecked(false);
            CheckBox q1CB2 = findViewById(R.id.checkBox2Question1);
            q1CB2.setChecked(false);
            CheckBox q1CB3 = findViewById(R.id.checkBox3Question1);
            q1CB3.setChecked(false);

            CheckBox q2CB1 = findViewById(R.id.checkBox1Question2);
            q2CB1.setChecked(false);
            CheckBox q2CB2 = findViewById(R.id.checkBox2Question2);
            q2CB2.setChecked(false);
            CheckBox q2CB3 = findViewById(R.id.checkBox3Question2);
            q2CB3.setChecked(false);

            //reset the radio button
            RadioButton q3RB1 = findViewById(R.id.radioButton1Question3);
            q3RB1.setChecked(false);
            RadioButton q3RB2 = findViewById(R.id.radioButton2Question3);
            q3RB2.setChecked(false);
            RadioButton q3RB3 = findViewById(R.id.radioButton3Question3);
            q3RB3.setChecked(false);

            //clear the text from quesiton 4
            EditText et = findViewById(R.id.question4Message);
            et.setText("");

            displayPoints(totalScore);
        }



//display totalScore changes totalPoints text view
    private void displayPoints(int totalScore) {
        TextView pointsTextView = findViewById(R.id.points);
        pointsTextView.setText("Points: " + totalScore);

    }


}

