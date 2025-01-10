package com.example.sagetimes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

//import com.facebook.AccessToken;
//import com.facebook.GraphRequest;
//import com.facebook.GraphResponse;
import com.example.sagetimes.nointernet.InternetReceiver;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import com.example.sagetimes.nointernet.InternetReceiver;

import org.json.JSONException;
import org.json.JSONObject;

import java.time.temporal.TemporalQueries;


public class MainActivity extends AppCompatActivity {

    //initialization
    TextView textViewStudents;
    ImageView imageViewStudents;
    TextView textViewFaculty;
    ImageView imageViewFaculty;
    TextView textViewStaff;
    ImageView imageViewStaff;
    TextView textViewAssignment;
    ImageView imageViewAssignment;
    TextView textViewQuestionPaper;
    ImageView imageViewQuestionPaper;
    TextView textViewCalculator;
    ImageView imageViewCalculator;
    TextView textViewQuiz;
    ImageView imageViewQuiz;

    TextView textViewDonation;
    ImageView imageViewDonation;
    TextView textViewGame;

    ImageView imageViewPlacement;

    TextView textViewPlacementText;
    ImageView imageViewProjectIdeas;
    TextView textViewProjectIdeas, textViewAboutDevelopers;

    ImageView imageViewGame;

    FirebaseAuth auth;
    Button button;
    TextView textView;
    FirebaseUser user;

    Button officialSageBtn;


    BroadcastReceiver broadcastReceiver = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        fixed the rotation of the screen to portrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);



        // Initialize the BroadcastReceiver
        broadcastReceiver = new InternetReceiver();
        // Register BroadcastReceiver to monitor internet connectivity
        registerInternetStatusReceiver();


        // redirection to official sage website

        officialSageBtn = findViewById(R.id.sage_official);
        officialSageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://portal.sageuniversity.edu.in/AccSoft/studentlogin.aspx");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

//donation activity
        textViewDonation = findViewById(R.id.donation_text);
        textViewDonation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DonationActivity.class);
                startActivity(intent);
            }
        });

//        profile
        ImageView weatherImageView = findViewById(R.id.students_icon);

        // Set an OnClickListener on the ImageView
        weatherImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(MainActivity.this, profileSetting.class);
                startActivity(intent); // Start the new activity
            }
        });










        imageViewDonation = findViewById(R.id.donation_icon);
        imageViewDonation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DonationActivity.class);
                startActivity(intent);
            }
        });

//game activity
        textViewGame = findViewById(R.id.game_text);
        textViewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                startActivity(intent);
            }
        });
        imageViewGame = findViewById(R.id.game_icon);
        imageViewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                startActivity(intent);
            }
        });

        //students activity
        textViewStudents = findViewById(R.id.students_text);
        textViewStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), profileSetting.class);
                startActivity(intent);
            }
        });
//        imageViewStudents = findViewById(R.id.students_icon);
//        imageViewStudents.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), GameActivity.class);
//                startActivity(intent);
//            }
//        });




        //faculty activity
        textViewFaculty = findViewById(R.id.faculty_text);
        textViewFaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FacultyActivity.class);
                startActivity(intent);
            }
        });

        imageViewFaculty = findViewById(R.id.faculty_icon);
        imageViewFaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FacultyActivity.class);
                startActivity(intent);
            }
        });

//staff activity
        textViewStaff = findViewById(R.id.staff_text);
        textViewStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), StaffActivity.class);
                startActivity(intent);
            }
        });
        imageViewStaff = findViewById(R.id.staff_icon);
        imageViewStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), StaffActivity.class);
                startActivity(intent);
            }
        });

        //assignment activity
        textViewAssignment = findViewById(R.id.assignment_text);
        textViewAssignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AssignmentActivity.class);
                startActivity(intent);
            }
        });
        imageViewAssignment = findViewById(R.id.assignment_icon);
        imageViewAssignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AssignmentActivity.class);
                startActivity(intent);
            }
        });

//        previous year question paper activity

        imageViewQuestionPaper = findViewById(R.id.previous_year_question_paper_icon);
        imageViewQuestionPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuestionPaperActivity.class);
                startActivity(intent);
            }
        });

        textViewQuestionPaper = findViewById(R.id.previous_year_question_paper_text);
        textViewQuestionPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuestionPaperActivity.class);
                startActivity(intent);
            }
        });

//        quiz activity
        imageViewQuiz = findViewById(R.id.quiz_icon);
        imageViewQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
                startActivity(intent);
            }
        });
        textViewQuiz = findViewById(R.id.quiz_text);
        textViewQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
                startActivity(intent);
            }
        });

//        calculator activity

        imageViewCalculator = findViewById(R.id.calculator_icon);
        imageViewCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CalculatorActivity.class);
                startActivity(intent);
            }
        });
        textViewCalculator = findViewById(R.id.calculator_text);
        textViewCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CalculatorActivity.class);
                startActivity(intent);
            }
        });

        // project ideas activity

        imageViewProjectIdeas = findViewById(R.id.project_ideas);
        imageViewProjectIdeas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProjectIdeas.class);
                startActivity(intent);
            }
        });
        textViewProjectIdeas = findViewById(R.id.project_text);
        textViewProjectIdeas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProjectIdeas.class);
                startActivity(intent);
            }
        });

        // placement guide activity

        imageViewProjectIdeas = findViewById(R.id.placement_cell);
        imageViewProjectIdeas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Placement.class);
                startActivity(intent);
            }
        });
        textViewProjectIdeas = findViewById(R.id.placement_text);
        textViewProjectIdeas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Placement.class);
                startActivity(intent);
            }
        });

// about developers activity
        textViewAboutDevelopers = findViewById(R.id.about_developers);
        textViewAboutDevelopers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DevelopersActivity.class);
                startActivity(intent);
            }
        });

        //facebook authentication
//        AccessToken accessToken=AccessToken.getCurrentAccessToken();
//
//        GraphRequest request = GraphRequest.newMeRequest(
//                accessToken,
//                new GraphRequest.GraphJSONObjectCallback() {
//                    @Override
//                    public void onCompleted(
//                            JSONObject object,
//                            GraphResponse response) {
//
//                        try {
//                           String fullName= object.getString("name");
//                           textView.setText(fullName);
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                        // Application code
//                    }
//                });
//        Bundle parameters = new Bundle();
//        parameters.putString("fields", "id,name,link");
//        request.setParameters(parameters);
//        request.executeAsync();




        auth = FirebaseAuth.getInstance();
        button = findViewById(R.id.sign_out);
        textView = findViewById(R.id.email);
        user = auth.getCurrentUser();
        if (user == null) {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
            finish();
        } else {
            textView.setText(user.getEmail());
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    // Method to register the BroadcastReceiver for internet status
    private void registerInternetStatusReceiver() {
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(broadcastReceiver, filter);
    }

    @Override
    protected void onDestroy() {
        // Disconnect from the MQTT broker
//        mqttHandler.disconnect();
 
        // Unregister the BroadcastReceiver when activity is destroyed
        unregisterReceiver(broadcastReceiver);

        super.onDestroy();
    }

}