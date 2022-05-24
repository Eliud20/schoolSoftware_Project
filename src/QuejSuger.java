

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuejSuger extends javax.swing.JFrame {

    private static Connection con;
    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    String numCtrl = "";

    public QuejSuger() {
        initComponents();
        conector();
        txtEspecif.setVisible(false);
        btnDebug.setVisible(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /*
        persona a quien va dirigida (tipo de usuario), motivo, fecha del evento, num para contactar al alumno
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lbSelec = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txTexto = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        btnDebug = new javax.swing.JButton();
        cbOpc = new javax.swing.JComboBox<>();
        lbPersona = new javax.swing.JLabel();
        txPersona = new javax.swing.JTextField();
        lbFecha = new javax.swing.JLabel();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        cbAño = new javax.swing.JComboBox<>();
        lbRedacte = new javax.swing.JLabel();
        lbMotivo = new javax.swing.JLabel();
        lbNumCont = new javax.swing.JLabel();
        txNumCont = new javax.swing.JTextField();
        cbMotivo = new javax.swing.JComboBox<>();
        lbEspecif = new javax.swing.JLabel();
        txtEspecif = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quejas y Sugerencias");
        setBackground(new java.awt.Color(200, 238, 238));
        setLocation(new java.awt.Point(25, 25));

        panel.setBackground(new java.awt.Color(215, 234, 245));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSelec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSelec.setText("Tipo:");
        panel.add(lbSelec, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, 40, -1));

        txTexto.setColumns(20);
        txTexto.setRows(5);
        txTexto.setToolTipText("Redacte la respectiva");
        jScrollPane1.setViewportView(txTexto);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 124, 580, 120));

        btnEnviar.setBackground(new java.awt.Color(215, 234, 245));
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono guardar.png"))); // NOI18N
        btnEnviar.setToolTipText("Envíe los datos");
        btnEnviar.setBorder(null);
        btnEnviar.setPreferredSize(new java.awt.Dimension(150, 50));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        panel.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 262, 90, -1));

        btnDebug.setText("debug");
        btnDebug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDebugActionPerformed(evt);
            }
        });
        panel.add(btnDebug, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, -1, -1));

        cbOpc.setBackground(new java.awt.Color(153, 197, 255));
        cbOpc.setForeground(new java.awt.Color(255, 255, 255));
        cbOpc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una opción", "Queja", "Sugerencia"}));
        cbOpc.setToolTipText("Seleccione");
        cbOpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOpcActionPerformed(evt);
            }
        });
        panel.add(cbOpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 11, 150, -1));

        lbPersona.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPersona.setText("Persona adjudicada:");
        panel.add(lbPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 14, -1, -1));

        txPersona.setToolTipText("Persona a la que se adjudica");
        txPersona.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel.add(txPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 12, 125, -1));

        lbFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbFecha.setText("Fecha del evento:");
        panel.add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 14, -1, -1));

        cbDia.setBackground(new java.awt.Color(153, 197, 255));
        cbDia.setForeground(new java.awt.Color(255, 255, 255));
        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Día", "01", "02", "03", "04" ,"05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21"
            ,"22","23","24","25","26","27","28","29","30","31"}));
cbDia.setToolTipText("Seleccione el día");
cbDia.setAutoscrolls(true);
cbDia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
cbDia.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
panel.add(cbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 11, 50, -1));

cbMes.setBackground(new java.awt.Color(153, 197, 255));
cbMes.setForeground(new java.awt.Color(255, 255, 255));
cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
cbMes.setToolTipText("Seleccione el mes");
cbMes.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbMesActionPerformed(evt);
    }
    });
    panel.add(cbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 11, 50, -1));

    cbAño.setBackground(new java.awt.Color(153, 197, 255));
    cbAño.setForeground(new java.awt.Color(255, 255, 255));
    cbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008"
        + "2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991","1990","1989","1988","1987","1986","1985","1984"
        + "1983","1982","1981","1980","1979","1978","1977","1976","1975","1974","1973","1972","1971","1970" }));
cbAño.setToolTipText("Seleccione el año");
cbAño.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
    cbAñoActionPerformed(evt);
    }
    });
    panel.add(cbAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 11, 60, -1));

    lbRedacte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    panel.add(lbRedacte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, 194, 26));

    lbMotivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    lbMotivo.setText("Motivo:");
    panel.add(lbMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 55, -1, -1));

    lbNumCont.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    lbNumCont.setText("Número de contacto:");
    panel.add(lbNumCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 55, -1, -1));

    txNumCont.setToolTipText("Número de contacto del alumno");
    txNumCont.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    panel.add(txNumCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 53, 119, -1));

    cbMotivo.setBackground(new java.awt.Color(153, 197, 255));
    cbMotivo.setForeground(new java.awt.Color(255, 255, 255));
    cbMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
    cbMotivo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cbMotivoActionPerformed(evt);
        }
    });
    panel.add(cbMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 52, 180, -1));

    lbEspecif.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    panel.add(lbEspecif, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 51, 80, 22));

    txtEspecif.setToolTipText("Indique el motivo");
    txtEspecif.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    panel.add(txtEspecif, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 53, 150, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void conector() { //Conector para la base de datos de quejas y sugerencias del alumno
        con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/quejsug", "root", "P4ssw0rd12345"); //url (quejsug es el nombre de la BD), usuario, contraseña
            con = (Connection) DriverManager.getConnection("jdbc:mysql://b2wq6mcfp7p3rv0v2suv-mysql.services.clever-cloud.com:3306/b2wq6mcfp7p3rv0v2suv",
                    "unngd71jb8olwnlq", "098t79cXF7hDchnE3vQb");
            if (con != null) { //Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
                System.out.println("Conexión establecida");
            }
        } catch (ClassNotFoundException | SQLException e) { //Si la conexion NO fue exitosa mostramos un mensaje de error
            System.out.println("Error de conexión " + e);
        }
    }

    public void insertar(String nC, String numContacto, Object tipo, Object motivo, String texto, String persAdj, String fecha) { //Método de insertar a la tabla 
        String tip = tipo.toString().toUpperCase();
        String moti = motivo.toString().toUpperCase();
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO QuejSuger (Departamento, NumCtrl, NumContacto, Tipo, Motivo, Texto, PersonaAdjudicada, Fecha)"
                    + "VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1, "ALUMNOS");
            ps.setString(2, nC);
            ps.setString(3, numContacto);
            ps.setString(4, tip);
            ps.setString(5, moti);
            ps.setString(6, texto);
            ps.setString(7, persAdj);
            ps.setString(8, fecha);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error en la ejecución de la sentencia");
            Logger.getLogger(QuejSuger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setNumCtrl(String num) {
        this.numCtrl = num;
    }

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (cbOpc.getSelectedIndex() == 0) { //Si el combo box indica la primera opción "Elija...", no lo hace válido
            JOptionPane.showMessageDialog(null, "Seleccione una opción.");
            txTexto.setText("");
        } else {
            String numContacto = txNumCont.getText().toUpperCase();
            Object tipo = cbOpc.getSelectedItem();
            Object motivo;
            if (cbMotivo.getSelectedIndex() == cbMotivo.getItemCount() - 1) {
                motivo = txtEspecif.getText();
            } else {
                motivo = cbMotivo.getSelectedItem();
            }
            String texto = txTexto.getText().toUpperCase();
            String persAdj = txPersona.getText().toUpperCase();
            System.out.println(persAdj);

            if (cbDia.getSelectedIndex() <= 0 || cbMes.getSelectedIndex() <= 0 || cbAño.getSelectedIndex() <= 0) {
                JOptionPane.showMessageDialog(null, "Seleccione la fecha especificada");

            } else {
                String fecha = cbDia.getSelectedItem() + "/" + meses[cbMes.getSelectedIndex() - 1] + "/" + cbAño.getSelectedItem();

                if (numContacto.isEmpty()|| cbMotivo.getSelectedIndex() == 0 || texto.isEmpty()|| persAdj.isEmpty()|| fecha.isEmpty()) { //Si los campos están en blanco o no son válidos
                    JOptionPane.showMessageDialog(null, "Rellene los respectivos recuadros.");

                } else {
                    try {
                        insertar(numCtrl, numContacto, tipo, motivo, texto, persAdj, fecha); //Se envía el número de control (escrito en string), el tipo y el texto
// Se espera que el numero de control se tome desde el inicio de sesión del alumno EJ: insertar(classAlum.getNumCtrl().toString(), numContacto, tipo, motivo, texto, persAdj, fecha);
                        JOptionPane.showMessageDialog(null, cbOpc.getSelectedItem() + " enviada con éxito!");

                        txNumCont.setText("");
                        cbOpc.setSelectedIndex(0);
                        cbMotivo.setSelectedIndex(0);
                        txtEspecif.setText("");
                        txTexto.setText("");
                        txPersona.setText("");
                        cbDia.setSelectedIndex(0);
                        cbMes.setSelectedIndex(0);
                        cbAño.setSelectedIndex(0);

                    } catch (java.lang.RuntimeException e) {
                        System.out.println("Error, no se puede compilar el código");
                        //Seguramente sea porque el número de control insertado no es admitido
                    }
                }
            }
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnDebugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDebugActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        String[] dato = new String[9];

        model.addColumn("Número de queja");
        model.addColumn("Departamento");
        model.addColumn("Número de control");
        model.addColumn("Número de contacto");
        model.addColumn("Tipo");
        model.addColumn("Motivo");
        model.addColumn("Texto");
        model.addColumn("Persona adjudicada");
        model.addColumn("Fecha del evento");

        try {
            Statement sentencia = con.createStatement();
            String consulta = "SELECT * FROM QuejSuger";
            ResultSet rs = sentencia.executeQuery(consulta);

            while (rs.next()) {
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                dato[4] = rs.getString(5);
                dato[5] = rs.getString(6);
                dato[6] = rs.getString(7);
                dato[7] = rs.getString(8);
                dato[8] = rs.getString(9);

                model.addRow(dato);
            }

        } catch (SQLException ex) {
            Logger.getLogger(QuejSuger.class.getName()).log(Level.SEVERE, null, ex);
        }

        tabla table = new tabla();
        table.verTabla(model);
        table.setVisible(true);
    }//GEN-LAST:event_btnDebugActionPerformed

    private void cbOpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpcActionPerformed
        int x = cbOpc.getSelectedIndex();
        if (x == 0) { //Opción "Redacte..."
            lbRedacte.setText("");
            cbMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{""}));;
            lbEspecif.setText("");
            txtEspecif.setVisible(false);
            txtEspecif.setText("");
        } else if (x == 1) { //Opción de queja
            lbRedacte.setText("Redacte la queja");
            cbMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Seleccione el motivo", "Queja hacia alumno", "Ser víctima de bullying", "Queja hacia maestro",
                "Calificación mal puesta", "Acoso", "Otro (Especifíque)"}));
        } else { //Opción de sugerencia
            lbRedacte.setText("Redacte la sugerencia");
            cbMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Seleccione el motivo", "Sugerir alguna actividad", "Sugerir algo de una clase",
                "", "Otro (Especifíque)"}));
        }
    }//GEN-LAST:event_cbOpcActionPerformed

    private void cbAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAñoActionPerformed
        Object x = cbAño.getSelectedItem();
        int y = cbMes.getSelectedIndex();
        if (x == "2021") {
            cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Mes", "01", "02", "03", "04", "05"}));
            if (y <= 5){
                cbMes.setSelectedIndex(y);
            } else {
                cbMes.setSelectedIndex(0);
            }
        } else {
            cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Mes", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
            cbMes.setSelectedIndex(y);
        }
    }//GEN-LAST:event_cbAñoActionPerformed

    private void cbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMesActionPerformed
        int x = cbMes.getSelectedIndex();
        int y = cbDia.getSelectedIndex();
        if (x == 2) {
            cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Día", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"}));
            if (y <= 28){
                cbDia.setSelectedIndex(y);
            } else {
                cbDia.setSelectedIndex(0);
            }
        } else if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
            cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Día", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
            if (y <= 30){
                cbDia.setSelectedIndex(y);
            } else {
                cbDia.setSelectedIndex(0);
            }
        } else if (x == 4 || x == 6 || x == 9 || x == 11) {
            cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Día", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
            if (y <= 31){
                cbDia.setSelectedIndex(y);
            }
        } else if (x == 0){
            cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Día", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
            cbDia.setSelectedIndex(0);
        }
    }//GEN-LAST:event_cbMesActionPerformed

    private void cbMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotivoActionPerformed
        int x = cbMotivo.getSelectedIndex(), y = cbMotivo.getItemCount() - 1;
        System.out.println("X: " + x + "; Y: " + y);
        if (y > 0) {
            if (x == y) {
                lbEspecif.setText("Especifíque:");
                txtEspecif.setVisible(true);
            } else {
                lbEspecif.setText("");
                txtEspecif.setText("");
                txtEspecif.setVisible(false);
            }
        }
    }//GEN-LAST:event_cbMotivoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuejSuger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDebug;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox<String> cbAño;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbMotivo;
    private javax.swing.JComboBox<String> cbOpc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEspecif;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbMotivo;
    private javax.swing.JLabel lbNumCont;
    private javax.swing.JLabel lbPersona;
    private javax.swing.JLabel lbRedacte;
    private javax.swing.JLabel lbSelec;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txNumCont;
    private javax.swing.JTextField txPersona;
    private javax.swing.JTextArea txTexto;
    private javax.swing.JTextField txtEspecif;
    // End of variables declaration//GEN-END:variables
}
