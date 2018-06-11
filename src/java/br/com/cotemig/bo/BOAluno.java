/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cotemig.bo;

import br.com.cotemig.dao.DAOAluno;
import br.com.cotemig.fw.Data;
import br.com.cotemig.to.TOAluno;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class BOAluno {
    
    public static void insert(TOAluno t) throws Exception {
        try (Connection c = Data.openConnection()) {
            DAOAluno.insert(c, t);
        }
    }

    public static void update(TOAluno t) throws Exception {
        try (Connection c = Data.openConnection()) {
            DAOAluno.update(c, t);
        }
    }
    
    public static List<TOAluno> list() throws Exception {
        try (Connection c = Data.openConnection()) {
                return DAOAluno.list(c);
        }
    }
}
