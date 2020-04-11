package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.HideReturnsTransformationMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnMessageOnClick(View view) {
        EditText mEdit = findViewById(R.id.valor);
        if (mEdit.getText().length() == 0) {
            return;
        }

        TextView mResultado = findViewById(R.id.textView2);
        Double salario = Double.parseDouble(String.valueOf(mEdit.getText()));
        String valorFinal = SalarioLiquido.calcular(salario);
        mResultado.setText(valorFinal);
        hideSoftKeyBoard();
    }

    protected void hideSoftKeyBoard() {
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);

        if(imm.isAcceptingText()) { // verify if the soft keyboard is open
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
    }
}
