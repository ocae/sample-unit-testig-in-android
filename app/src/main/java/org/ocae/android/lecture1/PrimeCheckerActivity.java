package org.ocae.android.lecture1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.ocae.android.lecture1.widget.PrimeUtils;


public class PrimeCheckerActivity extends Activity implements TextWatcher, View.OnClickListener {

    private final String TAG = "Lecture1";

    private EditText mInputText;
    private int mCurrentBackgroundColor = Color.WHITE;

    private void initCallbacks() {
        mInputText = (EditText) findViewById(R.id.input_text);
        mInputText.addTextChangedListener(this);

        Button checkButton = (Button) findViewById(R.id.check_button);
        checkButton.setOnClickListener(this);
    }

    public int getCurrentBackgroundColor() {
        return mCurrentBackgroundColor;
    }

    @Override
    public void onClick(View v) {
        setBackgroundColor(isPrime() ? Color.GREEN : Color.RED);
    }

    private boolean isPrime() {
        return PrimeUtils.isPrime(mInputText.getText().toString());
    }

    private void setBackgroundColor(int color) {
        getWindow().getDecorView().setBackgroundColor(color);
        mCurrentBackgroundColor = color;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        setBackgroundColor(Color.WHITE);
    }

    @Override
    public void afterTextChanged(Editable s) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_prime_checker);
        initCallbacks();
    }
}
