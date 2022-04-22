/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateu
 */
public class BazaFrame extends javax.swing.JFrame {
    //dane do bazy danycy
    private static final String username = "sa";
    private static final String password = "1234";
    private static final String dataConn= "jdbc:sqlserver://localhost\\sqlexpress;dataBaseName=BazaDanychUczelni";
    private JFrame frame;
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i, id, deleteItem;
    
    
    
    public BazaFrame() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pPanelStudenci = new javax.swing.JPanel();
        jText1Student = new javax.swing.JLabel();
        jImieStudent = new javax.swing.JTextField();
        jText2Student = new javax.swing.JLabel();
        jNazwiskoStudent = new javax.swing.JTextField();
        jText3Student = new javax.swing.JLabel();
        jPrzedmiotIDStudent = new javax.swing.JTextField();
        bDodajStudent = new javax.swing.JButton();
        bUsunStudent = new javax.swing.JButton();
        bAktualizujStudent = new javax.swing.JButton();
        bWyczyscStudent = new javax.swing.JButton();
        bWyswietlStudent = new javax.swing.JButton();
        jWyjdzStudent = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabelaStudent = new javax.swing.JTable();
        jTextStudent = new javax.swing.JLabel();
        pPanelProwadzacy = new javax.swing.JPanel();
        jText1Prowadzacy = new javax.swing.JLabel();
        jImieProwadzacy = new javax.swing.JTextField();
        jText2Przedmiot1 = new javax.swing.JLabel();
        jNazwiskoProwadzacy = new javax.swing.JTextField();
        jText3Prowadzacy = new javax.swing.JLabel();
        jPrzedmiotIDProwadzacy = new javax.swing.JTextField();
        bDodajProwadzacy = new javax.swing.JButton();
        bUsunProwadzacy = new javax.swing.JButton();
        bAktualizujProwadzacy = new javax.swing.JButton();
        bWyczyscProwadzacy = new javax.swing.JButton();
        bWyswietlProwadzacy = new javax.swing.JButton();
        jWyjdzProwadzacy = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabelaProwadzacy = new javax.swing.JTable();
        jTextProwadzacy = new javax.swing.JLabel();
        pPanelPrzedmiot = new javax.swing.JPanel();
        jText1Przedmiot = new javax.swing.JLabel();
        jNazwaPrzedmiot = new javax.swing.JTextField();
        jText2Przedmiot = new javax.swing.JLabel();
        jText3Przedmiot = new javax.swing.JLabel();
        jSalaPrzedmiot = new javax.swing.JTextField();
        bDodajPrzedmiot = new javax.swing.JButton();
        bUsunPrzedmiot = new javax.swing.JButton();
        bAktualizujPrzedmiot = new javax.swing.JButton();
        bWyczyscPrzedmiot = new javax.swing.JButton();
        bWyswietlPrzedmiot = new javax.swing.JButton();
        jWyjdzPrzedmiot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaPrzedmiot = new javax.swing.JTable();
        jTextPrzedmiot = new javax.swing.JLabel();
        jDatePrzedmiot = new com.toedter.calendar.JDateChooser();
        jText3Przedmiot1 = new javax.swing.JLabel();
        jGodzinaPrzedmiot = new javax.swing.JComboBox<>();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(51, 153, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        pPanelStudenci.setBackground(new java.awt.Color(153, 204, 255));
        pPanelStudenci.setForeground(new java.awt.Color(0, 0, 0));

        jText1Student.setForeground(new java.awt.Color(0, 0, 0));
        jText1Student.setText("Imie");

        jText2Student.setForeground(new java.awt.Color(0, 0, 0));
        jText2Student.setText("Nazwisko");

        jNazwiskoStudent.setAutoscrolls(false);

        jText3Student.setForeground(new java.awt.Color(0, 0, 0));
        jText3Student.setText("PrzedmiotID");

        bDodajStudent.setText("Dodaj");
        bDodajStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDodajStudent(evt);
            }
        });

        bUsunStudent.setText("Usun");
        bUsunStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsunStudent(evt);
            }
        });

        bAktualizujStudent.setText("Aktualizuj");
        bAktualizujStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAktualizujStudent(evt);
            }
        });

        bWyczyscStudent.setText("Wyczysc");
        bWyczyscStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bWyczyscStudent(evt);
            }
        });

        bWyswietlStudent.setText("Wyswietl");
        bWyswietlStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bWyswietlStudent(evt);
            }
        });

        jWyjdzStudent.setText("Wyjdz");
        jWyjdzStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWyjdzStudentActionPerformed(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setForeground(new java.awt.Color(0, 0, 0));

        jTabelaStudent.setAutoCreateRowSorter(true);
        jTabelaStudent.setBackground(new java.awt.Color(255, 255, 255));
        jTabelaStudent.setForeground(new java.awt.Color(0, 0, 0));
        jTabelaStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "imie", "nazwisko", "PrzedmiotID"
            }
        ));
        jTabelaStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaStudentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTabelaStudent);

        jTextStudent.setForeground(new java.awt.Color(0, 0, 0));
        jTextStudent.setText("Studenci");

        javax.swing.GroupLayout pPanelStudenciLayout = new javax.swing.GroupLayout(pPanelStudenci);
        pPanelStudenci.setLayout(pPanelStudenciLayout);
        pPanelStudenciLayout.setHorizontalGroup(
            pPanelStudenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPanelStudenciLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pPanelStudenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPanelStudenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jText1Student, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jText2Student, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jNazwiskoStudent, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jText3Student, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPrzedmiotIDStudent, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pPanelStudenciLayout.createSequentialGroup()
                            .addGroup(pPanelStudenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bAktualizujStudent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(bDodajStudent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pPanelStudenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bWyczyscStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(bUsunStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jWyjdzStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jImieStudent))
                    .addComponent(bWyswietlStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(pPanelStudenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addComponent(jTextStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pPanelStudenciLayout.setVerticalGroup(
            pPanelStudenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPanelStudenciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPanelStudenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jText1Student)
                    .addComponent(jTextStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPanelStudenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPanelStudenciLayout.createSequentialGroup()
                        .addComponent(jImieStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jText2Student)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNazwiskoStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText3Student)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPrzedmiotIDStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pPanelStudenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bDodajStudent)
                            .addComponent(bWyczyscStudent))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pPanelStudenciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAktualizujStudent)
                            .addComponent(bUsunStudent))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bWyswietlStudent)
                        .addGap(97, 97, 97)
                        .addComponent(jWyjdzStudent))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Studenci", pPanelStudenci);

        pPanelProwadzacy.setBackground(new java.awt.Color(153, 204, 255));
        pPanelProwadzacy.setForeground(new java.awt.Color(0, 0, 0));
        pPanelProwadzacy.setToolTipText("");

        jText1Prowadzacy.setForeground(new java.awt.Color(0, 0, 0));
        jText1Prowadzacy.setText("Imie");

        jText2Przedmiot1.setForeground(new java.awt.Color(0, 0, 0));
        jText2Przedmiot1.setText("Nazwisko");

        jNazwiskoProwadzacy.setAutoscrolls(false);

        jText3Prowadzacy.setForeground(new java.awt.Color(0, 0, 0));
        jText3Prowadzacy.setText("PrzedmiotID");

        bDodajProwadzacy.setText("Dodaj");
        bDodajProwadzacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDodajProwadzacy(evt);
            }
        });

        bUsunProwadzacy.setText("Usun");
        bUsunProwadzacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsunProwadzacy(evt);
            }
        });

        bAktualizujProwadzacy.setText("Aktualizuj");
        bAktualizujProwadzacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAktualizujProwadzacy(evt);
            }
        });

        bWyczyscProwadzacy.setText("Wyczysc");
        bWyczyscProwadzacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bWyczyscProwadzacy(evt);
            }
        });

        bWyswietlProwadzacy.setText("Wyswietl");
        bWyswietlProwadzacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bWyswietlProwadzacy(evt);
            }
        });

        jWyjdzProwadzacy.setText("Wyjdz");
        jWyjdzProwadzacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWyjdzProwadzacyActionPerformed(evt);
            }
        });

        jTabelaProwadzacy.setBackground(new java.awt.Color(255, 255, 255));
        jTabelaProwadzacy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "imie", "nazwisko", "PrzedmiotID"
            }
        ));
        jTabelaProwadzacy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaProwadzacyMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabelaProwadzacy);

        jTextProwadzacy.setForeground(new java.awt.Color(0, 0, 0));
        jTextProwadzacy.setText("Prowadzący");

        javax.swing.GroupLayout pPanelProwadzacyLayout = new javax.swing.GroupLayout(pPanelProwadzacy);
        pPanelProwadzacy.setLayout(pPanelProwadzacyLayout);
        pPanelProwadzacyLayout.setHorizontalGroup(
            pPanelProwadzacyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPanelProwadzacyLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pPanelProwadzacyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPanelProwadzacyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jText1Prowadzacy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jText2Przedmiot1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jNazwiskoProwadzacy, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jText3Prowadzacy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPrzedmiotIDProwadzacy, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pPanelProwadzacyLayout.createSequentialGroup()
                            .addGroup(pPanelProwadzacyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bAktualizujProwadzacy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(bDodajProwadzacy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pPanelProwadzacyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bWyczyscProwadzacy, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(bUsunProwadzacy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jWyjdzProwadzacy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jImieProwadzacy))
                    .addComponent(bWyswietlProwadzacy, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(pPanelProwadzacyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addComponent(jTextProwadzacy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pPanelProwadzacyLayout.setVerticalGroup(
            pPanelProwadzacyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPanelProwadzacyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPanelProwadzacyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jText1Prowadzacy)
                    .addComponent(jTextProwadzacy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPanelProwadzacyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPanelProwadzacyLayout.createSequentialGroup()
                        .addComponent(jImieProwadzacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jText2Przedmiot1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNazwiskoProwadzacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText3Prowadzacy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPrzedmiotIDProwadzacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pPanelProwadzacyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bDodajProwadzacy)
                            .addComponent(bWyczyscProwadzacy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pPanelProwadzacyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAktualizujProwadzacy)
                            .addComponent(bUsunProwadzacy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bWyswietlProwadzacy)
                        .addGap(97, 97, 97)
                        .addComponent(jWyjdzProwadzacy))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Prowadzący", pPanelProwadzacy);

        pPanelPrzedmiot.setBackground(new java.awt.Color(153, 204, 255));
        pPanelPrzedmiot.setPreferredSize(new java.awt.Dimension(850, 450));

        jText1Przedmiot.setForeground(new java.awt.Color(0, 0, 0));
        jText1Przedmiot.setText("Nazwa");

        jText2Przedmiot.setForeground(new java.awt.Color(0, 0, 0));
        jText2Przedmiot.setText("Data");

        jText3Przedmiot.setForeground(new java.awt.Color(0, 0, 0));
        jText3Przedmiot.setText("Sala");

        bDodajPrzedmiot.setText("Dodaj");
        bDodajPrzedmiot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDodajPrzedmiot(evt);
            }
        });

        bUsunPrzedmiot.setText("Usun");
        bUsunPrzedmiot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsunPrzedmiot(evt);
            }
        });

        bAktualizujPrzedmiot.setText("Aktualizuj");
        bAktualizujPrzedmiot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAktualizujPrzedmiot(evt);
            }
        });

        bWyczyscPrzedmiot.setText("Wyczysc");
        bWyczyscPrzedmiot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bWyczyscPrzedmiot(evt);
            }
        });

        bWyswietlPrzedmiot.setText("Wyswietl");
        bWyswietlPrzedmiot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bWyswietlPrzedmiot(evt);
            }
        });

        jWyjdzPrzedmiot.setText("Wyjdz");
        jWyjdzPrzedmiot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWyjdzPrzedmiot(evt);
            }
        });

        jTabelaPrzedmiot.setBackground(new java.awt.Color(255, 255, 255));
        jTabelaPrzedmiot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Nazwa", "Dzien", "Godzina", "Sala"
            }
        ));
        jTabelaPrzedmiot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaPrzedmiotMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelaPrzedmiot);

        jTextPrzedmiot.setForeground(new java.awt.Color(0, 0, 0));
        jTextPrzedmiot.setText("Przedmioty");

        jDatePrzedmiot.setDateFormatString("yyyy-MM-dd");

        jText3Przedmiot1.setForeground(new java.awt.Color(0, 0, 0));
        jText3Przedmiot1.setText("Godzina");

        jGodzinaPrzedmiot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00", "8:45", "9:45", "10:30", "11:30", "12:15", "13:30", "14:15", "15:15", "16:00", "17:00", "17:45", "18:45", "19:30", " " }));

        javax.swing.GroupLayout pPanelPrzedmiotLayout = new javax.swing.GroupLayout(pPanelPrzedmiot);
        pPanelPrzedmiot.setLayout(pPanelPrzedmiotLayout);
        pPanelPrzedmiotLayout.setHorizontalGroup(
            pPanelPrzedmiotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPanelPrzedmiotLayout.createSequentialGroup()
                .addGroup(pPanelPrzedmiotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPanelPrzedmiotLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(bDodajPrzedmiot, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bWyczyscPrzedmiot, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pPanelPrzedmiotLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pPanelPrzedmiotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jText1Przedmiot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jText2Przedmiot, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText3Przedmiot, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSalaPrzedmiot)
                            .addComponent(jWyjdzPrzedmiot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jNazwaPrzedmiot, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDatePrzedmiot, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(jText3Przedmiot1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jGodzinaPrzedmiot, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pPanelPrzedmiotLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pPanelPrzedmiotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bWyswietlPrzedmiot, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pPanelPrzedmiotLayout.createSequentialGroup()
                                .addComponent(bAktualizujPrzedmiot, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bUsunPrzedmiot, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(pPanelPrzedmiotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addComponent(jTextPrzedmiot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pPanelPrzedmiotLayout.setVerticalGroup(
            pPanelPrzedmiotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPanelPrzedmiotLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPanelPrzedmiotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jText1Przedmiot)
                    .addComponent(jTextPrzedmiot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPanelPrzedmiotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPanelPrzedmiotLayout.createSequentialGroup()
                        .addComponent(jNazwaPrzedmiot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jText2Przedmiot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDatePrzedmiot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText3Przedmiot1)
                        .addGap(4, 4, 4)
                        .addComponent(jGodzinaPrzedmiot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText3Przedmiot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSalaPrzedmiot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pPanelPrzedmiotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bDodajPrzedmiot)
                            .addComponent(bWyczyscPrzedmiot))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pPanelPrzedmiotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAktualizujPrzedmiot)
                            .addComponent(bUsunPrzedmiot))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bWyswietlPrzedmiot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jWyjdzPrzedmiot))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Przedmioty", null, pPanelPrzedmiot, "");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//========================================Przedmiot=======================================================================
    public void upDateDBPrzedmiot(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Polaczenie
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            //Wybor tabeli
            pst = sqlConn.prepareStatement("{call dbo.wyswietlPrzedmiot}");
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            //Pobranie danych o ilosci kolum w JFrame
            q =stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel)jTabelaPrzedmiot.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                
                for (i = 1;i <= q; i++){
                   columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("Nazwa"));
                    columnData.add(rs.getDate("Dzien"));
                    columnData.add(rs.getString("Godzina"));
                    columnData.add(rs.getString("Sala"));
                }
                RecordTable.addRow(columnData);
            }
            sqlConn.close();
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                    JOptionPane.ERROR_MESSAGE);
        }
    
    }
   
    private void bDodajPrzedmiot(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDodajPrzedmiot
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("com.mysql.jdbc.Driver");
            //Polaczenie
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            //Wybor tabeli
            //pst = sqlConn.prepareStatement("insert into Przedmiot2(Nazwa,Dzien,Godzina,Sala) values (?,?,?,?)");
            pst = sqlConn.prepareStatement("{call dbo.dodajPrzedmiot(?,?,?,?)}");
            //konwertowanie daty
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String d = sdf.format(jDatePrzedmiot.getDate());
            
            if(jNazwaPrzedmiot.getText().length()==0 || d.length()==0 || jGodzinaPrzedmiot.getSelectedItem()==null || jSalaPrzedmiot.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Wprowadz wszystkie dane");
                return;
            }
            pst.setString(1, jNazwaPrzedmiot.getText());
            pst.setString(2, d);
            pst.setString(3, (String) jGodzinaPrzedmiot.getSelectedItem());
            pst.setString(4, jSalaPrzedmiot.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Przedmiot dodany!");
            upDateDBPrzedmiot();
                
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bDodajPrzedmiot
    
    private void bWyswietlPrzedmiot(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bWyswietlPrzedmiot
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Polaczenie
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            //Wybor tabeli
            pst = sqlConn.prepareStatement("{call dbo.wyswietlPrzedmiot}");
            //pst = sqlConn.prepareStatement("select * from Przedmiot2");
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            //Pobranie danych o ilosci kolum w JFrame
            q =stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel)jTabelaPrzedmiot.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                
                for (i = 1;i <= q; i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("Nazwa"));
                    columnData.add(rs.getDate("Dzien"));
                    columnData.add(rs.getString("Godzina"));
                    columnData.add(rs.getString("Sala"));
                }
                RecordTable.addRow(columnData);
            }
            sqlConn.close();
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                    JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_bWyswietlPrzedmiot

    private void jTabelaPrzedmiotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaPrzedmiotMouseClicked
    try{
        // wierszu w tabeli
        DefaultTableModel RecordTable = (DefaultTableModel)jTabelaPrzedmiot.getModel();
        int SelectedRows = jTabelaPrzedmiot.getSelectedRow();
        java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)RecordTable.getValueAt(SelectedRows, 2).toString()); 
        
        //Przeniesienie danych z tabeli do pól tekstowych
        jNazwaPrzedmiot.setText(RecordTable.getValueAt(SelectedRows, 1 ).toString());
        jDatePrzedmiot.setDate(date);
        jGodzinaPrzedmiot.setSelectedItem(RecordTable.getValueAt(SelectedRows, 3 ).toString());
        jSalaPrzedmiot.setText(RecordTable.getValueAt(SelectedRows, 4 ).toString());
    } 
    catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Błąd "+ex.getMessage(),"Błąd aplikacji",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTabelaPrzedmiotMouseClicked

    private void jWyjdzPrzedmiot(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWyjdzPrzedmiot
        //Opcja wyjdz
        frame = new JFrame("Wyjdz");
        if(JOptionPane.showConfirmDialog(frame, "Czy napewno chcesz wyjsc?","MySQL Connector",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jWyjdzPrzedmiot

    private void bAktualizujPrzedmiot(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAktualizujPrzedmiot
        DefaultTableModel RecordTable = (DefaultTableModel)jTabelaPrzedmiot.getModel();
        int SelectedRows = jTabelaPrzedmiot.getSelectedRow();

        try {
            id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("com.mysql.jdbc.Driver");
            //Polaczenie
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            //Wybor tabeli
            //pst = sqlConn.prepareStatement("update Przedmiot2 set Nazwa=?, Dzien=?, Godzina=?, Sala=? where id=?");
            pst = sqlConn.prepareStatement("{call dbo.aktualizujPrzedmiot(?,?,?,?,?)}");
            //konwertowanie daty
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String d = sdf.format(jDatePrzedmiot.getDate());
            
            if(jNazwaPrzedmiot.getText().length()==0 || d.length()==0 || jGodzinaPrzedmiot.getSelectedItem()==null || jSalaPrzedmiot.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Wprowadz wszystkie dane");
                return;
            }
            pst.setString(1, jNazwaPrzedmiot.getText());
            pst.setString(2, d);
            pst.setString(3, (String) jGodzinaPrzedmiot.getSelectedItem());
            pst.setString(4, jSalaPrzedmiot.getText());
            pst.setInt(5, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Przedmiot zaktualizowany");
            //zakutalizowanie tabeli
            upDateDBPrzedmiot();

        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bAktualizujPrzedmiot

    private void bWyczyscPrzedmiot(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bWyczyscPrzedmiot
       jNazwaPrzedmiot.setText("");
        jDatePrzedmiot.setCalendar(null);
        jGodzinaPrzedmiot.setSelectedItem(null);
        jSalaPrzedmiot.setText("");
    }//GEN-LAST:event_bWyczyscPrzedmiot

    private void bUsunPrzedmiot(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsunPrzedmiot
        //Usuwanie wierszu
        DefaultTableModel RecordTable = (DefaultTableModel)jTabelaPrzedmiot.getModel();
        int SelectedRows = jTabelaPrzedmiot.getSelectedRow();
        
        try{
            id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            
            deleteItem = JOptionPane.showConfirmDialog(null, "Czy napewno chcesz usunac ten rekord?", "Warning", JOptionPane.YES_NO_OPTION);
            
            if(deleteItem == JOptionPane.YES_OPTION)
            {
                Class.forName("com.mysql.jdbc.Driver");
                //Polaczenie
                sqlConn = DriverManager.getConnection(dataConn,username,password);
                //Wybor tabeli
                //pst = sqlConn.prepareStatement("delete from Przedmiot2 where id=?");
                pst = sqlConn.prepareStatement("{call dbo.usunPrzedmiot(?)}");
                
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Przedmiot usuniety!");
                upDateDBPrzedmiot();        
                
                jNazwaPrzedmiot.setText("");
                jNazwaPrzedmiot.requestFocus();
                jDatePrzedmiot.setCalendar(null);
                jGodzinaPrzedmiot.setSelectedItem(null);
                jSalaPrzedmiot.setText("");
                return;
                
            }
        }
        
          catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bUsunPrzedmiot
//========================================Prowadzacy======================================================================   
     public void upDateDBProwadzacy(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Polaczenie
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            //Wybor tabeli
            pst = sqlConn.prepareStatement("{call dbo.wyswietlProwadzacy}");
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            //Pobranie danych o ilosci kolum w JFrame
            q =stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel)jTabelaProwadzacy.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                
                for (i = 1;i <= q; i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("imie"));
                    columnData.add(rs.getString("nazwisko"));
                    columnData.add(rs.getString("PrzedmiotID"));
                }
                RecordTable.addRow(columnData);
            }
            sqlConn.close();
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                    JOptionPane.ERROR_MESSAGE);
        }
    
    }
     
    private void bDodajProwadzacy(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDodajProwadzacy
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("com.mysql.jdbc.Driver");
            //Polaczenie
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            //Wybor tabeli
            //pst = sqlConn.prepareStatement("insert into Prowadzacy(imie,nazwisko,PrzedmiotID) values (?,?,?)");
            pst = sqlConn.prepareStatement("{call dbo.dodajProwadzacy(?,?,?)}");
            if(jImieProwadzacy.getText().length()==0 || jNazwiskoProwadzacy.getText().length()==0 || jPrzedmiotIDProwadzacy.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Wprowadz wszystkie dane");
                return;
            }
            else{   
                pst.setString(1, jImieProwadzacy.getText());
                pst.setString(2, jNazwiskoProwadzacy.getText());
                pst.setString(3, jPrzedmiotIDProwadzacy.getText());
            
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Prowadzacy dodany!");
                upDateDBProwadzacy();
            }
                
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bDodajProwadzacy

    private void bUsunProwadzacy(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsunProwadzacy
        //Usuwanie wierszu
        DefaultTableModel RecordTable = (DefaultTableModel)jTabelaProwadzacy.getModel();
        int SelectedRows = jTabelaProwadzacy.getSelectedRow();
        
        try{
            id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            
            deleteItem = JOptionPane.showConfirmDialog(null, "Czy napewno chcesz usunac ten rekord?", "Warning", JOptionPane.YES_NO_OPTION);
            
            if(deleteItem == JOptionPane.YES_OPTION)
            {
                Class.forName("com.mysql.jdbc.Driver");
                //Polaczenie
                sqlConn = DriverManager.getConnection(dataConn,username,password);
                //Wybor tabeli
                //pst = sqlConn.prepareStatement("delete from Prowadzacy where id=?");
                pst = sqlConn.prepareStatement("{call dbo.usunProwadzacy(?)}");
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Prowadzacy usuniety!");
                upDateDBProwadzacy();        
                
                jImieProwadzacy.setText("");
                jImieProwadzacy.requestFocus();
                jNazwiskoProwadzacy.setText("");
                jPrzedmiotIDProwadzacy.setText("");
                
            }
        }
        
          catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bUsunProwadzacy

    private void bAktualizujProwadzacy(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAktualizujProwadzacy
        DefaultTableModel RecordTable = (DefaultTableModel)jTabelaProwadzacy.getModel();
        int SelectedRows = jTabelaProwadzacy.getSelectedRow();

        try {
            id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("com.mysql.jdbc.Driver");
            //Polaczenie
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            //Wybor tabeli
            //pst = sqlConn.prepareStatement("update Prowadzacy set imie=?, nazwisko=?, PrzedmiotID=? where id=?");
            pst = sqlConn.prepareStatement("{call dbo.aktualizujProwadzacy(?,?,?,?)}");
            
            if(jImieProwadzacy.getText().length()==0 || jNazwiskoProwadzacy.getText().length()==0 || jPrzedmiotIDProwadzacy.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Wprowadz wszystkie dane");
                return;
            }
             pst.setString(1, jImieProwadzacy.getText());
            pst.setString(2, jNazwiskoProwadzacy.getText());
            pst.setString(3, jPrzedmiotIDProwadzacy.getText());
            pst.setInt(4, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Prowadzacy zaktualizowany");
            upDateDBProwadzacy();

        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bAktualizujProwadzacy

    private void bWyczyscProwadzacy(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bWyczyscProwadzacy
        jImieProwadzacy.setText("");       
        jNazwiskoProwadzacy.setText("");
        jPrzedmiotIDProwadzacy.setText("");
    }//GEN-LAST:event_bWyczyscProwadzacy

    private void bWyswietlProwadzacy(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bWyswietlProwadzacy
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Polaczenie
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            //Wybor tabeli
            pst = sqlConn.prepareStatement("{call dbo.wyswietlProwadzacy}");
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            //Pobranie danych o ilosci kolum w JFrame
            q =stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel)jTabelaProwadzacy.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                
                for (i = 1;i <= q; i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("imie"));
                    columnData.add(rs.getString("nazwisko"));
                    columnData.add(rs.getString("PrzedmiotID"));
                }
                RecordTable.addRow(columnData);
            }
            sqlConn.close();
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bWyswietlProwadzacy

    private void jWyjdzProwadzacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWyjdzProwadzacyActionPerformed
        frame = new JFrame("Wyjdz");
        if(JOptionPane.showConfirmDialog(frame, "Czy napewno chcesz wyjsc?","MySQL Connector",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jWyjdzProwadzacyActionPerformed

    private void jTabelaProwadzacyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaProwadzacyMouseClicked
        //Wybor wierszu w tabeli
        DefaultTableModel RecordTable = (DefaultTableModel)jTabelaProwadzacy.getModel();
        int SelectedRows = jTabelaProwadzacy.getSelectedRow();
        
        jImieProwadzacy.setText(RecordTable.getValueAt(SelectedRows, 1 ).toString());
        jNazwiskoProwadzacy.setText(RecordTable.getValueAt(SelectedRows, 2 ).toString());
        jPrzedmiotIDProwadzacy.setText(RecordTable.getValueAt(SelectedRows, 3 ).toString());
    }//GEN-LAST:event_jTabelaProwadzacyMouseClicked
//========================================Studenci========================================================================
     public void upDateDBStudent(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Polaczenie
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            //Wybor tabeli
            //pst = sqlConn.prepareStatement("select * from Student");
            pst = sqlConn.prepareStatement("{call dbo.wyswietlStudent}");
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            //Pobranie danych o ilosci kolum w JFrame
            q =stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel)jTabelaStudent.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                
                for (i = 1;i <= q; i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("imie"));
                    columnData.add(rs.getString("nazwisko"));
                    columnData.add(rs.getString("PrzedmiotID"));
                }
                RecordTable.addRow(columnData);
            }
            sqlConn.close();
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                    JOptionPane.ERROR_MESSAGE);
        }
    
    }
     
    private void bDodajStudent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDodajStudent
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("com.mysql.jdbc.Driver");
            //Polaczenie
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            //Wybor tabeli
            //pst = sqlConn.prepareStatement("insert into Student(imie,nazwisko,PrzedmiotID) values (?,?,?)");
            pst = sqlConn.prepareStatement("{call dbo.dodajStudent(?,?,?)}");
            if(jImieStudent.getText().length()==0 || jNazwiskoStudent.getText().length()==0 || jPrzedmiotIDStudent.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Wprowadz wszystkie dane");
                return;
            }
            
            pst.setString(1, jImieStudent.getText());
            pst.setString(2, jNazwiskoStudent.getText());
            pst.setString(3, jPrzedmiotIDStudent.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student dodany!");
            upDateDBStudent();
                
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bDodajStudent

    private void bUsunStudent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsunStudent
        //Usuwanie wierszu
        DefaultTableModel RecordTable = (DefaultTableModel)jTabelaStudent.getModel();
        int SelectedRows = jTabelaStudent.getSelectedRow();
        
        try{
            id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            
            deleteItem = JOptionPane.showConfirmDialog(null, "Czy napewno chcesz usunac ten rekord?", "Warning", JOptionPane.YES_NO_OPTION);
            
            if(deleteItem == JOptionPane.YES_OPTION)
            {
                Class.forName("com.mysql.jdbc.Driver");
                //Polaczenie
                sqlConn = DriverManager.getConnection(dataConn,username,password);
                //Wybor tabeli
                pst = sqlConn.prepareStatement("{call dbo.usunStudent(?)}");
                //pst = sqlConn.prepareStatement("delete from Student where id=?");
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Prowadzacy usuniety!");
                upDateDBStudent();        
                
                jImieStudent.setText("");
                jImieStudent.requestFocus();
                jNazwiskoStudent.setText("");
                jPrzedmiotIDStudent.setText("");
                
            }
        }
        
          catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bUsunStudent

    private void bAktualizujStudent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAktualizujStudent
        DefaultTableModel RecordTable = (DefaultTableModel)jTabelaStudent.getModel();
        int SelectedRows = jTabelaStudent.getSelectedRow();

        try {
            id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("com.mysql.jdbc.Driver");
            //Polaczenie
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            //Wybor tabeli
            //pst = sqlConn.prepareStatement("update Student set imie=?, nazwisko=?, PrzedmiotID=? where id=?");
            pst = sqlConn.prepareStatement("{call dbo.aktualizujStudent(?,?,?,?)}");
            if(jImieStudent.getText().length()==0 || jNazwiskoStudent.getText().length()==0 || jPrzedmiotIDStudent.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Wprowadz wszystkie dane");
                return;
            }
             pst.setString(1, jImieStudent.getText());
            pst.setString(2, jNazwiskoStudent.getText());
            pst.setString(3, jPrzedmiotIDStudent.getText());
            pst.setInt(4, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student zaktualizowany");
            upDateDBStudent();

        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bAktualizujStudent

    private void bWyczyscStudent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bWyczyscStudent
        jImieStudent.setText("");
        jNazwiskoStudent.setText("");
        jPrzedmiotIDStudent.setText("");
    }//GEN-LAST:event_bWyczyscStudent

    private void bWyswietlStudent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bWyswietlStudent
           try {
            Class.forName("com.mysql.jdbc.Driver");
            //Polaczenie
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            //Wybor tabeli
            //pst = sqlConn.prepareStatement("select * from Student");
            pst = sqlConn.prepareStatement("{call dbo.wyswietlStudent}");
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            //Pobranie danych o ilosci kolum w JFrame
            q =stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel)jTabelaStudent.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                
                for (i = 1;i <= q; i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("imie"));
                    columnData.add(rs.getString("nazwisko"));
                    columnData.add(rs.getString("PrzedmiotID"));
                }
                RecordTable.addRow(columnData);
            }
            sqlConn.close();
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),"Błąd aplikacji",
                    JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_bWyswietlStudent

    private void jWyjdzStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWyjdzStudentActionPerformed
         frame = new JFrame("Wyjdz");
        if(JOptionPane.showConfirmDialog(frame, "Czy napewno chcesz wyjsc?","MySQL Connector",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jWyjdzStudentActionPerformed

    private void jTabelaStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaStudentMouseClicked
         //Wybor wierszu w tabeli
        DefaultTableModel RecordTable = (DefaultTableModel)jTabelaStudent.getModel();
        int SelectedRows = jTabelaStudent.getSelectedRow();
        
        jImieStudent.setText(RecordTable.getValueAt(SelectedRows, 1 ).toString());
        jNazwiskoStudent.setText(RecordTable.getValueAt(SelectedRows, 2 ).toString());
        jPrzedmiotIDStudent.setText(RecordTable.getValueAt(SelectedRows, 3 ).toString());
    }//GEN-LAST:event_jTabelaStudentMouseClicked

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BazaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BazaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BazaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BazaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BazaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAktualizujProwadzacy;
    private javax.swing.JButton bAktualizujPrzedmiot;
    private javax.swing.JButton bAktualizujStudent;
    private javax.swing.JButton bDodajProwadzacy;
    private javax.swing.JButton bDodajPrzedmiot;
    private javax.swing.JButton bDodajStudent;
    private javax.swing.JButton bUsunProwadzacy;
    private javax.swing.JButton bUsunPrzedmiot;
    private javax.swing.JButton bUsunStudent;
    private javax.swing.JButton bWyczyscProwadzacy;
    private javax.swing.JButton bWyczyscPrzedmiot;
    private javax.swing.JButton bWyczyscStudent;
    private javax.swing.JButton bWyswietlProwadzacy;
    private javax.swing.JButton bWyswietlPrzedmiot;
    private javax.swing.JButton bWyswietlStudent;
    private com.toedter.calendar.JDateChooser jDatePrzedmiot;
    private javax.swing.JComboBox<String> jGodzinaPrzedmiot;
    private javax.swing.JTextField jImieProwadzacy;
    private javax.swing.JTextField jImieStudent;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JTextField jNazwaPrzedmiot;
    private javax.swing.JTextField jNazwiskoProwadzacy;
    private javax.swing.JTextField jNazwiskoStudent;
    private javax.swing.JTextField jPrzedmiotIDProwadzacy;
    private javax.swing.JTextField jPrzedmiotIDStudent;
    private javax.swing.JTextField jSalaPrzedmiot;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTabelaProwadzacy;
    private javax.swing.JTable jTabelaPrzedmiot;
    private javax.swing.JTable jTabelaStudent;
    private javax.swing.JLabel jText1Prowadzacy;
    private javax.swing.JLabel jText1Przedmiot;
    private javax.swing.JLabel jText1Student;
    private javax.swing.JLabel jText2Przedmiot;
    private javax.swing.JLabel jText2Przedmiot1;
    private javax.swing.JLabel jText2Student;
    private javax.swing.JLabel jText3Prowadzacy;
    private javax.swing.JLabel jText3Przedmiot;
    private javax.swing.JLabel jText3Przedmiot1;
    private javax.swing.JLabel jText3Student;
    private javax.swing.JLabel jTextProwadzacy;
    private javax.swing.JLabel jTextPrzedmiot;
    private javax.swing.JLabel jTextStudent;
    private javax.swing.JButton jWyjdzProwadzacy;
    private javax.swing.JButton jWyjdzPrzedmiot;
    private javax.swing.JButton jWyjdzStudent;
    private javax.swing.JPanel pPanelProwadzacy;
    private javax.swing.JPanel pPanelPrzedmiot;
    private javax.swing.JPanel pPanelStudenci;
    // End of variables declaration//GEN-END:variables

}
