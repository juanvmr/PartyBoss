package reservademesaapp.com.comp8.unesc.partyboss;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private String savedUser;
    private String savedPassword;
    private EditText userEditText;
    private EditText pwdEditText;
    //private Toolbar toolbar;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private TextView novoUsuario;
    private Button entrarButton;
    private CoordinatorLayout appBarLoginContent;
    private AppBarLayout appBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        preferences = PreferenceManager.getDefaultSharedPreferences(LoginActivity.this);
        savedUser = preferences.getString("user","nouser");
        savedPassword = preferences.getString("pwd","nopwd");
        System.out.println("READUSR:" + savedUser);
        System.out.println("READPWD:" + savedPassword);

        if("nouser".compareTo(savedUser)!=0 && "nopwd".compareTo(savedPassword)!=0){
            startTelaInicialActivity();
        }

        userEditText = (EditText)findViewById(R.id.loginEditText);
        pwdEditText = (EditText)findViewById(R.id.senhaEditText);
        /*toolbar = (Toolbar) findViewById(R.id.loginToolbar);
        setSupportActionBar(toolbar);*/

        novoUsuario = (TextView)findViewById(R.id.novoUsuarioTextView);
        novoUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        entrarButton = (Button)findViewById(R.id.loginEntrarButton);
        entrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox keepOnline = (CheckBox)findViewById(R.id.keepUserCheckBox);
                if(keepOnline.isActivated()){
                    saveUserData();
                }
                startTelaInicialActivity();
            }
        });
    }

    private void startTelaInicialActivity(){
        /*appBarLoginContent = (CoordinatorLayout)findViewById(R.id.appBarLoginContent);
        appBarLayout = (AppBarLayout)findViewById(R.id.loginAppBar);
        appBarLoginContent.removeView(appBarLayout);*/
        setSupportActionBar(null);
        Intent intent = new Intent(this, TelaInicialActivity.class);
        startActivity(intent);
    }

    private void saveUserData(){
        preferences = PreferenceManager.getDefaultSharedPreferences(LoginActivity.this);
        editor = preferences.edit();
        editor.putString("user",userEditText.getText().toString());
        editor.putString("pwd",pwdEditText.getText().toString());
        editor.commit();
        editor.apply();
        System.out.println("SAVEUSR:" + userEditText.getText().toString());
        System.out.println("SAVEPWD:" + pwdEditText.getText().toString());
    }
}
