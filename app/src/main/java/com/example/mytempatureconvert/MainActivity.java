package com.example.mytempatureconvert;

import androidx.appcompat.app.AppCompatActivity;


import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    EditText txtDoC,txtDoF;
    Double DoF=0.0,DoC=0.0;
    Convert c=new Convert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Button btnFtoC = (Button)findViewById(R.id.btConvertFtoC);
         btnFtoC.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 ConvertFtoC();
             }
         });
    }
    public void ConvertCtoF(View view){
        txtDoC=(EditText) findViewById(R.id.Cdegreetext);
        txtDoF=(EditText) findViewById(R.id.Fdegreetext);
        String regex = "\\d+";
        String textC=txtDoC.getText().toString();
        if(textC.matches(regex)) {
            DoC = Double.parseDouble(txtDoC.getText().toString());
            c.ConvertCtoF(DoC);
            DoF = c.getDoF();
            txtDoF.setText(String.valueOf(DoF));
        }
        else{
            Toast.makeText(getApplicationContext(),"Không được chứa ký tự chữ !!", Toast.LENGTH_LONG).show();
        }
    }
    public void ConvertFtoC(){
        txtDoC=(EditText) findViewById(R.id.Cdegreetext);

        txtDoF=(EditText)findViewById(R.id.Fdegreetext);
        try {
            DoF=Double.parseDouble(txtDoF.getText().toString());
            c.ConvertFtoC(DoF);
            DoC=c.getDoC();
            txtDoC.setText(String.valueOf(DoC));
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),"Không được chứa ký tự chữ !!", Toast.LENGTH_LONG).show();
            Log.e("CONVERT",e.getMessage());

        }


    }


}