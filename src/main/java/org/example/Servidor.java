package org.example;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Servidor extends AbstractModule {
    private static Servidor instance;
    private Injector injector;
    private Servidor(){

    }

    public static Servidor getInstance() {
        if (instance == null){
            instance = new Servidor();
            instance.injector = Guice.createInjector(instance);
        }

        return instance;
    }

public PessoaDaoAlternativa getDAOAlternativa(){
    return injector.getInstance(PessoaDaoAlternativa.class);
}
    @Override
    protected void configure() {
        super.configure();
        System.out.println("Iniciando Server");
    }
}
