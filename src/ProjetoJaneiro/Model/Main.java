package ProjetoJaneiro.Model;

import ProjetoJaneiro.Connection.ConnectionFactory;
import ProjetoJaneiro.Controller.ColaboradorController;
import ProjetoJaneiro.Controller.PermissaoColaboradorController;
import ProjetoJaneiro.Controller.PermissaoController;
import ProjetoJaneiro.Domain.Colaborador;
import ProjetoJaneiro.Domain.Permissao;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            Permissao permissaoParaSairMaisCedo = new Permissao(15, "permissaoParaSairMaisCedo");
            Permissao permissaoParaMexerJira = new Permissao(12, "permissaoParaMexerJira");
            Permissao permissaoParaMexerJiraa = new Permissao(12, "permissaoParaMexerJira");
            Permissao permissaoParaAbrirEmail = new Permissao(10, "permissaoParaAbrirEmail");
            Permissao permissaoParaFalarNoDaily = new Permissao(13, "permissaoParaFalarNoDaily");
            Permissao permissaoParaTocarBerrante = new Permissao(16, "permissaoParaTocarBerrante");

            Colaborador colaboradoraLarissa = new Colaborador(1, "Larissa", "15/09/1994");
            Colaborador colaboradoraBeatriz = new Colaborador(2, "Beatriz", "31/05/1997");
            Colaborador colaboradoraBeatrizz = new Colaborador(2, "Beatriz", "31/05/1997");
            Colaborador colaboradorDidi = new Colaborador(3, "Beatriz", "31/05/1997");


            PermissaoController permissaoController = new PermissaoController();
            permissaoController.cadastrarPermissao(permissaoParaSairMaisCedo);
            permissaoController.cadastrarPermissao(permissaoParaMexerJira);
            permissaoController.cadastrarPermissao(permissaoParaMexerJiraa);
            permissaoController.cadastrarPermissao(permissaoParaAbrirEmail);
            permissaoController.cadastrarPermissao(permissaoParaFalarNoDaily);
            permissaoController.cadastrarPermissao(permissaoParaTocarBerrante);
          //permissaoController.excluirPermissao(10);


//            ColaboradorController colaboradorController = new ColaboradorController();
//            colaboradorController.cadastrarColaborador(colaboradoraLarissa);
//            colaboradorController.cadastrarColaborador(colaboradoraBeatriz);
//            colaboradorController.cadastrarColaborador(colaboradoraBeatrizz);
//            colaboradorController.cadastrarColaborador(colaboradorDidi);
        //    colaboradorController.excluirColaborador();

//
//            PermissaoColaboradorController permissaoColaboradorController = new PermissaoColaboradorController();
//            permissaoColaboradorController.cadastrarPermissaoColaborador();
//            permissaoColaboradorController.excluirPermissaoColaborador();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
