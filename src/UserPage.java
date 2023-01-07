

import static java.awt.EventQueue.invokeLater;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;


public class UserPage extends javax.swing.JFrame {

 
    public UserPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */

    //Components
    private void initComponents() {

        
        //varable declearation
        Mainpanel = new javax.swing.JPanel();
        Toppanel = new javax.swing.JPanel();
        jlvicBank = new javax.swing.JLabel();
        jlaccno = new javax.swing.JLabel();
        jlamount = new javax.swing.JLabel();
        jtAccno = new javax.swing.JTextField();
        jtAmount = new javax.swing.JTextField();
        jlUsername = new javax.swing.JLabel();
        jlAccbalance = new javax.swing.JLabel();
        PinPanel = new javax.swing.JPanel();
        jBt1 = new javax.swing.JButton();
        jBt2 = new javax.swing.JButton();
        jBt3 = new javax.swing.JButton();
        jBt4 = new javax.swing.JButton();
        jBt5 = new javax.swing.JButton();
        jBt6 = new javax.swing.JButton();
        jBt7 = new javax.swing.JButton();
        jBt8 = new javax.swing.JButton();
        jBt9 = new javax.swing.JButton();
        jBt0 = new javax.swing.JButton();
        jBtDEL = new javax.swing.JButton();
        jBtCLR = new javax.swing.JButton();
        jBtEnter = new javax.swing.JButton();
        jBDeposit = new javax.swing.JButton();
        jBtTransfer = new javax.swing.JButton();
        jBtWithdraw = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

         /* 
         *  all the variable instatnces starts here.
        */

        // Setting the backGround color for the Top panel and main panel
        Mainpanel.setBackground(new java.awt.Color(255, 255, 255));
        Toppanel.setBackground(new java.awt.Color(255, 153, 51));

        //Setting the Font and text for vic Bank
        jlvicBank.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlvicBank.setText("Victory Bank");

        // Setting the layout for the top panel
        javax.swing.GroupLayout ToppanelLayout = new javax.swing.GroupLayout(Toppanel);
        Toppanel.setLayout(ToppanelLayout);
        ToppanelLayout.setHorizontalGroup(

            //position for Label Victiory bank
            ToppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToppanelLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jlvicBank)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        //Vartical Grouping For the top panel 
        ToppanelLayout.setVerticalGroup(
            ToppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToppanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlvicBank)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        // Text and font for Account number and Amount labels
        jlaccno.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlaccno.setText("Acc No:");

        jlamount.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlamount.setText("Amount:");


        //Text fild for Account number and Amount
        jtAccno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAccnoActionPerformed(evt);
            }
        });

        jtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAmountActionPerformed(evt);
            }
        });

        //Text for Username And Accountbalance
        jlUsername.setText("User Name:");
        jlAccbalance.setText("Acount balance:");

        //Setting the back Ground color for the PinPanel
        PinPanel.setBackground(new java.awt.Color(255, 153, 51));

        // Text and Act for jBt1
        jBt1.setText("1");
        jBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt1ActionPerformed(evt);
            }
        });

        // Text and Act for jBt2
        jBt2.setText("2");
        jBt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        // Text and Act for jBt3
        jBt3.setText("3");
        jBt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        // Text and Act for jBt4
        jBt4.setText("4");
        jBt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        // Text and Act for jBt5
        jBt5.setText("5");
        jBt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        // Text and Act for jBt6
        jBt6.setText("6");
        jBt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        // Text and Act for jBt7
        jBt7.setText("7");
        jBt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        // Text and Act for jBt8
        jBt8.setText("8");
        jBt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        // Text and Act for jBt9
        jBt9.setText("9");
        jBt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        // Text and Act for jBt0
        jBt0.setText("0");
        jBt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        // Text and Act for jBtDEL
        jBtDEL.setText("DEL");
        jBtDEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        // Text and Act for jBtCLR
        jBtCLR.setText("CLR");
        jBtCLR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        // Text and Act for jBtEnter
        jBtEnter.setText("Enter");
        jBtEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        // Text and Act for jBDeposit
        jBDeposit.setText("Deposit");
        jBDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        // Text and Act for jBtTransfer
        jBtTransfer.setText("Transfer");
        jBtTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        // Text and Act for jBtWithdraw
        jBtWithdraw.setText("Withdraw");
        jBtWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        //Setting groupLayout for the PinPanel
        javax.swing.GroupLayout PinPanelLayout = new javax.swing.GroupLayout(PinPanel);
        PinPanel.setLayout(PinPanelLayout);

        //Horizontal Grouping for the PinPanel
        PinPanelLayout.setHorizontalGroup(
            PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PinPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)

                //Grouping the Deposit, Transfer and Withdraw  buttons
                .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PinPanelLayout.createSequentialGroup()
                        .addComponent(jBDeposit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtTransfer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtWithdraw))
                    .addGroup(PinPanelLayout.createSequentialGroup()

                   //Grouping the 1, 4, 7 buttons
                        .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBt7, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jBt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBt1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                       
                       
                        //Grouping the 2, 5, 8, 0 Buttons
                        .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBt0, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jBt2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jBt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)

                        //Grouping the 3, 6, 9 buttons
                        .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBt3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jBt6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBt9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)

                        //Grouping the Delete, Clear, and Enter buttons
                        .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtCLR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );


        //Vertical Grouping for the PinPanel
        PinPanelLayout.setVerticalGroup(
            PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PinPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)

                //Grouping The 1,2,3,Delete button
                .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBt1)
                    .addComponent(jBt2)
                    .addComponent(jBt3)
                    .addComponent(jBtDEL))
                .addGap(28, 28, 28)
                
                //Grouping The 4, 5, 6, Clear button
                .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBt4)
                    .addComponent(jBt5)
                    .addComponent(jBt6)
                    .addComponent(jBtCLR))
                .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PinPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        
                //Grouping The 7, 8, 9 Butoons
                        .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBt7)
                            .addComponent(jBt8)
                            .addComponent(jBt9)))

                            
                //Grouping The Enter butten 
                    .addGroup(PinPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addComponent(jBt0)
                .addGap(18, 18, 18)

                
                //Grouping The Deposit, Transfer, Withdraw Bottens
                .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDeposit)
                    .addComponent(jBtTransfer)
                    .addComponent(jBtWithdraw))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        
        //Setting groupLaout for the Mainpanel
        javax.swing.GroupLayout MainpanelLayout = new javax.swing.GroupLayout(Mainpanel);
        Mainpanel.setLayout(MainpanelLayout);

        //Horizontal Grouping for the MainPanel
        MainpanelLayout.setHorizontalGroup(
            MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Toppanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            
            //Grouping The Account Balance Label and the User Name label
            .addGroup(MainpanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAccbalance)
                    .addComponent(jlUsername)
                    .addGroup(MainpanelLayout.createSequentialGroup()

                    //Grouping The Amount label ane the Account Label
                        .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlamount)
                            .addComponent(jlaccno, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        //Grouping the Account TextFild, The amount textfild and the PinPanel
                        .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtAccno, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        //Vertical Grouping for the MainPanel
        MainpanelLayout.setVerticalGroup(
            MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            //Grouping The Toppanel, Username label, Account Balance label, 
            .addGroup(MainpanelLayout.createSequentialGroup()
                .addComponent(Toppanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlAccbalance)
                .addGap(31, 31, 31)
                

                //Grouping The Accunt No label and the Account Text fild
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaccno)
                    .addComponent(jtAccno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)

                //Grouping The Amount label, And amount Text
                .addGroup(MainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlamount)
                    .addComponent(jtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)

                //Adding the pin panel to the main panel
                .addComponent(PinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void jtAccnoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jtAmountActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jBt1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void jBt6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void jBt8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

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
            for (var info : getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            getLogger(UserPage.class.getName()).log(SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        invokeLater(() -> {
            new UserPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JPanel Mainpanel;
    public javax.swing.JPanel PinPanel;
    public javax.swing.JPanel Toppanel;
    public javax.swing.JButton jBDeposit;
    public javax.swing.JButton jBt0;
    public javax.swing.JButton jBt1;
    public javax.swing.JButton jBt2;
    public javax.swing.JButton jBt3;
    public javax.swing.JButton jBt4;
    public javax.swing.JButton jBt5;
    public javax.swing.JButton jBt6;
    public javax.swing.JButton jBt7;
    public javax.swing.JButton jBt8;
    public javax.swing.JButton jBt9;
    public javax.swing.JButton jBtCLR;
    public javax.swing.JButton jBtDEL;
    public javax.swing.JButton jBtEnter;
    public javax.swing.JButton jBtTransfer;
    public javax.swing.JButton jBtWithdraw;
    public javax.swing.JLabel jlAccbalance;
    public javax.swing.JLabel jlUsername;
    public javax.swing.JLabel jlaccno;
    public javax.swing.JLabel jlamount;
    public javax.swing.JLabel jlvicBank;
    public javax.swing.JTextField jtAccno;
    public javax.swing.JTextField jtAmount;
    // End of variables declaration                   
}
