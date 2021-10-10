/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Cliente;
import classes.ManipuladorArquivo;
import classes.Motoboy;
import classes.Produto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */


public class ExcluirCliente extends javax.swing.JFrame {
    private ArrayList<Cliente> clientes;
    
    /**
     * Creates new form CadastroProduto
     */
    public ExcluirCliente() {
        initComponents();
        
        carregarClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSelecionarCliente = new javax.swing.JPanel();
        cmbCliente = new javax.swing.JComboBox<>();
        jlDescricaoCliente = new javax.swing.JLabel();
        btnNovoCliente = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Excluir Cliente");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_uaifood.png")).getImage());
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSelecionarCliente.setBackground(new java.awt.Color(234, 29, 44));
        jpSelecionarCliente.setMaximumSize(null);
        jpSelecionarCliente.setPreferredSize(new java.awt.Dimension(360, 640));

        cmbCliente.setFont(new java.awt.Font("Sul Sans", 0, 13)); // NOI18N
        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlDescricaoCliente.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlDescricaoCliente.setForeground(new java.awt.Color(255, 255, 255));
        jlDescricaoCliente.setText("Selecione um cliente:");

        btnNovoCliente.setBackground(new java.awt.Color(234, 29, 44));
        btnNovoCliente.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnNovoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_fechar_branco.png"))); // NOI18N
        btnNovoCliente.setText("Excluir");
        btnNovoCliente.setBorder(null);
        btnNovoCliente.setBorderPainted(false);
        btnNovoCliente.setContentAreaFilled(false);
        btnNovoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(234, 29, 44));
        btnVoltar.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_voltar_branco.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(null);
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSelecionarClienteLayout = new javax.swing.GroupLayout(jpSelecionarCliente);
        jpSelecionarCliente.setLayout(jpSelecionarClienteLayout);
        jpSelecionarClienteLayout.setHorizontalGroup(
            jpSelecionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSelecionarClienteLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jpSelecionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNovoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlDescricaoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        jpSelecionarClienteLayout.setVerticalGroup(
            jpSelecionarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSelecionarClienteLayout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addComponent(jlDescricaoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );

        getContentPane().add(jpSelecionarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        // TODO add your handling code here:
        if (cmbCliente.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um cliente.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int indice_motoboy = cmbCliente.getSelectedIndex() - 1;
        Cliente cliente = clientes.get(indice_motoboy);

            try {
            ManipuladorArquivo.excluirCliente(cliente);
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso.", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
            
            carregarClientes();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Algo deu errado! O cliente não foi excluído.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(ExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JLabel jlDescricaoCliente;
    private javax.swing.JPanel jpSelecionarCliente;
    // End of variables declaration//GEN-END:variables

    private void carregarClientes() {
        try {
            clientes = ManipuladorArquivo.carregarClientes();
            ArrayList<String> nomesClientes = new ArrayList();
            
            nomesClientes.add("Selecione um cliente");
            for (Cliente cliente : clientes) {
                nomesClientes.add(String.valueOf(cliente.getCodCliente()) + " - " + cliente.getNome());
            }
            
            MyComboBoxModel myModel = new MyComboBoxModel(nomesClientes.toArray(new String[0]));
            cmbCliente.setModel(myModel);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao carregar os clientes!", "Erro", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
