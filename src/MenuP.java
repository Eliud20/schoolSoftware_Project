
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MenuP extends javax.swing.JFrame {

    /**
     * Creates new form MenuP
     */
    int num=0;
    int id=0;
    public MenuP(int nc,int x) {
        initComponents();
        setSize(595,610);
        setLocationRelativeTo(null);
        num=nc;
        id=x;
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
        btnQue = new javax.swing.JButton();
        btnEva = new javax.swing.JButton();
        btnHo = new javax.swing.JButton();
        btnCalen = new javax.swing.JButton();
        btnBi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCalif = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102), 4));
        jPanel1.setLayout(null);

        btnQue.setBackground(new java.awt.Color(255, 255, 255));
        btnQue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quejas.png"))); // NOI18N
        btnQue.setBorder(null);
        btnQue.setBorderPainted(false);
        btnQue.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Quejas1.png"))); // NOI18N
        btnQue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueActionPerformed(evt);
            }
        });
        jPanel1.add(btnQue);
        btnQue.setBounds(150, 430, 310, 50);

        btnEva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Evalua.png"))); // NOI18N
        btnEva.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Evalua1.png"))); // NOI18N
        btnEva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEva);
        btnEva.setBounds(150, 500, 310, 60);

        btnHo.setBackground(new java.awt.Color(255, 255, 255));
        btnHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hora.png"))); // NOI18N
        btnHo.setBorder(null);
        btnHo.setBorderPainted(false);
        btnHo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Hora1.png"))); // NOI18N
        btnHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoActionPerformed(evt);
            }
        });
        jPanel1.add(btnHo);
        btnHo.setBounds(150, 240, 310, 50);

        btnCalen.setBackground(new java.awt.Color(255, 255, 255));
        btnCalen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calen.png"))); // NOI18N
        btnCalen.setBorder(null);
        btnCalen.setBorderPainted(false);
        btnCalen.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Calen1.png"))); // NOI18N
        btnCalen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalenActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalen);
        btnCalen.setBounds(150, 300, 310, 50);

        btnBi.setBackground(new java.awt.Color(255, 255, 255));
        btnBi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblio.png"))); // NOI18N
        btnBi.setBorder(null);
        btnBi.setBorderPainted(false);
        btnBi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblio1.png"))); // NOI18N
        btnBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiActionPerformed(evt);
            }
        });
        jPanel1.add(btnBi);
        btnBi.setBounds(150, 360, 310, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Seleccione una opción:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 120, 220, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel2.setText("¡ B I E N V E N I D O  A L U M N O !");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 80, 430, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sep1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 10, 160, 60);

        btnCalif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calif.png"))); // NOI18N
        btnCalif.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Calif1.png"))); // NOI18N
        btnCalif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalifActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalif);
        btnCalif.setBounds(150, 170, 310, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaActionPerformed
        // TODO add your handling code here:
        Eva obj=new Eva();
            obj.setVisible(true);
    }//GEN-LAST:event_btnEvaActionPerformed

    private void btnQueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueActionPerformed
        // TODO add your handling code here:
        QuejSuger obj=new QuejSuger();
        obj.setVisible(true);
    }//GEN-LAST:event_btnQueActionPerformed

    private void btnCalenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalenActionPerformed
        // TODO add your handling code here:
        Calen obj=new Calen(num);
        obj.setVisible(true);
                
    }//GEN-LAST:event_btnCalenActionPerformed

    private void btnHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoActionPerformed
        try {
            // TODO add your handling code here:
            ConsultarHorario obj= new ConsultarHorario(id);
            obj.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHoActionPerformed

    private void btnCalifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalifActionPerformed
        // TODO add your handling code here:
        Calificaciones obj=new Calificaciones(num);
        obj.setVisible(true);
    }//GEN-LAST:event_btnCalifActionPerformed

    private void btnBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiActionPerformed
        // TODO add your handling code here:
        FrmPrincipal obj=new FrmPrincipal();
        obj.setVisible(true);
    }//GEN-LAST:event_btnBiActionPerformed

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
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuP().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBi;
    private javax.swing.JButton btnCalen;
    private javax.swing.JButton btnCalif;
    private javax.swing.JButton btnEva;
    private javax.swing.JButton btnHo;
    private javax.swing.JButton btnQue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
