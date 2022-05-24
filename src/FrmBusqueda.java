

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class FrmBusqueda extends javax.swing.JFrame {
public static int opc; 
public static int opcion; 

int fila=-1;
      Conectar cone=new Conectar();
     Connection reg=cone.conexion();
    /** Creates new form FrmBusqueda */
    public FrmBusqueda() {
        // centrando el frmlogin
        this.setLocation(350, 0);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initComponents();
        this.getContentPane().setBackground(Color.decode("#D7EAF5"));
        jPanel1.setBackground(Color.decode("#D7EAF5"));
    }
public void buscar_editorial(){
    switch (opc) { 
        case 1:
//Buscar ciudades

  
    

Object[][] dtEdi;        
String[] columNames = {"Código","Nombre"};  
// se utiliza la funcion
dtEdi = getDatosE();
// se colocan los datos en la tabla
DefaultTableModel datos = new DefaultTableModel(dtEdi,columNames);                        
Tabla.setModel(datos);
break;
}    
}

public void buscar_autor(){
    switch (opc){ 
        case 2:
        

Object[][] dtAu;        
String[] columNames = {"Código","Nombre","Pais"};  
// se utiliza la funcion
dtAu = getDatosAu();
// se colocan los datos en la tabla
DefaultTableModel datos = new DefaultTableModel(dtAu,columNames);                        
Tabla.setModel(datos);
break;
    }
}
public void buscar_libro(){
    switch (opcion){ 
        case 1:
        

Object[][] dtlibr;        
String[] columNames = {"Código","Titulo","codEditorial","codAutor"};  
// se utiliza la funcion
dtlibr = getDatosL();
// se colocan los datos en la tabla
DefaultTableModel datos = new DefaultTableModel(dtlibr,columNames);                        
Tabla.setModel(datos);
break;
    }
}

public void buscar_Alumno(){
    switch (opcion){ 
        case 2:
        

Object[][] dtusr;        
String[] columNames = {"N. Control","Nombre","ApeliidoP","ApellidoP"};  
// se utiliza la funcion
dtusr = getDatosAu();
// se colocan los datos en la tabla
DefaultTableModel datos = new DefaultTableModel(dtusr,columNames);                        
Tabla.setModel(datos);
break;
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Salir"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// TODO add your handling code here:
    switch(opc){
        case 1:
            buscar_editorial();
        break;
        case 2:
            buscar_autor();
        break;
    }
    switch(opcion){
        case 1:
            buscar_libro();
        break;
        
        
    }
}//GEN-LAST:event_formWindowOpened

private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
// TODO add your handling code here:
switch(opc){
case 1:
fila = Tabla.rowAtPoint(evt.getPoint());                 
         if (fila > -1){                          
         FrmLibro.TxtCodeditorial.setText(String.valueOf(Tabla.getValueAt(fila, 0)));
         FrmLibro.Txtnombreeditorial.setText(String.valueOf(Tabla.getValueAt(fila, 1)));
         }
this.dispose();
break;
    case 2:
fila = Tabla.rowAtPoint(evt.getPoint());                 
         if (fila > -1){                          
         FrmLibro.Txtcodautor.setText(String.valueOf(Tabla.getValueAt(fila, 0)));
         FrmLibro.Txtnombreautor.setText(String.valueOf(Tabla.getValueAt(fila, 1)));
         }
this.dispose();
break;         
     }
switch(opcion){
case 1:
fila = Tabla.rowAtPoint(evt.getPoint());                 
         if (fila > -1){                          
         FrmTransaccion.Txtcodlibro.setText(String.valueOf(Tabla.getValueAt(fila, 0)));
         FrmTransaccion.Txtlibro.setText(String.valueOf(Tabla.getValueAt(fila, 1)));
         }
this.dispose();
break;
    case 2:
fila = Tabla.rowAtPoint(evt.getPoint());                 
         if (fila > -1){                          
         FrmTransaccion.Txtrutusu.setText(String.valueOf(Tabla.getValueAt(fila, 0)));
         FrmTransaccion.txtusuario.setText(String.valueOf(Tabla.getValueAt(fila, 1)));
         }
this.dispose();
break;         
 
     }
}//GEN-LAST:event_TablaMouseClicked

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    this.dispose();
    
}//GEN-LAST:event_jButton1ActionPerformed



 /*obtenemos todos los datos de la tabla*/
 public Object [][] getDatosE(){
      int x = 0;
      //obtenemos la cantidad de registros existentes en la tabla
      try{   
         
         PreparedStatement pstm = reg.prepareStatement("SELECT count(1) as total FROM editoriales ");
         ResultSet res = pstm.executeQuery();
         res.next();
         x = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
        
      }
      
    Object[][] s = new String[x][2];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
         
         PreparedStatement pstm = reg.prepareStatement("SELECT " +
            " cod_edit, editorial " +
            " FROM editoriales" +
            " ORDER BY cod_edit ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estCodigo = res.getString("cod_edit");
            String estEditorial = res.getString("editorial");
            s[i][0] = estCodigo;            
            s[i][1] = estEditorial;            
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
      
    return s;
 }

  public Object [][] getDatosAu(){
      int x = 0;
      //obtenemos la cantidad de registros existentes en la tabla
      try{       
          
         PreparedStatement pstm = reg.prepareStatement("SELECT count(1) as total FROM autores ");
         ResultSet res = pstm.executeQuery();
         res.next();
         x = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
         
      }
      
    Object[][] s = new String[x][3];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{ 
         
         PreparedStatement pstm = reg.prepareStatement("SELECT " +
            " cod_aut, aut_nombre, aut_pais " +
            " FROM autores" +
            " ORDER BY cod_aut ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estCodigo = res.getString("cod_aut");
            String estNombre = res.getString("aut_nombre");
            String estPais = res.getString("aut_pais");
            s[i][0] = estCodigo;            
            s[i][1] = estNombre;            
            s[i][2] = estPais;
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
      
    return s;
 }
  
  public Object [][] getDatosL(){
      int x = 0;
      //obtenemos la cantidad de registros existentes en la tabla
      try{     
         
         PreparedStatement pstm = reg.prepareStatement("SELECT count(1) as total FROM libros ");
         ResultSet res = pstm.executeQuery();
         res.next();
         x = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
         
      }
      
    Object[][] s = new String[x][4];  
    //realizamos la consulta sql y llenamos los datos en "Object"c
      try{    
         
         PreparedStatement pstm = reg.prepareStatement("SELECT " +
            " li.cod_lib, li.titulo, e.cod_edit, a.cod_aut " +
            " FROM libros li " +
            " LEFT JOIN editoriales e on  li.cod_edit = e.cod_edit "+
            " LEFT JOIN autores a on  li.cod_aut = a.cod_aut "+
            " ORDER BY li.cod_lib ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estCodigo = res.getString("li.cod_lib");
            String esttitulo = res.getString("li.titulo");
            String esteditorial = res.getString("e.cod_edit");
            String estautor = res.getString("a.cod_aut");
            s[i][0] = estCodigo;            
            s[i][1] = esttitulo;            
            s[i][2] = esteditorial;
            s[i][3] = estautor;
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
      
    return s;
 }
    
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBusqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
