/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.ManipuladorArquivo;
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

public class EditarProduto extends javax.swing.JFrame {
    private ArrayList<Produto> produtos;
    
    /**
     * Creates new form CadastroProduto
     */
    public EditarProduto() {
        initComponents();
        
        jpSelecionarProduto.setVisible(true);
        jpEditarProduto.setVisible(false);
        
        carregarDiasDaSemana();
        carregarCategorias();
        carregarProdutos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSelecionarProduto = new javax.swing.JPanel();
        cmbProdutos = new javax.swing.JComboBox<>();
        jlDescricaoProduto1 = new javax.swing.JLabel();
        btnEditarProduto = new javax.swing.JButton();
        btnVoltarProduto = new javax.swing.JButton();
        jpEditarProduto = new javax.swing.JPanel();
        jlTituloProduto = new javax.swing.JLabel();
        jlNomeProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        jlValorProduto = new javax.swing.JLabel();
        txtValorProduto = new javax.swing.JTextField();
        jlDescricaoProduto = new javax.swing.JLabel();
        jlCategoriaProduto = new javax.swing.JLabel();
        cmbCategoriaProduto = new javax.swing.JComboBox<>();
        jlDiaDaPromocaoProduto = new javax.swing.JLabel();
        cmbjlDiaDaPromocaoProduto = new javax.swing.JComboBox<>();
        rbtnAlcoolicoProduto = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescricaoProduto = new javax.swing.JTextArea();
        btnCancelarProduto = new javax.swing.JButton();
        btnSalvarProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecionar Produto");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_uaifood.png")).getImage());
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(null);
        setMinimumSize(null);
        setPreferredSize(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSelecionarProduto.setBackground(new java.awt.Color(234, 29, 44));
        jpSelecionarProduto.setMaximumSize(null);
        jpSelecionarProduto.setPreferredSize(new java.awt.Dimension(360, 640));

        cmbProdutos.setFont(new java.awt.Font("Sul Sans", 0, 13)); // NOI18N
        cmbProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProdutosActionPerformed(evt);
            }
        });

        jlDescricaoProduto1.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlDescricaoProduto1.setForeground(new java.awt.Color(255, 255, 255));
        jlDescricaoProduto1.setText("Selecione um produto:");

        btnEditarProduto.setBackground(new java.awt.Color(234, 29, 44));
        btnEditarProduto.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnEditarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_editar_branco.png"))); // NOI18N
        btnEditarProduto.setText("Editar");
        btnEditarProduto.setBorder(null);
        btnEditarProduto.setBorderPainted(false);
        btnEditarProduto.setContentAreaFilled(false);
        btnEditarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });

        btnVoltarProduto.setBackground(new java.awt.Color(234, 29, 44));
        btnVoltarProduto.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnVoltarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_voltar_branco.png"))); // NOI18N
        btnVoltarProduto.setText("Voltar");
        btnVoltarProduto.setBorder(null);
        btnVoltarProduto.setBorderPainted(false);
        btnVoltarProduto.setContentAreaFilled(false);
        btnVoltarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSelecionarProdutoLayout = new javax.swing.GroupLayout(jpSelecionarProduto);
        jpSelecionarProduto.setLayout(jpSelecionarProdutoLayout);
        jpSelecionarProdutoLayout.setHorizontalGroup(
            jpSelecionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSelecionarProdutoLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jpSelecionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEditarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cmbProdutos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlDescricaoProduto1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltarProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        jpSelecionarProdutoLayout.setVerticalGroup(
            jpSelecionarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSelecionarProdutoLayout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addComponent(jlDescricaoProduto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );

        getContentPane().add(jpSelecionarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpEditarProduto.setBackground(new java.awt.Color(234, 29, 44));
        jpEditarProduto.setPreferredSize(new java.awt.Dimension(360, 640));

        jlTituloProduto.setFont(new java.awt.Font("Sul Sans", 0, 24)); // NOI18N
        jlTituloProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTituloProduto.setText("Editar Produto");

        jlNomeProduto.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlNomeProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlNomeProduto.setText("Nome:");

        txtNomeProduto.setBackground(new java.awt.Color(234, 29, 44));
        txtNomeProduto.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        txtNomeProduto.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jlValorProduto.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlValorProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlValorProduto.setText("Valor:");

        txtValorProduto.setBackground(new java.awt.Color(234, 29, 44));
        txtValorProduto.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        txtValorProduto.setForeground(new java.awt.Color(255, 255, 255));
        txtValorProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jlDescricaoProduto.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlDescricaoProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlDescricaoProduto.setText("Descrição:");

        jlCategoriaProduto.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlCategoriaProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlCategoriaProduto.setText("Categoria:");

        cmbCategoriaProduto.setFont(new java.awt.Font("Sul Sans", 0, 13)); // NOI18N
        cmbCategoriaProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlDiaDaPromocaoProduto.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlDiaDaPromocaoProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlDiaDaPromocaoProduto.setText("Dia da promoção:");

        cmbjlDiaDaPromocaoProduto.setFont(new java.awt.Font("Sul Sans", 0, 13)); // NOI18N
        cmbjlDiaDaPromocaoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        rbtnAlcoolicoProduto.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        rbtnAlcoolicoProduto.setForeground(new java.awt.Color(255, 255, 255));
        rbtnAlcoolicoProduto.setText("Alcoolico");
        rbtnAlcoolicoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAlcoolicoProdutoActionPerformed(evt);
            }
        });

        jtaDescricaoProduto.setBackground(new java.awt.Color(234, 29, 44));
        jtaDescricaoProduto.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jtaDescricaoProduto.setForeground(new java.awt.Color(255, 255, 255));
        jtaDescricaoProduto.setRows(5);
        jtaDescricaoProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jScrollPane1.setViewportView(jtaDescricaoProduto);

        btnCancelarProduto.setBackground(new java.awt.Color(234, 29, 44));
        btnCancelarProduto.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnCancelarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_fechar_branco.png"))); // NOI18N
        btnCancelarProduto.setText("Cancelar");
        btnCancelarProduto.setBorder(null);
        btnCancelarProduto.setBorderPainted(false);
        btnCancelarProduto.setContentAreaFilled(false);
        btnCancelarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProdutoActionPerformed(evt);
            }
        });

        btnSalvarProduto.setBackground(new java.awt.Color(234, 29, 44));
        btnSalvarProduto.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnSalvarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_verificar_branco.png"))); // NOI18N
        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.setBorder(null);
        btnSalvarProduto.setBorderPainted(false);
        btnSalvarProduto.setContentAreaFilled(false);
        btnSalvarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEditarProdutoLayout = new javax.swing.GroupLayout(jpEditarProduto);
        jpEditarProduto.setLayout(jpEditarProdutoLayout);
        jpEditarProdutoLayout.setHorizontalGroup(
            jpEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditarProdutoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtValorProduto)
                    .addComponent(txtNomeProduto)
                    .addComponent(rbtnAlcoolicoProduto)
                    .addComponent(jlDescricaoProduto)
                    .addComponent(jlValorProduto)
                    .addComponent(jlNomeProduto)
                    .addComponent(jlTituloProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jpEditarProdutoLayout.createSequentialGroup()
                        .addGroup(jpEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlCategoriaProduto)
                                .addComponent(cmbCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpEditarProdutoLayout.createSequentialGroup()
                                .addGap(0, 7, Short.MAX_VALUE)
                                .addGroup(jpEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbjlDiaDaPromocaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlDiaDaPromocaoProduto))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jpEditarProdutoLayout.setVerticalGroup(
            jpEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditarProdutoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlTituloProduto)
                .addGap(30, 30, 30)
                .addComponent(jlNomeProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlValorProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlDescricaoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCategoriaProduto)
                    .addComponent(jlDiaDaPromocaoProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbjlDiaDaPromocaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnAlcoolicoProduto)
                .addGap(56, 56, 56)
                .addGroup(jpEditarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        getContentPane().add(jpEditarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void carregarDiasDaSemana() {
        cmbjlDiaDaPromocaoProduto.removeAllItems();

        cmbjlDiaDaPromocaoProduto.addItem("Selecione um dia");
        cmbjlDiaDaPromocaoProduto.addItem("Domingo");
        cmbjlDiaDaPromocaoProduto.addItem("Segunda");
        cmbjlDiaDaPromocaoProduto.addItem("Terça");
        cmbjlDiaDaPromocaoProduto.addItem("Quarta");
        cmbjlDiaDaPromocaoProduto.addItem("Quinta");
        cmbjlDiaDaPromocaoProduto.addItem("Sexta");
        cmbjlDiaDaPromocaoProduto.addItem("Sábado");
    }
    
    public void carregarCategorias() {
        cmbCategoriaProduto.removeAllItems();
        
        cmbCategoriaProduto.addItem("Selecione uma categoria");
        for(String categoria : Produto.categorias) {
            cmbCategoriaProduto.addItem(categoria);
        }
    }
    
    private void rbtnAlcoolicoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAlcoolicoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnAlcoolicoProdutoActionPerformed

    private void btnCancelarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProdutoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarProdutoActionPerformed

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        // TODO add your handling code here:
        if (cmbProdutos.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um produto.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // tela de edição visível
        jpSelecionarProduto.setVisible(false);
        jpEditarProduto.setVisible(true);
        this.setTitle("Editar Produto");
        
        int indice_produto = cmbProdutos.getSelectedIndex() - 1;
        Produto produto = produtos.get(indice_produto);
        
        // valores do objeto original
        txtNomeProduto.setText(produto.getNome());
        txtValorProduto.setText(String.valueOf(produto.getValor()));
        jtaDescricaoProduto.setText(produto.getDescricao());
        
        cmbCategoriaProduto.setSelectedItem(produto.getCategoria());
        cmbjlDiaDaPromocaoProduto.setSelectedIndex(produto.getDiaDaPromocao() + 1);
        
        rbtnAlcoolicoProduto.setSelected(produto.getAlcoolico());
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        // TODO add your handling code here:
        int indice_produto = cmbProdutos.getSelectedIndex() - 1;
        Produto produtoAntigo = produtos.get(indice_produto);
        
        if (txtNomeProduto.getText().equals("")
            || txtValorProduto.getText().equals("")
            || jtaDescricaoProduto.getText().equals("")
            || cmbCategoriaProduto.getSelectedIndex() == 0
            || cmbjlDiaDaPromocaoProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String nome = txtNomeProduto.getText();
        float valor = Float.parseFloat(txtValorProduto.getText());
        boolean alcoolico = rbtnAlcoolicoProduto.isSelected();
        String categoria = cmbCategoriaProduto.getSelectedItem().toString();
        int diaDaPromocao = cmbjlDiaDaPromocaoProduto.getSelectedIndex() - 1;
        String descricao = jtaDescricaoProduto.getText();
        
        Produto produto = new Produto(produtoAntigo.getCodProduto(), nome, valor, alcoolico, categoria, descricao, diaDaPromocao);
        try {
            ManipuladorArquivo.editarProduto(produto);
            JOptionPane.showMessageDialog(null, "Produto editado com sucesso.", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
            this.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Algo deu errado! O produto não foi editado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void btnVoltarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarProdutoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarProdutoActionPerformed

    private void cmbProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarProduto;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JButton btnVoltarProduto;
    private javax.swing.JComboBox<String> cmbCategoriaProduto;
    private javax.swing.JComboBox<String> cmbProdutos;
    private javax.swing.JComboBox<String> cmbjlDiaDaPromocaoProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlCategoriaProduto;
    private javax.swing.JLabel jlDescricaoProduto;
    private javax.swing.JLabel jlDescricaoProduto1;
    private javax.swing.JLabel jlDiaDaPromocaoProduto;
    private javax.swing.JLabel jlNomeProduto;
    private javax.swing.JLabel jlTituloProduto;
    private javax.swing.JLabel jlValorProduto;
    private javax.swing.JPanel jpEditarProduto;
    private javax.swing.JPanel jpSelecionarProduto;
    private javax.swing.JTextArea jtaDescricaoProduto;
    private javax.swing.JRadioButton rbtnAlcoolicoProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtValorProduto;
    // End of variables declaration//GEN-END:variables

    private void carregarProdutos() {
        try {
            produtos = ManipuladorArquivo.carregarProdutos();
            ArrayList<String> nomes_produtos = new ArrayList();
            
            nomes_produtos.add("Selecione um produto");
            for (Produto produto : produtos) {
                nomes_produtos.add(String.valueOf(produto.getCodProduto()) + " - " + produto.getNome());
            }
            
            MyComboBoxModel myModel = new MyComboBoxModel(nomes_produtos.toArray(new String[0]));
            cmbProdutos.setModel(myModel);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao carregar os produtos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
