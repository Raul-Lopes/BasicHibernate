package Beans;
// Generated 25-Apr-2018 21:57:22 by Hibernate Tools 4.3.1

public class Funcionario implements java.io.Serializable {

    private Integer id;
    private Departamento departamento;
    private String cpf;
    private String nome;

    public Funcionario() {
    }

    public Funcionario(Departamento departamento, String cpf, String nome) {
        this.departamento = departamento;
        this.cpf = cpf;
        this.nome = nome;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
