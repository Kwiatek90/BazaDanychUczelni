/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import frontend.BazaFrame;


/**
 *
 * @author mateu
 */
public class BazaDanych {
    public void baza() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection polaczenie = DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress;dataBaseName=BazaDanychUczelni","sa", "1234");
            Statement skladnia=polaczenie.createStatement();
            ResultSet rezultat=skladnia.executeQuery("select * from dane");
            //while(rezultat.next()) {
            //    tTekst.append(""+rezultat.getInt("id")+" "+
            //           rezultat.getString("tekst")+"\n");                
            //}
            polaczenie.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //public void bazaWyswietlPrzedmiot() {
       // try {
           // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           // Class.forName("com.mysql.jdbc.Driver");
           // Connection polaczenie = DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress;dataBaseName=PAB","sa", "1234");
            //Statement skladnia=polaczenie.createStatement();
            //Statement st = polaczenie.createStatement();
            
            //String sql = "select * from Przedmiot";
            //ResultSet rs = st.executeQuery(sql);
            
            //while(rs.next()){
            //    String Nazwa = rs.getString("Nazwa");
            //    String Data = String.valueOf(rs.getDate("Data"));
            //    String Sala = String.valueOf(rs.getInt("Sala"));
                
            //    String tbData[] = {Nazwa,Data,Sala};
            //        DefaultTableModel tblModel = (DefaultTableModel)jTabelaPrzedmiot.getModel();
            //        tblModel.addrow(tbData);
            //}
            
        //}
        ///catch(Exception e) {
           // JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
           //         JOptionPane.ERROR_MESSAGE);
        //}
    //}

}
