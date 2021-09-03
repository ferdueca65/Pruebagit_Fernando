package formularios;

import dao.DAOProducto;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelos.Producto;

public class ProductosListar extends javax.swing.JInternalFrame {

    private final String columnas[] = {"Código Producto", "Referencia Producto", "Nombre Producto", "Precio Costo", "Precio Venta"};
    private final DefaultTableModel miModelo = new DefaultTableModel(columnas, 0);

    public ProductosListar() {
        initComponents();
        cargarDatos();
    }

    private void cargarDatos() {
        List<Producto> arregloProductos;
        DAOProducto objDaoProducto = new DAOProducto();

        arregloProductos = objDaoProducto.consultar();
        arregloProductos.forEach((miProducto) -> {
            Object[] fila = new Object[5];
            fila[0] = miProducto.getIdProducto();
            fila[1] = miProducto.getReferencia();
            fila[2] = miProducto.getNombre();
            fila[3] = miProducto.getPrecioCosto();
            fila[4] = miProducto.getPrecioVenta();
            miModelo.addRow(fila);
        });
        
        tablaDatos.setModel(miModelo);
        tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(20);
        tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(100);
        
        tablaDatos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tablaDatos.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaDatos.getColumnModel().getColumn(4).setPreferredWidth(100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCabeceraListarP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelCuerpoListarP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        panelBotonesListarP = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("PRODUCTOS LISTAR");
        setPreferredSize(new java.awt.Dimension(711, 442));

        panelCabeceraListarP.setBackground(new java.awt.Color(102, 255, 255));
        panelCabeceraListarP.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Listado  Productos");

        javax.swing.GroupLayout panelCabeceraListarPLayout = new javax.swing.GroupLayout(panelCabeceraListarP);
        panelCabeceraListarP.setLayout(panelCabeceraListarPLayout);
        panelCabeceraListarPLayout.setHorizontalGroup(
            panelCabeceraListarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeceraListarPLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCabeceraListarPLayout.setVerticalGroup(
            panelCabeceraListarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeceraListarPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCuerpoListarP.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaDatos.setBackground(new java.awt.Color(255, 255, 0));
        tablaDatos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código Producto", "Referencia", "Nombre", "Precio Costo", "Precio Venta"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        javax.swing.GroupLayout panelCuerpoListarPLayout = new javax.swing.GroupLayout(panelCuerpoListarP);
        panelCuerpoListarP.setLayout(panelCuerpoListarPLayout);
        panelCuerpoListarPLayout.setHorizontalGroup(
            panelCuerpoListarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );
        panelCuerpoListarPLayout.setVerticalGroup(
            panelCuerpoListarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoListarPLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBotonesListarP.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCancelar.setBackground(new java.awt.Color(51, 255, 0));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesListarPLayout = new javax.swing.GroupLayout(panelBotonesListarP);
        panelBotonesListarP.setLayout(panelBotonesListarPLayout);
        panelBotonesListarPLayout.setHorizontalGroup(
            panelBotonesListarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesListarPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotonesListarPLayout.setVerticalGroup(
            panelBotonesListarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesListarPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCuerpoListarP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCabeceraListarP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotonesListarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCabeceraListarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpoListarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotonesListarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBotonesListarP;
    private javax.swing.JPanel panelCabeceraListarP;
    private javax.swing.JPanel panelCuerpoListarP;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
