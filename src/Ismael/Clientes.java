package Ismael;


import java.net.URISyntaxException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Properties;
import javax.swing.ImageIcon;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author henrygbc
 */
public class Clientes extends javax.swing.JFrame {
    DefaultTableModel modelo;
    String ID_Editar = "";
     String Ruta = "/home/henrygbc/NetBeansProjects/Ismaels/";
    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
        setLocation(380,250);
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        this.jTable1.setModel(modelo);
        llenarClientes();
        jbtnMod.setVisible(false);
        jbtnCancelar.setVisible(false);
        ImageIcon iconAtras = new ImageIcon(Ruta+"atras.png");
        jbtnAtras.setIcon(iconAtras);
        
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
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jtxfNombre = new java.awt.TextField();
        jtxfApellido = new java.awt.TextField();
        jtxfTelef = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        label1 = new java.awt.Label();
        jbtnAgregar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnMod = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jbtnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        label2.setText("Nombre: ");

        label3.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        label3.setText("Apellido:");

        label4.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        label4.setText("Telefono:");

        jtxfNombre.setFont(new java.awt.Font("Lucida Sans Typewriter", 3, 12)); // NOI18N

        jtxfApellido.setFont(new java.awt.Font("Lucida Sans Typewriter", 3, 12)); // NOI18N

