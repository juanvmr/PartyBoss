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
import android.widget.LinearLayout;

public class CadastroEventoActivity extends AppCompatActivity {

    private Button cadastrarButton;
    private int resultActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_festa);

        cadastrarButton = (Button)findViewById(R.id.eventoCadastrarButton);
        cadastrarButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                startCadastroConvidadoActivity();
            }
        });
    }

    private void startCadastroConvidadoActivity(){
        Intent intent = new Intent(CadastroEventoActivity.this, CadastroConvidadoActivity.class);
        startActivityForResult(intent, 255);
        onActivityResult(255, resultActivity, intent);
        if(resultActivity == 0){
            finish();
        }
    }

}