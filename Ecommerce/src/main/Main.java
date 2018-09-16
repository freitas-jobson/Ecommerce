/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import conexao.ConectaDB;
import javax.swing.JOptionPane;
import org.hibernate.Session;


public class Main {
    
    public static void main(String[] args) {
        try {
            Session s = ConectaDB.getSessionFactory().openSession();
            JOptionPane.showMessageDialog(null,"Cone realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
