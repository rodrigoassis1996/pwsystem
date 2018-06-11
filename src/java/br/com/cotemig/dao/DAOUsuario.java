/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cotemig.dao;

import br.com.cotemig.fw.Data;
import br.com.cotemig.to.TOUsuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class DAOUsuario {
    
    public static void insert(Connection c, TOUsuario t) throws Exception {

        StringBuilder sql = new StringBuilder();
        sql.append(" insert into usuario (usuario, senha, tipo) values (?, ?, ?) ");

        Data.executeUpdate(c, sql.toString(), t.getUsuario(), t.getSenha(),
                           t.getTipo());
    }

    public static void update(Connection c, TOUsuario t) throws Exception {

        StringBuilder sql = new StringBuilder();
        sql.append(" update usuario  ");
        sql.append(" set usuario = ?, tipo = ? ");
        sql.append(" where id = ? ");

        Data.executeUpdate(c, sql.toString(), t.getUsuario(), t.getTipo());

    }
    
    public static List<TOUsuario> list(Connection c) throws Exception {

        List<TOUsuario> l = new ArrayList<>();
        
        StringBuilder sql = new StringBuilder();
        sql.append(" select usuario, tipo from usuario ");
        sql.append(" order by usuario ");

        try (ResultSet rs = Data.executeQuery(c, sql.toString())) {

             while (rs.next()) {

                TOUsuario tu = new TOUsuario();
                tu.setId(rs.getInt("id"));
                tu.setUsuario(rs.getString("usuario"));
                tu.setTipo(rs.getString("tipo"));
                
                l.add(tu);
             }
        }
        return l;
    }
    
}
