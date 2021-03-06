
package formularios;

import javax.swing.JInternalFrame;


public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        panelTablero = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuProductos = new javax.swing.JMenu();
        jMenuItemCrearP = new javax.swing.JMenuItem();
        jMenuItemListarP = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");
        setResizable(false);

        panelTablero.setBackground(new java.awt.Color(102, 255, 255));
        panelTablero.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelTableroLayout = new javax.swing.GroupLayout(panelTablero);
        panelTablero.setLayout(panelTableroLayout);
        panelTableroLayout.setHorizontalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        panelTableroLayout.setVerticalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );

        jMenuArchivo.setBackground(new java.awt.Color(255, 255, 102));
        jMenuArchivo.setText("Archivo");
        jMenuArchivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItemAcercaDe.setText("Acerca De");
        jMenuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaDeActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemAcercaDe);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuProductos.setBackground(new java.awt.Color(255, 204, 204));
        jMenuProductos.setText("Productos");
        jMenuProductos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItemCrearP.setText("Crear");
        jMenuItemCrearP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCrearPActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItemCrearP);

        jMenuItemListarP.setText("Listar");
        jMenuItemListarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarPActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItemListarP);

        jMenuBar1.add(jMenuProductos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void agregarVentanaPanel(JInternalFrame ventana){
        if(panelTablero.getComponentCount() > 0){
            panelTablero.removeAll();
        }
        panelTablero.add(ventana);
    }
    
    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaDeActionPerformed
        
        //definicion de variables
        AcercaDe ventanaAcercaDe;        
        
        //creacion de objetos
        
        ventanaAcercaDe = new AcercaDe();
        
        agregarVentanaPanel(ventanaAcercaDe);
        ventanaAcercaDe.show();
    }//GEN-LAST:event_jMenuItemAcercaDeActionPerformed

    private void jMenuItemCrearPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCrearPActionPerformed
        
        //definicion de variables
        ProductoCrear ventanaProductoCrear;
               
        //creacion de objetos
        
        ventanaProductoCrear = new ProductoCrear();
        
        agregarVentanaPanel(ventanaProductoCrear);
        ventanaProductoCrear.show();
    }//GEN-LAST:event_jMenuItemCrearPActionPerformed

    private void jMenuItemListarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarPActionPerformed
        
        //definicion de variables
        ProductosListar ventanaProductoListar;
        
        //creacion de objetos
        ventanaProductoListar = new ProductosListar();
        
        agregarVentanaPanel(ventanaProductoListar);
        ventanaProductoListar.show();
    }//GEN-LAST:event_jMenuItemListarPActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemCrearP;
    private javax.swing.JMenuItem jMenuItemListarP;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuProductos;
    private javax.swing.JPanel panelTablero;
    // End of variables declaration//GEN-END:variables
}
