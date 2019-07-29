/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.sun.crypto.provider.DESCipher;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author edwin
 */
public class Facturacion extends JFrame implements ActionListener {
    private JTextField tnombreCli;
    private JTextField txtRuc;
    private JTextField direccion;
    private JTextField fecha;
    private JTextField telefono;
    private JTextField cantidad;
    private JTextField descripcion;
    private JTextField valorUni;
    private JTextField valorTotal;
    private JTextField total;
    private JCheckBox c1,c2,c3;
    private JTable tablafacura;
    public Facturacion(){
        initcomponents();
    }
    
    public void initcomponents(){
    this.setSize(1150,700);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Libreria Marquez");

    Container cp= getContentPane();
    BorderLayout layout=new BorderLayout();
    cp.setLayout(layout);
  
   JPanel registro=new JPanel();
   registro.setLayout(new GridBagLayout());
   
    GridBagConstraints gb =new GridBagConstraints();
    gb.gridx=1;
    gb.gridy=0;
    registro.add(new JLabel("                                          PEDRO ORELLANA-EDWIN MARQUEZ-CUÑADO "), gb);
    
    gb =new GridBagConstraints();
    gb.gridx=0;
    gb.gridy=1;
    registro.add(new JLabel("   "), gb);
    
    gb =new GridBagConstraints();
    gb.gridx=0;
    gb.gridy=2;
    registro.add(new JLabel("Dir.: s/n (Cuenca-Ecuador) "), gb);
    
    gb =new GridBagConstraints();
    gb.gridx=0;
    gb.gridy=3;
    registro.add(new JLabel("R.u.c:0302127022001 "), gb);
    
    gb =new GridBagConstraints();
    gb.gridx=0;
    gb.gridy=4;
    registro.add(new JLabel("Aut.SRI.: 1123368257"), gb);
    
    gb =new GridBagConstraints();
    gb.gridx=0;
    gb.gridy=5;
    registro.add(new JLabel("  "), gb);
    
    gb =new GridBagConstraints();
    gb.gridx=0;
    gb.gridy=6;
    registro.add(new JLabel("  "), gb);
    
    gb =new GridBagConstraints();
    gb.gridx=0;
    gb.gridy=7;
    registro.add(new JLabel("Cliente: "), gb);
    
   gb =new GridBagConstraints();
    gb.gridx=1;
    gb.gridy=7;
    gb.fill=2;
    tnombreCli = new JTextField(10);
    registro.add(tnombreCli, gb);
    
    gb =new GridBagConstraints();
    gb.gridx=0;
    gb.gridy=8;
    registro.add(new JLabel("R.U.C./C.I.:"), gb);
      
    
    gb =new GridBagConstraints();
    gb.gridx=1;
    gb.gridy=8;
    gb.fill=2;
    txtRuc = new JTextField(10);
    registro.add(txtRuc, gb);
   
    

    
    
    gb =new GridBagConstraints();
    gb.gridx=0;
    gb.gridy=9;
    registro.add(new JLabel("Direccion: "), gb);
    
    gb =new GridBagConstraints();
    gb.gridx=1;
    gb.gridy=9;
    gb.fill=2;
    direccion = new JTextField(10);
    registro.add(direccion, gb);
    
    gb =new GridBagConstraints();
    gb.gridx=0;
    gb.gridy=10;
    registro.add(new JLabel("Fecha: "), gb);
    
   gb =new GridBagConstraints();
    gb.gridx=1;
    gb.gridy=10;
    gb.fill=2;
    fecha = new JTextField(10);
    registro.add(fecha, gb);
   
    gb =new GridBagConstraints();
    gb.gridx=2;
    gb.gridy=10;
    registro.add(new JLabel("        Telf.: "), gb);
    
   gb =new GridBagConstraints();
    gb.gridx=3;
    gb.gridy=10;
    gb.fill=2;
    telefono = new JTextField(10);
    registro.add(telefono, gb);
    
        JButton guardar=new JButton("Guardar");
        guardar.addActionListener(this);
        guardar.setActionCommand("guardaes");
        
        JButton total2=new JButton("Calcular");
        total2.addActionListener(this);
        total2.setActionCommand("totaldos");
        
       JButton borrar=new JButton("Borrar");
        borrar.addActionListener(this);
        borrar.setActionCommand("borarb");
        
         JButton buscar=new JButton("Buscar");
        buscar.addActionListener(this);
        buscar.setActionCommand("bbuscar");
            
    gb =new GridBagConstraints();
    gb.gridx=6;
    gb.gridy=10;
    gb.fill=1;
    registro.add(guardar, gb);//BOTON BUSCAR 

    gb =new GridBagConstraints();
    gb.gridx=5;
    gb.gridy=10;
    gb.fill=1;
    registro.add(buscar, gb);//BOTON GUARDAR
    
    gb =new GridBagConstraints();
    gb.gridx=0;
    gb.gridy=11;
    gb.fill=2;
     registro.add(new JLabel("   "), gb);
    
    gb =new GridBagConstraints();
    gb.gridx=0;
    gb.gridy=12;
    //gb.fill=2;
     registro.add(new JLabel("  Cantidad: "), gb);
    
    gb =new GridBagConstraints();
    gb.gridx=1;
    gb.gridy=12;
    //gb.fill=1;
    cantidad = new JTextField(10);
    registro.add(cantidad, gb);
    
    gb =new GridBagConstraints();
    gb.gridx=2;
    gb.gridy=12;
    gb.fill=2;
    registro.add(new JLabel("  Descripcion: "), gb);
    
    gb =new GridBagConstraints();
    gb.gridx=3;
    gb.gridy=12;
    gb.fill=2;
    descripcion = new JTextField(10);
    registro.add(descripcion, gb);
    
    gb =new GridBagConstraints();
    gb.gridx=4;
    gb.gridy=12;
    gb.fill=2;
    registro.add(new JLabel("  Valor Unitario: "), gb);
    
    gb =new GridBagConstraints();
    gb.gridx=5;
    gb.gridy=12;
    gb.fill=2;
    valorUni = new JTextField(10);
    registro.add(valorUni, gb);
    
    gb =new GridBagConstraints();
    gb.gridx=6;
    gb.gridy=12;
    gb.fill=2;
    registro.add(new JLabel("  Valor Total: "), gb);
    
    gb =new GridBagConstraints();
    gb.gridx=7;
    gb.gridy=12;
    gb.fill=2;
    valorTotal = new JTextField(10);
    registro.add(valorTotal, gb);
    
    
    
    tablafacura = new JTable();
    tablafacura.setModel(new vista.ModelTablaFac() );
        JScrollPane ip=new JScrollPane(tablafacura);
   
               JPanel scrollPane = new JPanel();
		scrollPane.setLayout(new GridLayout(1, 1));
		scrollPane.add(ip);

    cp.add(registro);
    cp.add(scrollPane,BorderLayout.SOUTH);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
