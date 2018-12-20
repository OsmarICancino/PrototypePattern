package com.dalvikmx.prototypepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        t1 = findViewById(R.id.text_view_1);
        t2 = findViewById(R.id.text_view_2);
        t3 = findViewById(R.id.text_view_3);

        SequenceCache.loadCache();

        Sequence prime = SequenceCache.getSequence("1");

        t1.setText(new StringBuilder()
                    .append("El numero primo 10000esimo es: ")
                    .append(prime.getResult())
                    .toString());

        Sequence fiboacci = SequenceCache.getSequence("2");

        t2.setText(new StringBuilder()
                .append("El numero de Fibonacci 1000esimo es: ")
                .append(fiboacci.getResult())
                .toString());

        Sequence clone = (Sequence) new Fibonacci().clone();
        long result = clone.getResult() / 2;

        t3.setText(new StringBuilder()
                .append("El numero de Fibonacci clonado y dividido entre 2 es igual a : ")
                .append(result)
                .toString());


    }
}
