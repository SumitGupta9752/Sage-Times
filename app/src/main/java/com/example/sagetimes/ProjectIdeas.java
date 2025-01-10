package com.example.sagetimes;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ProjectIdeas extends AppCompatActivity {

    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8,
            textView9, textView10, textView11, textView12, textView13, textView14, textView15,
            textView16, textView17, textView18, textView19, textView20;
    TextView myDescription1,myDescription2,myDescription3,myDescription4, myDescription5, myDescription6,
            myDescription7, myDescription8, myDescription9, myDescription10, myDescription11,
            myDescription12, myDescription13, myDescription14, myDescription15, myDescription16, myDescription17, myDescription18,
            myDescription19, myDescription20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_project_ideas);

        textView1 = findViewById(R.id.my_text1);
        myDescription1 = findViewById(R.id.my_description1);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle visibility of the description
                if (myDescription1.getVisibility() == View.GONE) {
                    myDescription1.setVisibility(View.VISIBLE);
                } else {
                    myDescription1.setVisibility(View.GONE);
                }
            }
        });

        myDescription2 = findViewById(R.id.my_description2);
        textView2 = findViewById(R.id.my_text2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myDescription2.getVisibility() == View.GONE) {
                    myDescription2.setVisibility(View.VISIBLE);
                } else {
                    myDescription2.setVisibility(View.GONE);
                }
            }
        });

        myDescription3 = findViewById(R.id.my_description3);
        textView3 = findViewById(R.id.my_text3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myDescription3.getVisibility() == View.GONE) {
                    myDescription3.setVisibility(View.VISIBLE);
                } else {
                    myDescription3.setVisibility(View.GONE);
                }
            }
        });

        myDescription4 = findViewById(R.id.my_description4);
        textView4 = findViewById(R.id.my_text4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myDescription4.getVisibility() == View.GONE) {
                    myDescription4.setVisibility(View.VISIBLE);
                } else {
                    myDescription4.setVisibility(View.GONE);
                }}
            });

        myDescription5=findViewById(R.id.my_description5);
        textView5=findViewById(R.id.my_text5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myDescription5.getVisibility()==View.GONE){
                    myDescription5.setVisibility(View.VISIBLE);
                }
                else{
                    myDescription5.setVisibility(View.GONE);
                }
            }
        });

        myDescription6 = findViewById(R.id.my_description6);
        textView6 = findViewById(R.id.my_text6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myDescription6.getVisibility() == View.GONE) {
                    myDescription6.setVisibility(View.VISIBLE);
                } else {
                    myDescription6.setVisibility(View.GONE);
                }
            }
        });

        myDescription7 = findViewById(R.id.my_description7);
        textView7 = findViewById(R.id.my_text7);
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myDescription7.getVisibility() == View.GONE) {
                    myDescription7.setVisibility(View.VISIBLE);
                } else {
                    myDescription7.setVisibility(View.GONE);
                }
            }
        });

        myDescription8 = findViewById(R.id.my_description8);
        textView8 = findViewById(R.id.my_text8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myDescription8.getVisibility() == View.GONE) {
                    myDescription8.setVisibility(View.VISIBLE);
                } else {
                    myDescription8.setVisibility(View.GONE);
                }}
        });

        myDescription9=findViewById(R.id.my_description9);
        textView9=findViewById(R.id.my_text9);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myDescription9.getVisibility()==View.GONE){
                    myDescription9.setVisibility(View.VISIBLE);
                }
                else{
                    myDescription9.setVisibility(View.GONE);
                }
            }
        });

        myDescription10 = findViewById(R.id.my_description10);
        textView10 = findViewById(R.id.my_text10);
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myDescription10.getVisibility() == View.GONE) {
                    myDescription10.setVisibility(View.VISIBLE);
                } else {
                    myDescription10.setVisibility(View.GONE);
                }
            }
        });

        textView11 = findViewById(R.id.my_text11);
        myDescription11 = findViewById(R.id.my_description11);

        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle visibility of the description
                if (myDescription11.getVisibility() == View.GONE) {
                    myDescription11.setVisibility(View.VISIBLE);
                } else {
                    myDescription11.setVisibility(View.GONE);
                }
            }
        });

        myDescription12 = findViewById(R.id.my_description12);
        textView12 = findViewById(R.id.my_text12);
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myDescription12.getVisibility() == View.GONE) {
                    myDescription12.setVisibility(View.VISIBLE);
                } else {
                    myDescription12.setVisibility(View.GONE);
                }
            }
        });

        myDescription13 = findViewById(R.id.my_description13);
        textView13 = findViewById(R.id.my_text13);
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myDescription13.getVisibility() == View.GONE) {
                    myDescription13.setVisibility(View.VISIBLE);
                } else {
                    myDescription13.setVisibility(View.GONE);
                }
            }
        });

        myDescription14 = findViewById(R.id.my_description14);
        textView14 = findViewById(R.id.my_text14);
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myDescription14.getVisibility() == View.GONE) {
                    myDescription14.setVisibility(View.VISIBLE);
                } else {
                    myDescription14.setVisibility(View.GONE);
                }}
        });

        myDescription15=findViewById(R.id.my_description15);
        textView15=findViewById(R.id.my_text15);
        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myDescription15.getVisibility()==View.GONE){
                    myDescription15.setVisibility(View.VISIBLE);
                }
                else{
                    myDescription15.setVisibility(View.GONE);
                }
            }
        });

        myDescription16 = findViewById(R.id.my_description16);
        textView16 = findViewById(R.id.my_text16);
        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myDescription16.getVisibility() == View.GONE) {
                    myDescription16.setVisibility(View.VISIBLE);
                } else {
                    myDescription16.setVisibility(View.GONE);
                }
            }
        });

        myDescription17 = findViewById(R.id.my_description17);
        textView17 = findViewById(R.id.my_text17);
        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myDescription17.getVisibility() == View.GONE) {
                    myDescription17.setVisibility(View.VISIBLE);
                } else {
                    myDescription17.setVisibility(View.GONE);
                }
            }
        });

        myDescription18 = findViewById(R.id.my_description18);
        textView18 = findViewById(R.id.my_text18);
        textView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myDescription18.getVisibility() == View.GONE) {
                    myDescription18.setVisibility(View.VISIBLE);
                } else {
                    myDescription18.setVisibility(View.GONE);
                }}
        });

        myDescription19=findViewById(R.id.my_description19);
        textView19=findViewById(R.id.my_text19);
        textView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myDescription19.getVisibility()==View.GONE){
                    myDescription19.setVisibility(View.VISIBLE);
                }
                else{
                    myDescription19.setVisibility(View.GONE);
                }
            }
        });

        myDescription20 = findViewById(R.id.my_description20);
        textView20 = findViewById(R.id.my_text20);
        textView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myDescription20.getVisibility() == View.GONE) {
                    myDescription20.setVisibility(View.VISIBLE);
                } else {
                    myDescription20.setVisibility(View.GONE);
                }
            }
        });



        }
    }