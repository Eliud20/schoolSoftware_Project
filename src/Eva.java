
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Eva extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form Eva
     */
    JLabel tit;
    JLabel pre1;
    JLabel pre2;
    JLabel pre3;
    JLabel pre4;
    JLabel pre5;
    JLabel pre6;
    JLabel pre7;
    JLabel pre8;
    JLabel pre9;
    JLabel pre10;
    JLabel pre11;
    JLabel pre12;
    
    JComboBox p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,profe;
    JButton btnagregar;
    JLabel d;
     String mod="";
    String pun []={"Seleccione una opción","Muy en desacuerdo","En desacuerdo","Indiferente","De acuerdo", "Muy de acuerdo"};
    
     Conectar con=new Conectar();
     Connection reg=con.conexion();
    public Eva() {
           super("Evaluacion Docente");
           initComponents(); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(950,670);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        this.getContentPane().setBackground(Color.getHSBColor(215,234,245));
        setVisible(false);
        verTabla();
        tit=new JLabel("Evaluación Docente");
        tit.setBounds(325,5,300,50);//x,y,ancho, alto
        tit.setFont(new Font("Tahoma",Font.BOLD,30));
        
        d=new JLabel("Seleccione al profesor que le hara evaluación docente");
        d.setBounds(25,60,700,20);//x,y,ancho, alto
        d.setFont(new Font("Tahoma",Font.BOLD,12));
        
        pre1=new JLabel("¿El profesor asistió puntalmente a la clase?");
        pre1.setBounds(25,220,300,20);//x,y,ancho, alto
        pre1.setFont(new Font("Tahoma",Font.BOLD,12));
        
        pre2=new JLabel("¿El profesor asistió a todas sus clases?");
        pre2.setBounds(25,250,300,20);//x,y,ancho, alto
        pre2.setFont(new Font("Tahoma",Font.BOLD,12));
        
        pre3=new JLabel("¿El profesor estableció los criterios de evaluación?");
        pre3.setBounds(25,280,400,20);//x,y,ancho, alto
        pre3.setFont(new Font("Tahoma",Font.BOLD,12));
        
        pre4=new JLabel("¿El profesor compartía los contenidos de la asignatura?");
        pre4.setBounds(25,310,400,20);//x,y,ancho, alto
        pre4.setFont(new Font("Tahoma",Font.BOLD,12));
        
        pre5=new JLabel("¿El profesor estableció fechas para la realización de las unidades?");
        pre5.setBounds(25,340,400,20);//x,y,ancho, alto
        pre5.setFont(new Font("Tahoma",Font.BOLD,12));
        
        pre6=new JLabel("¿El profesor fue claro al exponer los contenidos y respondía dudas?");
        pre6.setBounds(25,370,420,20);//x,y,ancho, alto
        pre6.setFont(new Font("Tahoma",Font.BOLD,12));
        
        pre7=new JLabel("¿El profesor domina los temas expuestos?");
        pre7.setBounds(25,400,400,20);//x,y,ancho, alto
        pre7.setFont(new Font("Tahoma",Font.BOLD,12));
        
        pre8=new JLabel("¿El profesor utiliza estrategias de enseñanza que estimula que los estudiantes participen?");
        pre8.setBounds(25,430,600,20);//x,y,ancho, alto
        pre8.setFont(new Font("Tahoma",Font.BOLD,12));
        
        pre9=new JLabel("¿El profesor hace uso de diferentes herramientas para la enseñanza (pizarrón, computadora, cañón, etc.)?");
        pre9.setBounds(25,460,650,20);//x,y,ancho, alto
        pre9.setFont(new Font("Tahoma",Font.BOLD,12));
        
        pre10=new JLabel("¿El profesor entrega en tiempo y forma las calificaciones?");
        pre10.setBounds(25,490,400,20);//x,y,ancho, alto
        pre10.setFont(new Font("Tahoma",Font.BOLD,12));
        
        pre11=new JLabel("¿El profesor consigue un ambiente de respeto en el aula?");
        pre11.setBounds(25,520,400,20);//x,y,ancho, alto
        pre11.setFont(new Font("Tahoma",Font.BOLD,12));
        
        pre12=new JLabel("¿El profesor demuestra interés por la enseñanza y que los alumnos aprendan?");
        pre12.setBounds(25,550,500,20);//x,y,ancho, alto
        pre12.setFont(new Font("Tahoma",Font.BOLD,12));
        
        p1=new JComboBox(pun);
        p1.setBounds(725,220, 200, 20);
        p1.setEditable(true);
        
        p2=new JComboBox(pun);
        p2.setBounds(725,250, 200, 20);
        p2.setEditable(true);
        
        p3=new JComboBox(pun);
        p3.setBounds(725,280, 200, 20);
        p3.setEditable(true);
        
        p4=new JComboBox(pun);
        p4.setBounds(725,310, 200, 20);
        p4.setEditable(true);
        
        p5=new JComboBox(pun);
        p5.setBounds(725,340, 200, 20);
        p5.setEditable(true);
        
        p6=new JComboBox(pun);
        p6.setBounds(725, 370, 200, 20);
        p6.setEditable(true);
        
        p7=new JComboBox(pun);
        p7.setBounds(725, 400, 200, 20);
        p7.setEditable(true);
        
        p8=new JComboBox(pun);
        p8.setBounds(725, 430, 200, 20);
        p8.setEditable(true);
        
        p9=new JComboBox(pun);
        p9.setBounds(725, 460, 200, 20);
        p9.setEditable(true);
        
        p10=new JComboBox(pun);
        p10.setBounds(725, 490, 200, 20);
        p10.setEditable(true);
        
        p11=new JComboBox(pun);
        p11.setBounds(725, 520, 200, 20);
        p11.setEditable(true);
        
        p12=new JComboBox(pun);
        p12.setBounds(725, 550, 200, 20);
        p12.setEditable(true);
        
        
        btnagregar=new JButton("Agregar");
        btnagregar.setBounds(425,600,100,30);//x,y,ancho, alto
        
        this.add(tit);
        this.add(pre1);
        this.add(pre2);
        this.add(pre3);
        this.add(pre4);
        this.add(pre5);
        this.add(pre6);
        this.add(pre7);
        this.add(pre8);
        this.add(pre9);
        this.add(pre10);
        this.add(pre11);
        this.add(pre12);
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.add(p6);
        this.add(p7);
        this.add(p8);
        this.add(p9);
        this.add(p10);
        this.add(p11);
        this.add(p12);
        this.add(btnagregar);
        this.add(d);
        
        btnagregar.addActionListener(this);

    }
    
        
     public void actionPerformed(ActionEvent ev){
         Object objeto=ev.getSource();
         
         if(objeto instanceof JButton){
                 int pr1=p1.getSelectedIndex();
                 int pr2=p2.getSelectedIndex();
                 int pr3=p3.getSelectedIndex();
                 int pr4=p4.getSelectedIndex();
                 int pr5=p5.getSelectedIndex();
                 int pr6=p6.getSelectedIndex();
                 int pr7=p7.getSelectedIndex();
                 int pr8=p8.getSelectedIndex();
                 int pr9=p9.getSelectedIndex();
                 int pr10=p10.getSelectedIndex();
                 int pr11=p11.getSelectedIndex();
                 int pr12=p12.getSelectedIndex();
                 
                 
                 
                 if(pr1==0 || pr2==0 || pr3==0 || pr4==0 || pr5==0 || pr6==0 || pr7==0 || pr8==0 || pr9==0 || pr10==0 || pr11==0 || pr12==0 ){
                     JOptionPane.showMessageDialog(null,"Seleccione una opción correcta");
                 }else{
                     try {
                         String sql="INSERT INTO evaluadoc (iddoc,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                         
                         PreparedStatement ps;
                         
                         ps = (PreparedStatement) reg.prepareStatement(sql);
                         ps.setString(1, mod);
                         ps.setString(2, String.valueOf(pr1));
                         ps.setString(3, String.valueOf(pr2));
                         ps.setString(4, String.valueOf(pr3));
                         ps.setString(5, String.valueOf(pr4));
                         ps.setString(6, String.valueOf(pr5));
                         ps.setString(7, String.valueOf(pr6));
                         ps.setString(8, String.valueOf(pr7));
                         ps.setString(9, String.valueOf(pr8));
                         ps.setString(10, String.valueOf(pr9));
                         ps.setString(11, String.valueOf(pr10));
                         ps.setString(12, String.valueOf(pr11));
                         ps.setString(13, String.valueOf(pr12));
                         ps.executeUpdate();
                         JOptionPane.showMessageDialog(null, "Evaluación Docente Guardada");
                         setVisible(false);
                     } catch (SQLException ex) {
                         Logger.getLogger(Eva.class.getName()).log(Level.SEVERE, null, ex);
                     }
          
                 }
                 
             
                 

     
     }
     }

     

    
    
    public void verTabla(){
         DefaultTableModel miModelo=new DefaultTableModel();
              miModelo.addColumn("IdDocente");
              miModelo.addColumn("Nombre");
              miModelo.addColumn("Apellido Paterno");
              miModelo.addColumn("Apellido Materno");
              miModelo.addColumn("Nivel");
              
              
              String []datos=new String[7];
              String  sql="SELECT * FROM Docentes";
              
                 try {
                 Statement sentencia= reg.createStatement();
                 ResultSet rs= sentencia.executeQuery(sql);
        
                 while (rs.next()) {

                     datos[0]=rs.getString(1);
                     datos[1]=rs.getString(4);
                     datos[2]=rs.getString(5);
                     datos[3]=rs.getString(6);
                     datos[4]=rs.getString(11);
                
                    if(datos[4].equals("2") || datos[4].equals("3")){
                        
                        if(datos[4].equals("2")){
                            datos[4]="Secundaria";
                        }
                        if(datos[4].equals("3")){
                            datos[4]="Preparatoria";
                        }
                        
                        
                        miModelo.addRow(datos);
                     }
              
                  }
                 
                 
                 
                  }catch (java.sql.SQLException ex) {
                Logger.getLogger(Eva.class.getName()).log(Level.SEVERE, null, ex);
                }
                 tabla.setModel(miModelo);
              
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        
        int seleccion=tabla.getSelectedRow();
        mod=tabla.getValueAt(seleccion,0).toString();
         System.out.println(mod);
                 
    }//GEN-LAST:event_tablaMouseClicked

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
            java.util.logging.Logger.getLogger(Eva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
