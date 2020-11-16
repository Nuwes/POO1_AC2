package ac2;

public class Curso {

    private int numero;
    private String descricao;
    private String nomeprof;
    private Escola escola;

    public Curso() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeProf() {
        return nomeprof;
    }

    public void setNomeProf(String nomeprof) {
        this.nomeprof = nomeprof;
    }

    public double calcularTotalCurso() {
        double valor = 0;
        return valor;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    @Override
    public String toString() {
        return "Curso [escola=" + escola + ", descricao=" + descricao + ", nome do professor=" + nomeprof + ", numero=" + numero + "]";
    }
    
}
