    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discord_board_5;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author RYAN
 */
public class regForm extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public regForm() {
        initComponents();
    }

    /**
     * 여기 아래엔 타이머를 이용하여서 jPanel 메세지가 나오고 몇초 뒤에 사라지게 구현하였습니다.
     * 로그인 실패, 로그인 성공시 새로운 창이 뜨는게 아니라 숨겨져 있던 패널이 내려오면서 메세지를 출력하게 됩니다.
     */
    
        Timer timer1 = new Timer(30, new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
        
            if(jPanel_Message.getHeight() != 105){
                jPanel_Message.setBounds(0,0,regForm.this.getSize().width,jPanel_Message.getHeight() + 5);
                if(jPanel_Message.getHeight() == 105){
                    timer1.stop();
                }
            }
        }
    });
    
        Timer timer2 = new Timer(30, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        
            if(jPanel_Message.getHeight() != 0){
                jPanel_Message.setBounds(0,0,regForm.this.getSize().width,jPanel_Message.getHeight() - 5);
                if(jPanel_Message.getHeight() == 0){
                    timer2.stop();
                }
            }
        }
    });
       
        
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jTextField_Username = new javax.swing.JTextField();
            jPasswordField_Password = new javax.swing.JPasswordField();
            jl_Title = new javax.swing.JLabel();
            jButton_Reg = new javax.swing.JButton();
            jt_ID = new javax.swing.JTextField();
            jt_pswd = new javax.swing.JTextField();
            jCheckBox1 = new javax.swing.JCheckBox();
            jPanel_Message = new javax.swing.JPanel();
            jLabel_Message = new javax.swing.JLabel();
            jButton_Ok = new javax.swing.JButton();
            jLabel_Nick = new javax.swing.JLabel();
            jScrollPane1 = new javax.swing.JScrollPane();
            jTextPane_Nick = new javax.swing.JTextPane();
            jLabel_Cellnum = new javax.swing.JLabel();
            jLabel_Bday = new javax.swing.JLabel();
            jScrollPane2 = new javax.swing.JScrollPane();
            jTextPane_Bday = new javax.swing.JTextPane();
            jScrollPane3 = new javax.swing.JScrollPane();
            jTextPane_Cellnum = new javax.swing.JTextPane();
            jButton_Cancle = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setUndecorated(true);
            setResizable(false);

            jPanel1.setBackground(new java.awt.Color(0, 0, 0));

            jTextField_Username.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
            jTextField_Username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
            jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField_UsernameActionPerformed(evt);
                }
            });

            jPasswordField_Password.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
            jPasswordField_Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
            jPasswordField_Password.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jPasswordField_PasswordActionPerformed(evt);
                }
            });

            jl_Title.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
            jl_Title.setForeground(new java.awt.Color(255, 255, 255));
            jl_Title.setText("Register Form");

            jButton_Reg.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
            jButton_Reg.setText("Register");
            jButton_Reg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
            jButton_Reg.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton_RegActionPerformed(evt);
                }
            });

            jt_ID.setEditable(false);
            jt_ID.setBackground(new java.awt.Color(0, 0, 0));
            jt_ID.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
            jt_ID.setForeground(new java.awt.Color(255, 255, 255));
            jt_ID.setText("ID");
            jt_ID.setBorder(null);
            jt_ID.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jt_IDActionPerformed(evt);
                }
            });

            jt_pswd.setEditable(false);
            jt_pswd.setBackground(new java.awt.Color(0, 0, 0));
            jt_pswd.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
            jt_pswd.setForeground(new java.awt.Color(255, 255, 255));
            jt_pswd.setText("Password");
            jt_pswd.setBorder(null);

            jCheckBox1.setText("Show Password");
            jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBox1ActionPerformed(evt);
                }
            });

            jPanel_Message.setForeground(new java.awt.Color(34, 34, 63));

            jLabel_Message.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N

            jButton_Ok.setText("OK");
            jButton_Ok.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton_OkActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel_MessageLayout = new javax.swing.GroupLayout(jPanel_Message);
            jPanel_Message.setLayout(jPanel_MessageLayout);
            jPanel_MessageLayout.setHorizontalGroup(
                jPanel_MessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_MessageLayout.createSequentialGroup()
                    .addComponent(jLabel_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton_Ok, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addContainerGap())
            );
            jPanel_MessageLayout.setVerticalGroup(
                jPanel_MessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton_Ok, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addComponent(jLabel_Message, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            jLabel_Nick.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
            jLabel_Nick.setForeground(new java.awt.Color(255, 255, 255));
            jLabel_Nick.setText("NickName");

            jScrollPane1.setViewportView(jTextPane_Nick);

            jLabel_Cellnum.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
            jLabel_Cellnum.setForeground(new java.awt.Color(255, 255, 255));
            jLabel_Cellnum.setText("Cellphone");

            jLabel_Bday.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
            jLabel_Bday.setForeground(new java.awt.Color(255, 255, 255));
            jLabel_Bday.setText("Birthday");

            jScrollPane2.setViewportView(jTextPane_Bday);

            jScrollPane3.setViewportView(jTextPane_Cellnum);

            jButton_Cancle.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
            jButton_Cancle.setText("Cancle");
            jButton_Cancle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
            jButton_Cancle.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton_CancleActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel_Message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jt_pswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_Nick)
                                .addComponent(jLabel_Bday)
                                .addComponent(jLabel_Cellnum))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton_Cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordField_Password, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_Username, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(194, 194, 194)
                            .addComponent(jl_Title)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addComponent(jl_Title)
                    .addGap(26, 26, 26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jt_pswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox1)
                    .addGap(11, 11, 11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Nick))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_Bday)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_Cellnum)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
            );

            jl_Title.getAccessibleContext().setAccessibleName("");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            setSize(new java.awt.Dimension(520, 420));
            setLocationRelativeTo(null);
        }
        // </editor-fold>  
 
        /* 
         * 
         */

    private void jPasswordField_PasswordActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void jButton_RegActionPerformed(java.awt.event.ActionEvent evt) {                                            
        DataBallon bean = new DataBallon();
        bean.setUserName(jTextField_Username.getText());
        bean.setPassword(new String(jPasswordField_Password.getPassword()));
        bean.setNickname(jTextPane_Nick.getText());
        bean.setBirthday(jTextPane_Bday.getText());
        bean.setCellnumber(jTextPane_Cellnum.getText());
        bean.setUserType("U"); // user tpye user 
        DataManager manager = new DataManager();
        boolean status = manager.doRegistration(bean);
        /*
         * 여긴 레지스터 boolean 값 받아와서 성공 실패여부 메세지 출력 
         */
        if(status){
            //성공 msg 
            // JOptionPane.showMessageDialog(rootPane, "Success ! Registration has been completed");
						jLabel_Message.setText("Success ! Registration has been completed");
						jLabel_Message.setForeground(Color.GREEN);
						timer1.start();
            
        } else {
            //실패 msg
            //  JOptionPane.showMessageDialog(rootPane, "Failed ! Some Error encountered");
				jLabel_Message.setText("Failed ! Some Error encountered");
		        jLabel_Message.setForeground(Color.RED);
		        timer1.start();

        }
                
      }                                           

    private void jt_IDActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jButton_OkActionPerformed(java.awt.event.ActionEvent evt) {                                           
        timer2.start();
    }                                          

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
              if(jCheckBox1.isSelected()){
            jPasswordField_Password.setEchoChar((char)0);
        }else{
          jPasswordField_Password.setEchoChar('*');
        }  
    }                                          

    private void jButton_CancleActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        this.dispose();
        new Discord_LogIn().show();
        
    }                                              

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new login().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton_Cancle;
    private javax.swing.JButton jButton_Ok;
    private javax.swing.JButton jButton_Reg;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel_Bday;
    private javax.swing.JLabel jLabel_Cellnum;
    private javax.swing.JLabel jLabel_Message;
    private javax.swing.JLabel jLabel_Nick;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Message;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField_Username;
    private javax.swing.JTextPane jTextPane_Bday;
    private javax.swing.JTextPane jTextPane_Cellnum;
    private javax.swing.JTextPane jTextPane_Nick;
    private javax.swing.JLabel jl_Title;
    private javax.swing.JTextField jt_ID;
    private javax.swing.JTextField jt_pswd;
    // End of variables declaration                   
}
