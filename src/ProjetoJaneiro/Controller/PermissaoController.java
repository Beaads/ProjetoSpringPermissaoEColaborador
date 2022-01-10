package ProjetoJaneiro.Controller;

import ProjetoJaneiro.Connection.ConnectionFactory;
import ProjetoJaneiro.Dao.PermissaoDAO;

import java.sql.Connection;


public class PermissaoController {

private PermissaoDAO permissaoDAO;

public PermissaoController() {
    try (Connection connection = new ConnectionFactory().recuperarConexao()) {
        this.permissaoDAO = new PermissaoDAO(connection);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}