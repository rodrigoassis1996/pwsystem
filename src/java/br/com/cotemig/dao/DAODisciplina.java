/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cotemig.dao;

import br.com.cotemig.fw.Data;
import br.com.cotemig.to.TODisciplina;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class DAODisciplina {
    
    public static void insert(Connection c, TODisciplina t) throws Exception {
        StringBuilder sql = new StringBuilder();
        sql.append(" insert into disciplina (id, nome) values (?, ?) ");

        Data.executeUpdate(c, sql.toString(), t.getId(), t.getNome());
    }
    
    public static void update(Connection c, TODisciplina t) throws Exception {
        StringBuilder sql = new StringBuilder();
        sql.append(" update disciplina set nome = ? where id = ? ");

        Data.executeUpdate(c, sql.toString(), t.getId(), t.getNome());
    }
    
    
    public static List<TODisciplina> list(Connection c) throws Exception {
        List<TODisciplina> l = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append(" select id, nome from disciplina order by nome ");

        try (ResultSet rs = Data.executeQuery(c, sql.toString())) {
             while (rs.next()) {
                TODisciplina td = new TODisciplina();
                td.setId(rs.getInt("id"));
                td.setNome(rs.getString("nome"));
                l.add(td);
             }
        }
        return l;
    }
}
