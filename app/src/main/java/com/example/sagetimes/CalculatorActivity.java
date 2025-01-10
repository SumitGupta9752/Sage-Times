package com.example.sagetimes;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    TextView resultTextView, solutionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        resultTextView = findViewById(R.id.result);
        solutionTextView = findViewById(R.id.solution);

        // Initialize buttons and set click listeners
        findViewById(R.id.btn_c).setOnClickListener(this);
        findViewById(R.id.btn_bracket).setOnClickListener(this);
        findViewById(R.id.btn_bracket2).setOnClickListener(this);
        findViewById(R.id.btn_div).setOnClickListener(this);
        findViewById(R.id.btn_sub).setOnClickListener(this);
        findViewById(R.id.btn_multiply).setOnClickListener(this);
        findViewById(R.id.btn_add).setOnClickListener(this);
        findViewById(R.id.btn_equals).setOnClickListener(this);
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);
        findViewById(R.id.btn_6).setOnClickListener(this);
        findViewById(R.id.btn_7).setOnClickListener(this);
        findViewById(R.id.btn_8).setOnClickListener(this);
        findViewById(R.id.btn_9).setOnClickListener(this);
        findViewById(R.id.btn_0).setOnClickListener(this);
        findViewById(R.id.btn_dot).setOnClickListener(this);
        findViewById(R.id.btn_ac).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();

        switch (buttonText) {
            case "AC":
                solutionTextView.setText("");
                resultTextView.setText("0");
                break;
            case "=":
                String dataCalculate = solutionTextView.getText().toString();
                String finalResult = getResult(dataCalculate);
                if (!finalResult.equals("Error")) {
                    solutionTextView.setText(finalResult);
                    resultTextView.setText(finalResult);
                } else {
                    resultTextView.setText("Error");
                }
                break;
            case "C":
                String currentText = solutionTextView.getText().toString();
                if (!currentText.isEmpty()) {
                    solutionTextView.setText(currentText.substring(0, currentText.length() - 1));
                }
                break;
            default:
                solutionTextView.append(buttonText);
                break;
        }
    }

    String getResult(String data) {
        try {
            Context context = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initSafeStandardObjects();
            String finalResult = context.evaluateString(scriptable, data, "Javascript", 1, null).toString();
            if (finalResult.endsWith(".0")) {
                finalResult = finalResult.replace(".0", "");
            }
            return finalResult;
        } catch (Exception e) {
            return "Error";
        }
    }
}
