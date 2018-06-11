/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cotemig.bo;

import br.com.cotemig.dao.DAOTurma;
import br.com.cotemig.fw.Data;
import br.com.cotemig.to.TOTurma;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class BOTurma {
    
    public static void insert(TOTurma t) throws Exception {
        try (Connection c = Data.openConnection()) {
            DAOTurma.insert(c, t);
        }
    }
    
    public static void update(TOTurma t) throws Exception {
        try (Connection c = Data.openConnection()) {
            DAOTurma.update(c, t);
        }
    }
    
    public static List<TOTurma> list() throws Exception {
        try (Connection c = Data.openConnection()) {
                return DAOTurma.list(c);
        }
    }  
    
}
