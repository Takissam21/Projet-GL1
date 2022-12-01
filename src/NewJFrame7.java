
import javax.swing.table.DefaultTableModel;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PC
 */
public class NewJFrame7 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame7
     */
    public NewJFrame7() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1004, 610));

        jPanel1.setLayout(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(290, 140, 360, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(290, 190, 360, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(290, 240, 360, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(290, 290, 360, 30);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(290, 330, 360, 30);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(290, 380, 360, 30);

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton1.setText("Insertion");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(800, 140, 150, 40);

        jToggleButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton2.setText("Modification");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2);
        jToggleButton2.setBounds(800, 190, 150, 40);

        jToggleButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton3.setText("Recherche");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton3);
        jToggleButton3.setBounds(800, 240, 150, 40);

        jToggleButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton4.setText("Reset");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton4);
        jToggleButton4.setBounds(800, 290, 150, 40);

        jToggleButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton5.setText("Retour");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton5);
        jToggleButton5.setBounds(800, 340, 150, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "numéro", "désignation", "adresse", "email", "responsable", "revendeur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 450, 950, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\7.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        NewJFrame3 Variable = new NewJFrame3();
        Variable.show();
        dispose();                      
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        jTextField1.setText(RecordTable.getValueAt(SelectedRows,0).toString());
        jTextField2.setText(RecordTable.getValueAt(SelectedRows,1).toString());
        jTextField3.setText(RecordTable.getValueAt(SelectedRows,2).toString());
        jTextField4.setText(RecordTable.getValueAt(SelectedRows,3).toString());
        jTextField5.setText(RecordTable.getValueAt(SelectedRows,4).toString());
        jTextField6.setText(RecordTable.getValueAt(SelectedRows,5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String sql="INSERT INTO client(numéro,désignation,adresse,email,responsable,revendeur)"
            +"VALUES (?,?,?,?,?,?)";
            String passwd="";
            String user="root";
            String url="jdbc:mysql://localhost:3306/utilsateur";
            Connection con = DriverManager.getConnection(url,user,passwd);
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,jTextField1.getText());
            pst.setString(2,jTextField2.getText());
            pst.setString(3,jTextField3.getText());
            pst.setString(4,jTextField4.getText());
            pst.setString(5,jTextField5.getText());
            pst.setString(6,jTextField6.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record added");
            /////////////////////////////////////////////////////////////////////////////////////////////
            try{
                con = DriverManager.getConnection(url,user,passwd);
                pst =con.prepareStatement("select * from client");
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
                int q = stData.getColumnCount();
                DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
                RecordTable.setRowCount(0);
                while(rs.next()){
                    Vector columnData = new Vector();
                    for(int i=1;i<q;i++){
                        columnData.add(rs.getString("numéro"));
                        columnData.add(rs.getString("désignation"));
                        columnData.add(rs.getString("adresse"));
                        columnData.add(rs.getString("email"));
                        columnData.add(rs.getString("responsable"));
                        columnData.add(rs.getString("revendeur"));
                    } 
                    RecordTable.addRow(columnData);  
                }  
            }
            catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
            }
            /////////////////////////////////////////////////////////////////////////////////////////////
        }
        catch(SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        try{
            String sql="UPDATE client SET désignation=?,adresse=?,email=?,responsable=?,revendeur=? WHERE numéro=?";
            String passwd="";
            String user="root";
            String url="jdbc:mysql://localhost:3306/utilsateur";
            Connection con = DriverManager.getConnection(url,user,passwd);
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(6,jTextField1.getText());
            pst.setString(1,jTextField2.getText());
            pst.setString(2,jTextField3.getText());
            pst.setString(3,jTextField4.getText());
            pst.setString(4,jTextField5.getText());
            pst.setString(5,jTextField6.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record modified");
            ////////////////////////////////////////////////////////////////////////////////////////////
            try{
                con = DriverManager.getConnection(url,user,passwd);
                pst =con.prepareStatement("select * from client");
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
                int q = stData.getColumnCount();
                DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
                RecordTable.setRowCount(0);
                while(rs.next()){
                    Vector columnData = new Vector();
                    int i;
                    for(i=1;i<q;i++){
                        columnData.add(rs.getString("numéro"));
                        columnData.add(rs.getString("désignation"));
                        columnData.add(rs.getString("adresse"));
                        columnData.add(rs.getString("email"));
                        columnData.add(rs.getString("responsable"));
                        columnData.add(rs.getString("revendeur"));
                    } 
                    RecordTable.addRow(columnData);  
                }  
            }
            catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        catch(SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        String passwd="";
        String user="root";
        String url="jdbc:mysql://localhost:3306/utilsateur";
        try{
            Connection con = DriverManager.getConnection(url,user,passwd);
            PreparedStatement pst = con.prepareStatement("SELECT désignation,adresse,email,responsable,revendeur FROM client WHERE numéro=?");
            pst.setString(1,jTextField1.getText());
            ResultSet rs1 = pst.executeQuery();
            if(rs1.next()==false){
                JOptionPane.showMessageDialog(this,"");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField1.requestFocus();
            }
            else{
                jTextField2.setText(rs1.getString("désignation"));
                jTextField3.setText(rs1.getString("adresse"));
                jTextField4.setText(rs1.getString("email"));
                jTextField5.setText(rs1.getString("responsable"));
                jTextField6.setText(rs1.getString("revendeur"));
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    // End of variables declaration//GEN-END:variables
}