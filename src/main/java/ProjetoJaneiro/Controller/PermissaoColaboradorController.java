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

    public void cadastrarPermissaoColaborador(Integer codigoColaborador, Integer codigoPermissao) {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
        permissaoColaboradorDao.cadastrarPermissaoColaborador(codigoColaborador, codigoPermissao);
    } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void excluirPermissaoColaborador(Integer codigoColaborador, Integer codigoPermissao) {
        permissaoColaboradorDao.excluirPermissaoColaborador(codigoColaborador, codigoPermissao);
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
