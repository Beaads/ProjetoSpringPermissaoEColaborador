package ProjetoJaneiro.Domain;


import lombok.Data;

@Data
public class Permissao {
    private int codigoPermissao;
    private String nomePermissao;

    public Permissao(int codigoPermissao, String nomePermissao) {
        this.codigoPermissao = codigoPermissao;
        this.nomePermissao = nomePermissao;
    }

    public int getCodigoPermissao() {
        return codigoPermissao;
    }

    public String getNomePermissao() {
        return nomePermissao;
    }
}
