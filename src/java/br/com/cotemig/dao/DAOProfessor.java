/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cotemig.dao;

import br.com.cotemig.fw.Data;
import br.com.cotemig.to.TOProfessor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class DAOProfessor {
    public static void insert(Connection c, TOProfessor t) throws Exception {

        StringBuilder sql = new StringBuilder();
        sql.append(" insert into professor (nome, sobrenome, nascimento, email, telefone, cpf) values (?, ?, ?, ?) ");

        Data.executeUpdate(c, sql.toString(), t.getNome(), t.getSobrenome(),
                           t.getNascimento(), t.getEmail(), t.getTelefone(), t.getCpf());
    }

    public static void update(Connection c, TOProfessor t) throws Exception {

        StringBuilder sql = new StringBuilder();
        sql.append(" update professor  ");
        sql.append(" set nome = ?, sobrenome = ?, nascimento = ?, email = ?, telefone = ?, cpf = ?, usuario_id = ? ");
        sql.append(" where id = ? ");

        Data.executeUpdate(c, sql.toString(), t.getNome(), t.getSobrenome(),
                           t.getNascimento(), t.getEmail(), t.getTelefone(), t.getCpf(), t.getUsuario_id());

    }
    
    public static List<TOProfessor> list(Connection c) throws Exception {

        List<TOProfessor> l = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append(" select id, nome, sobrenome, nascimento, email, telefone, cpf, usuario_id from professor ");
        sql.append(" order by nome ");

        try (ResultSet rs = Data.executeQuery(c, sql.toString())) {
             while (rs.next()) {

                TOProfessor ta = new TOProfessor();
                ta.setId(rs.getInt("id"));
                ta.setNome(rs.getString("nome"));
                ta.setSobrenome(rs.getString("sobrenome"));
                ta.setNascimento(rs.getDate("nascimento"));
                ta.setEmail(rs.getString("email"));
                ta.setTelefone(rs.getInt("telefone"));
                ta.setCpf(rs.getInt("cpf"));
                ta.setUsuario_id(rs.getInt("usuario_id"));

                l.add(ta);
             }
        }
        return l;
    }
}
