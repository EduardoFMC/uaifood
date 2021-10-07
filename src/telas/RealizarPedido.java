/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Cliente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import classes.ManipuladorArquivo;

/**
 *
 * @author Victor
 */
public class RealizarPedido extends javax.swing.JFrame {

    /**
     * Creates new form RealizarPedido
     */
    public RealizarPedido() {
        initComponents();
        
        // exibe somente a tela de Login
        jpLogin.setVisible(true);
        jspSelecionarProdutos.setVisible(false);
        
        jlErro.setVisible(false); // mensagem de erro não aparece
        jlErro.setHorizontalAlignment(SwingConstants.CENTER);
        jlErro.setVerticalAlignment(SwingConstants.CENTER);        
        
        
        //listarProdutos();
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
        jspSelecionarProdutos = new javax.swing.JScrollPane();
        jpSelecionarProdutos = new javax.swing.JPanel();
        jpLogin = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        jlEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jlErro = new javax.swing.JLabel();
        btnEntrar1 = new javax.swing.JButton();

        jLabel1.setText("lagrimas de crocodilo do WIU");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(234, 29, 44));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_uaifood.png")).getImage());
        setMaximumSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(360, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jspSelecionarProdutos.setBackground(new java.awt.Color(234, 29, 44));
        jspSelecionarProdutos.setAlignmentX(0.0F);
        jspSelecionarProdutos.setAlignmentY(0.0F);
        jspSelecionarProdutos.setHorizontalScrollBar(null);
        jspSelecionarProdutos.setMaximumSize(null);
        jspSelecionarProdutos.setMinimumSize(null);
        jspSelecionarProdutos.setName(""); // NOI18N
        jspSelecionarProdutos.setPreferredSize(new java.awt.Dimension(360, 640));
        jspSelecionarProdutos.setRequestFocusEnabled(false);

        jpSelecionarProdutos.setBackground(new java.awt.Color(234, 29, 44));
        jpSelecionarProdutos.setAlignmentX(0.0F);
        jpSelecionarProdutos.setAlignmentY(0.0F);
        jpSelecionarProdutos.setMaximumSize(null);
        jpSelecionarProdutos.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jpSelecionarProdutosLayout = new javax.swing.GroupLayout(jpSelecionarProdutos);
        jpSelecionarProdutos.setLayout(jpSelecionarProdutosLayout);
        jpSelecionarProdutosLayout.setHorizontalGroup(
            jpSelecionarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        jpSelecionarProdutosLayout.setVerticalGroup(
            jpSelecionarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        jspSelecionarProdutos.setViewportView(jpSelecionarProdutos);

        getContentPane().add(jspSelecionarProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpLogin.setBackground(new java.awt.Color(234, 29, 44));
        jpLogin.setMaximumSize(new java.awt.Dimension(360, 640));
        jpLogin.setMinimumSize(new java.awt.Dimension(360, 640));
        jpLogin.setPreferredSize(new java.awt.Dimension(360, 640));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/uaifood_logo.jpg"))); // NOI18N

        btnEntrar.setBackground(new java.awt.Color(234, 29, 44));
        btnEntrar.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_entrar_branco.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.setBorderPainted(false);
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        jlEmail.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlEmail.setForeground(new java.awt.Color(255, 255, 255));
        jlEmail.setText("Email:");

        txtEmail.setBackground(new java.awt.Color(234, 29, 44));
        txtEmail.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jlSenha.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlSenha.setForeground(new java.awt.Color(255, 255, 255));
        jlSenha.setText("Senha:");

        txtSenha.setBackground(new java.awt.Color(234, 29, 44));
        txtSenha.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        txtSenha.setSelectionColor(new java.awt.Color(160, 35, 49));

        jlErro.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlErro.setForeground(new java.awt.Color(255, 255, 255));

        btnEntrar1.setBackground(new java.awt.Color(234, 29, 44));
        btnEntrar1.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnEntrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_registrar_branco.png"))); // NOI18N
        btnEntrar1.setText("Registrar");
        btnEntrar1.setBorder(null);
        btnEntrar1.setBorderPainted(false);
        btnEntrar1.setContentAreaFilled(false);
        btnEntrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpLoginLayout = new javax.swing.GroupLayout(jpLogin);
        jpLogin.setLayout(jpLoginLayout);
        jpLoginLayout.setHorizontalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLoginLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlSenha)
                            .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(jlEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(btnEntrar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpLoginLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(logo)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addComponent(jlErro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpLoginLayout.setVerticalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEntrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlErro, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        getContentPane().add(jpLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        String email = txtEmail.getText();
        String senha = String.valueOf(txtSenha.getPassword());
        
        if (email.equals("") || senha.equals("")) {
            jlErro.setText("Por favor, preencha todos os campos!");
            jlErro.setVisible(true);
            return;
        }
        
        try {
            if (login(email, senha)) {
                this.setTitle("Escolher Produtos"); // troca o título da página
                
                jpLogin.setVisible(false);
                jspSelecionarProdutos.setVisible(true);
            } else {
                jlErro.setText("As credenciais estão incorretas!");
                jlErro.setVisible(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(RealizarPedido.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao carregar o banco de dados!", "Erro", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar1ActionPerformed
        // TODO add your handling code here:
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_btnEntrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(RealizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealizarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEntrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlErro;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JPanel jpSelecionarProdutos;
    private javax.swing.JScrollPane jspSelecionarProdutos;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private boolean login(String emailUsuario, String senhaUsuario) throws IOException {
        ArrayList<Cliente> clientes = ManipuladorArquivo.carregarClientes(); // carrega clientes do banco de dados
        
        for (int i = 0; i < clientes.size(); i++) {
            // verifica credenciais
            if (clientes.get(i).getEmail().equals(emailUsuario) && clientes.get(i).getSenha().equals(senhaUsuario))
                return true;
        }
        
        return false;
    }

    private void listarProdutos() {
        jpLogin.setVisible(false);
        jspSelecionarProdutos.setVisible(true);
        
        javax.swing.GroupLayout jpSelecionarProdutosLayout = new javax.swing.GroupLayout(jpSelecionarProdutos);
        jpSelecionarProdutos.setLayout(jpSelecionarProdutosLayout);
        
        SequentialGroup hor = jpSelecionarProdutosLayout.createSequentialGroup();
        SequentialGroup ver = jpSelecionarProdutosLayout.createSequentialGroup();
        
        for (int i = 1; i <= 10; i++) {
            JPanel macacoa = new javax.swing.JPanel();
            
            javax.swing.GroupLayout macacoaLayout = new javax.swing.GroupLayout(macacoa);
            macacoa.setLayout(macacoaLayout);
            macacoaLayout.setHorizontalGroup(
                macacoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
            );
            macacoaLayout.setVerticalGroup(
                macacoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
            );
            
            hor.addComponent(macacoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE);
            
            ver.addGap(1, 1, 1);
            ver.addComponent(macacoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE);
        }
        
        jpSelecionarProdutosLayout.setHorizontalGroup(
            jpSelecionarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSelecionarProdutosLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(hor.addContainerGap(195, Short.MAX_VALUE))));
        
        jpSelecionarProdutosLayout.setVerticalGroup(
            jpSelecionarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ver.addContainerGap(850, Short.MAX_VALUE)));
                
        //jspSelecionarProdutos.setViewportView(jpSelecionarProdutos);
        /*
        javax.swing.GroupLayout jpSelecionarProdutosLayout = new javax.swing.GroupLayout(jpSelecionarProdutos);
        jpSelecionarProdutos.setLayout(jpSelecionarProdutosLayout);
        
        for (int i = 1; i <= 1; i++) {
            JPanel jpItem = new javax.swing.JPanel();
            JLabel jlbNome = new JLabel();
            JLabel jlbPreco = new JLabel();
            JLabel jlbCodigo = new JLabel();
            JCheckBox jcbAdicionar = new JCheckBox();
            
            jpItem.setBackground(new java.awt.Color(234, 29, 44));
            jpItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

            jlbNome.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
            jlbNome.setForeground(new java.awt.Color(255, 255, 255));
            jlbNome.setText("Pizza de Calabresa");

            jlbPreco.setFont(new java.awt.Font("Sul Sans", 0, 24)); // NOI18N
            jlbPreco.setForeground(new java.awt.Color(255, 255, 255));
            jlbPreco.setText("R$20,00");

            jcbAdicionar.setBackground(new java.awt.Color(234, 29, 44));
            jcbAdicionar.setForeground(new java.awt.Color(234, 29, 44));
            jcbAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jcbAdicionar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_adicionar_branco.png"))); // NOI18N
            jcbAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_carrinho_branco.png"))); // NOI18N
            jcbAdicionar.setMargin(new java.awt.Insets(1, 1, 1, 1));
            jcbAdicionar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_carrinho_branco.png"))); // NOI18N
            jcbAdicionar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_carrinho_remover_branco.png"))); // NOI18N

            jlbCodigo.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
            jlbCodigo.setForeground(new java.awt.Color(255, 255, 255));
            jlbCodigo.setText("#1");

            javax.swing.GroupLayout jpItemLayout = new javax.swing.GroupLayout(jpItem);
            jpItem.setLayout(jpItemLayout);
            jpItemLayout.setHorizontalGroup(
                jpItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpItemLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jpItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlbNome, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addComponent(jlbPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(25, 25, 25)
                    .addGroup(jpItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jlbCodigo)
                        .addComponent(jcbAdicionar))
                    .addContainerGap())
            );
            jpItemLayout.setVerticalGroup(
                jpItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpItemLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlbNome)
                        .addComponent(jlbCodigo))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jpItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jlbPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbAdicionar))
                    .addGap(6, 6, 6))
            );

            
            jpSelecionarProdutosLayout.setHorizontalGroup(
                jpSelecionarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpSelecionarProdutosLayout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jpItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(197, Short.MAX_VALUE))
            );
            jpSelecionarProdutosLayout.setVerticalGroup(
                jpSelecionarProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpSelecionarProdutosLayout.createSequentialGroup()
                    .addGap(100*i, 100*i, 100*i)
                    .addComponent(jpItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(392, Short.MAX_VALUE))
            );

            
        }
        
        jspSelecionarProdutos.setViewportView(jpSelecionarProdutos);
        */
    }
}
