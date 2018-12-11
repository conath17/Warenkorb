 package project;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class AdminPanel extends JFrame {

    
	/**
     * Creates new form AdminPanel
     */
	private static final long serialVersionUID = 1L;
    boolean imageChooser = false;
    String path;
    
    public AdminPanel() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        checkStockButton = new javax.swing.JButton();
        billingButton = new javax.swing.JButton();
        cardAdminParentLayout = new javax.swing.JPanel();
        updatePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        mBrand = new javax.swing.JTextField();
        mModel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mQty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mPhotoPath = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mCat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        mDescription = new javax.swing.JTextArea();
        selectedPhoto = new javax.swing.JLabel();
        photoSelection = new javax.swing.JButton();
        mPrice = new javax.swing.JTextField();
        LogInButton = new javax.swing.JButton();
        checkStockPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        checkStockTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        stockUpdateModel = new javax.swing.JTextField();
        stockStatusCat = new javax.swing.JComboBox<>();
        updateStockButton = new javax.swing.JButton();
        delEntry = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        delEntryModel = new javax.swing.JTextField();
        delUpdateCat = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        stockUpdateSetQty = new javax.swing.JTextField();
        billingPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        billingTable = new javax.swing.JTable();
        delEntry1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(1199, 699));
        jPanel3.setPreferredSize(new java.awt.Dimension(1199, 699));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 72));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrator Panel");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Admin_48px.png")));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(678, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 60));

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        updateButton.setBackground(new java.awt.Color(153, 204, 255));
        updateButton.setFont(new java.awt.Font("Tahoma", 0, 20));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("New Entry");
        updateButton.setToolTipText("Enter new product");
        updateButton.setBorder(null);
        updateButton.setBorderPainted(false);
        updateButton.setContentAreaFilled(false);
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.setOpaque(true);
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updateButtonMouseReleased(evt);
            }
        });
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        checkStockButton.setBackground(new java.awt.Color(153, 204, 255));
        checkStockButton.setFont(new java.awt.Font("Tahoma", 0, 20));
        checkStockButton.setForeground(new java.awt.Color(255, 255, 255));
        checkStockButton.setText("Check Stock");
        checkStockButton.setToolTipText("Stock status");
        checkStockButton.setBorder(null);
        checkStockButton.setBorderPainted(false);
        checkStockButton.setContentAreaFilled(false);
        checkStockButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkStockButton.setOpaque(true);
        checkStockButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkStockButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkStockButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkStockButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                checkStockButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                checkStockButtonMouseReleased(evt);
            }
        });
        checkStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkStockButtonActionPerformed(evt);
            }
        });

        billingButton.setBackground(new java.awt.Color(153, 204, 255));
        billingButton.setFont(new java.awt.Font("Tahoma", 0, 20));
        billingButton.setForeground(new java.awt.Color(255, 255, 255));
        billingButton.setText("Billing");
        billingButton.setToolTipText("Total billings ");
        billingButton.setBorder(null);
        billingButton.setBorderPainted(false);
        billingButton.setContentAreaFilled(false);
        billingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        billingButton.setOpaque(true);
        billingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billingButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                billingButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                billingButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                billingButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                billingButtonMouseReleased(evt);
            }
        });
        billingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(34, 34, 34)
            .addComponent(checkStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(billingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(740, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(billingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(checkStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 1210, 50));

        cardAdminParentLayout.setBackground(new java.awt.Color(255, 255, 255));
        cardAdminParentLayout.setLayout(new java.awt.CardLayout());

        updatePanel.setBackground(new java.awt.Color(255, 255, 255));
        updatePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20));
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Product Details");
        updatePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 1200, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 1));
        updatePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 51, 200, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Brand:");
        updatePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 104, -1));

        mBrand.setFont(new java.awt.Font("Tahoma", 0, 14));
        mBrand.setForeground(new java.awt.Color(0, 0, 255));
        mBrand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        mBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBrandActionPerformed(evt);
            }
        });
        updatePanel.add(mBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 362, -1));

        mModel.setFont(new java.awt.Font("Tahoma", 0, 14));
        mModel.setForeground(new java.awt.Color(0, 0, 255));
        mModel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        mModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mModelActionPerformed(evt);
            }
        });
        updatePanel.add(mModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 362, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Model:");
        updatePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 104, -1));

        mQty.setFont(new java.awt.Font("Tahoma", 0, 14));
        mQty.setForeground(new java.awt.Color(0, 0, 255));
        mQty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        mQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mQtyActionPerformed(evt);
            }
        });
        updatePanel.add(mQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Category:");
        updatePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 104, -1));

        mPhotoPath.setEditable(false);
        mPhotoPath.setFont(new java.awt.Font("Tahoma", 0, 14));
        mPhotoPath.setForeground(new java.awt.Color(0, 0, 255));
        mPhotoPath.setText("Choose photo:");
        mPhotoPath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        mPhotoPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPhotoPathActionPerformed(evt);
            }
        });
        updatePanel.add(mPhotoPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 340, 210, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Price:");
        updatePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 104, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Quantity:");
        updatePanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 104, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Product Description:");
        updatePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 140, -1));

        mCat.setFont(new java.awt.Font("Tahoma", 0, 14));
        mCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kids" }));
        updatePanel.add(mCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        mDescription.setColumns(20);
        mDescription.setFont(new java.awt.Font("Tahoma", 0, 14));
        mDescription.setLineWrap(true);
        mDescription.setRows(5);
        mDescription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        jScrollPane1.setViewportView(mDescription);

        updatePanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 370, 190));

        selectedPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Image_100px.png")));
        selectedPhoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        selectedPhoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        updatePanel.add(selectedPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 230, 210));

        photoSelection.setBackground(new java.awt.Color(0, 0, 255));
        photoSelection.setFont(new java.awt.Font("Tahoma", 0, 14));
        photoSelection.setForeground(new java.awt.Color(255, 255, 255));
        photoSelection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Camera_20px.png")));
        photoSelection.setBorder(null);
        photoSelection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        photoSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoSelectionActionPerformed(evt);
            }
        });
        updatePanel.add(photoSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 340, 50, 30));

        mPrice.setFont(new java.awt.Font("Tahoma", 0, 14));
        mPrice.setForeground(new java.awt.Color(0, 0, 255));
        mPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        mPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPriceActionPerformed(evt);
            }
        });
        updatePanel.add(mPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 180, -1));

        LogInButton.setBackground(new java.awt.Color(0, 0, 255));
        LogInButton.setFont(new java.awt.Font("Tahoma", 0, 20));
        LogInButton.setForeground(new java.awt.Color(255, 255, 255));
        LogInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Database_24px.png")));
        LogInButton.setText("Update");
        LogInButton.setBorder(null);
        LogInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        updatePanel.add(LogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 460, 130, 50));

        cardAdminParentLayout.add(updatePanel, "card3");

        checkStockPanel.setBackground(new java.awt.Color(255, 255, 255));

        checkStockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Model", "Stock", "Category"
            }
        ));
        checkStockTable.setEnabled(false);
        checkStockTable.setRowHeight(20);
        jScrollPane3.setViewportView(checkStockTable);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Enter model:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Add to Stock:");

        stockUpdateModel.setFont(new java.awt.Font("Tahoma", 0, 18));
        stockUpdateModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockUpdateModelActionPerformed(evt);
            }
        });

        stockStatusCat.setFont(new java.awt.Font("Tahoma", 0, 18));
        stockStatusCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kids" }));

        updateStockButton.setBackground(new java.awt.Color(0, 0, 255));
        updateStockButton.setFont(new java.awt.Font("Tahoma", 0, 18));
        updateStockButton.setForeground(new java.awt.Color(255, 255, 255));
        updateStockButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Up_24px.png")));
        updateStockButton.setText("Update Stock");
        updateStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStockButtonActionPerformed(evt);
            }
        });

        delEntry.setBackground(new java.awt.Color(255, 0, 0));
        delEntry.setFont(new java.awt.Font("Tahoma", 0, 18));
        delEntry.setForeground(new java.awt.Color(255, 255, 255));
        delEntry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Delete_24px.png")));
        delEntry.setText("Delete Entry");
        delEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delEntryActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Delete Entry:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Enter model:");

        delEntryModel.setFont(new java.awt.Font("Tahoma", 0, 18));
        delEntryModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delEntryModelActionPerformed(evt);
            }
        });

        delUpdateCat.setFont(new java.awt.Font("Tahoma", 0, 18));
        delUpdateCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kids" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Set Quantity:");

        stockUpdateSetQty.setFont(new java.awt.Font("Tahoma", 0, 18));
        stockUpdateSetQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockUpdateSetQtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout checkStockPanelLayout = new javax.swing.GroupLayout(checkStockPanel);
        checkStockPanel.setLayout(checkStockPanelLayout);
        checkStockPanelLayout.setHorizontalGroup(
            checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(checkStockPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkStockPanelLayout.createSequentialGroup()
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(delEntryModel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(28, 28, 28)
            .addComponent(delUpdateCat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(26, 26, 26)
            .addComponent(delEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(checkStockPanelLayout.createSequentialGroup()
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(stockUpdateModel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(28, 28, 28)
            .addComponent(stockStatusCat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(stockUpdateSetQty, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(26, 26, 26)
            .addComponent(updateStockButton)
            .addContainerGap(77, Short.MAX_VALUE))
        );
        checkStockPanelLayout.setVerticalGroup(
            checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkStockPanelLayout.createSequentialGroup()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkStockPanelLayout.createSequentialGroup()
            .addGap(38, 38, 38)
            .addGroup(checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(stockUpdateModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkStockPanelLayout.createSequentialGroup()
            .addGap(1, 1, 1)
            .addGroup(checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(stockStatusCat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(stockUpdateSetQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(updateStockButton))))
            .addGap(27, 27, 27)
            .addGroup(checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(delEntryModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(delUpdateCat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(delEntry)))
            .addGap(0, 36, Short.MAX_VALUE))
        );

        cardAdminParentLayout.add(checkStockPanel, "card4");

        billingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "Username", "Total Bill", "Time & Date"
            }
        ));
        jScrollPane2.setViewportView(billingTable);

        delEntry1.setBackground(new java.awt.Color(255, 0, 0));
        delEntry1.setFont(new java.awt.Font("Tahoma", 0, 18));
        delEntry1.setForeground(new java.awt.Color(255, 255, 255));
        delEntry1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Delete_24px.png")));
        delEntry1.setText("Delete Log");
        delEntry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delEntry1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout billingPanelLayout = new javax.swing.GroupLayout(billingPanel);
        billingPanel.setLayout(billingPanelLayout);
        billingPanelLayout.setHorizontalGroup(
            billingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
            .addGroup(billingPanelLayout.createSequentialGroup()
            .addGap(457, 457, 457)
            .addComponent(delEntry1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        billingPanelLayout.setVerticalGroup(
            billingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billingPanelLayout.createSequentialGroup()
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
            .addComponent(delEntry1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, 24))
        );

        cardAdminParentLayout.add(billingPanel, "card2");

        jPanel3.add(cardAdminParentLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1200, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void billingButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	cardAdminParentLayout.removeAll();
        cardAdminParentLayout.add(billingPanel);
        cardAdminParentLayout.repaint();
        cardAdminParentLayout.revalidate();
            
        DefaultTableModel model =  (DefaultTableModel) billingTable.getModel();
        model.setRowCount(0);
        
        Object[] data = new Object[4];
        ArrayList<BillObject> list = new ArrayList<>();
        list = BillingDB.billlings();
        
        for(int i=0; i<list.size(); i++){
            data[0] = i+1;
            data[1] = list.get(i).getUname();
            data[2] = list.get(i).getBill();
            data[3] = list.get(i).getDate();
            
            model.addRow(data);
            billingTable.setRowHeight(20);
        }
    }

    private void billingButtonMouseReleased(java.awt.event.MouseEvent evt) {
        billingButton.setBackground(new Color(153, 204, 255));
    }

    private void billingButtonMousePressed(java.awt.event.MouseEvent evt) {
        billingButton.setBackground(new Color(0, 0, 255));
    }

    private void billingButtonMouseExited(java.awt.event.MouseEvent evt) {
        billingButton.setBackground(new Color(153, 204, 255));
    }

    private void billingButtonMouseEntered(java.awt.event.MouseEvent evt) {
        billingButton.setBackground(new Color(0, 137, 123));
    }

    private void billingButtonMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void checkStockButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	cardAdminParentLayout.removeAll();
        cardAdminParentLayout.add(checkStockPanel);
        cardAdminParentLayout.repaint();
        cardAdminParentLayout.revalidate();
            
        DefaultTableModel model =  (DefaultTableModel) checkStockTable.getModel();
        model.setRowCount(0);
         
        ArrayList<ProductList> list = KidsDB.checkStock();
        
        Object data[] = new Object[4];
        
        for(int i=0; i<list.size(); i++){
            data[0] = list.get(i).getBrand();
            data[1] = list.get(i).getModel();
            data[2] = list.get(i).getQty();
            data[3] = "Toys";
            
            model.addRow(data);
        }
        list.clear();
    }

    private void checkStockButtonMouseReleased(java.awt.event.MouseEvent evt) {
        checkStockButton.setBackground(new Color(153, 204, 255));
    }

    private void checkStockButtonMousePressed(java.awt.event.MouseEvent evt) {
        checkStockButton.setBackground(new Color(0, 0, 255));
    }

    private void checkStockButtonMouseExited(java.awt.event.MouseEvent evt) {
        checkStockButton.setBackground(new Color(153, 204, 255));
    }

    private void checkStockButtonMouseEntered(java.awt.event.MouseEvent evt) {
        checkStockButton.setBackground(new Color(0, 137, 123));
    }

    private void checkStockButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	cardAdminParentLayout.removeAll();
        cardAdminParentLayout.add(updatePanel);
        cardAdminParentLayout.repaint();
        cardAdminParentLayout.revalidate();
    }

    private void updateButtonMouseReleased(java.awt.event.MouseEvent evt) {
        updateButton.setBackground(new Color(153, 204, 255));
    }
    
    private void updateButtonMousePressed(java.awt.event.MouseEvent evt) {
        updateButton.setBackground(new Color(0, 0, 255));
    }
    
    private void updateButtonMouseExited(java.awt.event.MouseEvent evt) {
        updateButton.setBackground(new Color(153, 204, 255));
    }

    private void updateButtonMouseEntered(java.awt.event.MouseEvent evt) {
        updateButton.setBackground(new Color(0, 137, 123));
    }

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void mBrandActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void mModelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void mQtyActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void mPhotoPathActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void photoSelectionActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        File selectedImage = fc.getSelectedFile();
        path = selectedImage.getName();
        
        try {
            Image img = ImageIO.read(selectedImage);
            mPhotoPath.setText(path);
            selectedPhoto.setIcon(new ImageIcon(img.getScaledInstance(selectedPhoto.getWidth(),
                    selectedPhoto.getHeight(), Image.SCALE_SMOOTH)));
        } catch (IOException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void mPriceActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
        try{
        	if(mCat.getSelectedItem().equals("Kids")){
        		if(!path.equals(""))
        			KidsDB.insertIntoKidsDB(mBrand.getText(), mModel.getText(), Integer.parseInt(mPrice.getText()), 
                		Integer.parseInt(mQty.getText()), mDescription.getText(), path);
        	}
        	mBrand.setText("");
        	mModel.setText("");
        	mQty.setText("");
        	mPrice.setText("");
        	mDescription.setText("");
        	mPhotoPath.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            mBrand.setText("");
            mModel.setText("");
            mQty.setText("");
            mPrice.setText("");
            mDescription.setText("");
            mPhotoPath.setText("");
        }
    }

    private void stockUpdateModelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void delEntryModelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void updateStockButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	try{
            String model = stockUpdateModel.getText();
            int qty = Integer.parseInt(stockUpdateSetQty.getText());

            if(stockStatusCat.getSelectedItem().equals("Kids")){
                KidsDB.flag = true;
                KidsDB.updateKidsDB(model, qty);
            }
            
            stockUpdateModel.setText("");
            stockUpdateSetQty.setText("");
        
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
    }

    private void stockUpdateSetQtyActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void delEntryActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            String del = delEntryModel.getText();
        
        if(delUpdateCat.getSelectedItem().equals("Kids")){
            KidsDB.delete(del);
        }
        delEntryModel.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void delEntry1ActionPerformed(java.awt.event.ActionEvent evt) {
        BillingDB.deleteBillings();
    }


    // Variables declaration
    private javax.swing.JButton LogInButton;
    private javax.swing.JButton billingButton;
    private javax.swing.JPanel billingPanel;
    private javax.swing.JTable billingTable;
    private javax.swing.JPanel cardAdminParentLayout;
    private javax.swing.JButton checkStockButton;
    private javax.swing.JPanel checkStockPanel;
    private javax.swing.JTable checkStockTable;
    private javax.swing.JButton delEntry;
    private javax.swing.JButton delEntry1;
    private javax.swing.JTextField delEntryModel;
    private javax.swing.JComboBox<String> delUpdateCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mBrand;
    private javax.swing.JComboBox<String> mCat;
    private javax.swing.JTextArea mDescription;
    private javax.swing.JTextField mModel;
    private javax.swing.JTextField mPhotoPath;
    private javax.swing.JTextField mPrice;
    private javax.swing.JTextField mQty;
    private javax.swing.JButton photoSelection;
    private javax.swing.JLabel selectedPhoto;
    private javax.swing.JComboBox<String> stockStatusCat;
    private javax.swing.JTextField stockUpdateModel;
    private javax.swing.JTextField stockUpdateSetQty;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JButton updateStockButton;
}
