package reservademesaapp.com.comp8.unesc.partyboss;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class CadastroConvidadoActivity extends AppCompatActivity {

    private Button cadastrarConvidado;
    private Button finalizarCadastro;
    private EditText nomeConvidado;
    private EditText whatsappContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_convidados);

        this.setResult(1);

        cadastrarConvidado = (Button)findViewById(R.id.cadastrarConvidadoButton);
        finalizarCadastro = (Button)findViewById(R.id.finalizarConvidadoButton);
        nomeConvidado = (EditText)findViewById(R.id.convidadoCadastroNome);
        whatsappContato = (EditText)findViewById(R.id.convidadoCadastroWhatsapp);

        cadastrarConvidado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limparCampos();
            }
        });

        finalizarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limparCampos();
                setResult(0);
                finish();
            }
        });
    }

    private void limparCampos(){
        nomeConvidado.setText("");
        whatsappContato.setText("");
    }
}