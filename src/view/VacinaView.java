package view;

import controller.VacinaController;
import javax.swing.JOptionPane;
import model.bean.Vacina;
import tablemodel.VacinaTableModel;

public class VacinaView extends javax.swing.JFrame {

    private boolean alterar = false;
    private int idVacina = 0;
    private Vacina vacina;
    
    VacinaTableModel tableModel;
    VacinaController vacinaController = new VacinaController();
    
    public VacinaView() {
        initComponents();
        
        if (vacina != null){
            preencheCampos(vacina);
            this.vacina = vacina;
        }else {
            jTextFieldNome.requestFocus();
        }
        
        tableModel = new VacinaTableModel(vacinaController.read());
        
        jTableTabela.setModel(tableModel);
    }
    
    public void preencheCampos(Vacina vacina){
        this.idVacina = vacina.getId();
        jTextFieldNome.setText(vacina.getNome());
        jTextFieldFabricante.setText(vacina.getFabricante());
        jTextFieldDosesNecessarias.setText(String.valueOf(vacina.getDosesNecessarias()));
        jButtonCadastrar.setEnabled(false);
        jButtonCadastrar.setEnabled(false);
        jButtonExcluir.setEnabled(true);
        this.alterar = true;
    }
    
    public void limpaCampos(){
        jTextFieldNome.setText("");
        jTextFieldFabricante.setText("");
        jTextFieldDosesNecessarias.setText("");
    }
    
    private void getListaVacinas(){
        VacinaView vacinaview = new VacinaView();
        vacinaview.setVisible(true);
        this.dispose();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelVacina = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelFabricante = new javax.swing.JLabel();
        jLabelDosesNecessarias = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldFabricante = new javax.swing.JTextField();
        jTextFieldDosesNecessarias = new javax.swing.JTextField();
        jComboBoxBusca = new javax.swing.JComboBox<>();
        jTextFieldBusca = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPanelTabela = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelVacina.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelVacina.setText("Vacina");

        jLabelNome.setText("Nome:");

        jLabelFabricante.setText("Fabricante:");

        jLabelDosesNecessarias.setText("Doses Necessárias:");

        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyTyped(evt);
            }
        });

        jComboBoxBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Fabricante", "Doses" }));
        jComboBoxBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBuscaActionPerformed(evt);
            }
        });

        jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/insert.png"))); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTableTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTabelaMouseClicked(evt);
            }
        });
        jScrollPanelTabela.setViewportView(jTableTabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(jLabelVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDosesNecessarias)
                            .addComponent(jLabelFabricante)
                            .addComponent(jLabelNome)
                            .addComponent(jComboBoxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCadastrar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldFabricante)
                            .addComponent(jTextFieldDosesNecessarias)
                            .addComponent(jTextFieldBusca)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonExcluir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPanelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabelVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFabricante)
                    .addComponent(jTextFieldFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDosesNecessarias)
                    .addComponent(jTextFieldDosesNecessarias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jScrollPanelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        if (vacinaController.create(jTextFieldNome.getText(), jTextFieldFabricante.getText(), Integer.parseInt(jTextFieldDosesNecessarias.getText()))){
            JOptionPane.showMessageDialog(this, "Vacina salva com sucesso!");
        }else {
            JOptionPane.showMessageDialog(this, "Não foi possível salvar a vacina", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        this.getListaVacinas();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        if (vacinaController.update(idVacina, jTextFieldNome.getText(), jTextFieldFabricante.getText(), Integer.parseInt(jTextFieldDosesNecessarias.getText()))){
            JOptionPane.showMessageDialog(this, "Vacina atualizada com sucesso!");
        }else{
            JOptionPane.showMessageDialog(this, "Não foi possível atualizar a vacina!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        this.getListaVacinas();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jButtonCadastrar.setEnabled(true);
        jButtonAtualizar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        alterar = false;
        limpaCampos();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyTyped
        if (alterar){
            jButtonExcluir.setEnabled(false);
            jButtonAtualizar.setEnabled(true);
        }
    }//GEN-LAST:event_jTextFieldNomeKeyTyped

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (vacinaController.delete(idVacina)){
            JOptionPane.showMessageDialog(this, "Vacina deletada com sucesso!");
        }else {
            JOptionPane.showMessageDialog(this, "Não foi possível deletar a vacina!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        this.getListaVacinas();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jComboBoxBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBuscaActionPerformed
        jTextFieldBusca.setText("");
        if (jComboBoxBusca.getSelectedIndex() == 0){
            tableModel = new VacinaTableModel(vacinaController.read());
            jTableTabela.setModel(tableModel);
        }
        jTextFieldBusca.requestFocus();
    }//GEN-LAST:event_jComboBoxBuscaActionPerformed

    private void jTableTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMouseClicked
        tableModel = (VacinaTableModel) jTableTabela.getModel();
        Vacina vacina = tableModel.getVacina(jTableTabela.getSelectedRow());
        VacinaView vacinaview = new VacinaView();
        vacinaview.setVisible(true);
        this.dispose(); //ERRADO NAO EH PRA ABRIR OUTRA TELA E SIM MOSTRAR OS DADOS NA TELA
    }//GEN-LAST:event_jTableTabelaMouseClicked

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
            java.util.logging.Logger.getLogger(VacinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VacinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VacinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VacinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VacinaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JComboBox<String> jComboBoxBusca;
    private javax.swing.JLabel jLabelDosesNecessarias;
    private javax.swing.JLabel jLabelFabricante;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelVacina;
    private javax.swing.JScrollPane jScrollPanelTabela;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldDosesNecessarias;
    private javax.swing.JTextField jTextFieldFabricante;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
