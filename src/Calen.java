
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Calen extends javax.swing.JFrame {
    //Conectar
    Conectar con=new Conectar();
            Connection reg=con.conexion();
    
    int num=0;
            
    public Calen(int nc) {
        super("Calendario");
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(false);
        num=nc;
        
        verTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miPanel = new javax.swing.JPanel();
        boxDia = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        boxMes = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAn = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        miPanel.setBackground(new java.awt.Color(215, 234, 245));

        boxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4","5","6","7","8","9","10"
            ,"11","12","13","14","15","16","17","18","19","20"
            ,"21","22","23","24","25","26","27","28","29","30","31"}));
boxDia.setSelectedIndex(0);

jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/disquete (1).png"))); // NOI18N
jButton1.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
    }
    });

    boxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril",
        "Mayo","Junio","Julio","Agosto",
        "Septiembre","Octubre","Noviembre","Diciembre"}));
boxMes.setSelectedIndex(0);

jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actualizar (1).png"))); // NOI18N
jButton2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton2ActionPerformed(evt);
    }
    });

    jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel3.setText("Dia:");

    jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel6.setText("Descripción:");

    jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
    jLabel1.setText("Anuncios");

    txtAn.setColumns(20);
    txtAn.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
    txtAn.setRows(5);
    txtAn.setText("     *NOTICIAS DE ULTIMO MOMENTO*");
    txtAn.setEditable(false);
    jScrollPane1.setViewportView(txtAn);

    jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
    jLabel2.setText("Tareas Pendientes:");

    jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel4.setText("Mes:");

    miTabla = new JTable() {
        public boolean isCellEditable(int row,int columnn){
            for(int i=0;i<miTabla.getRowCount();i++){
                if(row == i){
                    return false;
                }
            }
            return true;
        }
    };
    miTabla.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {

        }
    ));
    miTabla.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            miTablaMouseClicked(evt);
        }
    });
    jScrollPane2.setViewportView(miTabla);

    javax.swing.GroupLayout miPanelLayout = new javax.swing.GroupLayout(miPanel);
    miPanel.setLayout(miPanelLayout);
    miPanelLayout.setHorizontalGroup(
        miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(miPanelLayout.createSequentialGroup()
            .addGap(44, 44, 44)
            .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(40, Short.MAX_VALUE))
        .addGroup(miPanelLayout.createSequentialGroup()
            .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(miPanelLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(miPanelLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel2))
                        .addComponent(jLabel6)
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(miPanelLayout.createSequentialGroup()
                            .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(boxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(26, 26, 26)
                            .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(boxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))))
                    .addGap(18, 42, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(14, 14, 14))
    );
    miPanelLayout.setVerticalGroup(
        miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(miPanelLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(miPanelLayout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(miPanelLayout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addGap(22, 22, 22))))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(miPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(miPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sql,dia,mes,desc;
        dia=boxDia.getSelectedItem().toString();
        mes=boxMes.getSelectedItem().toString().toUpperCase();
        desc=txtDesc.getText();
        //insertar en la tabla empleado (campos de la tabla)valores (variables)
        sql="INSERT INTO Tareas (idalumno,dia,mes,descripcion) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps= reg.prepareStatement(sql);
            ps.setInt(1,num);
            ps.setString(2, dia);
            ps.setString(3, mes);
            ps.setString(4,desc);
            ps.executeUpdate();
            verTabla();
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(Calen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void miTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miTablaMouseClicked
        if(evt.getClickCount() == 2){
            //JOptionPane.showMessageDialog(null, "Haz dado doble clic en la fila"+miTabla.getSelectedRow());
            int row = miTabla.getSelectedRow();
            int respuesta;
            String idTarea;
        respuesta=JOptionPane.showConfirmDialog(null, 
                "Se eliminra la tarea de pendientes. Desea Continuar?",
                "Tareas",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        
            if(respuesta == 0){
                idTarea=(String)miTabla.getValueAt(row, 0);
                try{
                    PreparedStatement ps= reg.prepareStatement("DELETE FROM Tareas WHERE idTarea='"+idTarea+"'");
                    ps.executeUpdate();
                    verTabla();
            
            }catch(SQLException ex){
                Logger.getLogger(Calen.class.getName()).log(Level.SEVERE,null,ex);
            }
                
            }
        }
    }//GEN-LAST:event_miTablaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        verTabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    void verTabla(){
        DefaultTableModel miModelo=new DefaultTableModel();
        //Titulo de las columnas
        miModelo.addColumn("idTarea");
        miModelo.addColumn("idAlumno");
        miModelo.addColumn("Dia");
        miModelo.addColumn("Mes");
        miModelo.addColumn("Descripción");
        miTabla.setModel(miModelo);
        //Arreglo para llenar la tabla
        String []datos=new String[5];

        String sql="SELECT * FROM Tareas";
        try {
        Statement sentencia= reg.createStatement();
        ResultSet rs= sentencia.executeQuery(sql);
        while (rs.next()) {
        datos[0]=rs.getString(1);//campos de la tabla de la base de datos
        datos[1]=rs.getString(2);
        datos[2]=rs.getString(3);
        datos[3]=rs.getString(4);
        datos[4]=rs.getString(5);
        miModelo.addRow(datos);
        }
        miTabla.setModel(miModelo);
        } catch (SQLException ex) {
        Logger.getLogger(Calen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void limpiar(){
        boxDia.setSelectedIndex(0);
        boxMes.setSelectedIndex(0);
        txtDesc.setText("");
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Calen().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxDia;
    private javax.swing.JComboBox<String> boxMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel miPanel;
    private javax.swing.JTable miTabla;
    public static javax.swing.JTextArea txtAn;
    private javax.swing.JTextField txtDesc;
    // End of variables declaration//GEN-END:variables
}
