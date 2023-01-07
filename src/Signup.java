

//imorpt all the java dependencies
import static java.awt.EventQueue.invokeLater;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;


public class Signup extends javax.swing.JFrame {

   //custom Signup method
    public Signup() {
        initComponents();
    }

      /**
     * This method is called from within the constructor to initialize the form.
     */
    
    // Components
    private void initComponents() {

        
        //varable declearation
        MainPanel = new javax.swing.JPanel();
        TopPanel = new javax.swing.JPanel();
        jlSignup = new javax.swing.JLabel();
        jlVicBank = new javax.swing.JLabel();
        jlFirstName = new javax.swing.JLabel();
        jlMidName = new javax.swing.JLabel();
        jlLastName = new javax.swing.JLabel();
        jlBVN = new javax.swing.JLabel();
        jlClientID = new javax.swing.JLabel();
        jlFthersname = new javax.swing.JLabel();
        jlMothersName = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jlPassWord = new javax.swing.JLabel();
        jlRetypePass = new javax.swing.JLabel();
        jtFirName = new javax.swing.JTextField();
        jtMidName = new javax.swing.JTextField();
        jtLastName = new javax.swing.JTextField();
        jtBvn = new javax.swing.JTextField();
        jtClientId = new javax.swing.JTextField();
        jtFathersName = new javax.swing.JTextField();
        jtMothersName = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jpfPassword = new javax.swing.JPasswordField();
        jpRetypPass = new javax.swing.JPasswordField();
        jbSignup = new javax.swing.JButton();
        jbResetPass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        /* 
         *  all the variable instatnces starts here.
        */
        
        //Setting background colors to the top panel and main panel
        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        TopPanel.setBackground(new java.awt.Color(255, 153, 51));

        //Signup textFild font and text
        jlSignup.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlSignup.setText("SignUp");


        //vicbank label font and text
        jlVicBank.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlVicBank.setText("Victory Bank");


         //code to structure the topPanel
        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        
         //horizontal grouping for the topPanel using javax.swing.UIManager
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlSignup)
                .addGap(139, 139, 139)
                .addComponent(jlVicBank)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        //verticalgroup grouping for the topPanel using javax.swing.UIManager.setLookAndFeel
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlVicBank)
                    .addComponent(jlSignup))
                .addGap(15, 15, 15))
        );

        //FirstName label
        jlFirstName.setText("First Name ");

        //MidName label
        jlMidName.setText("Mid Name ");

        //LastName label
        jlLastName.setText("Last Name");

        //BVN label
        jlBVN.setText("BVN");

        //ClientID label
        jlClientID.setText("Client ID");

        //Fathersname label
        jlFthersname.setText("Father's name ");

        //Mothersname label
        jlMothersName.setText("Mother's name ");

        //Email label
        jlEmail.setText("Email");

        //Password label
        jlPassWord.setText("Password");

        //Retypepassword label
        jlRetypePass.setText("Retype pass");

        // Firstname text fild
        jtFirName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFirNameActionPerformed(evt);
            }
        });

        //Email text fild
        jtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailActionPerformed(evt);
            }
        });

        // Password password fild
        jpfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfPasswordActionPerformed(evt);
            }
        });

        //Signup button
        jbSignup.setBackground(new java.awt.Color(255, 102, 0));
        jbSignup.setText("Signup");

        //ResetPassword button
        jbResetPass.setText("Reset");
        jbResetPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbResetPassActionPerformed(evt);
            }
        });


         //code to structure the mainPanel
        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);


        //horizontal grouping for the mainPanel using javax.swing.UIManager.setLookAndFeel
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)

                //grouping the ClientID label, BVN label, LastName label, MidleName label, FirstName Label
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlClientID)
                    .addComponent(jlBVN)
                    .addComponent(jlLastName)
                    .addComponent(jlMidName)
                    .addComponent(jlFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                //grouping the Signup and reset button
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jbSignup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbResetPass))
                   
                        //grouping the firstName textfild, midName Textfild, LastName TextFild, BVN TextFild, ClientId TextFild
                        .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtFirName, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jtMidName)
                            .addComponent(jtLastName)
                            .addComponent(jtBvn)
                            .addComponent(jtClientId))
                        .addGap(52, 52, 52)

                        //grouping MothersName label, Email label, PassWord labe, RetypePass label, Fathersname label
                        
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlMothersName)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlPassWord, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlRetypePass, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlFthersname, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(6, 6, 6)))
                        .addGap(34, 34, 34)

                        //grouping Mothersname textfild, FathersName textfild, Email textfild, password fild, Retype password fild
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtMothersName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtFathersName, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpRetypPass, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(75, 75, 75))
        );

        // Vertical grouping of mainpanel javax.swing.UIManager.
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                //grouping the FirstName labe, fathersname label, firstname textfild, fathersname textfild, 
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFirstName)
                    .addComponent(jlFthersname)
                    .addComponent(jtFirName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFathersName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)

                //grouping the midlname label, mothersname label, midlename textfiled, and mothersname textfild
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMidName)
                    .addComponent(jlMothersName)
                    .addComponent(jtMidName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtMothersName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)

                //grouping the last name label, email label, last name text fild, and email textfild
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLastName)
                    .addComponent(jlEmail)
                    .addComponent(jtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)

                // grouping the BVN label, password label, BVN textfild, password passwordfild
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBVN)
                    .addComponent(jlPassWord)
                    .addComponent(jtBvn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)

                // grouping the ClientID label, retyplabel, ClientID
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlClientID)
                    .addComponent(jlRetypePass)
                    .addComponent(jtClientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpRetypPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSignup)
                    .addComponent(jbResetPass))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jtFirNameActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jtEmailActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jbResetPassActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jpfPasswordActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    public static void main(String args[]) {
        
        invokeLater(() -> {
            new Signup().setVisible(true);
        });
    }

    // Variables declaration                   
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton jbResetPass;
    private javax.swing.JButton jbSignup;
    private javax.swing.JLabel jlBVN;
    private javax.swing.JLabel jlClientID;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlFirstName;
    private javax.swing.JLabel jlFthersname;
    private javax.swing.JLabel jlLastName;
    private javax.swing.JLabel jlMidName;
    private javax.swing.JLabel jlMothersName;
    private javax.swing.JLabel jlPassWord;
    private javax.swing.JLabel jlRetypePass;
    private javax.swing.JLabel jlSignup;
    private javax.swing.JLabel jlVicBank;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JTextField jtBvn;
    private javax.swing.JTextField jtClientId;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtFathersName;
    private javax.swing.JTextField jtFirName;
    private javax.swing.JTextField jtLastName;
    private javax.swing.JTextField jtMidName;
    private javax.swing.JTextField jtMothersName;
    private javax.swing.JPasswordField jpRetypPass;
    // End of variables declaration                   
}
