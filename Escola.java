package ac2;

import java.util.ArrayList;
import java.time.LocalDate;

/**
 * Escola
 */
public class Escola {
    private int codigo;
    private String nome;
    private String endereco;
    private LocalDate dataCadastro;
    private ArrayList<Curso> cursos = new ArrayList<Curso>();

    public Escola(int codigo, String nome) {
        dataCadastro = LocalDate.now();
        this.codigo = codigo;
        this.nome = nome;
    }

    public Escola(int codigo){
        dataCadastro = LocalDate.now();
        this.codigo = codigo;
    }

    public Escola() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setPedidos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public boolean addCurso(Curso curso){
        return cursos.add(curso);
    }

    public boolean removeCurso(Curso curso){
        return cursos.remove(curso);
    }

    public int getQuantidadeCursos(){
        return cursos.size();
    }
    

    public double somarTotalCursos(){
        double soma=0;

        for(Curso curso: cursos){
            soma += curso.calcularTotalCurso();
        }

        return soma;

    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    @Override
    public String toString() {
        return "Escola [codigo=" + codigo + ", nome=" + nome + ", endereco da escola= " + endereco + ", data= " + dataCadastro + "]";
    }
}
