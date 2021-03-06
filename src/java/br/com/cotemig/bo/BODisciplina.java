/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cotemig.bo;


import br.com.cotemig.dao.DAODisciplina;
import br.com.cotemig.fw.Data;
import br.com.cotemig.to.TODisciplina;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class BODisciplina {
    
    public static void insert(TODisciplina t) throws Exception {
        try (Connection c = Data.openConnection()) {
            DAODisciplina.insert(c, t);
        }
    }
    
    public static void update(TODisciplina t) throws Exception {
        try (Connection c = Data.openConnection()) {
            DAODisciplina.update(c, t);
        }
    }
    
    public static List<TODisciplina> list() throws Exception {
        try (Connection c = Data.openConnection()) {
                return DAODisciplina.list(c);
        }
    }    
}
