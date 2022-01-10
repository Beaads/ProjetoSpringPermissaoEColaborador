package ProjetoJaneiro.Controller;

import ProjetoJaneiro.Connection.ConnectionFactory;
import ProjetoJaneiro.Dao.ColaboradorDAO;

import java.sql.Connection;

public class ColaboradorController {

    private ColaboradorDAO colaboradorDAO;

    public ColaboradorController() {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            this.colaboradorDAO = new ColaboradorDAO(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

