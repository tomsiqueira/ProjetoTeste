package androidpro.com.br.projetoteste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String teste = "teste";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mensagem(View view){
        Toast.makeText(this,"Teste",Toast.LENGTH_SHORT).show();
    }
}
