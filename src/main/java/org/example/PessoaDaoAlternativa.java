package org.example;

import com.google.inject.Singleton;

import java.util.ArrayList;
@Singleton

public final class PessoaDaoAlternativa {
    private ArrayList<Pessoa> db = new ArrayList<>();

    public void save(Pessoa p) {
        db.add(p);
    }

    public void remove(Pessoa p) {
        db.remove(p);

    }

    public Pessoa searchByCPF(String cpf) throws Exception {
        for (Pessoa p : db) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        throw new Exception("Pessoa não encontrada" + cpf);

    }

    public void listAll() {
        for (Pessoa p : db) {
            System.out.println(p.getCpf() + "-" + p.getNome());
        }
    }
}