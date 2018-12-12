package project;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class ProductInformation extends JFrame {

    
	private static final long serialVersionUID = 1L;
	static int rab2Dis = 5;//absoluter Rabatt (€)
	static int rab1Dis = 10;//prozentualer Rabatt (%)
	static String rab1 = "Beetle";//prozentual rabattiertes Modell
	static String rab2 = "Grau";//absolut rabatiertes Modell
	
	/**
     * Creates new form ProductInformation
     */
    //static String categoryChooser="";
    
    public ProductInformation() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        productPhoto = new javax.swing.JLabel();
        productInfoBrand = new javax.swing.JLabel();
        productInfoBrand1 = new javax.swing.JLabel();
        productInfoBrand2 = new javax.swing.JLabel();
        productInfoBrand3 = new javax.swing.JLabel();
        productInfoBrand4 = new javax.swing.JLabel();
        addToCart = new javax.swing.JButton();
        productInfoBrandName = new javax.swing.JLabel();
        productInfoModel = new javax.swing.JLabel();
        productInfoPrice = new javax.swing.JLabel();
        productInfoStock = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productInfoFeature = new javax.swing.JTextArea();
        productInfoBrand5 = new javax.swing.JLabel();
        productQtyField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 72));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Produkt Information");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        // label for info icon
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Info_48px.png")));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(608, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap(16, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        productPhoto.setBackground(new java.awt.Color(255, 255, 255));
        productPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        productInfoBrand.setFont(new java.awt.Font("Tahoma", 0, 14));
        productInfoBrand.setForeground(new java.awt.Color(0, 0, 255));
        productInfoBrand.setText("Name:");

        productInfoBrand1.setFont(new java.awt.Font("Tahoma", 0, 14));
        productInfoBrand1.setForeground(new java.awt.Color(0, 0, 255));
        productInfoBrand1.setText("Preis €:");

        productInfoBrand2.setFont(new java.awt.Font("Tahoma", 0, 14));
        productInfoBrand2.setForeground(new java.awt.Color(0, 0, 255));
        productInfoBrand2.setText("Auf Lager:");

        productInfoBrand3.setFont(new java.awt.Font("Tahoma", 0, 14));
        productInfoBrand3.setForeground(new java.awt.Color(0, 0, 255));
        productInfoBrand3.setText("Modell:");

        productInfoBrand4.setFont(new java.awt.Font("Tahoma", 0, 14));
        productInfoBrand4.setForeground(new java.awt.Color(0, 0, 255));
        productInfoBrand4.setText("Beschreibung:");

        addToCart.setBackground(new java.awt.Color(0, 0, 255));
        addToCart.setFont(new java.awt.Font("Tahoma", 0, 18));
        addToCart.setForeground(new java.awt.Color(255, 255, 255));
        addToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Shopping_Cart_24px.png")));
        addToCart.setText("In den Warenkorb");
        addToCart.setBorder(null);
        addToCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        productInfoBrandName.setFont(new java.awt.Font("Tahoma", 1, 14));
        productInfoBrandName.setForeground(new java.awt.Color(0, 0, 255));

        productInfoModel.setFont(new java.awt.Font("Tahoma", 1, 14));
        productInfoModel.setForeground(new java.awt.Color(0, 0, 255));

        productInfoPrice.setFont(new java.awt.Font("Tahoma", 1, 14));
        productInfoPrice.setForeground(new java.awt.Color(0, 0, 255));

        productInfoStock.setFont(new java.awt.Font("Tahoma", 1, 14));
        productInfoStock.setForeground(new java.awt.Color(0, 0, 255));

        productInfoFeature.setEditable(false);
        productInfoFeature.setColumns(20);
        productInfoFeature.setFont(new java.awt.Font("Tahoma", 1, 14));
        productInfoFeature.setLineWrap(true);
        productInfoFeature.setRows(5);
        productInfoFeature.setBorder(null);
        productInfoFeature.setFocusable(false);
        productInfoFeature.setRequestFocusEnabled(false);
        productInfoFeature.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(productInfoFeature);
        
        productInfoBrand5.setFont(new java.awt.Font("Tahoma", 0, 18));
        productInfoBrand5.setForeground(new java.awt.Color(0, 0, 255));
        productInfoBrand5.setText("Anzahl:");

        productQtyField.setFont(new java.awt.Font("Tahoma", 0, 18));
        productQtyField.setText("1");
        productQtyField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        productQtyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productQtyFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(64, 64, 64)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(productInfoBrand)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(productInfoBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(productInfoBrand1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(productInfoBrand3, javax.swing.GroupLayout.Alignment.LEADING))
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productInfoModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(productInfoPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(productInfoBrand2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(productInfoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(63, 63, 63)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productInfoBrand4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addComponent(productPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addComponent(productInfoBrand5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(productQtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(45, 45, 45)
            .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(50, 50, 50))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(88, 88, 88)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(productInfoBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(productInfoBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(74, 74, 74)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(productInfoBrand3)
            .addComponent(productInfoModel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(67, 67, 67)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productInfoBrand1)
            .addComponent(productInfoPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(70, 70, 70)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productInfoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(productInfoBrand2)))
            .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addComponent(productInfoBrand4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(29, 49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGap(58, 58, 58)
            .addComponent(productPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(productInfoBrand5)
            .addComponent(productQtyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1130, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }
    
    public static ArrayList<ProductList> cartItem = new ArrayList();
    
    
    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {
        
        if(Integer.parseInt(this.productInfoStock.getText())<Integer.parseInt(this.productQtyField.getText())){
            JOptionPane.showMessageDialog(null, "Nicht genug Ware auf Lager!");
        }
        else{
            int qty = Integer.parseInt(this.productQtyField.getText());
            ProductList p = new ProductList(this.productInfoBrandName.getText(), this.productInfoModel.getText(), calcDiscount(productInfoModel.getText(), Integer.parseInt(productInfoPrice.getText()), qty), 
                            	Integer.parseInt(this.productQtyField.getText()), null, null);//qty*Integer.parseInt(this.productInfoPrice.getText()
            
            cartItem.add(p);
            JOptionPane.showMessageDialog(null, "Dem Warenkorb hinzugefügt!");
   
            int qtyTester = Integer.parseInt(this.productInfoStock.getText())-Integer.parseInt(this.productQtyField.getText());
            
            KidsDB.updateKidsDB(this.productInfoModel.getText(), qtyTester);
        }
    }
    
    //Berechne Preis mit Rabatt
    private int calcDiscount(String mod, int price, int qty) {
    	
    	int rab = 0;
    	
    	if (mod.equals(rab1)) {
    		rab = ((qty * price) - (((qty * price) * rab1Dis)/100));
    	}
    	else if (mod.equals(rab2)) {
    		rab = ((qty * price) - qty * rab2Dis);
    	}
    	else{
    		rab = price * qty;
    	}
    	return(rab);
	}
    
    

	private void productQtyFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here
    }
    
    // Variables declaration
    private javax.swing.JButton addToCart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel productInfoBrand;
    private javax.swing.JLabel productInfoBrand1;
    private javax.swing.JLabel productInfoBrand2;
    private javax.swing.JLabel productInfoBrand3;
    private javax.swing.JLabel productInfoBrand4;
    private javax.swing.JLabel productInfoBrand5;
    public javax.swing.JLabel productInfoBrandName;
    public javax.swing.JTextArea productInfoFeature;
    public javax.swing.JLabel productInfoModel;
    public javax.swing.JLabel productInfoPrice;
    public javax.swing.JLabel productInfoStock;
    public javax.swing.JLabel productPhoto;
    private javax.swing.JTextField productQtyField;
}
