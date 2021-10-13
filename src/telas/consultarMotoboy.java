package telas;

import classes.ManipuladorArquivo;
import classes.Motoboy;
import java.awt.Color;
import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mvinn
 */


public class consultarMotoboy extends javax.swing.JFrame {

    /**
     * Creates new form consultarMotoboy
     */
    public consultarMotoboy() {
        initComponents();
        
        carregarMotoboys();
    }
    
    private void carregarMotoboys() {
        try {
            ArrayList<Motoboy> motoboys = ManipuladorArquivo.carregarMotoboys();
            
            DefaultListModel defModel = new DefaultListModel();
            for (Motoboy motoboy : motoboys) {
                if (motoboy.getDisponibilidade())
                    defModel.addElement(String.valueOf(motoboy.getCodMotoboy()) + " - " + motoboy.getNome());
            }
            
            jlMotoboys.setFixedCellHeight(30);
            jlMotoboys.setModel(defModel);
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao carregar os motoboys!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLista = new javax.swing.JPanel();
        jlTituloMotoboy = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlMotoboys = new javax.swing.JList<>();
        btnVoltarConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpLista.setBackground(new java.awt.Color(234, 29, 44));

        jlTituloMotoboy.setFont(new java.awt.Font("Sul Sans", 0, 24)); // NOI18N
        jlTituloMotoboy.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloMotoboy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloMotoboy.setText("Motoboys Disponíveis");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 2));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 2));
        jSeparator1.setVerifyInputWhenFocusTarget(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jlMotoboys.setBackground(new java.awt.Color(234, 29, 44));
        jlMotoboys.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        jlMotoboys.setForeground(new java.awt.Color(255, 255, 255));
        jlMotoboys.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlMotoboys);

        btnVoltarConsulta.setBackground(new java.awt.Color(236, 35, 51));
        btnVoltarConsulta.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnVoltarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_voltar_branco.png"))); // NOI18N
        btnVoltarConsulta.setText("Voltar");
        btnVoltarConsulta.setBorder(null);
        btnVoltarConsulta.setBorderPainted(false);
        btnVoltarConsulta.setContentAreaFilled(false);
        btnVoltarConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpListaLayout = new javax.swing.GroupLayout(jpLista);
        jpLista.setLayout(jpListaLayout);
        jpListaLayout.setHorizontalGroup(
            jpListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlTituloMotoboy, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jpListaLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(btnVoltarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpListaLayout.setVerticalGroup(
            jpListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlTituloMotoboy)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(jpLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarConsultaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(consultarMotoboy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultarMotoboy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultarMotoboy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultarMotoboy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultarMotoboy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltarConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> jlMotoboys;
    private javax.swing.JLabel jlTituloMotoboy;
    private javax.swing.JPanel jpLista;
    // End of variables declaration//GEN-END:variables
}