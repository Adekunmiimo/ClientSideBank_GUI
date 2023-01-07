
//imorpt all the java dependencies
import static java.awt.EventQueue.invokeLater;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;


public class Login extends javax.swing.JFrame {

  
    //custom loging method
    public Login() {
        initComponents();
    }

    
    // this are of the code declears the constructure (initComponent) i.e all the components of the Login method  are in the init constructor 
    private void initComponents() {

        //varable declearation
        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        jlLogin = new javax.swing.JLabel();
        jlVicBank = new javax.swing.JLabel();
        jlAccountID = new javax.swing.JLabel();
        jlPassword = new javax.swing.JLabel();
        sigUpQ = new javax.swing.JLabel();
        jbSignup = new javax.swing.JButton();
        tfUsername = new javax.swing.JTextField();
        jbLogin = new javax.swing.JButton();
        jbReset = new javax.swing.JButton();
        jppassword = new javax.swing.JPasswordField();
        forgottenpass = new javax.swing.JLabel();

        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //setting Background color to the top panel and main panel
        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        topPanel.setBackground(new java.awt.Color(255, 153, 51));

        //login textFild font and text
        jlLogin.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlLogin.setText("Login");


        //vicbank label font and text
        jlVicBank.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlVicBank.setText("Victory Bank");


        //code to structure the topPanel
        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);

        //horizontal grouping for the topPanel using javax.swing.UIManager
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlLogin)
                .addGap(108, 108, 108)
                .addComponent(jlVicBank)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        //verticalgroup grouping for the topPanel using javax.swing.UIManager.setLookAndFeel
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlVicBank)
                    .addComponent(jlLogin))
                .addGap(18, 18, 18))
        );

        //AccountID label
        jlAccountID.setText("Account ID");

        //password label
        jlPassword.setText("Password");

        // aprompt to sign up if you don't have an account
        sigUpQ.setText("You don't have an account ?");

        //Signup button
        jbSignup.setBackground(new java.awt.Color(255, 153, 51));
        jbSignup.setText("Sign Up");

        // Login button
        jbLogin.setBackground(new java.awt.Color(255, 153, 51));
        jbLogin.setText("Login");
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });

        // reset button
        jbReset.setText("Reset");
        jbReset.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jppasswordActionPerformed(evt);
            }
        });
           
        
        // password fild
        jppassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jppasswordActionPerformed(evt);
            }
        });


        //prompt to reset password
        forgottenpass.setText("Forgotten password  ");
        forgottenpass.addAncestorListener(null);


        //code to structure the mainPanel
        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);

        //horizontal grouping for the mainPanel using javax.swing.UIManager.setLookAndFeel
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    // grouping the signup prompt(sigUpQ) and then signup button 
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(sigUpQ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSignup)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                            // grouping the AccountID label and the password label 
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlAccountID)
                                    .addComponent(jlPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)

                                // grouping the username textfild and the passwordfild
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfUsername)
                                    .addComponent(jppassword, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(125, 125, 125))

                                //  grouping the Login button and the Reset button
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(jbLogin)
                                .addGap(18, 18, 18)
                                .addComponent(jbReset)
                                .addGap(161, 161, 161))))))

            //forgottenpass
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(forgottenpass)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        //verticalgroup grouping for the mainPanel using javax.swing.UIManager.setLookAndFeel
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)


                //  grouping the AccountID label and Username textfild 
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAccountID)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)

                // grouping the password label and the passwordfild
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPassword)
                    .addComponent(jppassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)

                // grouging the login button nd the reset button
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLogin)
                    .addComponent(jbReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(forgottenpass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)

                // grouping the signup quetion and the sign up button
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sigUpQ)
                    .addComponent(jbSignup))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        String username = tfUsername.getText();
        String password = jppassword.getPassword().toString();
        if(username.isEmpty() || password.isEmpty()){
            JoptionPane.showMessageDialog(this, "Username / password should not be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                       

    private void jppasswordActionPerformed(java.awt.event.ActionEvent evt) {                                           
      
    }                                          

  
    public static void main(String args[]) {
       
        try {
            for (var info : getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            getLogger(Login.class.getName()).log(SEVERE, null, ex);
        }
        

        /* Create and display the form */
        invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel forgottenpass;
    private javax.swing.JButton jbLogin;
    private javax.swing.JButton jbReset;
    private javax.swing.JButton jbSignup;
    private javax.swing.JLabel jlAccountID;
    private javax.swing.JLabel jlVicBank;
    private javax.swing.JPasswordField jppassword;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel sigUpQ;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JPanel topPanel;
    // End of variables declaration                   

    private static class JoptionPane {

        private static void showMessageDialog(Login aThis, String username__password_shound_not_be_empty, String error, int ERROR_MESSAGE) {
            throw new UnsupportedOperationException("Not supported yet."); 

        }
    }
}
