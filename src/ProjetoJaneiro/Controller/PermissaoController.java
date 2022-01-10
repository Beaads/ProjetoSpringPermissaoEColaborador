package ProjetoJaneiro.Controller;

import ProjetoJaneiro.Connection.ConnectionFactory;
import ProjetoJaneiro.Dao.PermissaoDAO;
import ProjetoJaneiro.Domain.Permissao;

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

    public void cadastrarPermissao(Permissao codigoPermissao) {
        this.permissaoDAO.cadastrarPermissao(codigoPermissao);
    }

    public void excluirPermissao(int codigopermissao) {
        this.permissaoDAO.excluirPermissao(codigopermissao);
    }
}