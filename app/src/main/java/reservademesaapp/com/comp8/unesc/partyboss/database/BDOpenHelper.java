package reservademesaapp.com.comp8.unesc.partyboss.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BDOpenHelper extends SQLiteOpenHelper {

    private static final String
    DATABASE_NOME = "banco.db";

    private static final int
    DATABASE_VERSAO = 1;

    public DBOpenHelper(Context context){
         super (context, DATABASE_NOME, null, DATABASE_VERSAO);
    }
    @Override
    public void onCreate(SQLiteDatabase db){

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