        jtxfTelef.setFont(new java.awt.Font("Lucida Sans Typewriter", 3, 12)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        label1.setText("Clientes");

        jbtnAgregar.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jbtnAgregar.setText("Agregar");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });

        jbtnEliminar.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnEditar.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        jbtnEditar.setText("Editar");
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jbtnMod.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        jbtnMod.setText("Modificar");
        jbtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModActionPerformed(evt);
            }
        });

        jbtnCancelar.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnAtras.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jbtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxfApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxfTelef, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnEditar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtnMod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnCancelar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnAtras)
                        .addGap(190, 190, 190)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnAtras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnMod)
                        .addComponent(jbtnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxfTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnAgregar)
                        .addComponent(jbtnEliminar)
                        .addComponent(jbtnEditar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
       
        
        String []Datos = new String[4];
        Datos[1]= jtxfNombre.getText();
        jtxfNombre.setText(null);
        Datos[2] = jtxfApellido.getText();
        jtxfApellido.setText(null);
        Datos[3] = jtxfTelef.getText();
        jtxfTelef.setText(null);
        
        
        //INSERT INTO CLIENTES (NOMBRE,APELLIDO,TELEFONO) VALUES (?1,?2,?3)
        Connection c = null;
        Statement stmt = null;
        
        
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:"+Ruta+"Ismael.sqlite");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

             stmt = c.createStatement();
             
             String sql = "INSERT INTO CLIENTES (NOMBRE,APELLIDO,TELEFONO) VALUES (?,?,?)";
             PreparedStatement pst;
             pst = c.prepareStatement(sql);
             
             pst.setString(1, Datos[1]);
             pst.setString(2, Datos[2]);
             pst.setString(3, Datos[3]);
             
             int n = pst.executeUpdate();
             
             ResultSet rs = stmt.executeQuery( "SELECT ID FROM CLIENTES WHERE NOMBRE "
                     + "='"+Datos[1]+"' AND APELLIDO ='"+Datos[2]+"' AND TELEFONO ='"+Datos[3]+"' ;" );
                 
             while ( rs.next() ) {
                int id = rs.getInt("ID");
                Datos[0] = Integer.toString(id);
             }
             
             stmt.close();
             c.commit();
             c.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        //AGREGAR A TABLA JFRAME
        modelo.addRow(Datos);
        
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        String []Datos = new String[4]; 
        
        int FilaSeleccionada = jTable1.getSelectedRow();
        if(FilaSeleccionada>=0)
        {   
           Datos[0] = modelo.getValueAt(FilaSeleccionada, 0).toString();
            Connection c = null;
            Statement stmt = null;
            try {
              Class.forName("org.sqlite.JDBC");
              c = DriverManager.getConnection("jdbc:sqlite:"+Ruta+"Ismael.sqlite");
              c.setAutoCommit(false);
              System.out.println("Opened database successfully");

              stmt = c.createStatement();
              String sql = "DELETE from CLIENTES where ID='"+Datos[0]+"';";
              stmt.executeUpdate(sql);
              c.commit();
            
            stmt.close();
            c.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
              
              modelo.removeRow(FilaSeleccionada);
            
        }else{
            JOptionPane.showMessageDialog(null,"Tabla vacia o no seleccionó fila");
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        
        
        
        String []Datos = new String[4]; 
        int FilaSeleccionada = jTable1.getSelectedRow();
        if(FilaSeleccionada>=0)
        {
           Datos[0] = modelo.getValueAt(FilaSeleccionada, 0).toString();
           Datos[1] = modelo.getValueAt(FilaSeleccionada, 1).toString();
           Datos[2] = modelo.getValueAt(FilaSeleccionada, 2).toString();
           Datos[3] = modelo.getValueAt(FilaSeleccionada, 3).toString();
           ID_Editar = Datos[0];
           jtxfNombre.setText(Datos[1]);
           jtxfApellido.setText(Datos[2]);
           jtxfTelef.setText(Datos[3]);
        }else{
            JOptionPane.showMessageDialog(null,"Tabla vacia o no seleccionó fila");
        }
        
        jbtnMod.setVisible(true);
        jbtnCancelar.setVisible(true);
        jbtnAgregar.setVisible(false);
        jbtnEliminar.setVisible(false);
        jbtnEditar.setVisible(false);
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModActionPerformed
        String []Datos = new String[4];
        Datos[1]= jtxfNombre.getText();
        jtxfNombre.setText(null);
        Datos[2] = jtxfApellido.getText();
        jtxfApellido.setText(null);
        Datos[3] = jtxfTelef.getText();
        jtxfTelef.setText(null);
        Connection c = null;
        Statement stmt = null;
        try{ 
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:"+Ruta+"Ismael.sqlite");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            System.out.println("Opened database successfully");
           
            
             int n = stmt.executeUpdate("UPDATE CLIENTES SET "
                     + "NOMBRE ='"+Datos[1]+"', APELLIDO ='"+Datos[2]+"', TELEFONO ='"+Datos[3]+"' WHERE ID= '"+ID_Editar+"' ");
              stmt.close();
             c.commit();
             c.close();
             removerFilasTabla();
             llenarClientes();
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
          jbtnMod.setVisible(false);
        jbtnCancelar.setVisible(false);
        jbtnAgregar.setVisible(true);
        jbtnEliminar.setVisible(true);
        jbtnEditar.setVisible(true);
        jtxfNombre.setText(null);
        jtxfApellido.setText(null);
        jtxfTelef.setText(null);
        
    }//GEN-LAST:event_jbtnModActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        
        jbtnMod.setVisible(false);
        jbtnCancelar.setVisible(false);
        jbtnAgregar.setVisible(true);
        jbtnEliminar.setVisible(true);
        jbtnEditar.setVisible(true);
        jtxfNombre.setText(null);
        jtxfApellido.setText(null);
        jtxfTelef.setText(null);
        
       
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtrasActionPerformed
       Pedidos pedidos = new Pedidos();
       pedidos.setVisible(true);
       dispose();
    }//GEN-LAST:event_jbtnAtrasActionPerformed
  
    public void llenarClientes(){
  
       String []Datos = new String[4];
       String driver = "org.sqlite.JDBC";
    
       Connection c = null;
       Statement stmt = null;
       try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:"+Ruta+"Ismael.sqlite");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
            
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM \"CLIENTES\" ;" );
            
         while ( rs.next() ) {
                int id = rs.getInt("ID");
                String name = rs.getString("NOMBRE");
                String apellido = rs.getString("APELLIDO");
                String telefono = rs.getString("TELEFONO");
                Datos[0] = Integer.toString(id);
                Datos[1] = name;
                Datos[2] = apellido;
                Datos[3] = telefono;
                modelo.addRow(Datos);
        }
         rs.close();
        stmt.close();
        c.close();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
           System.out.println(e.getMessage());
       }
   }
   
   public void removerFilasTabla()
   {
      int cantidadFilas = jTable1.getRowCount();
       for (int i = cantidadFilas-1; i >=0; i--) {
            modelo.removeRow(i);
           
       }
   }
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnAtras;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnMod;
    private java.awt.TextField jtxfApellido;
    private java.awt.TextField jtxfNombre;
    private java.awt.TextField jtxfTelef;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables
}
