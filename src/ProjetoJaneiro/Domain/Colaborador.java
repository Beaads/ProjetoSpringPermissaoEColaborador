package ProjetoJaneiro.Domain;

import java.util.ArrayList;
import java.util.List;

public class Colaborador {
    private int codigoColaborador;
    private String nomeColaborador;
    private String dataNascimento;
    private List<Permissao> permissaoLista = new ArrayList<>();

    public Colaborador(int codigoColaborador, String nomeColaborador, String dataNascimento) {
        this.codigoColaborador = codigoColaborador;
        this.nomeColaborador = nomeColaborador;
        this.dataNascimento = dataNascimento;
    }

    public int getCodigoColaborador() {
        return codigoColaborador;
    }

    public String getNomeColaborador() {
        return nomeColaborador;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}
