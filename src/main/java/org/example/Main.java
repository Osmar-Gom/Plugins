package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.apache.commons.lang3.StringUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PessoaDao dao1 = PessoaDao.getInstance();
        dao1.save(new Pessoa("Renato", "123456789"));
        dao1.save(new Pessoa("Osmar", "123454789"));
        dao1.save(new Pessoa("Matheus", "125456789"));

        System.out.println(StringUtils.repeat("=", 20));
        System.out.println(StringUtils.center("DB1", 20));
        dao1.listAll();

        System.out.println(StringUtils.repeat("=", 20));
        System.out.println(StringUtils.center("DB2", 20));

        dao1.save(new Pessoa("Natalia ", "143456799"));
        dao1.save(new Pessoa("Lais", "123454787"));
        dao1.save(new Pessoa("Alexandra", "125477788"));
        dao1.listAll();



        PessoaDaoAlternativa servico = Servidor.getInstance().getDAOAlternativa();
        servico.save(new Pessoa("123", "123"));
        servico.listAll();

        PessoaDaoAlternativa serviço = Servidor.getInstance().getDAOAlternativa();
        servico.save(new Pessoa("1234", "1234"));
        servico.listAll();
    }
}
