/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cotemig.dao;

import br.com.cotemig.fw.Data;
import br.com.cotemig.to.TOTurma;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class DAOTurma {
    
    public static void insert(Connection c, TOTurma t) throws Exception {
        StringBuilder sql = new StringBuilder();
        sql.append(" insert into turma (id, nome) values (?, ?) ");

        Data.executeUpdate(c, sql.toString(), t.getId(), t.getNome());
    }
    
    public static void update(Connection c, TOTurma t) throws Exception {
        StringBuilder sql = new StringBuilder();
        sql.append(" update turma set nome = ? where id = ? ");

        Data.executeUpdate(c, sql.toString(), t.getId(), t.getNome());
    }
    
    
    public static List<TOTurma> list(Connection c) throws Exception {
        List<TOTurma> l = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append(" select id, nome from turma order by nome ");

        try (ResultSet rs = Data.executeQuery(c, sql.toString())) {
             while (rs.next()) {
                TOTurma tt = new TOTurma();
                tt.setId(rs.getInt("id"));
                tt.setNome(rs.getString("nome"));
                l.add(tt);
             }
        }
        return l;
    }
}
