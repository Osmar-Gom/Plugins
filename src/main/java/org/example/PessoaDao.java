package org.example;

import java.util.ArrayList;

public final class PessoaDao {
    private static PessoaDao instance;
    private ArrayList<Pessoa> db = new ArrayList<>();
    public static PessoaDao getInstance() {
        if (instance == null) {
            instance = new PessoaDao();
        }
        return instance;
    }
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