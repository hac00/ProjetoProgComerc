package view;

import controller.ProfissionalSaudeController;
import javax.swing.JOptionPane;
import model.bean.ProfissionalSaude;
import tablemodel.ProfissionalSaudeTableModel;

public class ProfissionalSaudeView extends javax.swing.JFrame {
    
    private boolean alterar = true;
    private int idProfissional = 0;
    private ProfissionalSaude profissional;
    
    ProfissionalSaudeTableModel tableModel;
    ProfissionalSaudeController profissionalController = new ProfissionalSaudeController();

    public ProfissionalSaudeView() {
        initComponents();
        
        if (profissional != null){
            preencheCampos(profissional);
            this.profissional = profissional;
        }else {
            jTextFieldNome.requestFocus();
        }
        
        tableModel = new ProfissionalSaudeTableModel(profissionalController.read());
        
        jTableProfissionais.setModel(tableModel);
    }
    
    public void preencheCampos(ProfissionalSaude profissional){
        this.idProfissional = profissional.getId();
        jTextFieldNome.setText(profissional.getNome());
        jFormattedTextFieldCpf.setText(profissional.getCpf());
        jTextFieldRegistro.setText(profissional.getRegistroProfissional());
        jButtonCadastrar.setEnabled(false);
        jButtonExcluir.setEnabled(true);
        this.alterar = true;
    }
    
    public void limpaCampos(){
        jTextFieldNome.setText("");
        jFormattedTextFieldCpf.setText("");
        jTextFieldRegistro.setText("");
        jTextFieldNome.requestFocus();
    }
    
    private void getListaProfissionais(){
        tableModel = new ProfissionalSaudeTableModel(profissionalController.read());
        jTableProfissionais.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCadastroProfissionais = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelRegistro = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jTextFieldRegistro = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProfissionais = new javax.swing.JTable();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        cbBusca = new javax.swing.JComboBox<>();
        jTextFieldBusca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CadastroProfissionalSaude");

        jLabelCadastroProfissionais.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCadastroProfissionais.setText("Cadastro Profissional Saude");

        jLabelNome.setText("Nome:");

        jLabelCPF.setText("CPF:");

        jLabelRegistro.setText("Registro:");

        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyTyped(evt);
            }
        });

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTableProfissionais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableProfissionais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProfissionaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProfissionais);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setEnabled(false);
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/insert.png"))); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setEnabled(false);
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        cbBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF", "Registro" }));
        cbBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscaActionPerformed(evt);
            }
        });

        jTextFieldBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabelCadastroProfissionais, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                    .addComponent(jLabelCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldRegistro))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelCadastroProfissionais, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegistro)
                    .addComponent(jTextFieldRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        if(jTextFieldNome.getText().isEmpty() ||
           jFormattedTextFieldCpf.getText().isEmpty() ||
           jTextFieldRegistro.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Preencha os campos obrigatórios!");
        return;
        }
        if(profissionalController.create(jTextFieldNome.getText(),
                jFormattedTextFieldCpf.getText(),
                jTextFieldRegistro.getText())){
            JOptionPane.showMessageDialog(this, "Profissional salvo com sucesso!");
        }else{
            JOptionPane.showMessageDialog(this, "Nao foi possivel salvar o profissional!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        this.getListaProfissionais();
        limpaCampos();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        if (profissionalController.update(idProfissional, jTextFieldNome.getText(), jFormattedTextFieldCpf.getText(), jTextFieldRegistro.getText())){
            JOptionPane.showMessageDialog(this, "Profissional atualizado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(this, "Não foi possível atualizar o profissional!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        this.getListaProfissionais();
        limpaCampos();
        
        /*if(jTableProfissionais.getSelectedRow() != -1){
            if(profissionalController.update((int) jTableProfissionais.getValueAt(jTableProfissionais.getSelectedRow(),0),
                                             jTextFieldNome.getText(),
                                             jFormattedTextFieldCpf.getText(),
                                             jTextFieldRegistro.getText()));
            this.getListaProfissionais();
            limpaCampos();
            JOptionPane.showMessageDialog(this, "Profissional atualizado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(this, "Não foi possível atualizar o profissional", "Erro", JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (profissionalController.delete(idProfissional)){
            JOptionPane.showMessageDialog(this, "Profissional deletado com sucesso!");
        }else {
            JOptionPane.showMessageDialog(this, "Não foi possível deletar o profissional!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        this.getListaProfissionais();
        limpaCampos();
        
        /*if(jTableProfissionais.getSelectedRow() != -1){
            if(profissionalController.delete((int) jTableProfissionais.getValueAt(jTableProfissionais.getSelectedRow(), 0))){
                this.getListaProfissionais();
                limpaCampos();
                JOptionPane.showMessageDialog(this, "Profissional deletado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(this, "Não foi possível excluir o profissional", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um profissional para excluir");
        }*/
    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
            jButtonCadastrar.setEnabled(true);
            jButtonAtualizar.setEnabled(true);
            jButtonExcluir.setEnabled(false);
            jButtonCancelar.setEnabled(true);
        }
    }//GEN-LAST:event_jTextFieldNomeKeyTyped

    private void cbBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscaActionPerformed
        jTextFieldBusca.setText("");
        if (cbBusca.getSelectedIndex() == 0){
            tableModel = new ProfissionalSaudeTableModel(profissionalController.read());
            jTableProfissionais.setModel(tableModel);
        }
        jTextFieldBusca.requestFocus();
    }//GEN-LAST:event_cbBuscaActionPerformed

    private void jTextFieldBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaKeyTyped
        String chave = jTextFieldBusca.getText(); //CORRIGIR!!
        if (chave.equals("")){
            chave = String.valueOf(evt.getKeyChar());
        }else if (evt.getKeyChar() != '\b'){
            chave = chave + evt.getKeyChar();
        }
        switch(cbBusca.getSelectedIndex()){
            case 0:
                tableModel = new ProfissionalSaudeTableModel(profissionalController.getProfissionalNome(chave));
                break;
            case 1:
                tableModel = new ProfissionalSaudeTableModel(profissionalController.getProfissionalCpf(chave));
                break;
            case 2:
                tableModel = new ProfissionalSaudeTableModel(profissionalController.getProfissionalRegistro(chave));
                break;
        }
        jTableProfissionais.setModel(tableModel);
    }//GEN-LAST:event_jTextFieldBuscaKeyTyped

    private void jTableProfissionaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProfissionaisMouseClicked
        tableModel = (ProfissionalSaudeTableModel) jTableProfissionais.getModel();
        ProfissionalSaude profissional = tableModel.getProfissionalSaude(jTableProfissionais.getSelectedRow());
        idProfissional = profissional.getId();
        jTextFieldNome.setText(profissional.getNome());
        jFormattedTextFieldCpf.setText(profissional.getCpf());
        jTextFieldRegistro.setText(profissional.getRegistroProfissional());
        jButtonExcluir.setEnabled(true);
        jButtonCadastrar.setEnabled(false);
        jButtonCadastrar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        this.alterar = true;
    }//GEN-LAST:event_jTableProfissionaisMouseClicked

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
            java.util.logging.Logger.getLogger(ProfissionalSaudeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfissionalSaudeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfissionalSaudeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfissionalSaudeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfissionalSaudeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbBusca;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCadastroProfissionais;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProfissionais;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRegistro;
    // End of variables declaration//GEN-END:variables
}
