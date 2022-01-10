package ProjetoJaneiro.Controller;

import ProjetoJaneiro.Connection.ConnectionFactory;
import ProjetoJaneiro.Dao.PermissaoColaboradorDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class PermissaoColaboradorController {

    private PermissaoColaboradorDAO permissaoColaboradorDao;

    public PermissaoColaboradorController() {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            this.permissaoColaboradorDao = new PermissaoColaboradorDAO(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cadastrarPermissaoColaborador(Integer codigoPermissao, Integer codigoColaborador) {
        permissaoColaboradorDao.cadastrarPermissaoColaborador(codigoPermissao, codigoColaborador);
    }

    public void excluirPermissaoColaborador(Integer codigoPermissao, Integer codigoColaborador) {
        permissaoColaboradorDao.excluirPermissaoColaborador(codigoPermissao, codigoColaborador);
    }

//    public void listarPermissaoColaborador() {
//        try {
//            veiculoPneuDaoT1.listarComPneu();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
}
