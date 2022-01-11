package ProjetoJaneiro.Domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

public class Colaborador {
    private int codigoColaborador;
    private String nomeColaborador;
    private String dataNascimento;
    private int qtdMaxPermissoes = 4;
    private List<Permissao> permissaoLista = new ArrayList<>();

    public Colaborador(int codigoColaborador, String nomeColaborador, String dataNascimento) {
        this.codigoColaborador = codigoColaborador;
        this.nomeColaborador = nomeColaborador;
        this.dataNascimento = dataNascimento;
    }
}

