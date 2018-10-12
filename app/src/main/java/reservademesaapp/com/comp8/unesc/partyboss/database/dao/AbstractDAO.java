package reservademesaapp.com.comp8.unesc.partyboss.database.dao;

import android.database.SQLException;
import android.database.sqlite.SQLiteOpenHelper;

public abstract class AbstractDAO {

    protected SQLiteOpenHelper db;
    protected DBOpenHelper db_helper;

    protected final void Open() throws SQLException{
        //Recebi a instacia do banco de dados.
        db = db_helper.getWritableDatabase();
    }
    protected final void Close() throws SQLException{
        //Fecha a conexao com o banco de dados.
        db_helper.close();
    }

}
