

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import javax.swing.JFrame;

public class FrmTransaccion extends javax.swing.JFrame {
    int fila=-1;
    //Constructor de Clase
     
     Conectar cone=new Conectar();
     Connection reg=cone.conexion();
    /** Creates new form FrmTransacciones */
    
     public FrmTransaccion() {
         // centrando el frmlogin
this.setLocation(350, 0);
       
        initComponents();
         this.getContentPane().setBackground(Color.decode("#D7EAF5"));
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
     public void mostrartransacciones(){
        
        Object[][] dttra;        
        String[] columNames = {"Código","Fecha y Hora","nombre usuario","codRepuesto","rutUsuario"};  
        // se utiliza la funcion
        dttra = getDatosTra();
        // se colocan los datos en la tabla
        DefaultTableModel datos = new DefaultTableModel(dttra,columNames);                        
        jTable1.setModel(datos);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txtcodlibro = new javax.swing.JTextField();
        Txtrutusu = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Txtlibro = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("Nuevo"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Grabar"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Borrar"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Libro"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Usuario"); // NOI18N

        Txtrutusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtrutusuActionPerformed(evt);
            }
        });

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        jButton4.setText("Seleccionar"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Salir"); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton7.setText("Seleccionar"); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("hora y fecha");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Precio");

        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txtcodlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(Txtlibro, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txtrutusu, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addGap(53, 53, 53)
                                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(jButton4))
                        .addGap(127, 127, 127))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6)
                                    .addGap(97, 97, 97))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precio, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addGap(384, 384, 384))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Txtlibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7)
                            .addComponent(Txtcodlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Txtrutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton4)
                                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// TODO add your handling code here:
    mostrartransacciones();
}//GEN-LAST:event_formWindowOpened

private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
// TODO add your handling code here:
    fila = jTable1.rowAtPoint(evt.getPoint());                 
         if (fila > -1){                          
             jLabel5.setText(String.valueOf(jTable1.getValueAt(fila, 1)));
              precio.setText(String.valueOf(jTable1.getValueAt(fila, 2)));
             Txtrutusu.setText(String.valueOf(jTable1.getValueAt(fila, 3)));
            Txtcodlibro.setText(String.valueOf(jTable1.getValueAt(fila, 4)));
         }
}//GEN-LAST:event_jTable1MouseClicked

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
         new FrmBusqueda().setVisible(true);
    FrmBusqueda.opcion = 2;

}//GEN-LAST:event_jButton4ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
        
        Txtcodlibro.setText("");
        Txtlibro.setText("");
        Txtrutusu.setText("");                                        
        txtusuario.setText("");
        precio.setText("");
        Txtcodlibro.grabFocus();
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
        String Campo1, Campo2, Campo3, Campo4;                                         
        Campo1=jLabel5.getText();
        Campo2=txtusuario.getText();
        Campo3=Txtcodlibro.getText();
        Campo4=Txtrutusu.getText();
        NuevaTransaccion(Campo1, Campo2, Campo3, Campo4);
        mostrartransacciones();
   JOptionPane.showMessageDialog(rootPane,"se ha realizado con exito la transaccion");
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
    if (fila > -1){
            String codigo = String.valueOf(jTable1.getValueAt(fila, 0));                        
            eliminartransaccion(codigo);
            mostrartransacciones();
            fila=-1;
        }
   JOptionPane.showMessageDialog(rootPane,"la Transaccion ha sido Borrada");
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    // TODO add your handling code here:
    this.dispose();
    new FrmPrincipal().setVisible(true);
}//GEN-LAST:event_jButton6ActionPerformed

private void TxtrutusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtrutusuActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_TxtrutusuActionPerformed

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    // TODO add your handling code here:
     new FrmBusqueda().setVisible(true);
    FrmBusqueda.opcion = 1;
   
    
}//GEN-LAST:event_jButton7ActionPerformed

private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    // TODO add your handling code here:
    Calendar Cal= Calendar.getInstance();
        String fecha= Cal.get (Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+ "/"+Cal.get(Cal.YEAR)+"    "+Cal.get(Cal.HOUR_OF_DAY)+ ":"+Cal.get(Cal.MINUTE);
        jLabel5.setText(fecha);
}//GEN-LAST:event_formWindowActivated

private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_precioActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed
    
       public void NuevaTransaccion(String fecha, String diasprestamo, String codigo_libro, String rut_usuario ){
       try {    
          
            PreparedStatement pstm = reg.prepareStatement("insert into " + 
                    "transacciones(fecha, diasprestamo, cod_lib, usu_rut) " +
                    " values(?,?,?,?)");            
            pstm.setString(1, fecha);
            pstm.setString(2, diasprestamo);
            pstm.setString(3, codigo_libro);
            pstm.setString(4, rut_usuario);
            
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
       
   }

 /*obtenemos todos los datos de la tabla*/
 public Object [][] getDatosTra(){
      int x = 0;
      //obtenemos la cantidad de registros existentes en la tabla
      try{     
          
         PreparedStatement pstm = reg.prepareStatement("SELECT count(1) as total FROM transacciones ");
         ResultSet res = pstm.executeQuery();
         res.next();
         x = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
         
      }
      
    Object[][] s = new String[x][5];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{   
          
         PreparedStatement pstm = reg.prepareStatement("SELECT " +
            " tra.cod_trans, tra.fecha, tra.diasprestamo, li.cod_lib, usu.usu_rut  " +
            " FROM transacciones tra " +
            " LEFT JOIN libros li on  tra.cod_lib = li.cod_lib " +
            " LEFT JOIN usuarios usu on  tra.usu_rut = usu.usu_rut" +
            " ORDER BY tra.cod_trans  ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estcodigo = res.getString("tra.cod_trans");
            String estfecha = res.getString("tra.fecha");
            String estdiasp = res.getString("tra.diasprestamo");
            String estlibro = res.getString("li.cod_lib");
            String estusuario = res.getString("usu.usu_rut");
            
            s[i][0] = estcodigo;            
            s[i][1] = estfecha;    
            s[i][2] = estdiasp;
            s[i][3] = estlibro;
            s[i][4] = estusuario;
            
            i++;

         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
      
    return s;
 }
 
//Eliminar Ciudad
public void eliminartransaccion(String cod){  
            try {         
               
                PreparedStatement aaa = reg.prepareStatement("delete from transacciones where cod_trans = ?");            
                aaa.setString(1, cod);
               aaa.execute();
                aaa.close();            
            }catch(SQLException e){
            System.out.println(e);
            }  
            
   }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTransaccion().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Txtcodlibro;
    public static javax.swing.JTextField Txtlibro;
    public static javax.swing.JTextField Txtrutusu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField precio;
    public static javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
    
}
