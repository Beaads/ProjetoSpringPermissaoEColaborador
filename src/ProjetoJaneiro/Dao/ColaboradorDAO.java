package ProjetoJaneiro.Dao;

import ProjetoJaneiro.Connection.ConnectionFactory;
import ProjetoJaneiro.Domain.Colaborador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ColaboradorDAO {

    private Connection connection;

    public ColaboradorDAO(Connection connection) {
        this.connection = connection;
    }

    public void cadastrarColaborador(Colaborador colaborador) {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            PreparedStatement stm = connection.prepareStatement("INSERT INTO COLABORADOR (CODIGOCOLABORADOR," +
                    " NOMECOLABORADOR, DATANASCIMENTO) VALUES (?, ?, ?)");
            stm.setInt(1, colaborador.getCodigoColaborador());
            stm.setString(2, colaborador.getNomeColaborador());
            stm.setString(3, colaborador.getDataNascimento());

            stm.execute();

            ResultSet rst = stm.getResultSet();
            while (rst.next()) {
                Integer codigoColaborador = rst.getInt("CODIGOCOLABORADOR");
                System.out.println(codigoColaborador);
                String nomeColaborador = rst.getString("NOMECOLABORADOR");
                System.out.println(nomeColaborador);
                String dataNascimento = rst.getString("DATANASCIMENTO");
                System.out.println(dataNascimento);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void excluirColaborador(int codigocolaborador) {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            PreparedStatement stm = connection.prepareStatement("DELETE FROM COLABORADOR WHERE " +
                    "CODIGOCOLABORADOR = ?");
            {
                stm.setInt(1, codigocolaborador);

                stm.execute();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
//        try (PreparedStatement stm = connection.prepareStatement("DELETE FROM COLABORADOR WHERE " +
//                "CODIGOCOLABORADOR = ?")) {
//            stm.setInt(1, codigocolaborador);
//
//            stm.execute();
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
