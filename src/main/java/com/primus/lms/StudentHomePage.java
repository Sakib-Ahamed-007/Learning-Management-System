/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.primus.lms;

import Data.CourseContents;
import javax.swing.table.DefaultTableModel;
import Data.CourseData;
import DatabaseConnection.DBconnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author smsak
 */
public class StudentHomePage extends javax.swing.JFrame {

    
    // All the variables for this class are included here:
    
    
    DefaultTableModel model;
    private int batch;
    
    
    
    /**
     * Creates new form StudentHomePage
     */
    public StudentHomePage() {
        initComponents();
        
        model = (DefaultTableModel) jtEnrolledC.getModel();
        //System.out.println(batch);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpHome = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEnrolledC = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmCourseContents = new javax.swing.JMenuItem();
        jmEnrolledCourses = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eduverse - Home");
        setResizable(false);

        jpHome.setBackground(new java.awt.Color(102, 255, 255));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setText("Enrolled Courses:");

        jtEnrolledC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course_name", "Course_id", "Course_teacher", "Schedule"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtEnrolledC.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtEnrolledC);

        javax.swing.GroupLayout jpHomeLayout = new javax.swing.GroupLayout(jpHome);
        jpHome.setLayout(jpHomeLayout);
        jpHomeLayout.setHorizontalGroup(
            jpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHomeLayout.createSequentialGroup()
                .addGroup(jpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpHomeLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel13))
                    .addGroup(jpHomeLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpHomeLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpHomeLayout.setVerticalGroup(
            jpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 102, 102));

        jMenu1.setText("Home");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jmCourseContents.setText("Course Contents");
        jmCourseContents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCourseContentsActionPerformed(evt);
            }
        });
        jMenu1.add(jmCourseContents);

        jmEnrolledCourses.setText("Enrolled Courses");
        jmEnrolledCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEnrolledCoursesActionPerformed(evt);
            }
        });
        jMenu1.add(jmEnrolledCourses);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Profile");

        jMenuItem4.setText("Personal Information");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Online Class");

        jMenuItem1.setText("Join");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpHome, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        jpHome.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jmEnrolledCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEnrolledCoursesActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_jmEnrolledCoursesActionPerformed

    private void jmCourseContentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCourseContentsActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        DBconnection dbc = new DBconnection();
        
        String queryForGettingCourseInfo = "SELECT * FROM course_contents WHERE batch = '" + batch + "';";
        
        ArrayList<CourseContents> courseContent = new ArrayList<>();
        
        
        try {
            con = dbc.getConnect();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(queryForGettingCourseInfo);
            
            while(rs.next()){
                String queryForGettingCourseName = "SELECT * FROM courses WHERE course_id = '" + rs.getString("course_id") + "';";
                Statement stm2 = con.createStatement();
                ResultSet rs2 = stm2.executeQuery(queryForGettingCourseName);
                rs2.next();
                
                CourseContents courseC = new CourseContents(rs2.getString("course_name"), rs.getString("course_id"),
                        rs.getString("file_name"), rs.getString("upload_date"));
                
                courseContent.add(courseC);
            }
            
            DownCourseCont downCourseCont = new DownCourseCont();
            downCourseCont.setBatch(batch);
            downCourseCont.setTableData(courseContent);
            dispose();
            downCourseCont.setVisible(true);
            
            
            
            rs.close();
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentHomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmCourseContentsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            Client client = new Client();
            client.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(StudentHomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem jmCourseContents;
    private javax.swing.JMenuItem jmEnrolledCourses;
    private javax.swing.JPanel jpHome;
    private javax.swing.JTable jtEnrolledC;
    // End of variables declaration//GEN-END:variables
    
    
    
    public void setTableData(ArrayList<CourseData> courseData){
        
        for(int i = 0; i < courseData.size(); i++){
            model.insertRow(jtEnrolledC.getRowCount(), new Object[]{
                courseData.get(i).getCourseName(),
                courseData.get(i).getCourseId(),
                courseData.get(i).getCourseTeacher(),
                courseData.get(i).getClassSchedule()
            });
        }
    }
    
    
    public void setTableData2() throws SQLException{
        DBconnection dbc = new DBconnection();
        Connection con = dbc.getConnect();
        
        
        String queryToGetCourseInfo = "SELECT * FROM courses WHERE batch = '" + getBatch() + "';";
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery(queryToGetCourseInfo);
        
        
        System.out.println(getBatch());

        while(rs.next()){
            System.out.println(rs.getString("course_name") + " " + rs.getString("course_id") + " " + rs.getString("course_teacher") + " " + rs.getString("class_time"));
            model.insertRow(jtEnrolledC.getRowCount(), new Object[]{
            rs.getString("course_name"),
            rs.getString("course_id"),
            rs.getString("course_teacher"),
            rs.getString("class_time")
        });
        }
        stm.close();
        con.close();
        
        
        
    }

    /**
     * @return the batch
     */
    public int getBatch() {
        return batch;
    }

    /**
     * @param batch the batch to set
     */
    public void setBatch(int batch) {
        this.batch = batch;
    }
    
    
}
