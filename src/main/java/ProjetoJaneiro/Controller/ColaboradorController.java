package ProjetoJaneiro.Controller;

import ProjetoJaneiro.Connection.ConnectionFactory;
import ProjetoJaneiro.Dao.ColaboradorDAO;
import ProjetoJaneiro.Domain.Colaborador;
import ProjetoJaneiro.Repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;

@RestController
@RequestMapping("colaborador")

public class ColaboradorController {


    @GetMapping(path = "/{codigoColaborador}")
    public ResponseEntity<Colaborador> findById(@PathVariable int codigoColaborador){
        return (ResponseEntity<Colaborador>) ResponseEntity.ok();
    }

    private ColaboradorDAO colaboradorDAO;

    public ColaboradorController() {
        try (Connection connection = new ConnectionFactory().recuperarConexao()) {
            this.colaboradorDAO = new ColaboradorDAO(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cadastrarColaborador(Colaborador colaborador) {
        this.colaboradorDAO.cadastrarColaborador(colaborador);
    }

    public void excluirColaborador(int colaborador) {
        this.colaboradorDAO.excluirColaborador(colaborador);
    }
}


