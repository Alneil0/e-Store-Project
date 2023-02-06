import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ِAnas Omar Obaid
 */
public class CustomarWindow extends javax.swing.JFrame {
static Cart cart[] = new Cart[1000];
static int countinerCart = 0;
Iterator<String> iterator;
String nameDepartment[];
  JTree jTree1;
  String nameProductJtree ;
  
  public  static JPanel panel1; // For viewCart
   static JLabel lblTotalAmountPrice; // For viewCart
    /**
     * Creates new form CustomarWindow
     */
    public CustomarWindow() {
    
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

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        shopProduct = new javax.swing.JButton();
        viewCart = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        combowQuantitiy = new javax.swing.JComboBox<>();
        addCart = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelProduct = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionProduct = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Customar Window");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(33, 131, 226));
        login.setText("Login");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        shopProduct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        shopProduct.setForeground(new java.awt.Color(33, 131, 226));
        shopProduct.setText("Shope Product");
        shopProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shopProduct.setEnabled(false);
        shopProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopProductActionPerformed(evt);
            }
        });

        viewCart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewCart.setForeground(new java.awt.Color(33, 131, 226));
        viewCart.setText("View Cart");
        viewCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(shopProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(viewCart, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(viewCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shopProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(33, 131, 226));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 131, 226));
        jLabel2.setText("Quantitiy :");

        combowQuantitiy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combowQuantitiy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        combowQuantitiy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        addCart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addCart.setForeground(new java.awt.Color(33, 131, 226));
        addCart.setText("Add Cart");
        addCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCart.setEnabled(false);
        addCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCartActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 131, 226));
        jLabel3.setText("Product :");

        labelProduct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 131, 226));
        jLabel4.setText("Price :");

        labelPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 131, 226));
        jLabel5.setText("Description :");

        descriptionProduct.setColumns(20);
        descriptionProduct.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        descriptionProduct.setRows(5);
        jScrollPane1.setViewportView(descriptionProduct);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(combowQuantitiy, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(addCart, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combowQuantitiy)
                    .addComponent(addCart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(33, 131, 226));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customar Window :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        // This To Show The Frame Login
       
      LoginFrame frame = new LoginFrame();
      frame.setVisible(true);
    }//GEN-LAST:event_loginActionPerformed

    private void shopProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopProductActionPerformed

        // Hear To Show The Jtree
    
     
        //create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("eStore");
        
        // Create The Child nods 
        nameDepartment = new String[Department.nameDepatment.size()]; // The Size Depand For The Many Of Department
        iterator = Department.nameDepatment.iterator();
        for(int i = 0 ; i < nameDepartment.length ; ++i){
            nameDepartment[i] = iterator.next();
        }
       
       // For Loop To Make The Department And Create The  nods 
         DefaultMutableTreeNode departmentNode[] = new DefaultMutableTreeNode[nameDepartment.length];
         for(int i = 0 ; i < nameDepartment.length ; ++i){
           departmentNode[i] = new DefaultMutableTreeNode(nameDepartment[i]);
         }
      
       // This To Add The Child Of Nods
       for(int i = 0 ; i <  nameDepartment.length ; ++i){
       for(int j = 0 ; j < addNewProduct.countiner ; ++j){
            if(departmentNode[i].toString().equals(addNewProduct.product[j].getDep())){
                departmentNode[i].add(new DefaultMutableTreeNode(addNewProduct.product[j].getNameProdect()));
            }
        }   
       }
         
       // ========================= This For To Added Into Jtree
       for(int i = 0 ; i < nameDepartment.length ; ++i){
           root.add(departmentNode[i]);
         }
  
// Add This In Jreee
    jTree1 = new JTree(root);
   jTree1.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
    
       
    public void valueChanged(TreeSelectionEvent e) {
        labelProduct.setText(e.getPath().getLastPathComponent().toString());
        
       
// ========================= Get The Object From Product Class When I Click In The Node
        
 for(int i = 0 ; i < addNewProduct.countiner ; ++i){
     if(addNewProduct.product[i].getNameProdect().equals(labelProduct.getText())) {
     labelPrice.setText(String.valueOf(addNewProduct.product[i].getPrice()));
     descriptionProduct.setText(addNewProduct.product[i].getDescriptionProduct()); 
     addCart.setEnabled(true);
     }
     
 }       
    }
});
   
