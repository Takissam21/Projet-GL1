
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PC
 */
public class NewJFrame4 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame4
     */
    public NewJFrame4() {
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
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1004, 590));

        jPanel1.setLayout(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(290, 170, 310, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(290, 220, 310, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(290, 270, 310, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(290, 320, 310, 30);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(290, 370, 310, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("prix :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 370, 50, 30);

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton1.setText("Modifier");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(740, 160, 190, 40);

        jToggleButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton2.setText("Recherche");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2);
        jToggleButton2.setBounds(740, 210, 190, 40);

        jToggleButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton3.setText("Reset");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton3);
        jToggleButton3.setBounds(740, 260, 190, 40);

        jToggleButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton4.setText("Retour");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton4);
        jToggleButton4.setBounds(740, 310, 190, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "référence", "désignation", "prix"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 410, 570, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\6.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        NewJFrame1 Variable = new NewJFrame1();
        Variable.show();
        dispose();
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String sql="UPDATE produit SET prix=? WHERE référence=? or désignation=? ";
            String passwd="";
            String user="root";
            String url="jdbc:mysql://localhost:3306/utilsateur";
            Connection con = DriverManager.getConnection(url,user,passwd);
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(2,jTextField1.getText());
            pst.setString(3,jTextField2.getText());
            ////////////////////////////////////////////////////////////////////
            int i,j,resultat;
            String Chaine1, Chaine2, Chaine3;
            Chaine1 = jTextField3.getText();
            Chaine2 = jTextField4.getText();
            i = Integer.parseInt(Chaine1);
            j = Integer.parseInt(Chaine2);
            resultat = i + j;
            Integer rr = resultat;
            Chaine3 = rr.toString();
            ////////////////////////////////////////////////////////////////////
            pst.setString(1,Chaine3);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record modified");
            ////////////////////////////////////////////////////////////////////
            try{
                con = DriverManager.getConnection(url,user,passwd);
                pst =con.prepareStatement("select * from produit");
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
                int q = stData.getColumnCount();
                DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
                RecordTable.setRowCount(0);
                while(rs.next()){
                    Vector columnData = new Vector();
                    for(i=1;i<q;i++){
                        columnData.add(rs.getString("référence"));
                        columnData.add(rs.getString("désignation"));
                        columnData.add(rs.getString("prix"));
                    } 
                    RecordTable.addRow(columnData);  
                }
            }
            catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
            }
            ////////////////////////////////////////////////////////////////////
        }
            catch(SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        String passwd="";
        String user="root";
        String url="jdbc:mysql://localhost:3306/utilsateur";
        try{
            Connection con = DriverManager.getConnection(url,user,passwd);
            PreparedStatement pst = con.prepareStatement("SELECT référence,désignation,valeur_nutritionnelle,date_de_production,date_de_périmation,poids_net,dérivés,Qte,prix FROM produit WHERE référence=?");
            pst.setString(1,jTextField1.getText());
            ResultSet rs1 = pst.executeQuery();
            if(rs1.next()==false){
                JOptionPane.showMessageDialog(this,"");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField1.requestFocus();
            }
            else{
                jTextField2.setText(rs1.getString("désignation"));
                jTextField5.setText(rs1.getString("prix"));
                try{
                con = DriverManager.getConnection(url,user,passwd);
                pst =con.prepareStatement("select * from produit");
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
                int q = stData.getColumnCount();
                DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
                RecordTable.setRowCount(0);
                while(rs.next()){
                    Vector columnData = new Vector();
                    for(int i=1;i<q;i++){
                        columnData.add(rs.getString("référence"));
                        columnData.add(rs.getString("désignation"));
                        columnData.add(rs.getString("prix"));
                    } 
                    RecordTable.addRow(columnData);  
                }
                }
                catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        jTextField1.setText(RecordTable.getValueAt(SelectedRows,0).toString());
        jTextField2.setText(RecordTable.getValueAt(SelectedRows,1).toString());
        jTextField5.setText(RecordTable.getValueAt(SelectedRows,2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}