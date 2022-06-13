/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.primus.lms;

import Data.CourseData;
import DatabaseConnection.DBconnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author smsak
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    
    
    
    
    public LoginPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pfPasswordLogin = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LMS - Login Page");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 229, 184));
        jLabel2.setText("Learning is a journey not a destination.");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\smsak\\OneDrive\\Documents\\NetBeansProjects\\LMS\\src\\main\\java\\rsz_logoeduverse.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(187, 187, 187))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login Here");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User Name:");

        tfUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Do not have an account? Then signup...");

        btnSignUp.setBackground(new java.awt.Color(0, 0, 0));
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("SignUp");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(152, 152, 152))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(btnLogin)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(pfPasswordLogin)))
                    .addComponent(btnSignUp))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pfPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        SignUp signup = new SignUp();
        this.dispose();
        signup.setVisible(true);
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void tfUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserNameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        DBconnection dbc = new DBconnection();
        Connection con = null;
        
        String userName = tfUserName.getText();
        if(userName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your username.");
            tfUserName.grabFocus();
            return;
        }
        String password = pfPasswordLogin.getText();
        if(password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your password.");
            pfPasswordLogin.grabFocus();
            return;
        }
        
        // Query for fetching username and password from database.
        String loginQuery = "SELECT * FROM student_login AS sl WHERE sl.user_name = '" + userName + "' AND sl.user_password = '" 
                + password + "';";
        String loginQueryTeacher = "SELECT * FROM teacher_login AS tl WHERE tl.user_name = '" + userName + "' AND tl.user_password = '" 
                + password + "';";
        
        
        // Creating statement, executing query and checking validity.
        try{
            // Stablishing connection with the database.
            con = dbc.getConnect();
            
            Statement stm = con.createStatement();      // For student
            Statement stm2 = con.createStatement();  // For teacher
            
            ResultSet rs = stm.executeQuery(loginQuery);
            ResultSet rsTeach = stm2.executeQuery(loginQueryTeacher);
            
            
            // Checking if the username and password exists in the database AND the user is a ***STUDENT**** show course information in homepage.
            if(rs.next()){
                dispose();
                
                //ResultSetMetaData resultSetMetaData = rs.getMetaData();
                //String tableName = resultSetMetaData.getTableName(1);
                //System.out.println(tableName);
                
                // Getting batch information from student_info table by using the entered username:
                String queryForGettingBatch = "SELECT * FROM student_info WHERE user_name = '" + userName + "';";
                Statement statement = con.createStatement();
                ResultSet resultBatch = statement.executeQuery(queryForGettingBatch);
                resultBatch.next();
                int batch = resultBatch.getInt("batch");
                
                //System.out.println(batch);
                
                // Getting all data from courses table matching the batch data of the student user.
                String queryForGettingCourseInfo = "SELECT * FROM courses WHERE batch = '" + batch + "';";
                Statement statement2 = con.createStatement();
                ResultSet resultCourseInfo = statement2.executeQuery(queryForGettingCourseInfo);
                
                ArrayList<CourseData> coursedata = new ArrayList<>();
                
                
                StudentHomePage homepage = new StudentHomePage();
                
                
                // Adding data into the Arraylist.
                while(resultCourseInfo.next()){
                    CourseData course = new CourseData(resultCourseInfo.getString("course_name"), resultCourseInfo.getString("course_id"),
                            resultCourseInfo.getString("course_teacher"), resultCourseInfo.getInt("batch"), resultCourseInfo.getString("user_name"),
                            resultCourseInfo.getString("class_time"));
                    
                    coursedata.add(course);
                }
                homepage.setTableData(coursedata);
                homepage.setBatch(batch);
                //System.out.println(batch);
                dispose();
                homepage.setVisible(true);
                
                resultBatch.close();
                resultCourseInfo.close();
                statement.close();
                statement2.close();
                   
            }
            // Checking if the username and password exists in the database AND the user is a ***TEACHER**** show course information in homepage.
            else if(rsTeach.next()){
                TeacherHomePage homepage = new TeacherHomePage();
                    
                    String queryForgettingCourses = "SELECT * FROM courses WHERE user_name = '" + userName + "';";
                    
                    ArrayList<CourseData> courseData = new ArrayList<CourseData>();
                    
                    ResultSet rst = stm.executeQuery(queryForgettingCourses);
                    
                    while(rst.next()){
                        CourseData coursedata = new CourseData(rst.getString("course_name"), rst.getString("course_id"),
                                rst.getString("course_teacher"), rst.getInt("batch"), rst.getString("user_name"), rst.getString("class_time"));
                        
                        courseData.add(coursedata);
                    }
                    
                    
                    switch (courseData.size()) {
                        case 1:
                            homepage.setCourse1Data(courseData.get(0).getCourseName(), courseData.get(0).getBatch(), courseData.get(0).getClassSchedule());
                            homepage.setVisibilityCourse1();
                            break;
                        case 2:
                            homepage.setCourse1Data(courseData.get(0).getCourseName(), courseData.get(0).getBatch(), courseData.get(0).getClassSchedule());
                            homepage.setCourse2Data(courseData.get(1).getCourseName(), courseData.get(1).getBatch(), courseData.get(1).getClassSchedule());
                            homepage.setVisibilityCourse2();
                            break;
                        case 3:
                            homepage.setCourse1Data(courseData.get(0).getCourseName(), courseData.get(0).getBatch(), courseData.get(0).getClassSchedule());
                            homepage.setCourse2Data(courseData.get(1).getCourseName(), courseData.get(1).getBatch(), courseData.get(1).getClassSchedule());
                            homepage.setCourse3Data(courseData.get(2).getCourseName(), courseData.get(2).getBatch(), courseData.get(2).getClassSchedule());
                            homepage.setVisibilityCourse3();
                            break;
                        case 4:
                            homepage.setCourse1Data(courseData.get(0).getCourseName(), courseData.get(0).getBatch(), courseData.get(0).getClassSchedule());
                            homepage.setCourse2Data(courseData.get(1).getCourseName(), courseData.get(1).getBatch(), courseData.get(1).getClassSchedule());
                            homepage.setCourse3Data(courseData.get(2).getCourseName(), courseData.get(2).getBatch(), courseData.get(2).getClassSchedule());
                            homepage.setCourse4Data(courseData.get(3).getCourseName(), courseData.get(3).getBatch(), courseData.get(3).getClassSchedule());
                            homepage.setVisibilityCourse4();
                            break;
                        case 5:
                            homepage.setCourse1Data(courseData.get(0).getCourseName(), courseData.get(0).getBatch(), courseData.get(0).getClassSchedule());
                            homepage.setCourse2Data(courseData.get(1).getCourseName(), courseData.get(1).getBatch(), courseData.get(1).getClassSchedule());
                            homepage.setCourse3Data(courseData.get(2).getCourseName(), courseData.get(2).getBatch(), courseData.get(2).getClassSchedule());
                            homepage.setCourse4Data(courseData.get(3).getCourseName(), courseData.get(3).getBatch(), courseData.get(3).getClassSchedule());
                            homepage.setCourse5Data(courseData.get(4).getCourseName(), courseData.get(4).getBatch(), courseData.get(4).getClassSchedule());
                            homepage.setVisibilityCourse5();
                            break;
                        case 6:
                            homepage.setCourse1Data(courseData.get(0).getCourseName(), courseData.get(0).getBatch(), courseData.get(0).getClassSchedule());
                            homepage.setCourse2Data(courseData.get(1).getCourseName(), courseData.get(1).getBatch(), courseData.get(1).getClassSchedule());
                            homepage.setCourse3Data(courseData.get(2).getCourseName(), courseData.get(2).getBatch(), courseData.get(2).getClassSchedule());
                            homepage.setCourse4Data(courseData.get(3).getCourseName(), courseData.get(3).getBatch(), courseData.get(3).getClassSchedule());
                            homepage.setCourse5Data(courseData.get(4).getCourseName(), courseData.get(4).getBatch(), courseData.get(4).getClassSchedule());
                            homepage.setCourse6Data(courseData.get(5).getCourseName(), courseData.get(5).getBatch(), courseData.get(5).getClassSchedule());
                            break;
                        default:
                            break;
                    }
                    homepage.setUserName(userName);
                    dispose();
                    homepage.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(this, "Incorrect Username or Password");
                return;
            }
            
            rs.close();
            rsTeach.close();
            stm2.close();
            stm.close();
            con.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pfPasswordLogin;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables
}
