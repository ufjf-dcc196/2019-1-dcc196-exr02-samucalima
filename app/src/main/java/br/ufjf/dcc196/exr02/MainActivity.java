package br.ufjf.dcc196.exr02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView numero1, numero2;
    private int n1, n2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoSomar = findViewById(R.id.botao_somar);
        Button botaoSubtrair = findViewById(R.id.botao_subtrair);
        Button botaoDividir = findViewById(R.id.botao_dividir);
        Button botaoMultiplicar = findViewById(R.id.botao_multiplicar);

        botaoSomar.setOnClickListener(this);
        botaoSubtrair.setOnClickListener(this);
        botaoDividir.setOnClickListener(this);
        botaoMultiplicar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.botao_somar:
                numero1 = findViewById(R.id.numero_1);
                numero2 = findViewById(R.id.numero_2);
                n1 = Integer.parseInt(numero1.getText().toString());
                n2 = Integer.parseInt(numero2.getText().toString());
                res = n1 + n2;
                Toast.makeText(this, "Resultado: "+res, Toast.LENGTH_SHORT).show();
                break;
            case R.id.botao_subtrair:
                numero1 = findViewById(R.id.numero_1);
                numero2 = findViewById(R.id.numero_2);
                n1 = Integer.parseInt(numero1.getText().toString());
                n2 = Integer.parseInt(numero2.getText().toString());
                res = n1 - n2;
                Toast.makeText(this, "Resultado: "+res, Toast.LENGTH_SHORT).show();
                break;
            case R.id.botao_dividir:
                numero1 = findViewById(R.id.numero_1);
                numero2 = findViewById(R.id.numero_2);
                n1 = Integer.parseInt(numero1.getText().toString());
                n2 = Integer.parseInt(numero2.getText().toString());
                res = n1 / n2;
                Toast.makeText(this, "Resultado: "+res, Toast.LENGTH_SHORT).show();
                break;
            case R.id.botao_multiplicar:
                numero1 = findViewById(R.id.numero_1);
                numero2 = findViewById(R.id.numero_2);
                n1 = Integer.parseInt(numero1.getText().toString());
                n2 = Integer.parseInt(numero2.getText().toString());
                res = n1 * n2;
                Toast.makeText(this, "Resultado: "+res, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}