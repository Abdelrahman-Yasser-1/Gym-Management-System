package gym;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author LENOVO
 */
public class Login_form extends javax.swing.JFrame {
    
////////////////////////////////////////////////////////////////////////////////////////  Start  Functions
//This functions to take ArrayList and id and password and check if this password and id is exist or no.
    
    public boolean login_admin(ArrayList<Administrator> admin , int id , String pass)
    {
        boolean res = false;  
        for (int i = 0; i < admin.size(); i++) {
            
            if(id == admin.get(i).getId()& pass.equals( admin.get(i).getPassword()))
            {
                res =  true;
                break;
            }
            else
            {
                continue;
            }
        }
        return res;
    }
    
     public boolean login_emp(ArrayList<Employee> emp , int id , String pass)
    {
        boolean res = false;  
        for (int i = 0; i < emp.size(); i++) {
            
            if(id == emp.get(i).getId()& pass.equals( emp.get(i).getPassword()))
            {
                res =  true;
                break;
            }
            else
            {
                continue;
            }
        }
        return res;
    }
    
///////////////////////////////////////////////////////////////////////////////////////  End  Functions
     
    ArrayList<Administrator> admins = new ArrayList<Administrator>();
    ArrayList<Employee> employees = new ArrayList<Employee>();

    /**
     * Creates new form Login_form
     */
    
    
    Administrator_form admin = new Administrator_form();
    Employee_form employee = new Employee_form();
    
 
    
            
    public Login_form() {
       
        admins.add(new Administrator(55555,"151515"));
        admins.add(new Administrator(1,"1"));
        admins.add(new Administrator(77777,"131313"));
        
        employees.add(new Employee(3,"3"));
        employees.add(new Employee(2,"2"));
        employees.add(new Employee(555,"0303030"));
        
        initComponents();
        this.setVisible(true);
        errorLable.setVisible(false);
        admin.setVisible(false);
        employee.setVisible(false);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel_login = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jPasswordField_password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        errorLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GYM Management System");
        setLocation(new java.awt.Point(750, 150));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(23, 21, 32));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcom to Gym Management System");

        jLabel_login.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel_login.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_login.setText("Login");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID :");

        jTextField_id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idActionPerformed(evt);
            }
        });
        jTextField_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_idKeyPressed(evt);
            }
        });

        jPasswordField_password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPasswordField_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_passwordKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(205, 92, 92));
        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton1KeyReleased(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(23, 21, 32));
        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Exit");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        errorLable.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        errorLable.setForeground(new java.awt.Color(255, 0, 0));
        errorLable.setText("Make sure from your ID and Password.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jTextField_id)
                                .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel_login)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(errorLable)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jLabel_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased
        // TODO add your handling code here:    
    }//GEN-LAST:event_jButton1KeyReleased

    private void jTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Exit Application", "Exit!",JOptionPane.YES_NO_OPTION );
        
        if (a == 0) 
        {
            JOptionPane.showMessageDialog(admin, "Thank you for using my Application :)");
            System.exit(0);
        } 

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTextField_id.getText().equals("") || jPasswordField_password.getPassword().length==0){
            errorLable.setText("    Enter your ID and Password first");
            errorLable.setVisible(true);
            admin.setVisible(false);
            employee.setVisible(false);
        }else{
            int id = Integer.parseInt(jTextField_id.getText().toString());
            String password = new String(jPasswordField_password.getPassword()); 

            if (login_admin(admins, id, password)) { 
                employee.setVisible(false);
                this.setVisible(false);  
                admin.setVisible(true);
            }else if(login_emp(employees, id, password)) {
                this.setVisible(false); 
                admin.setVisible(false);
                employee.setVisible(true);
            }else{
                errorLable.setText("Make sure from your ID and Password");
                errorLable.setVisible(true);
                admin.setVisible(false);
                employee.setVisible(false);
            }
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_passwordKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if (jTextField_id.getText().equals("") || jPasswordField_password.getPassword().length==0){
                errorLable.setText("    Enter your ID and Password first");
                errorLable.setVisible(true);
                admin.setVisible(false);
                employee.setVisible(false);
            }else{
                int id = Integer.parseInt(jTextField_id.getText().toString());
                String password = new String(jPasswordField_password.getPassword()); 

                if (login_admin(admins, id, password)) { 
                    employee.setVisible(false);
                    this.setVisible(false);  
                    admin.setVisible(true);
                }else if(login_emp(employees, id, password)) {
                    this.setVisible(false); 
                    admin.setVisible(false);
                    employee.setVisible(true);
                }else{
                    errorLable.setText("Make sure from your ID and Password");
                    errorLable.setVisible(true);
                    admin.setVisible(false);
                    employee.setVisible(false);
                }
            }    
        }
    }//GEN-LAST:event_jPasswordField_passwordKeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton2KeyPressed

    private void jTextField_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_idKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if (jTextField_id.getText().equals("") || jPasswordField_password.getPassword().length==0){
                errorLable.setText("    Enter your ID and Password first");
                errorLable.setVisible(true);
                admin.setVisible(false);
                employee.setVisible(false);
            }else{
                int id = Integer.parseInt(jTextField_id.getText().toString());
                String password = new String(jPasswordField_password.getPassword()); 

                if (login_admin(admins, id, password)) { 
                    employee.setVisible(false);
                    this.setVisible(false);  
                    admin.setVisible(true);
                }else if(login_emp(employees, id, password)) {
                    this.setVisible(false); 
                    admin.setVisible(false);
                    employee.setVisible(true);
                }else{
                    errorLable.setText("Make sure from your ID and Password");
                    errorLable.setVisible(true);
                    admin.setVisible(false);
                    employee.setVisible(false);
                }
            }    
        }
    }//GEN-LAST:event_jTextField_idKeyPressed

  
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
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_form().setVisible(true);
            }
        });
        
//        ArrayList<Employee> emp = new ArrayList<Employee>(3);
//        emp.add(new Employee(201917001, "123456"));
//        emp.add(new Employee(201917002, "147852"));
//        emp.add(new Employee(201917003, "258963"));
//        
//        ArrayList<Administrator> admin = new ArrayList<Administrator>(3);
//        admin.add(new Administrator(202017001, "369852"));
//        admin.add(new Administrator(202017002, "258741"));
//        admin.add(new Administrator(202017003, "987456"));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_login;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_id;
    // End of variables declaration//GEN-END:variables
}
