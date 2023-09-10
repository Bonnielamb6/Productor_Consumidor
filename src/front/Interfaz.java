/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package front;
import back.Planificador;
import back.Consumidores;
import back.Productores;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.applet.AudioClip;
import java.awt.Cursor;
import java.awt.List;


/**
 *
 * @author PC
 */
public class Interfaz extends javax.swing.JFrame {
    
    Planificador bufferPrincipal = new Planificador (0);
    Consumidores consumidor = new Consumidores (bufferPrincipal);
    Productores productor = new Productores (bufferPrincipal);
    Icon puerro = new ImageIcon(getClass().getResource("/imagenes/puerro2.png"));
    int cantidadActual;
    Icon icono;
    AudioClip cancion;
    JLabel[] productos;
    Stack<JLabel> puerros;
    JLabel prueba = new JLabel(puerro);
    
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        
        initComponents();
        puerros = new Stack<JLabel>();
        panelPrincipal.setLayout(null);
        prueba.setBounds(500, 500, 180, 180);
        productos = new JLabel[10];
        for(int i = 0;i<10;i++){
            JLabel temp = new JLabel(puerro);
            temp.setBounds(100+(i*105), 500, 100, 100);
            panelPrincipal.add(temp);
            temp.setVisible(false);
            productos[i] = temp;
        }
        
        //panelPrincipal.add(prueba);
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        imgProductor = new javax.swing.JLabel();
        imgConsumidor = new javax.swing.JLabel();
        lblProductor = new javax.swing.JLabel();
        lblConsumidor = new javax.swing.JLabel();
        lblAlmacen = new javax.swing.JLabel();
        btnEmpezar = new javax.swing.JButton();
        lblPrograma = new javax.swing.JLabel();
        lblStatusPrograma = new javax.swing.JLabel();
        lblCantidadActual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imgProductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productor dormir.gif"))); // NOI18N

        imgConsumidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consumidor dormir.gif"))); // NOI18N

        lblProductor.setText("PRODUCTOR");

        lblConsumidor.setText("CONSUMIDOR");

        lblAlmacen.setText("ALMACEN");

        btnEmpezar.setBackground(new java.awt.Color(0, 255, 204));
        btnEmpezar.setText("Empezar");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });

        lblPrograma.setText("PROGRAMA");
        lblPrograma.setToolTipText("");

        lblStatusPrograma.setText("DETENIDO");

        lblCantidadActual.setText("Cantidad actual: 0");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(lblProductor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblConsumidor)
                .addGap(248, 248, 248))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(imgProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(lblPrograma)
                        .addGap(78, 78, 78))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(lblStatusPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(65, 65, 65)))
                .addComponent(imgConsumidor, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(btnEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(512, 512, 512)
                        .addComponent(lblAlmacen))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblCantidadActual)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProductor))
                    .addComponent(lblConsumidor))
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgConsumidor, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(lblCantidadActual)
                        .addGap(7, 7, 7)
                        .addComponent(btnEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrograma)
                        .addGap(75, 75, 75)
                        .addComponent(lblStatusPrograma)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(lblAlmacen)
                .addGap(303, 303, 303))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        // TODO add your handling code here:
        if(!productor.isAlive()){
            productor.start();
            consumidor.start();
            actualizarVentana();
            lblStatusPrograma.setText("CORRIENDO");
            cancion = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/graze the roof.wav"));
            cancion.loop();
            
        }else if (productor.isCorriendo()){
            productor.suspend();
            consumidor.suspend();
            productor.dormir();
            consumidor.dormir();
            productor.detener();
            lblStatusPrograma.setText("DETENIDO");
            cancion.stop();
        }else{
            productor.resume();
            consumidor.resume();
            productor.correr();
            productor.despertar();
            consumidor.despertar();
            lblStatusPrograma.setText("CORRIENDO");
            cancion.loop();
        }
        
    }//GEN-LAST:event_btnEmpezarActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Interfaz().setVisible(true);
                
                
            }

            
        });
        
    }
    
    public void actualizarVentana(){
        Thread ventana = new Thread(()->{
            while(!Thread.currentThread().isInterrupted()){
                
                if (cantidadActual!= bufferPrincipal.getCantidadProductos()){
                    cantidadActual= bufferPrincipal.getCantidadProductos();
                    pintar();
                }
                lblCantidadActual.setText("Cantidad actual: " + cantidadActual);
                
                
                if(productor.isDespierto()){
                    icono = new ImageIcon(getClass().getResource("/imagenes/productor producir.gif"));
                    imgProductor.setIcon(icono);
                }else{
                    icono = new ImageIcon(getClass().getResource("/imagenes/productor dormir.gif"));
                    imgProductor.setIcon(icono);
                }

                if(consumidor.isDespierto()){
                    icono = new ImageIcon(getClass().getResource("/imagenes/consumidor consumir.gif"));
                    imgConsumidor.setIcon(icono);
                }else{
                    icono = new ImageIcon(getClass().getResource("/imagenes/consumidor dormir.gif"));
                    imgConsumidor.setIcon(icono);
                }
            }
        });
        ventana.start();
        
            
        
    }
    
    public void pintar(){
        
        
        puerros.clear();
        System.out.println("\t" +cantidadActual);
        
        for(JLabel i:puerros){
            setVisible(false);
            
            i = null;
            remove(i);
            panelPrincipal.remove(i);
            
        }
        
        while(cantidadActual<puerros.size()){
            JLabel temp = puerros.peek();
            panelPrincipal.setVisible(false);
            puerros.peek().setIcon(icono);
            temp.setIcon(icono);
            puerros.elementAt(puerros.size()-1).setIcon(null);
            puerros.peek().remove(puerros.size());
            puerros.pop();
            //panelPrincipal.remove(panelPrincipal.getComponentAt(puerros.peek().getLocation()));

            
            panelPrincipal.remove(puerros.peek());
            
            
        }
        for(int i = 0;i<10;i++){
            productos[i].setVisible(false);
        }
        for(int i = 0;i<cantidadActual;i++){
            if(productos[i]!=null){
                productos[i].setVisible(true);
            }
            
        }
        
        
        
        
        
        
        
        
        
        panelPrincipal.updateUI();
        
    }
    
    public void repintar(){
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JLabel imgConsumidor;
    private javax.swing.JLabel imgProductor;
    private javax.swing.JLabel lblAlmacen;
    private javax.swing.JLabel lblCantidadActual;
    private javax.swing.JLabel lblConsumidor;
    private javax.swing.JLabel lblProductor;
    private javax.swing.JLabel lblPrograma;
    private javax.swing.JLabel lblStatusPrograma;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
