package app.nerdao.avalianerd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class AvaliaActivity extends AppCompatActivity {

    RatingBar rbAvaliacao;
    TextView txtNota;
    EditText comentario;
    Button toggleFoto;
    Button toggleAmigo;
    EditText local;
    Button avaliar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avalia);

        // mapeando todos os elementos
        rbAvaliacao = (RatingBar) findViewById(R.id.rbAvaliacao);
        txtNota = (TextView) findViewById(R.id.txtNota);
        comentario = (EditText) findViewById(R.id.comentario);
        toggleFoto = (Button) findViewById(R.id.toggleFoto);
        toggleAmigo = (Button) findViewById(R.id.toggleAmigo);
        local = (EditText) findViewById(R.id.local);
        avaliar = (Button) findViewById(R.id.avaliar);

        rbAvaliacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNota.setText(Float.toString(
                        rbAvaliacao.getRating()));
            }
        });

    }
}
