package com.example.custom_dialog2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements dialog_fragment.onClickListener {
Button  btn_open_dialog;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_open_dialog=findViewById(R.id.open_dialog_btn);
        textView=findViewById(R.id.txt_view);
        btn_open_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            sho();
            textView.setText("oh ho let me wait again");
            }
        });
    }

    private void sho() {
        dialog_fragment dialog_fragment=new dialog_fragment();
        dialog_fragment.show(getSupportFragmentManager(),"dialog fragment");
    }

    @Override
    public void data(String txt) {
        if(!txt.isEmpty()){
            textView.setText(txt);
        }
    }
}