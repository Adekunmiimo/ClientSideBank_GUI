// importing the nesesary java dependencies
import java.util.*;
import static java.awt.EventQueue.invokeLater;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;
import java.awt.event.ActionEvent;

//custom Security method
public class Security extends javax.swing.JFrame {

 
    // cunstructing the Components
    public Security() {
        initComponents();
    }

    // All the components are in the initComponents constructor
    private void initComponents() {

        //Declearing all the variables
        Scanner Scn = new Scanner(System.in);
        MainPanel = new javax.swing.JPanel();
        TopPanel = new javax.swing.JPanel();
        jlVicbank = new javax.swing.JLabel();
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
        jpasswordf = new javax.swing.JPasswordField();
        jlPin = new javax.swing.JLabel();
        jBtEnter = new javax.swing.JButton();
        jBtLogout = new javax.swing.JButton();

        Scanner scanner = new Scanner(System.in);
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         /* 
         *  all the variable instatnces starts here.
        */

        // Setting the backGround color for the Top panel and main panel
        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        TopPanel.setBackground(new java.awt.Color(255, 153, 51));

          // Setting the VictoryBank Label
        jlVicbank.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlVicbank.setText("Victory Bank");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);

        //Horizontal Grouping for the top panel
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlVicbank)
                .addGap(192, 192, 192))
        );
        //Vartical Grouping for the Top panel
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlVicbank)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        // Setting the Background and the foreground color
        PinPanel.setBackground(new java.awt.Color(255, 102, 0));
        PinPanel.setForeground(new java.awt.Color(255, 102, 0));

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
                jBt2ActionPerformed(evt);
            }
        });

        // Text and Act for jBt3
        jBt3.setText("3");
        jBt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt3ActionPerformed(evt);
            }
        });

        // Text and Act for jBt4
        jBt4.setText("4");
        jBt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt4ActionPerformed(evt);
            }
        });

        // Text and Act for jBt5
        jBt5.setText("5");
        jBt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt5ActionPerformed(evt);
            }
        });

        // Text and Act for jBt6
        jBt6.setText("6");
        jBt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt6ActionPerformed(evt);
            }
        });

        // Text and Act for jBt7
        jBt7.setText("7");
        jBt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt7ActionPerformed(evt);
            }
        });

        // Text and Act for jBt8
        jBt8.setText("8");
        jBt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt8ActionPerformed(evt);
            }
        });

        // Text and Act for jBt9
        jBt9.setText("9");
        jBt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt9ActionPerformed(evt);
            }
        });

        // Text and Act for jBt0
        jBt0.setText("0");
        jBt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt0ActionPerformed(evt);
            }
        });

        // Text and Act for jPasswordFild
        jpasswordf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasswordfActionPerformed(evt);
            }
        });

        //Font and text fot Pin label
        jlPin.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlPin.setText("PIN:");

        //Text for the Enter Button
        jBtEnter.setText("Enter");

         //Setting groupLayout for the PinPanel
        javax.swing.GroupLayout PinPanelLayout = new javax.swing.GroupLayout(PinPanel);
        PinPanel.setLayout(PinPanelLayout);

        //Horizontal Grouping for the PinPanel
        PinPanelLayout.setHorizontalGroup(
            PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PinPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    
                    //Grouping PIN Label and password fild
                    .addGroup(PinPanelLayout.createSequentialGroup()
                        .addComponent(jlPin)
                        .addGap(18, 18, 18)
                        .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpasswordf)
                            .addGroup(PinPanelLayout.createSequentialGroup()
                            

                            //Grouping the 1, 4 and 7 Button 
                                .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBt7, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(jBt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(36, 36, 36)


                                //Grouping the 2, 5, 8, and 0 Button
                                .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBt0, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(jBt2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(jBt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)

                                //Grouping the 3, 6, 9 Button 
                                .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBt3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                    .addComponent(jBt6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBt9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(72, Short.MAX_VALUE))
        );

         //Vertical Grouping for the PinPanel
        PinPanelLayout.setVerticalGroup(
            PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            //Grouping the Pin panel 
            .addGroup(PinPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)

                //Grouping the password fild and the pin label
                .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpasswordf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPin))
                .addGap(43, 43, 43)

                  //Grouping the 1, 2, 3 Buttons on the Vertical axis
                .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBt1)
                    .addComponent(jBt2)
                    .addComponent(jBt3))
                .addGap(27, 27, 27)
                 //Grouping the 4, 5, 6 Buttons ont the Vertical axis
                .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBt4)
                    .addComponent(jBt5)
                    .addComponent(jBt6))
                .addGap(27, 27, 27)

                 //Grouping the 7, 8, 9, 0 and the Enter Buttons on the Vertical axis
                .addGroup(PinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBt7)
                    .addComponent(jBt8)
                    .addComponent(jBt9))
                .addGap(26, 26, 26)
                .addComponent(jBt0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        //logout Button
        
        jBtLogout.setText("Logout");
        jBtLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt0ActionPerformed(evt);
            }
        });


      
        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
          //Horizontal Grouping of the Main Panel
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            
         //Grouping the Top panel, Logout Button, Pin panel on the Horizontal axis
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
          //vertical Grouping of the Main Panel
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()

            //Grouping the Top panel, Main Panel, Pin Panel and the Logout Button
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PinPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtLogout, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    protected void jBt0ActionPerformed(java.awt.event.ActionEvent evt) {
    }


    protected void jBt9ActionPerformed(java.awt.event.ActionEvent evt) {
    }


    protected void jBt8ActionPerformed(java.awt.event.ActionEvent evt) {
    }


    protected void jBt6ActionPerformed(java.awt.event.ActionEvent evt) {
    }


    protected void jBt5ActionPerformed(java.awt.event.ActionEvent evt) {
    }


    protected void jBt4ActionPerformed(java.awt.event.ActionEvent evt) {
    }


    protected void jBt3ActionPerformed(java.awt.event.ActionEvent evt) {
    }


    protected void jBt2ActionPerformed(java.awt.event.ActionEvent evt) {
    }


    protected void jBt1ActionPerformed(java.awt.event.ActionEvent evt) {
    }


    private void jBt7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        
    }                                    

    private void jpasswordfActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
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
            getLogger(Security.class.getName()).log(SEVERE, null, ex);
        }
     
        /* Create and display the form */
        invokeLater(() -> {
            new Security().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JPanel MainPanel;
    public javax.swing.JPanel PinPanel;
    public javax.swing.JPanel TopPanel;
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
    public javax.swing.JButton jBtEnter;
    public javax.swing.JButton jBtLogout;
    public javax.swing.JLabel jlPin;
    public javax.swing.JPasswordField jpasswordf;
    public javax.swing.JLabel jlVicbank;
    // End of variables declaration                   
}
