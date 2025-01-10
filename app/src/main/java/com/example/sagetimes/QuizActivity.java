package com.example.sagetimes;

import android.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener{
    TextView questionTextView;
    TextView totalQuestionTextView;
    Button ansA,ansB,ansC,ansD;
    Button btn_submit;

    int score=0;
    int totalQuestion = QuestionAnswer.question.length;
    int currentQuestionIndex =0;
    String selectedAnswer="";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        totalQuestionTextView = findViewById(R.id.questionCount);
        questionTextView = findViewById(R.id.questionTextView);
        ansA = findViewById(R.id.option1Button);
        ansB = findViewById(R.id.option2Button);
        ansC= findViewById(R.id.option3Button);
        ansD = findViewById(R.id.option4Button);
        btn_submit = findViewById(R.id.submitButton);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        btn_submit.setOnClickListener(this);


        totalQuestionTextView.setText("Total question: "+totalQuestion);

        loadNewQuestion();
    }

    private void loadNewQuestion(){
        if(currentQuestionIndex == totalQuestion){
            finishQuiz();
            return;
        }
        questionTextView.setText(QuestionAnswer.question[currentQuestionIndex]);
        ansA.setText(QuestionAnswer.choices[currentQuestionIndex][0]);
        ansB.setText(QuestionAnswer.choices[currentQuestionIndex][1]);
        ansC.setText(QuestionAnswer.choices[currentQuestionIndex][2]);
        ansD.setText(QuestionAnswer.choices[currentQuestionIndex][3]);

        selectedAnswer="";

    }

    private void finishQuiz(){
        String passStatus;
        if(score >= totalQuestion*0.6){
            passStatus = "Passed";
        }else{
            passStatus = "Failed";
        }
        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Your Score is "+score+" Out of "+totalQuestion)
                .setPositiveButton("Restart",((dialog, i) -> restartQuiz() ))
                .setCancelable(false)
                .show();
    }

    private void restartQuiz(){
        score = 0;
        currentQuestionIndex=0;
        loadNewQuestion();
    }

    @Override
    public void onClick(View view){
        ansA.setBackgroundColor(Color.YELLOW);
        ansB.setBackgroundColor(Color.BLUE);
        ansC.setBackgroundColor(Color.CYAN);
        ansD.setBackgroundColor(Color.BLACK);

        Button clickedButton = (Button) view;

        if(clickedButton.getId() == R.id.submitButton) {
            if(!selectedAnswer.isEmpty()){
                if(selectedAnswer.equals(QuestionAnswer.correctAnswers[currentQuestionIndex])){
                    score++;
                    clickedButton.setBackgroundColor(Color.GREEN);
                }else{
                    clickedButton.setBackgroundColor(Color.RED);
                }
                currentQuestionIndex++;
                loadNewQuestion();
            }else{
                Toast.makeText(this, "Please Select any option first", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            selectedAnswer=clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.GREEN);
        }
    }
}