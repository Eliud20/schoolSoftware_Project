/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Container;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alex_
 */
public class ConsultarHorario extends javax.swing.JFrame {
            public static DefaultTableModel xd=new DefaultTableModel();
         
    
    /**
     * Creates new form NewJFrame
     */
    public ConsultarHorario(int id) throws SQLException {
        initComponents();
        setVisible(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jLabel2.setText("<html> Nombre del Alumno:"+"    "+" <br> Grado:      "+"    "+" Grupo:    "+"    "+" <br> Periodo Escolar:"+"   </html>");
         String[] Columnas=
        {"Materia","Lunes","Martes","Miercoles","Jueves","Viernes"};
         xd.setColumnIdentifiers(Columnas);
        Container c=this.getContentPane();
        c.setBackground(Color.decode("#D7EAF5"));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.setDefaultEditor(Object.class, null);
        Conectar cn=new Conectar();
        String Nombre="",apellidop="",apellidom="",idgrado="",Grado="",Grupo="";
        String[] Materias=new String[6];
        String[]HoraInicio=new String[6];
        String[]HoraFin=new String[6];
        String query="SELECT * from Alumnos WHERE idalumno="+id;
        
        Statement st=cn.conexion().createStatement();
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
         Nombre=rs.getString("nombres");
         apellidop=rs.getString("apellido_pat");
         apellidom=rs.getString("apellido_mat");
         idgrado=rs.getString("IdGrado");
        }
        Nombre=Nombre+" "+apellidop+" "+apellidom;
        String query1="SELECT Grado from Grados WHERE IdGrado="+idgrado;
        rs=st.executeQuery(query1);
        while(rs.next())
        {
        Grado=rs.getString("Grado");
        
        }
         String query2="Select nombre from Grupos Where idgrupo in(SELECT idGrupo from alumnosGrupo WHERE idAlumno="+id+")";
        rs=st.executeQuery(query2);
        while(rs.next())
        {
        Grupo=rs.getString("nombre");
        
        }
        String query3="Select * from materias Where idMateria in(Select idmateria from Horario Where idGrado="+idgrado+")";
        rs=st.executeQuery(query3);
        int x=0;
        while(rs.next())
        {
        Materias[x]=rs.getString("nombre");
       x++;
        }
        String query4="SELECT * from Horario Where idgrado="+idgrado;
        rs=st.executeQuery(query4);
        int H=0;
        while(rs.next())
        {
        HoraInicio[H]=rs.getString("horainicio");
        HoraFin[H]=rs.getString("horafin");
       H++;
        }
        
        DatosAlumno(Nombre, Grado, Grupo, "2020-2021");
        for(int i=0;i<=Materias.length-1;i++)
        {
        String Hor=HoraInicio[i]+"-"+HoraFin[i];
        LlenarTabla(Materias[i], Hor, Hor,Hor, Hor, Hor);
        }
    }
 public  void DatosAlumno(String Nombre,String Grado,String Grupo,String PeriodoEscolar)
    {
    this.jLabel2.setText("<html> Nombre del Alumno:   "+Nombre+"<br> Grado:  "+Grado+"         Grupo:  "+Grupo+" <br>      Periodo Escolar:  "+PeriodoEscolar+"</html>");
    
    }
    public void LlenarTabla(String Materia,String HorarioL,String HorarioM,String HorarioMi,String HorarioJ,String HorarioV)
    {
      

        String[]Materias={Materia,HorarioL,HorarioM,HorarioMi,HorarioJ,HorarioV};
  
    xd.addRow(Materias);
    xd.fireTableDataChanged();
    jTable2.setModel(xd);
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Consulta de Horarios");

        jTable2.setBackground(new java.awt.Color(215, 234, 245));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(130, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(89, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ConsultarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}