

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Calificaciones extends javax.swing.JFrame {

        Conectar con = new Conectar();
        Connection reg = con.conexion();
        
        
    public Calificaciones(int nc) {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(false);
        tabla(nc);
    }
    
    public void tabla(int nc){
        
        //Variables temporales para almacenar parametros para consultas sql
        /* 1. Sacar el idalumno en base al numero de control
           2. Sacar la calificacion en base al idalumno
           3. Sacar los periodos en base al idperiodo*/
        
        int numero_cont = nc, idalumno = 0;
        int idmateria[] = new int[30]; 
        int inicio = 0;
        String nom = "";
        Object materias[] = new Object [7];
        lblNC.setText(String.valueOf(numero_cont));
        
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("         Materia");
        modelo.addColumn("                1");
        modelo.addColumn("                2");
        modelo.addColumn("                3");
        modelo.addColumn("                4");
        modelo.addColumn("                5");
        
         
        String sqlF, sql1, sql2,  sql3;
        
        //Consulta que saca el id en base al numero de control y de ahi se despliegan las demas consultas
        sql1 = "select idalumno from Alumnos where numero_cont = '" + numero_cont +"'"; 
        
        try {
                 Statement sentencia= reg.createStatement();
                 ResultSet rs= sentencia.executeQuery(sql1);
        
                 while (rs.next()) {
                     
                     idalumno = rs.getInt(1);
               
                  }
                  }catch (SQLException ex) {
                Logger.getLogger(Calificaciones.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
        //Consulta que concatena los valores los campos de Alumnos y se guardan en la variable para mostrar
        //el nombre
        sql3 = "SELECT concat_ws(' ', nombres, apellido_pat, apellido_mat) as Alumno FROM Alumnos "
                + "where Alumnos.idalumno = '" + idalumno + "'"; 
        
        try {
                 Statement sentencia= reg.createStatement();
                 ResultSet rs= sentencia.executeQuery(sql3);
        
                 while (rs.next()) {
                     
                     nom = rs.getString(1);
               
                  }
                    lblNom.setText(nom);
                  }catch (SQLException ex) {
                Logger.getLogger(Calificaciones.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        //Consulta que almacena dentro de un vector las id de las materias que se usan para sacar el nombre
        //y la calificacion
        sql2 = "select idmateria from calificacion where idalumno = '" + idalumno + "' order by idmateria";
        
        try {
                 Statement sentencia= reg.createStatement();
                 ResultSet rs= sentencia.executeQuery(sql2);
                 int i = 0;
                 while (rs.next()) {
                     idmateria[i] = rs.getInt(1);
                     i++;
                     
                  }
                  }catch (SQLException ex) {
                Logger.getLogger(Calificaciones.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        idmateria = repetidos(idmateria);
        
        for(int w = 0; w < idmateria.length; w++){
            
            if (idmateria[w] > 0){
                inicio = w;
                break;
            }
        }
        
        /* Consultas anidadas que muestran:
            * el nombre de la materia usando el idmateria
            * la calificacion de cada periodo utilizando el idalumno y el idmateria
        
           Nota: La longitud del vector es la cantidad de materias que se repiten por periodo (5 periodos * 6 materias)
                 y el programa busca la posicion a partir de la cual se dejan de almacenar 0's (ver metodo repetidos)
                 e ingresa esa posicion para comenzar a buscar en las consultas
          */
        for (int i = inicio + 1; i <= 30; i++){
            
     sqlF = "select materias.nombre, "
             + "(select calificacion from calificacion where IdPeriodo = 1 and idalumno = '"+ idalumno +"' and idmateria = '"+ idmateria[i-1] +"') as Bi1, "
             + "(select calificacion from calificacion where IdPeriodo = 2 and idalumno = '"+ idalumno +"' and idmateria = '"+ idmateria[i-1] +"') as Bi2, "
             + "(select calificacion from calificacion where IdPeriodo = 3 and idalumno = '"+ idalumno +"' and idmateria = '"+ idmateria[i-1] +"') as Bi3, "
             + "(select calificacion from calificacion where IdPeriodo = 4 and idalumno = '"+ idalumno +"' and idmateria = '"+ idmateria[i-1] +"') as Bi4, "
             + "(select calificacion from calificacion where IdPeriodo = 5 and idalumno = '"+ idalumno +"' and idmateria = '"+ idmateria[i-1] +"') as Bi5 "
             + "from materias, calificacion, Alumnos "
             + "where materias.idmateria = '"+ idmateria[i - 1] +"' and calificacion.idmateria = '"+ idmateria[i - 1] +"' "
             + "and calificacion.idalumno = '"+ idalumno +"' and Alumnos.idalumno = '"+ idalumno +"'";
             
        try {
                 Statement sentencia= reg.createStatement();
                 ResultSet rs= sentencia.executeQuery(sqlF);
                 while (rs.next()) {
                     
                    
                     materias[0] = rs.getString(1);
                     materias[1] = rs.getInt(2);
                     materias[2] = rs.getInt(3);
                     materias[3] = rs.getInt(4);
                     materias[4] = rs.getInt(5);
                     materias[5] = rs.getInt(6);
                     
                     
                  }
                 modelo.addRow(materias);
                 tab.setModel(modelo);
                 
                  }catch (SQLException ex) {
                Logger.getLogger(Calificaciones.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
        }
    }
    
public int[] burbuja(int[] matrix){
        int temp;
        
        for(int i=1; i <= 11; i++){
            
            for (int j=0 ; j < matrix.length- 1; j++){
                
                if (matrix[j] > matrix[j+1]){
                    
                    temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = temp;
                    
                }
            }
        }
        return matrix;
    }

//Metodo que sustituye los numeros repetidos y los ordena, los numeros repetidos reemplazados por 0's
public int[] repetidos(int[] vec){
    for (int i = 0; i < vec.length; i++){
        
        for (int j = 0; j< vec.length; j++){
            
            if (i != j){
                
               if (vec[i] == vec[j]){
                   vec[i] = 0;
               }
            }
        }
    }
    
    vec = burbuja(vec);
    
    for(int next: vec){
        System.out.println("or" + next);
    }
    return vec;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        btnReg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNom = new javax.swing.JLabel();
        lblNC = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(215, 234, 245));
        setForeground(new java.awt.Color(215, 234, 245));

        jPanel1.setBackground(new java.awt.Color(215, 234, 245));

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tab.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tab);

        btnReg.setBackground(new java.awt.Color(215, 234, 245));
        btnReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WhatsApp Image 2021-05-24 at 6.10.02 PM.jpeg"))); // NOI18N
        btnReg.setBorderPainted(false);
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Calificaciones");

        jLabel2.setText("Alumno:");

        jLabel3.setText("Numero de control:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lblNC, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(lblNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnRegActionPerformed

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
            java.util.logging.Logger.getLogger(Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Calificaciones().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNC;
    private javax.swing.JLabel lblNom;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables
}
