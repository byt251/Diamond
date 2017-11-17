package com.example.user.diamond;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button diamond2btn=(Button) findViewById(R.id.Diamond2Button);
        diamond2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView resultTextView=(TextView) findViewById(R.id.textView);
                TextView result2TextView=(TextView)findViewById(R.id.textView2);
                TextView result3TextView=(TextView)findViewById(R.id.textView3);
                TextView result4TextView=(TextView)findViewById(R.id.textView4);
                TextView result5TextView=(TextView)findViewById(R.id.textView5);
                TextView result7TextView=(TextView)findViewById(R.id.textView7);
                TextView result8TextView=(TextView)findViewById(R.id.textView8);


                int n;
                int m;
                int d;
                int x;
                String f="*";
                for (d=1;d<=4;d++) {
                    switch (d) {
                        case 1: {
                            resultTextView.setText("    " + f);
                            break;
                        }
                        case 2: {
                            result2TextView.setText("  " + f + " " + f + " " + f);
                            break;
                        }
                        case 3: {
                            result3TextView.setText(" " + f + " " + f + " " + f + " " + f);
                            break;
                        }
                        case 4: {
                            result4TextView.setText(f + " " + f + " " + f + " " + f + " " + f);
                            break;
                        }

                    }
                }
                for (x=1;x<=4;x++){
                    switch (x){
                        case 1:{
                            result5TextView.setText(" " + f + " " + f + " " + f + " " + f);
                            break;
                        }
                        case 2:{
                            result7TextView.setText("  " + f + " " + f + " " + f);
                            break;
                        }
                        case 3:{
                            result8TextView.setText("    " + f);
                            break;
                        }

                    }
                }
            }
        });




        }
    }

