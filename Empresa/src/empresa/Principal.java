/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import Banco.HibernateUtil;
import Beans.Departamento;
import Beans.Funcionario;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Raul
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //mostra e deleta -------------------
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();

        List<Funcionario> lista = (List< Funcionario>) s.createQuery("From Funcionario").list();

        for (Funcionario f : lista) {
            System.out.println("Nome: " + f.getNome() + " Departamento : " + f.getDepartamento().getNomeDepartamento());
            s.delete(f);
        }

        s.getTransaction().commit();
        
        
        //=======================
        Departamento d1 = new Departamento();
        Departamento d2 = new Departamento();

        d1.setId(1);
        d1.setNomeDepartamento("Informatica");
        d2.setId(2);
        d2.setNomeDepartamento("Recurso Humanos");
        Funcionario f1 = new Funcionario();

        f1.setId(100);
        f1.setNome("RAUL LOPES");
        f1.setCpf("07597945612");
        f1.setDepartamento(d2);

        Funcionario f2 = new Funcionario();
        f2.setId(102);
        f2.setNome("SARAH OBRIL");
        f2.setCpf("07597945612");
        f2.setDepartamento(d1);

        s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();

        s.save(d1);
        s.save(d2);

        s.save(f1);
        s.save(f2);

        s.getTransaction().commit();

        System.out.println("Ok, it is done");
        System.exit(0);

    }

}