// ======================================== Some Thing For jTree 
    add(new JScrollPane(jTree1));
    add(jTree1);
    jTree1.setBounds(30, 260, 200, 400);
    jTree1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jTree1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jTree1.setShowsRootHandles(true);
 
    }//GEN-LAST:event_shopProductActionPerformed

    private void addCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartActionPerformed
        
         // TODO add your handling code here:
        // This To Add The Product In Cart
     double price = Double.parseDouble(labelPrice.getText());
     double total = 0;
     total = price * Integer.parseInt((String) combowQuantitiy.getSelectedItem());
     
     String name = LoginFrame.nameCustomar;
     int puantity = Integer.parseInt((String) combowQuantitiy.getSelectedItem());
     cart[countinerCart] = new Cart(labelProduct.getText(),descriptionProduct.getText(),puantity,price,total,name);
     JOptionPane.showMessageDialog(this, " Add Sussfull  "+ " \n" + " Engoi Shoping " + name, " Welcome " + name, 1);
     countinerCart++;
    }//GEN-LAST:event_addCartActionPerformed

    private void viewCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCartActionPerformed

// ============================================================== This To View Cart 
   JFrame viewCart = new JFrame();     
     JPanel contentPane;
     JScrollPane scrollPane ;
     viewCart.setTitle("Cart Windows");
     viewCart.setBounds(100, 100, 539, 300);
     contentPane = new JPanel(); // Pane To Content
     viewCart.setContentPane(contentPane); // To Added To The viewCart
     contentPane.setLayout(null); // null layout TO ContentPane
     lblTotalAmountPrice = new JLabel("Total amount price of item in cart " ); // Create The Labl To Amount Price
     lblTotalAmountPrice.setBounds(218, 10, 236, 14); // Set Lecation
    double totalAll = 0 ;
    for(int c = 0 ; c < ManagerWindow.sizeCustomar ; ++c){ 
    for(int i = 0 ; i < countinerCart ; ++i){
     if(LoginFrame.nameCustomar.equals(ManagerWindow.customar[c].getUserName()) && LoginFrame.nameCustomar.equals(cart[i].getUserName())){
     totalAll += cart[i].getTotal();
     }
    }   
    }
     lblTotalAmountPrice.setText( "Total amount price of item in cart "+ totalAll);
    contentPane.add(lblTotalAmountPrice ); // To Add The Total In Frame
     		JButton btnProductToCheckout = new JButton("product to checkout");
		btnProductToCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkoutWindows c = new checkoutWindows();
				c.setVisible(true); // This To Show The Checkout
 
			}
		});
      btnProductToCheckout.setBounds(51, 6, 157, 23);

      contentPane.add(btnProductToCheckout); // This Too Add The Button In The ContentPane
      
       panel1 = new JPanel(); // This Pane To Content The Prpduct
		panel1.setBounds(10, 43, 487, 357);
		contentPane.add(panel1);
		panel1.setLayout(new GridLayout(1, 0, 0, 0));
	  
                scrollPane = new JScrollPane(panel1,
                    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 43, 487, 357);

		contentPane.add(scrollPane);	
                
                for(int i = 0 ; i <ManagerWindow.sizeCustomar ; ++i){
                for(int j = 0 ; j < countinerCart ; ++j){
                    if(LoginFrame.nameCustomar.equals(ManagerWindow.customar[i].getUserName()) && LoginFrame.nameCustomar.equals(cart[j].getUserName())){
                panel1.add( new cartPanel(cart[j]));} // This Too Add The Info In Box Panel
                }      
                }
                
             
                // Enabel The viewCart
		viewCart.setSize(523, 450);
		viewCart.setResizable(false);	
                viewCart.setVisible(true);
     
    }//GEN-LAST:event_viewCartActionPerformed

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
            java.util.logging.Logger.getLogger(CustomarWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomarWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomarWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomarWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomarWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCart;
    private javax.swing.JComboBox<String> combowQuantitiy;
    private javax.swing.JTextArea descriptionProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelProduct;
    private javax.swing.JButton login;
    public static javax.swing.JButton shopProduct;
    public static javax.swing.JButton viewCart;
    // End of variables declaration//GEN-END:variables
 
        }


