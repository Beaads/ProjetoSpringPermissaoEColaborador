package ProjetoJaneiro.Controller;

import ProjetoJaneiro.Connection.ConnectionFactory;
import ProjetoJaneiro.Dao.PermissaoColaboradorDAO;

import java.sql.Connection;

public class PermissaoColaboradorController {

    private PermissaoColaboradorDAO permissaoColaboradorDao;

    public PermissaoColaboradorController() {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            this.permissaoColaboradorDao = new PermissaoColaboradorDAO(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
