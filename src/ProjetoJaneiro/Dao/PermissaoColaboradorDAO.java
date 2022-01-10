package ProjetoJaneiro.Dao;

import ProjetoJaneiro.Domain.Colaborador;
import ProjetoJaneiro.Domain.Permissao;

import java.sql.Connection;

public class PermissaoColaboradorDAO {

    private Connection connection;
    private Colaborador colaborador;
    private Permissao permissao;

    public PermissaoColaboradorDAO(Connection connection)  {
        this.connection = connection;
    }
}

