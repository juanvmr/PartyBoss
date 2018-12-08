package reservademesaapp.com.comp8.unesc.partyboss.database.dao;

import android.content.Context;

import java.util.List;

import reservademesaapp.com.comp8.unesc.partyboss.database.BDOpenHelper;
import reservademesaapp.com.comp8.unesc.partyboss.database.model.UsuarioModel;

public class UsuarioDAO extends AbstractDAO {

    private final String[]
    colunas =
            {
                    UsuarioModel.COLUNA_ID,
                    UsuarioModel.COLUNA_NOME,
                    UsuarioModel.COLUNA_SENHA
            };
    public UsuarioDAO(Context context){
        //Cria o DBHelper.
        db_helper = new BDOpenHelper(context);
    }
    public int Insert(){
        return 0;
    }
    public int Delete(){
        return 0;
    }
    public int Update(){
        return 0;
    }
    public List<UsuarioModel> Select(){
        return null;
    }

}
