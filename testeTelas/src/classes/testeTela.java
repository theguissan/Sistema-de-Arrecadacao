/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.awt.Image;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author estagio5
 */
public class testeTela extends javax.swing.JFrame {

    /**
     * Creates new form testeTela
     */
    
    Tributo t;
    public testeTela() {
        initComponents();
        this.totalField.setEnabled(false);
        this.refisPainel.setVisible(false);
        this.acordoBtn.setEnabled(false);
        this.pagarBtn.setEnabled(false);
        
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("dbc.jpeg")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(this.imageLbl.getWidth(), this.imageLbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new  ImageIcon(img2);
        
        
        ImageIcon myimage2 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("marca-megasoft.png")));
        Image img3 = myimage2.getImage();
        Image img4 = img3.getScaledInstance(this.megasoftLbl.getWidth(), this.megasoftLbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic = new  ImageIcon(img4);
        
        this.imageLbl.setIcon(i);
        this.megasoftLbl.setIcon(ic);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pagamentoField = new com.toedter.calendar.JDateChooser();
        testeLabel = new javax.swing.JLabel();
        checarBtn = new javax.swing.JButton();
        vencimentoField = new com.toedter.calendar.JDateChooser();
        pagarBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        precoField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tributoComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        acordoBtn = new javax.swing.JButton();
        totalField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        refisPainel = new javax.swing.JPanel();
        refisBtn = new javax.swing.JButton();
        refisField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        imageLbl = new javax.swing.JLabel();
        megasoftLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pagamentoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pagamentoFieldKeyTyped(evt);
            }
        });

        testeLabel.setText(" made by: estagiario5");

        checarBtn.setText("Checar");
        checarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checarBtnActionPerformed(evt);
            }
        });

        pagarBtn.setText("Pagar");
        pagarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Pagamento");

        jLabel3.setText("Vencimento");

        precoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoFieldActionPerformed(evt);
            }
        });
        precoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precoFieldKeyTyped(evt);
            }
        });

        jLabel4.setText("Preço");

        tributoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IPTU", "ITBI", "ISS" }));

        jLabel5.setText("Tributo");

        acordoBtn.setText("Fazer Acordo Refis");
        acordoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acordoBtnActionPerformed(evt);
            }
        });

        totalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFieldActionPerformed(evt);
            }
        });
        totalField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalFieldKeyTyped(evt);
            }
        });

        jLabel6.setText("Total a pagar");

        refisBtn.setText("Aplicar");
        refisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refisBtnActionPerformed(evt);
            }
        });

        refisField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refisFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Porcentagem");

        javax.swing.GroupLayout refisPainelLayout = new javax.swing.GroupLayout(refisPainel);
        refisPainel.setLayout(refisPainelLayout);
        refisPainelLayout.setHorizontalGroup(
            refisPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(refisPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addComponent(refisField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refisBtn)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        refisPainelLayout.setVerticalGroup(
            refisPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, refisPainelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(refisPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(refisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refisBtn))
                .addGap(31, 31, 31))
        );

        jLabel1.setFont(new java.awt.Font("TlwgMono", 1, 24)); // NOI18N
        jLabel1.setText("Sistema de Arrecadação ");
        jLabel1.setToolTipText("");

        jLabel8.setText("Versão 1.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(tributoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(acordoBtn)
                                    .addComponent(vencimentoField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(checarBtn)
                                    .addComponent(precoField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pagamentoField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(testeLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(refisPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pagarBtn)))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(megasoftLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(62, 62, 62)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tributoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(pagamentoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(vencimentoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checarBtn)
                .addGap(18, 18, 18)
                .addComponent(acordoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refisPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pagarBtn)
                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(testeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(megasoftLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void checarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checarBtnActionPerformed

        try {
            float preco = Float.parseFloat(this.precoField.getText());
            LocalDate pagamento = this.pagamentoField.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate vencimento = this.vencimentoField.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (this.tributoComboBox.getSelectedItem().equals("IPTU")) {
                this.t = new Iptu(preco, pagamento, vencimento);
                this.totalField.setText(t.valorTotal());
            } else if (this.tributoComboBox.getSelectedItem().equals("ISS")) {
                this.t = new Iss(preco, pagamento, vencimento);
                this.totalField.setText(t.valorTotal());
            } else {
                this.t = new Itbi(preco, pagamento, vencimento);
                this.totalField.setText(t.valorTotal());
            }

            this.pagarBtn.setEnabled(true);
            this.acordoBtn.setEnabled(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro","Sistema de arrecadação", JOptionPane.PLAIN_MESSAGE);
            this.limpar();
        }
     
    }//GEN-LAST:event_checarBtnActionPerformed

    private void pagarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarBtnActionPerformed

        if (!this.refisField.getText().equals("")) {
            this.t.fazerAcordo(Float.parseFloat(this.refisField.getText()));
        } else {
            this.t.fazerAcordo(100);
        }
        if (this.t.getTaxa() <= 0) {
            JOptionPane.showMessageDialog(null, "Pagamento confirmado\n" + "Valor: R$" + this.t.valorTotal(), "Sistema de arrecadação", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Pagamento confirmado\n" + "Valor: R$" + this.t.getPreco() + "\n" + "Taxa por Atraso: R$" + this.t.getTaxa()
                    + "\n" + "ValorTotal: R$" + this.t.valorTotal(),
                    "Sistema de arrecadação", JOptionPane.PLAIN_MESSAGE);
        }
        this.limpar();
    }//GEN-LAST:event_pagarBtnActionPerformed

    public void limpar(){
        this.pagamentoField.setCalendar(null);
        this.vencimentoField.setCalendar(null);
        this.totalField.setText(null);
        this.precoField.setText(null);
        this.refisField.setText(null);
        this.acordoBtn.setEnabled(false);
        this.pagarBtn.setEnabled(false);
    }
    private void precoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoFieldActionPerformed

    private void precoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoFieldKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && c != '.'  ){
            evt.consume();
        }
    }//GEN-LAST:event_precoFieldKeyTyped

    private void acordoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acordoBtnActionPerformed

        this.refisPainel.setVisible(true);
    }//GEN-LAST:event_acordoBtnActionPerformed

    private void totalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFieldActionPerformed

    private void refisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refisBtnActionPerformed

        if(this.refisField.getText().equals("")){
            this.totalField.setText(t.simularAcordo(100));
        }
        else{
            this.totalField.setText(t.simularAcordo(Float.parseFloat(this.refisField.getText())));
        }
        this.refisPainel.setVisible(false);
    }//GEN-LAST:event_refisBtnActionPerformed

    private void refisFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refisFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refisFieldActionPerformed

    private void totalFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalFieldKeyTyped
 
    }//GEN-LAST:event_totalFieldKeyTyped

    private void pagamentoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagamentoFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pagamentoFieldKeyTyped

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
            java.util.logging.Logger.getLogger(testeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testeTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acordoBtn;
    private javax.swing.JButton checarBtn;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel megasoftLbl;
    private com.toedter.calendar.JDateChooser pagamentoField;
    private javax.swing.JButton pagarBtn;
    private javax.swing.JTextField precoField;
    private javax.swing.JButton refisBtn;
    private javax.swing.JTextField refisField;
    private javax.swing.JPanel refisPainel;
    private javax.swing.JLabel testeLabel;
    private javax.swing.JTextField totalField;
    private javax.swing.JComboBox<String> tributoComboBox;
    private com.toedter.calendar.JDateChooser vencimentoField;
    // End of variables declaration//GEN-END:variables
}
