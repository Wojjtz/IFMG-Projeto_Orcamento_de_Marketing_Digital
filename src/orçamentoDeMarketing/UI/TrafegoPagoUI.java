/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package orçamentoDeMarketing.UI;

import javax.swing.JOptionPane;
import orçamentoDeMarketing.listas.ListaTrafegoPago;

/**
 *
 * @author rodol
 */
public class TrafegoPagoUI extends javax.swing.JFrame {

    /**
     * Creates new form TrafegoPagoUI
     */
    public TrafegoPagoUI() {
        initComponents();
    }

    private ListaTrafegoPago listaTrafegoPago = new ListaTrafegoPago();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonVoltarPagina = new javax.swing.JButton();
        txtTFP = new javax.swing.JLabel();
        buttonAddImagem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtNicho = new javax.swing.JLabel();
        comboBoxNicho = new javax.swing.JComboBox<>();
        txtInvestimento = new javax.swing.JLabel();
        txtFieldValorInvestimento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(237, 126, 49));
        jPanel2.setForeground(new java.awt.Color(237, 126, 49));
        jPanel2.setPreferredSize(new java.awt.Dimension(97, 650));

        buttonVoltarPagina.setBackground(new java.awt.Color(237, 125, 49));
        buttonVoltarPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orçamentoDeMarketing/images/back-page-icon.png"))); // NOI18N
        buttonVoltarPagina.setBorder(null);
        buttonVoltarPagina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonVoltarPaginaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonVoltarPaginaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonVoltarPaginaMouseExited(evt);
            }
        });
        buttonVoltarPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarPaginaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(buttonVoltarPagina)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(buttonVoltarPagina)
                .addContainerGap(589, Short.MAX_VALUE))
        );

        txtTFP.setFont(new java.awt.Font("Noto Serif", 1, 48)); // NOI18N
        txtTFP.setForeground(new java.awt.Color(237, 125, 49));
        txtTFP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTFP.setText("TRÁFEGO PAGO");

        buttonAddImagem.setBackground(new java.awt.Color(237, 125, 49));
        buttonAddImagem.setFont(new java.awt.Font("Noto Serif", 1, 18)); // NOI18N
        buttonAddImagem.setForeground(new java.awt.Color(255, 255, 255));
        buttonAddImagem.setText("ADICIONAR");
        buttonAddImagem.setBorderPainted(false);
        buttonAddImagem.setFocusPainted(false);
        buttonAddImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddImagemActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(60, 60, 60));

        txtNicho.setFont(new java.awt.Font("Noto Serif", 1, 24)); // NOI18N
        txtNicho.setForeground(new java.awt.Color(255, 255, 255));
        txtNicho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNicho.setText("Seu nicho:");

        comboBoxNicho.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxNicho.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        comboBoxNicho.setForeground(new java.awt.Color(51, 51, 51));
        comboBoxNicho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Educação", "Programação", "Saúde", "Comércio", "Vendas Online", " " }));
        comboBoxNicho.setToolTipText("Segmento de conteúdo da sua página");

        txtInvestimento.setFont(new java.awt.Font("Noto Serif", 1, 24)); // NOI18N
        txtInvestimento.setForeground(new java.awt.Color(255, 255, 255));
        txtInvestimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInvestimento.setText("Investimento:");
        txtInvestimento.setToolTipText("O valor final é acrescido em 30% do investimento para nosso ganho.");

        txtFieldValorInvestimento.setBackground(new java.awt.Color(255, 255, 255));
        txtFieldValorInvestimento.setForeground(new java.awt.Color(51, 51, 51));
        txtFieldValorInvestimento.setToolTipText("Valor para custos das plataformas de divulgação.\nHaverá um acrescimo de 30% para o serviços de nossa organização.");
        txtFieldValorInvestimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldValorInvestimentoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("R$");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtNicho)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxNicho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtInvestimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldValorInvestimento, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(334, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNicho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxNicho, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInvestimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(txtFieldValorInvestimento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(204, 204, 204))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTFP)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAddImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTFP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buttonAddImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVoltarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVoltarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVoltarPaginaMouseClicked

    private void buttonVoltarPaginaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVoltarPaginaMouseEntered
        buttonVoltarPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orçamentoDeMarketing/images/back-page-icon-entered.png")));
    }//GEN-LAST:event_buttonVoltarPaginaMouseEntered

    private void buttonVoltarPaginaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVoltarPaginaMouseExited
        buttonVoltarPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orçamentoDeMarketing/images/back-page-icon.png")));
    }//GEN-LAST:event_buttonVoltarPaginaMouseExited

    private void buttonVoltarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarPaginaActionPerformed
        OpcoesUI op = new OpcoesUI();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonVoltarPaginaActionPerformed

    private void buttonAddImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddImagemActionPerformed
        try {
            if (txtFieldValorInvestimento.getText().isEmpty() || comboBoxNicho.getSelectedItem() == "-") {
                throw new NullPointerException();
            }
            double investimento = Double.parseDouble(txtFieldValorInvestimento.getText());
            if (investimento <= 0) {
                throw new NumberFormatException();
            }
            listaTrafegoPago.adicionar(comboBoxNicho.getSelectedItem().toString(), investimento);
            JOptionPane.showMessageDialog(null, "Trafego Pago adicionado com sucesso ao carrinho!");
            OpcoesUI op = new OpcoesUI();
            op.setVisible(true);
            this.dispose();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "É aceito apenas valores positivos ou diferentes de zero no campo 'Investimento'.");
        } finally {
            txtFieldValorInvestimento.setText("");
        }
    }//GEN-LAST:event_buttonAddImagemActionPerformed

    private void txtFieldValorInvestimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldValorInvestimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldValorInvestimentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void TrafegoPagoUI(String args[]) {
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
            java.util.logging.Logger.getLogger(TrafegoPagoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrafegoPagoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrafegoPagoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrafegoPagoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrafegoPagoUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddImagem;
    private javax.swing.JButton buttonVoltarPagina;
    private javax.swing.JComboBox<String> comboBoxNicho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtFieldValorInvestimento;
    private javax.swing.JLabel txtInvestimento;
    private javax.swing.JLabel txtNicho;
    private javax.swing.JLabel txtTFP;
    // End of variables declaration//GEN-END:variables
}
