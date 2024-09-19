/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import clases.Producto;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Celi Leandro
 */
public class ConsultaPrecio extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaPrecio
     */
    public ConsultaPrecio() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPrecio = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        maxPrecio = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        minPrecio = new javax.swing.JTextPane();
        botonBuscarPrecio = new java.awt.Button();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Listado Por Precio");

        jLabel2.setText("Entre $");

        jLabel3.setText("y");

        tablaPrecio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio", "Categoria", "Stock"
            }
        ));
        tablaPrecio.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tablaPrecioComponentAdded(evt);
            }
        });
        jScrollPane3.setViewportView(tablaPrecio);
        if (tablaPrecio.getColumnModel().getColumnCount() > 0) {
            tablaPrecio.getColumnModel().getColumn(0).setHeaderValue("Codigo");
            tablaPrecio.getColumnModel().getColumn(1).setHeaderValue("Descripcion");
            tablaPrecio.getColumnModel().getColumn(2).setHeaderValue("Precio");
            tablaPrecio.getColumnModel().getColumn(3).setHeaderValue("Categoria");
            tablaPrecio.getColumnModel().getColumn(4).setHeaderValue("Stock");
        }

        maxPrecio.setPreferredSize(new java.awt.Dimension(76, 20));
        maxPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                maxPrecioKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(maxPrecio);

        minPrecio.setName(""); // NOI18N
        minPrecio.setPreferredSize(new java.awt.Dimension(76, 20));
        minPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                minPrecioKeyTyped(evt);
            }
        });
        jScrollPane5.setViewportView(minPrecio);

        botonBuscarPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonBuscarPrecio.setLabel("button1");
        botonBuscarPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarPrecioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonBuscarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botonBuscarPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minPrecioKeyTyped
      
      
    }//GEN-LAST:event_minPrecioKeyTyped

    private void maxPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maxPrecioKeyTyped
        // TODO add your handling code here:
      
    }//GEN-LAST:event_maxPrecioKeyTyped

    private void botonBuscarPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarPrecioMouseClicked
        // TODO add your handling code here:
    try {
        double mnPrecio = Double.parseDouble(minPrecio.getText()); // Precio mínimo
        double mxPrecio = Double.parseDouble(maxPrecio.getText()); // Precio máximo
        
      
        DefaultTableModel model = (DefaultTableModel) tablaPrecio.getModel();
        
        
        model.setRowCount(0);

        
        for (Map.Entry<Long, Producto> entry : MenuPrincipal.productos.entrySet()) {
            Long key = entry.getKey();
            Producto value = entry.getValue();
            
            
            if (value.getPrecio() > mnPrecio && value.getPrecio() < mxPrecio) {                
                model.addRow(new Object[]{key, value.getDescripcion(), value.getPrecio(), value.getStock(), value.getRubro()});
            }
        }
        
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos.");
        }
    }//GEN-LAST:event_botonBuscarPrecioMouseClicked

    private void tablaPrecioComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tablaPrecioComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tablaPrecioComponentAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botonBuscarPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane maxPrecio;
    private javax.swing.JTextPane minPrecio;
    private javax.swing.JTable tablaPrecio;
    // End of variables declaration//GEN-END:variables
}
