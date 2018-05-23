package Beans;
// Generated 25-Apr-2018 21:57:22 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

public class Departamento  implements java.io.Serializable {


     private int id;
     private String nomeDepartamento;
     private Set funcionarios = new HashSet(0);

    public Departamento() {
    }

	
    public Departamento(int id, String nomeDepartamento) {
        this.id = id;
        this.nomeDepartamento = nomeDepartamento;
    }
    public Departamento(int id, String nomeDepartamento, Set funcionarios) {
       this.id = id;
       this.nomeDepartamento = nomeDepartamento;
       this.funcionarios = funcionarios;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNomeDepartamento() {
        return this.nomeDepartamento;
    }
    
    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }
    public Set getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Set funcionarios) {
        this.funcionarios = funcionarios;
    }
}


