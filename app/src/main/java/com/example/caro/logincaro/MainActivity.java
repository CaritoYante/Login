package com.example.caro.logincaro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nickName, contra;
    private String txtnickName, txtcontra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void valida(View v){
        nickName = (EditText) findViewById(R.id.nickName);
        contra = (EditText) findViewById(R.id.contra);

        txtnickName = nickName.getText().toString();
        txtcontra = contra.getText().toString();

        if(txtnickName.equals("Carolina") && txtcontra.equals("123456")){
            Intent intent = new Intent(this, Activity2.class);
            startActivity(intent);
        }else
            Toast.makeText(this, "Usuario incorrecto", Toast.LENGTH_SHORT).show();
    }
}
