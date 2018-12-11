package project;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author corinna
 */
public class ProjectMain extends javax.swing.JFrame {

    
	private static final long serialVersionUID = 1L;
	static Object[] data = new Object[4];   
    static int total = 0;
    //static String proDiscount = " (10% Rabatt)";
    //static String absDiscount = " (5€ Rabatt)";
    static String tot = "";
    static boolean signInStatus = false;
    static int wrongPass = 0;
    
    public ProjectMain() {
        initComponents();
        
        //Adding products to homeGUI
        ArrayList<ProductList> list = KidsDB.TableGenerator();
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel) homeTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
       
        model.setRowCount(0);
        
        for(int i=0; i<list.size(); i++){
        	// 6 columns in table on home
        	rowData[0] = list.get(i).getBrand();
            rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/kids/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
        list.clear();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     */
    //@SuppressWarnings("unchecked")
    
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        searchBar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        newlyAdded = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        cartButton = new javax.swing.JButton();
        cardParentPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        homeTable = new javax.swing.JTable();
        searchPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        cartPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartItemTable = new javax.swing.JTable();
        billLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        signUpPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        signUpNameField = new javax.swing.JTextField();
        emptyField = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        signUpPasswordField = new javax.swing.JPasswordField();
        signInButton = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();
        LogUpButton = new javax.swing.JButton();
        signUpUsernameField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        usernameExists = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        signInPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        signInUsernameField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        signInPasswordField = new javax.swing.JPasswordField();
        LogInButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        showPassword1 = new javax.swing.JCheckBox();
        warningLabel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1199, 72));
        //Shopname
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Happy Kids Shopping");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        
        jSeparator5.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jSeparator5.setOpaque(true);
        //Textfeld zum Suchen
        searchBar.setBackground(new java.awt.Color(153, 204, 255));
        searchBar.setFont(new java.awt.Font("Tahoma", 0, 14));
        searchBar.setForeground(new java.awt.Color(255, 255, 255));
        searchBar.setBorder(null);
        searchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBarMouseClicked(evt);
            }
        });
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });
        //button fuer Suche
        searchButton.setBackground(new java.awt.Color(51, 153, 255));
        searchButton.setFont(new java.awt.Font("Tahoma", 0, 20));
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_31px.png")));
        searchButton.setToolTipText("Suche");
        searchButton.setBorderPainted(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setOpaque(true);
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchButtonMouseReleased(evt);
            }
        });
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Suche");
        //panel2 enthaelt Shopname und Suche
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jSeparator5)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap(12, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2))
            .addGap(3, 3, 3))
            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        //backgroundpanel enthaelt 3 sep. panels
        BackgroundPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 60));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        //button um Spielzeug-Liste anzuzeigen
        newlyAdded.setBackground(new java.awt.Color(153, 204, 255));
        newlyAdded.setFont(new java.awt.Font("Tahoma", 0, 20));
        newlyAdded.setForeground(new java.awt.Color(255, 255, 255));
        newlyAdded.setText("Spielzeug");
        newlyAdded.setToolTipText("Spielzeugliste");
        newlyAdded.setBorderPainted(false);
        newlyAdded.setContentAreaFilled(false);
        newlyAdded.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newlyAdded.setOpaque(true);
        newlyAdded.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newlyAddedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newlyAddedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newlyAddedMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newlyAddedMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newlyAddedMouseReleased(evt);
            }
        });
        newlyAdded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newlyAddedActionPerformed(evt);
            }
        });

        //button zum einloggen, registrieren und Infos anzeigen (user-button)
        accountButton.setBackground(new java.awt.Color(153, 204, 255));
        accountButton.setFont(new java.awt.Font("Tahoma", 0, 20));
        accountButton.setForeground(new java.awt.Color(255, 255, 255));
        accountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Person_48px.png")));
        accountButton.setToolTipText("Konto Info");
        accountButton.setBorderPainted(false);
        accountButton.setContentAreaFilled(false);
        accountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountButton.setOpaque(true);
        accountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accountButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                accountButtonMouseReleased(evt);
            }
        });
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });
        //zeige Einkaufsliste
        cartButton.setBackground(new java.awt.Color(153, 204, 255));
        cartButton.setFont(new java.awt.Font("Tahoma", 0, 20));
        cartButton.setForeground(new java.awt.Color(255, 255, 255));
        cartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_OpenCart_24px.png")));
        cartButton.setText("Warenkorb");
        cartButton.setToolTipText("Warenkorb anzeigen");
        cartButton.setBorderPainted(false);
        cartButton.setContentAreaFilled(false);
        cartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartButton.setMaximumSize(new java.awt.Dimension(67, 49));
        cartButton.setOpaque(true);
        cartButton.setPreferredSize(new java.awt.Dimension(67, 49));
        cartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cartButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cartButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cartButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cartButtonMouseReleased(evt);
            }
        });
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
            }
        });
        
        //panel3 enthaelt Warenkorb-Button, User-Button
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(newlyAdded)
            .addGap(18, 18, 18)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
            .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(30, 30, 30)
            .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(accountButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(cartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(newlyAdded, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BackgroundPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 1210, 50));

        cardParentPanel.setLayout(new java.awt.CardLayout());
        //Liste mit Spielzeug
        homeTable.setFont(new java.awt.Font("Tahoma", 0, 18));
        homeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Modell", "Preis", "Lager", "Beschreibung", "Photo"
            }
        ) {
			private static final long serialVersionUID = 1L;
			Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        homeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        homeTable.getTableHeader().setReorderingAllowed(false);
        homeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(homeTable);

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(homePanel);
        //Such-Ergebnis-Liste
        searchTable.setFont(new java.awt.Font("Tahoma", 0, 18));
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Modell", "Preis", "Lager", "Beschreibung", "Photo"
            }
        ) {
            
			private static final long serialVersionUID = 1L;
			Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        searchTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        searchTable.getTableHeader().setReorderingAllowed(false);
        searchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(searchTable);

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(searchPanel);
        
        jPanel8.setBackground(new java.awt.Color(230, 243, 255));

        cartItemTable.setFont(new java.awt.Font("Tahoma", 0, 14));
        cartItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Modell", "Preis", "Anzahl"
            }
        ));
        cartItemTable.setEnabled(false);
        cartItemTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(cartItemTable);
        //Warenkorb/Rechnung ansehen
        billLabel.setFont(new java.awt.Font("Tahoma", 1, 18));
        billLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setText("€");
        //Kaufen bestaetigen
        buyButton.setBackground(new java.awt.Color(0, 0, 255));
        buyButton.setFont(new java.awt.Font("Tahoma", 0, 20));
        buyButton.setForeground(new java.awt.Color(255, 255, 255));
        buyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Buy_24px.png")));
        buyButton.setText("Kaufen");
        buyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setText("Zu Zahlen:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel8Layout.createSequentialGroup()
            .addGap(462, 462, 462)
            .addComponent(billLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
            .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(22, 22, 22))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
            .addGap(377, 377, 377)
            .addComponent(jLabel4)
            .addContainerGap(746, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(billLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(435, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)))
        );

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartPanelLayout.createSequentialGroup()
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 40, Short.MAX_VALUE)))
        );

        cardParentPanel.add(cartPanel, "card8");

        signUpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15));
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Name");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jSeparator1.setOpaque(true);
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 310, 2));

        signUpNameField.setFont(new java.awt.Font("Tahoma", 0, 18));
        signUpNameField.setForeground(new java.awt.Color(0, 0, 255));
        signUpNameField.setBorder(null);
        signUpNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpNameFieldActionPerformed(evt);
            }
        });
        jPanel4.add(signUpNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 310, 50));

        emptyField.setFont(new java.awt.Font("Tahoma", 0, 15));
        emptyField.setForeground(new java.awt.Color(255, 51, 0));
        jPanel4.add(emptyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 270, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jSeparator3.setOpaque(true);
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 310, 2));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15));
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Password");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jSeparator4.setOpaque(true);
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 310, 2));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Schon registriert?");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));
        
        signUpPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18));
        signUpPasswordField.setForeground(new java.awt.Color(0, 0, 255));
        signUpPasswordField.setBorder(null);
        jPanel4.add(signUpPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 310, 50));
        
        signInButton.setBackground(new java.awt.Color(255, 255, 255));
        signInButton.setFont(new java.awt.Font("Tahoma", 1, 15));
        signInButton.setForeground(new java.awt.Color(153, 204, 255));
        signInButton.setText("Einloggen.");
        signInButton.setBorder(null);
        signInButton.setBorderPainted(false);
        signInButton.setContentAreaFilled(false);
        signInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signInButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signInButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signInButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signInButtonMouseReleased(evt);
            }
        });
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        jPanel4.add(signInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 502, 90, 30));

        showPassword.setBackground(new java.awt.Color(255, 255, 255));
        showPassword.setFont(new java.awt.Font("Tahoma", 0, 18));
        showPassword.setForeground(new java.awt.Color(0, 0, 255));
        showPassword.setToolTipText("Show/Hide Password");
        showPassword.setBorderPaintedFlat(true);
        showPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showPassword.setPreferredSize(new java.awt.Dimension(30, 30));
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        jPanel4.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 20, 20));

        LogUpButton.setBackground(new java.awt.Color(0, 0, 255));
        LogUpButton.setFont(new java.awt.Font("Tahoma", 0, 20));
        LogUpButton.setForeground(new java.awt.Color(255, 255, 255));
        LogUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Checked_24px.png")));
        LogUpButton.setText("Registrieren");
        LogUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogUpButtonActionPerformed(evt);
            }
        });
        jPanel4.add(LogUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 180, 50));

        signUpUsernameField.setFont(new java.awt.Font("Tahoma", 0, 18));
        signUpUsernameField.setForeground(new java.awt.Color(0, 0, 255));
        signUpUsernameField.setBorder(null);
        signUpUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpUsernameFieldActionPerformed(evt);
            }
        });
        jPanel4.add(signUpUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 310, 50));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 15));
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("Username");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        usernameExists.setFont(new java.awt.Font("Tahoma", 0, 15));
        usernameExists.setForeground(new java.awt.Color(255, 51, 0));
        jPanel4.add(usernameExists, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 160, 30));

        signUpPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 770, 590));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma Light", 0, 30));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registrieren!");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 149, -1, 168));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_accounts_main.png")));
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, 168));

        signUpPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 590));

        //cardParentPanel.add(signUpPanel, "card6");

        signInPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel10.setFont(new java.awt.Font("Tahoma Light", 0, 30));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Einloggen.");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login.png")));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
            .addGap(131, 131, 131)
            .addComponent(jLabel11)
            .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10)
            .addGap(162, 162, 162))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
            .addGap(148, 148, 148)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel10)
            .addContainerGap(220, Short.MAX_VALUE))
        );

        signInPanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 590));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel6FocusGained(evt);
            }
        });
        jPanel6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel6ComponentShown(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15));
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Username");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jSeparator8.setOpaque(true);
        jPanel6.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 310, 2));

        signInUsernameField.setFont(new java.awt.Font("Tahoma", 0, 18));
        signInUsernameField.setForeground(new java.awt.Color(0, 0, 255));
        signInUsernameField.setBorder(null);
        signInUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInUsernameFieldActionPerformed(evt);
            }
        });
        jPanel6.add(signInUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 310, 50));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 15));
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Passwort");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jSeparator9.setOpaque(true);
        jPanel6.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 310, 2));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Noch nicht registriert?");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, -1, -1));
        
        signInPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18));
        signInPasswordField.setForeground(new java.awt.Color(0, 0, 255));
        signInPasswordField.setBorder(null);
        jPanel6.add(signInPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 310, 50));

        LogInButton.setBackground(new java.awt.Color(0, 0, 255));
        LogInButton.setFont(new java.awt.Font("Tahoma", 0, 20));
        LogInButton.setForeground(new java.awt.Color(255, 255, 255));
        LogInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Login_24px.png")));
        LogInButton.setText("Einloggen");
        LogInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        jPanel6.add(LogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 180, 50));//410 330 130 50
        //Registrieren Button
        signUpButton.setBackground(new java.awt.Color(255, 255, 255));
        signUpButton.setFont(new java.awt.Font("Tahoma", 1, 15));
        signUpButton.setForeground(new java.awt.Color(153, 204, 255));
        signUpButton.setText("Registrieren");
        //signUpButton.setToolTipText("Sign In with your existed credentials.");
        signUpButton.setBorderPainted(false);
        signUpButton.setContentAreaFilled(false);
        signUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signUpButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signUpButtonMouseReleased(evt);
            }
        });
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        jPanel6.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 502, 130, 30));
        //ticbox um Passwort anzuzeigen/verbergen
        showPassword1.setBackground(new java.awt.Color(255, 255, 255));
        showPassword1.setFont(new java.awt.Font("Tahoma", 0, 18));
        showPassword1.setForeground(new java.awt.Color(0, 0, 255));
        showPassword1.setToolTipText("Zeige/Verberge Passwort");
        showPassword1.setBorderPaintedFlat(true);
        showPassword1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showPassword1.setPreferredSize(new java.awt.Dimension(30, 30));
        showPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassword1ActionPerformed(evt);
            }
        });
        jPanel6.add(showPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 20, 20));
        //Warnung fuer falsches Passwort
        warningLabel.setFont(new java.awt.Font("Tahoma", 0, 18));
        warningLabel.setForeground(new java.awt.Color(255, 0, 0));
        warningLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        warningLabel.setBorder(null);
        warningLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warningLabelActionPerformed(evt);
            }
        });
        jPanel6.add(warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 310, 50));

        signInPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 770, 590));

        cardParentPanel.add(signInPanel);

        BackgroundPanel.add(cardParentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1200, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void newlyAddedActionPerformed(java.awt.event.ActionEvent evt) {
        cardParentPanel.removeAll();
        cardParentPanel.add(homePanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
        
        //Adding last three entries from every categories in home
        ArrayList<ProductList> list = KidsDB.TableGenerator();
        
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel) homeTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        model.setRowCount(0); //clear table
        
        for(int i=0; i<list.size(); i++){
            
        	rowData[0] = list.get(i).getBrand();
        	rowData[1] = list.get(i).getModel();
            rowData[2] = list.get(i).getPrice();
            rowData[3] = list.get(i).getQty();
            rowData[4] = list.get(i).getDescription();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/products/kids/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }   
    }
    
    //definiere Button-Actions
    private void newlyAddedMouseReleased(java.awt.event.MouseEvent evt) {
        newlyAdded.setBackground(new Color(153, 204, 255));
    }

    private void newlyAddedMousePressed(java.awt.event.MouseEvent evt) {
        newlyAdded.setBackground(new Color(0, 0, 255));
    }

    private void newlyAddedMouseExited(java.awt.event.MouseEvent evt) {
        newlyAdded.setBackground(new Color(153, 204, 255));
    }

    private void newlyAddedMouseEntered(java.awt.event.MouseEvent evt) {
        newlyAdded.setBackground(new Color(51, 153, 255));
    }

    private void newlyAddedMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    

    private void accountButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void accountButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseEntered
        accountButton.setBackground(new Color(51, 153, 255));
    }

    private void accountButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseExited
        accountButton.setBackground(new Color(153, 204, 255));
    }

    private void accountButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMousePressed
        accountButton.setBackground(new Color(0, 0, 255));
    }

    private void accountButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseReleased
        accountButton.setBackground(new Color(153, 204, 255));
    }

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        
        if(signInStatus==false){
            cardParentPanel.removeAll();
            cardParentPanel.add(signUpPanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();
        }
        else{
            SignedIn si = new SignedIn();
            si.setVisible(true);
            si.loggerName.setText(logger);
        }
    }

    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {
        cardParentPanel.removeAll();
        cardParentPanel.add(cartPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
        
         DefaultTableModel model =  (DefaultTableModel) cartItemTable.getModel();
         model.setRowCount(0);
         total = 0;
         //variable fuer Gesamt-Preis, wird in ProductInformation geupdated
         tot = "";
         
         for(int i=0; i<ProductInformation.cartItem.size(); i++){
            data[0] = ProductInformation.cartItem.get(i).getBrand();
            data[1] = ProductInformation.cartItem.get(i).getModel();
            data[2] = ProductInformation.cartItem.get(i).getPrice();
            data[3] = ProductInformation.cartItem.get(i).getQty();
            
            model.addRow(data);
            cartItemTable.setRowHeight(20);
            total+=Integer.parseInt(cartItemTable.getValueAt(i, 2)+"");
         }
         billLabel.setText(String.valueOf(total));
    }

    private void cartButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void cartButtonMouseEntered(java.awt.event.MouseEvent evt) {
        cartButton.setBackground(new Color(51, 153, 255));
    }

    private void cartButtonMouseExited(java.awt.event.MouseEvent evt) {
        cartButton.setBackground(new Color(153, 204, 255));
    }

    private void cartButtonMousePressed(java.awt.event.MouseEvent evt) {
        cartButton.setBackground(new Color(0, 0, 255));
    }

    private void cartButtonMouseReleased(java.awt.event.MouseEvent evt) {
        cartButton.setBackground(new Color(153, 204, 255));
    }
    
    
    private void signInUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    static String logger;
    
    //@SuppressWarnings("deprecation")
	private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
        JFrame adminPanel = new AdminPanel();
        if(signInUsernameField.getText().equals("admin") && signInPasswordField.getText().equals("admin")){
            signInStatus = true;
            adminPanel.setVisible(true);
            logger = signInUsernameField.getText();
            signInUsernameField.setText("");
            signInPasswordField.setText("");
            warningLabel.setText("");
            cardParentPanel.removeAll();
            cardParentPanel.add(homePanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();
            wrongPass = 0;
        }
        else{
            //Passwort abfrage
			boolean flag = DbConnector.signer(signInUsernameField.getText(), signInPasswordField.getText());
            
            if(flag){
                signInStatus = true;
                cardParentPanel.removeAll();
                cardParentPanel.add(homePanel);
                cardParentPanel.repaint();
                cardParentPanel.revalidate();
                logger = signInUsernameField.getText();
                warningLabel.setText("");
                signInUsernameField.setText("");
                signInPasswordField.setText("");
                wrongPass = 0;
            }  
            else{
                warningLabel.setText("Name/Passwort falsch!");
                wrongPass++;
                signInUsernameField.setText("");
                signInPasswordField.setText("");
            } 
        }
        
    }

    private void signUpButtonMouseEntered(java.awt.event.MouseEvent evt) {
        signUpButton.setForeground(new Color(48, 79, 254));
    }

    private void signUpButtonMouseExited(java.awt.event.MouseEvent evt) {
        signUpButton.setForeground(new Color(153, 204, 255));
    }

    private void signUpButtonMousePressed(java.awt.event.MouseEvent evt) {
        signUpButton.setForeground(new Color(0, 0, 255));
    }

    private void signUpButtonMouseReleased(java.awt.event.MouseEvent evt) {
        signUpButton.setForeground(new Color(153, 204, 255));
    }

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {
        cardParentPanel.removeAll();
        cardParentPanel.add(signUpPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }

    private void showPassword1ActionPerformed(java.awt.event.ActionEvent evt) {
    	
        if(showPassword1.isSelected()){
           signInPasswordField.setEchoChar((char)0);
        }
        else
            signInPasswordField.setEchoChar('*');
    }

    private void jPanel6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel6FocusGained
        // TODO add your handling code here:
    }

    private void jPanel6ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel6ComponentShown
        // TODO add your handling code here:   
    }

    private void signUpUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpUsernameFieldActionPerformed
        // TODO add your handling code here:
    }

    @SuppressWarnings("deprecation")
	private void LogUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogUpButtonActionPerformed
        
        if(signUpUsernameField.getText().equals("")||signUpNameField.getText().equals("")
           ||signUpPasswordField.getText().equals(""))
            emptyField.setText("*Notwendige Eingaben fehlen!");
        else{
            int test = DbConnector.insertToUser(signUpUsernameField.getText(), signUpNameField.getText(),
                signUpPasswordField.getText());

            if(test == 19){
                usernameExists.setText("Username exists!");
                emptyField.setText("");
                signUpUsernameField.setText("");
            }
            else{
                signUpUsernameField.setText("");
                signUpNameField.setText("");
                signUpPasswordField.setText("");
                emptyField.setText("");
            }
        }
    }

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {
        if(showPassword.isSelected()){
            signUpPasswordField.setEchoChar((char)0);
        }
        else
        signUpPasswordField.setEchoChar('*');
    }

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {
        cardParentPanel.removeAll();
        cardParentPanel.add(signInPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }

    private void signInButtonMouseReleased(java.awt.event.MouseEvent evt) {
        signInButton.setForeground(new Color(153, 204, 255));
    }

    private void signInButtonMousePressed(java.awt.event.MouseEvent evt) {
        signInButton.setForeground(new Color(0, 0, 255));
    }

    private void signInButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonMouseExited
        signInButton.setForeground(new Color(153, 204, 255));
    }

    private void signInButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonMouseEntered
        signInButton.setForeground(new Color(48, 79, 254));
    }
        
    private void signUpNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpNameFieldActionPerformed
        // TODO add your handling code here:
    }

    
    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        if(!signInStatus){
        	cardParentPanel.removeAll();
        	cardParentPanel.add(signInPanel);
        	cardParentPanel.repaint();
        	cardParentPanel.revalidate();
        	
        	warningLabel.setText("Bitte einloggen.");
        }
        else{
            Date date = new Date();
            JFrame da = new DeliveryAddress(logger, Integer.parseInt(billLabel.getText()), date.toString());
            da.setVisible(true);
        }
    }

    private void warningLabelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    ProductInformation pi = new ProductInformation();
    
    private void homeTableMouseClicked(java.awt.event.MouseEvent evt) {
        
        pi.setVisible(true);
        pi.pack();
        
        int selectedRow = homeTable.getSelectedRow();
        TableModel tm = homeTable.getModel();
        
        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);
        //zeige Produktinformationen nachdem ein Teil ausgewaehlt wurde
        pi.productInfoBrandName.setText(brand);
        pi.productInfoModel.setText(model);
        pi.productInfoPrice.setText(price);
        pi.productInfoStock.setText(stock);
        pi.productInfoFeature.setText(feature);
        pi.productPhoto.setIcon(img);
    }

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void searchButtonMouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void searchButtonMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void searchButtonMousePressed(java.awt.event.MouseEvent evt) {
        searchButton.setBackground(new Color(0, 0, 255));
    }

    private void searchButtonMouseReleased(java.awt.event.MouseEvent evt) {
        searchButton.setBackground(new Color(153, 204, 255));
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	
        Search.kids=0;
        ArrayList<ProductList> list = Search.mobileSearch(searchBar.getText());
        Object rowData[] = new Object[6];
        int i;
        
        if(searchBar.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Leeres Suchfeld!");
        else if(Search.kids==0)
            JOptionPane.showMessageDialog(null, "Ooops! Produkt existiert nicht!");
        else{
            cardParentPanel.removeAll();
            cardParentPanel.add(searchPanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();
                    
            DefaultTableModel model =  (DefaultTableModel) searchTable.getModel();
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            searchTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
            
            model.setRowCount(0);
            
            System.out.println();
            for(i=0; i<Search.kids; i++){
                rowData[0] = list.get(i).getBrand();
                rowData[1] = list.get(i).getModel();
                rowData[2] = list.get(i).getPrice();
                rowData[3] = list.get(i).getQty();
                rowData[4] = list.get(i).getDescription();
                String temp = list.get(i).getMimage();
                ImageIcon ii = new ImageIcon(getClass().getResource("/products/kids/"+temp));
                Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[5] = ii;
                model.addRow(rowData);
                searchTable.setRowHeight(150);
                searchTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            }
        }
    }

    private void searchBarMouseClicked(java.awt.event.MouseEvent evt) {
        searchBar.setText("");
    }
    
    
    private void searchTableMouseClicked(java.awt.event.MouseEvent evt) {
        
    	pi.setVisible(true);
        pi.pack();
        
        int selectedRow = searchTable.getSelectedRow();
        TableModel tm = searchTable.getModel();
        
        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);
        
        pi.productInfoBrandName.setText(brand);
        pi.productInfoModel.setText(model);
        pi.productInfoPrice.setText(price);
        pi.productInfoStock.setText(stock);
        pi.productInfoFeature.setText(feature);
        pi.productPhoto.setIcon(img);
    }

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //desc=" Look and feel setting code (optional) "
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
            java.util.logging.Logger.getLogger(ProjectMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        JFrame newMain = new ProjectMain();
        newMain.setTitle("Shopping");
        newMain.setVisible(true);
        newMain.setResizable(false);
    }
    
    // Variables declaration
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton LogInButton;
    private javax.swing.JButton LogUpButton;
    private javax.swing.JButton accountButton;
    public static javax.swing.JLabel billLabel;
    private javax.swing.JButton buyButton;
    private javax.swing.JPanel cardParentPanel;
    private javax.swing.JButton cartButton;
    public static javax.swing.JTable cartItemTable;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JLabel emptyField;
    private javax.swing.JPanel homePanel;
    private javax.swing.JTable homeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton newlyAdded;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable searchTable;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JCheckBox showPassword1;
    private javax.swing.JButton signInButton;
    private javax.swing.JPanel signInPanel;
    private javax.swing.JPasswordField signInPasswordField;
    private javax.swing.JTextField signInUsernameField;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField signUpNameField;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JPasswordField signUpPasswordField;
    private javax.swing.JTextField signUpUsernameField;
    private javax.swing.JLabel usernameExists;
    private javax.swing.JTextField warningLabel;
}

