

//imorpt all the java dependencies
import static java.awt.EventQueue.invokeLater;


public class WelcomePage extends javax.swing.JFrame {

 //custom loging method
    public WelcomePage() {
        initComponents();
    }

  
   
    // this are of the code declears the constructure (initComponent) i.e all the components of the Login method  are in the init constructor 
    private void initComponents() {

         //varable declearation
        MainPanel = new javax.swing.JPanel();
        TopPanel = new javax.swing.JPanel();
        JLVicBank = new javax.swing.JLabel();
        JPBar = new javax.swing.JProgressBar();
        JLWeToVic = new javax.swing.JLabel();
        JLPercentage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        
        //setting Background color to the top panel and main panel
        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        TopPanel.setBackground(new java.awt.Color(255, 153, 51));

        //VicBanl Font And Text
        JLVicBank.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        JLVicBank.setText("Victory Bank");

        //code to structure the topPanel
        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);

        //horizontal grouping for the topPanel using javax.swing.UIManager
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(JLVicBank, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addGap(174, 174, 174))
        );
        //verticalgroup grouping for the topPanel using javax.swing.UIManager.setLookAndFeel
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(JLVicBank)
                .addGap(27, 27, 27))
        );

        JPBar.setBackground(new java.awt.Color(255, 153, 51));

        JLWeToVic.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLWeToVic.setText("Welcome To Victory Bank");

        JLPercentage.setText("%");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);

        //Horizontal Grouping for the main panel
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(JLWeToVic))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(JLPercentage)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        //Vertical Grouping For the main Panel
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(JLWeToVic)
                .addGap(34, 34, 34)
                .addComponent(JLPercentage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPBar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
    }                       

    public static void main(String args[]) {
      
        invokeLater(() -> {
            new WelcomePage().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel JLPercentage;
    private javax.swing.JLabel JLVicBank;
    private javax.swing.JLabel JLWeToVic;
    private javax.swing.JProgressBar JPBar;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel TopPanel;
    // End of variables declaration                   
}
