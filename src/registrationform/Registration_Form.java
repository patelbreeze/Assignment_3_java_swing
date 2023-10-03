/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registrationform;

import java.io.File;
import java.util.regex.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Breeze
 */
public class Registration_Form extends javax.swing.JFrame {

    /**
     * Creates new form Registration_Form
     */
    public Registration_Form() {
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

        Main_layout = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Fname = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        Aage = new javax.swing.JLabel();
        Eemail = new javax.swing.JLabel();
        Mmessage = new javax.swing.JLabel();
        First_Name = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        Last_Name = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Message = new javax.swing.JTextArea();
        Submit = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        lastnameerror = new javax.swing.JLabel();
        firstnameerrorlabel = new javax.swing.JLabel();
        ageerror = new javax.swing.JLabel();
        emailerror = new javax.swing.JLabel();
        Upload_button = new javax.swing.JButton();
        Upload_image_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 255));

        Main_layout.setBackground(new java.awt.Color(102, 51, 255));
        Main_layout.setMaximumSize(new java.awt.Dimension(700, 500));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Customer Registration Form");

        Fname.setForeground(new java.awt.Color(255, 255, 255));
        Fname.setText("First Name:");

        Lname.setForeground(new java.awt.Color(255, 255, 255));
        Lname.setText("Last Name:");

        Aage.setForeground(new java.awt.Color(255, 255, 255));
        Aage.setText("Age:");

        Eemail.setBackground(new java.awt.Color(255, 255, 255));
        Eemail.setForeground(new java.awt.Color(255, 255, 255));
        Eemail.setText("Email :");

        Mmessage.setForeground(new java.awt.Color(255, 255, 255));
        Mmessage.setText("Message:");

        First_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                First_NameActionPerformed(evt);
            }
        });
        First_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                First_NameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                First_NameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                First_NameKeyTyped(evt);
            }
        });

        Age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AgeKeyReleased(evt);
            }
        });

        Last_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Last_NameActionPerformed(evt);
            }
        });

        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailKeyReleased(evt);
            }
        });

        Message.setColumns(20);
        Message.setRows(5);
        jScrollPane1.setViewportView(Message);

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");

        lastnameerror.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lastnameerror.setForeground(java.awt.Color.red);
        lastnameerror.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastnameerrorKeyReleased(evt);
            }
        });

        firstnameerrorlabel.setBackground(new java.awt.Color(0, 0, 0));
        firstnameerrorlabel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        firstnameerrorlabel.setForeground(java.awt.Color.red);

        ageerror.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ageerror.setForeground(java.awt.Color.red);

        emailerror.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        emailerror.setForeground(new java.awt.Color(255, 0, 0));

        Upload_button.setText("Upload");
        Upload_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upload_buttonActionPerformed(evt);
            }
        });

        Upload_image_field.setText("image path");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Upload Image and showing up in Dialog box");

        javax.swing.GroupLayout Main_layoutLayout = new javax.swing.GroupLayout(Main_layout);
        Main_layout.setLayout(Main_layoutLayout);
        Main_layoutLayout.setHorizontalGroup(
            Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_layoutLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Main_layoutLayout.createSequentialGroup()
                        .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Main_layoutLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Aage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Eemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Mmessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(Fname, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                    .addComponent(Lname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(Main_layoutLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Upload_image_field, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Main_layoutLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Main_layoutLayout.createSequentialGroup()
                                        .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Age, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(First_Name, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Last_Name, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lastnameerror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(Main_layoutLayout.createSequentialGroup()
                                                .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ageerror, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(firstnameerrorlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap())))
                                    .addGroup(Main_layoutLayout.createSequentialGroup()
                                        .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Main_layoutLayout.createSequentialGroup()
                                                .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(Email)
                                                    .addComponent(jScrollPane1))
                                                .addGap(18, 18, 18)
                                                .addComponent(emailerror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(Main_layoutLayout.createSequentialGroup()
                                                .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Title)
                                                    .addGroup(Main_layoutLayout.createSequentialGroup()
                                                        .addGap(187, 187, 187)
                                                        .addComponent(Submit)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(Cancel)))
                                                .addGap(0, 165, Short.MAX_VALUE)))
                                        .addContainerGap())))
                            .addGroup(Main_layoutLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(Upload_button)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(Main_layoutLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        Main_layoutLayout.setVerticalGroup(
            Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_layoutLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Fname)
                        .addComponent(First_Name))
                    .addComponent(firstnameerrorlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lname)
                    .addComponent(Last_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameerror, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aage)
                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageerror, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eemail)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailerror, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mmessage)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit)
                    .addComponent(Cancel))
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Main_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Upload_button)
                    .addComponent(Upload_image_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_layout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void First_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_First_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_First_NameActionPerformed


    private void First_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_First_NameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_First_NameKeyPressed

    private void First_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_First_NameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_First_NameKeyReleased

    private void lastnameerrorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastnameerrorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameerrorKeyReleased

    private void Last_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Last_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Last_NameActionPerformed

    private void AgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeKeyReleased

    private void EmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailKeyReleased

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        if (!First_Name.getText().isEmpty()) {
            String firstname_PATTERN = "^[a-zA-Z]{1,30}$";
            Pattern patt = Pattern.compile(firstname_PATTERN);
            Matcher match = patt.matcher(First_Name.getText());

            if (!match.matches()) {
                JOptionPane.showMessageDialog(null, "Naming in first name is incorrect, kindly use alphabets!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            //lastname
            if (!Last_Name.getText().isEmpty()) {
                String lastname_PATTERN = "^[a-zA-Z]{1,30}$";
                Pattern patt2 = Pattern.compile(lastname_PATTERN);
                Matcher match2 = patt2.matcher(Last_Name.getText());
                if (!match2.matches()) {
                    JOptionPane.showMessageDialog(null, "Naming in last name is incorrect, kindly use alphabets!", "Error", JOptionPane.ERROR_MESSAGE);
                }

                //age
                if (Age.getText().isEmpty()) {
                    String age_PATTERN = "\\b([1-9][0-9]?|100)\\b";
                    Pattern patt3 = Pattern.compile(age_PATTERN);
                    Matcher match3 = patt3.matcher(Age.getText());
                    if (!match3.matches()) {
                        JOptionPane.showMessageDialog(null, "You entered wrong age number, kindly age is between 1 to 100 !", "Error", JOptionPane.ERROR_MESSAGE);
                    }
//email
                    if (!Email.getText().isEmpty()) {
                        String email_PATTERN = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
                        Pattern patt4 = Pattern.compile(email_PATTERN);
                        Matcher match4 = patt4.matcher(Email.getText());
                        if (!match4.matches()) {
                            JOptionPane.showMessageDialog(null, "Enter correct email id!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter your email.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

//email ends                    
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter your age.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                //age end        
            } else {
                JOptionPane.showMessageDialog(null, "Please enter your lastname.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            //lastname end
        } else {
            JOptionPane.showMessageDialog(null, "Please enter your firstname.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        // firstname end

        JOptionPane.showMessageDialog(null, "Successful");
    }//GEN-LAST:event_SubmitActionPerformed

    private void First_NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_First_NameKeyTyped
        // TODO add your handling code here:       
    }//GEN-LAST:event_First_NameKeyTyped

    private void AgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeKeyPressed
        // TODO add your handling code here:
        String PATTERN = "\\b([1-9][0-9]?|100)\\b";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(Age.getText());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(null, "Age Should be between 1 to 100");
        }
    }//GEN-LAST:event_AgeKeyPressed

    private void Upload_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upload_buttonActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename=null;
        filename = f.getAbsolutePath();
        Upload_image_field.setText(filename);
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(filename);
        int a = JOptionPane.showConfirmDialog(this, "Is this the same image?", "", JOptionPane.YES_NO_OPTION , JOptionPane.PLAIN_MESSAGE, icon);

    }//GEN-LAST:event_Upload_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aage;
    private javax.swing.JTextField Age;
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel Eemail;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField First_Name;
    private javax.swing.JLabel Fname;
    private javax.swing.JTextField Last_Name;
    private javax.swing.JLabel Lname;
    private javax.swing.JPanel Main_layout;
    private javax.swing.JTextArea Message;
    private javax.swing.JLabel Mmessage;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel Title;
    private javax.swing.JButton Upload_button;
    private javax.swing.JTextField Upload_image_field;
    private javax.swing.JLabel ageerror;
    private javax.swing.JLabel emailerror;
    private javax.swing.JLabel firstnameerrorlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastnameerror;
    // End of variables declaration//GEN-END:variables

}
