import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Usuario extends JFrame implements ActionListener{
    int ganancias, total;
    JLabel lblbien;
    JLabel lblusu;
    JLabel  lblcon;
    JLabel seg;
    
    JTextField txtusu;
    JPasswordField con;
    JButton Ingresar;
    
       
     Conectar cone=new Conectar();
     Connection reg=cone.conexion();
    
    public Usuario(){
    super("Usuario");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(250,400);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        this.getContentPane().setBackground(Color.getHSBColor(215,234,245));
        
  
        
        //etiquetas
        lblbien=new JLabel("Bienvenido");
        lblbien.setBounds(25,5,200,50);//x,y,ancho, alto
        lblbien.setFont(new Font("arial",Font.PLAIN,40));
        
        //Usuario
        lblusu=new JLabel("Número de Control");
        lblusu.setBounds(10,170,150,30);//x,y,ancho, alto
        txtusu=new JTextField();
        txtusu.setBounds(10,200,200,30);//x,y,ancho, alto
        //Contraseña
        lblcon=new JLabel("NIP");
        lblcon.setBounds(10,230,100,30);//x,y,ancho, alto
        con=new JPasswordField();
        con.setBounds(10,260,200,30);//x,y,ancho, alto
        //boton ingreso
        Ingresar=new JButton("Ingresar");
        Ingresar.setBounds(75,320,100,30);//x,y,ancho, alto
        

        this.add(lblbien);
        this.add(lblusu);
        this.add(txtusu);
        this.add(lblcon);
        this.add(con);
        this.add(Ingresar);
        
        Ingresar.addActionListener(this);
        
        this.getContentPane().setBackground(Color.WHITE);
  
    }
    
         public void actionPerformed(ActionEvent ev){    
        //devuelve una referencia al objeto donde se genero el evento
       Object objeto=ev.getSource();
       String Usu, Con;
       if(objeto instanceof JButton){//si se pulso el boton
     
                Usu=txtusu.getText();
                int nc=Integer.parseInt(Usu);
                Con=con.getText();
       
                
                 String []datos=new String [3];
                 int x=0;
                 int z=100;
                 
                 String sql="SELECT * FROM Alumnos where numero_cont = '"+nc+"'";
                 try {
                 Statement sentencia=reg.createStatement();
                 ResultSet rs= sentencia.executeQuery(sql);                   
                 while(rs.next()){
                     datos[0]=rs.getString(1);
                     datos[1]=rs.getString(8);
                     datos[2]=rs.getString(9);
                     x=Integer.parseInt(datos[0]);
                     if(datos[1].equals("7") || datos[1].equals("8") || datos[1].equals("9") || datos[1].equals("10") 
                             || datos[1].equals("11") || datos[1].equals("12")){
                         if(datos[2].equals(Con)){
                             MenuP obj=new MenuP(nc,x);
                             obj.setVisible(true);
                             setVisible(false);
                         }else{
                             JOptionPane.showMessageDialog(null,"Número de Control y/o NIP Incorrectos");
                         }
                     }else{
                             if(datos[2].equals(Con)){
                             MenuPri obj=new MenuPri(nc,x);
                             obj.setVisible(true);
                             setVisible(false);
                         }else{
                             JOptionPane.showMessageDialog(null,"Número de Control y/o NIP Incorrectos");  
                             }
                     }

             
                 }
               
             } catch (SQLException ex) {
                 Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
             }
                 }
       
              
}
     
   
    public static void main(String[] args) {
        Usuario obj= new Usuario();
        obj.show();
                
    }

}
