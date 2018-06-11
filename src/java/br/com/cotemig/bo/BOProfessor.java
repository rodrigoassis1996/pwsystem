/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cotemig.bo;

import br.com.cotemig.dao.DAOProfessor;
import br.com.cotemig.fw.Data;
import br.com.cotemig.to.TOProfessor;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class BOProfessor {
      public static void insert(TOProfessor t) throws Exception {
        try (Connection c = Data.openConnection()) {
            DAOProfessor.insert(c, t);
        }
    }

    public static void update(TOProfessor t) throws Exception {
        try (Connection c = Data.openConnection()) {
            DAOProfessor.update(c, t);
        }
    }
    
    public static List<TOProfessor> list() throws Exception {
        try (Connection c = Data.openConnection()) {
                return DAOProfessor.list(c);
        }
    }
}
