package reservademesaapp.com.comp8.unesc.partyboss.database.model;

public class UsuarioModel {

    public static final String
    TABELA_NOME = "usuario";

    public static final String
    COLUNA_ID = "_id",
    COLUNA_NOME = "nome",
    COLUNA_SENHA = "senha";

    public static final String
    CREATE_TABLE =
            "create table" + TABELA_NOME
                           + "("
                           + COLUNA_ID + "integer primary key autoincrement,"
                           + COLUNA_NOME + "text not null,"
                           + COLUNA_SENHA + "text not null"
                           + ");";

    public static final String
            DROP_TABLE = "drop table if exists" + TABELA_NOME + ";";
}
