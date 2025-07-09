package view;

import controller.PacienteController;
import javax.swing.JOptionPane;
import model.bean.Paciente;
import tablemodel.PacienteTableModel;

public class PacienteView extends javax.swing.JFrame {

    private boolean alterar = true;
    private int idPaciente = 0;
    private Paciente paciente;
    
    PacienteTableModel tableModel;
    PacienteController pacienteController = new PacienteController();
     
    public PacienteView() {
        initComponents();
        
        if (paciente != null){
            preencheCampos(paciente);
            this.paciente = paciente;
        }else{
            jTextFieldNome.requestFocus();
        }
        
        tableModel = new PacienteTableModel(pacienteController.read());
        
        jTablePacientes.setModel(tableModel);

    }
    
    private void preencheCampos(Paciente paciente){
        this.idPaciente = paciente.getId();
        jTextFieldNome.setText(paciente.getNome());
        jFormattedTextFieldTelefone.setText(paciente.getTelefone());
        jFormattedTextFieldDataNascimento.setText(paciente.getDataNascimento());
        jTextFieldAlergias.setText(paciente.getAlergias());
        jFormattedTextFieldCpf.setText(paciente.getCpf());
        buttonGroupSexo.clearSelection();//?
        btnCadastrar.setEnabled(false);
        btnCadastrar.setEnabled(false);
        btnExcluir.setEnabled(true);
        this.alterar = true;        
    }
    
    private void limpaCampos(){
        jFormattedTextFieldTelefone.setText("");
        jFormattedTextFieldDataNascimento.setText("");
        jTextFieldAlergias.setText("");
        buttonGroupSexo.clearSelection();
        jFormattedTextFieldCpf.setText("");
        jTextFieldNome.setText("");
        jTextFieldNome.requestFocus();
    }
    
    public void getListaPacientes(){
        tableModel = new PacienteTableModel(pacienteController.read());
        jTablePacientes.setModel(tableModel);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelCadastro = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelAlergias = new javax.swing.JLabel();
        jLabelDataNascimento = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldAlergias = new javax.swing.JTextField();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jRadioButtonFeminino = new javax.swing.JRadioButton();
        btnCadastrar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePacientes = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        cbBusca = new javax.swing.JComboBox<>();
        jTextFieldBusca = new javax.swing.JTextField();
        btnAplicacoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(862, 950));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(741, 900));

        jLabelCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCadastro.setText("Cadastro de Paciente");

        jLabelNome.setText("Nome");

        jLabelCpf.setText("CPF");

        jLabelSexo.setText("Sexo");

        jLabelAlergias.setText("Alergias");

        jLabelDataNascimento.setText("Data Nascimento");

        jLabelTelefone.setText("Telefone");

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

        try {
            jFormattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9 ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        buttonGroupSexo.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setText("Masculino");

        buttonGroupSexo.add(jRadioButtonFeminino);
        jRadioButtonFeminino.setText("Feminino");

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setEnabled(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/insert.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jTablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePacientes);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cbBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF", "Sexo" }));
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

        btnAplicacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/order.png"))); // NOI18N
        btnAplicacoes.setText("Aplicações");
        btnAplicacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicacoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabelCadastro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldBusca))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNome)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jRadioButtonMasculino)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jRadioButtonFeminino))
                                        .addComponent(jLabelSexo))
                                    .addGap(49, 49, 49)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jFormattedTextFieldCpf)
                                        .addComponent(jLabelCpf)
                                        .addComponent(jLabelTelefone)
                                        .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelDataNascimento)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelAlergias)
                                            .addComponent(jTextFieldAlergias)
                                            .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAplicacoes)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelCpf)
                    .addComponent(jLabelDataNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jLabelAlergias)
                    .addComponent(jLabelSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonMasculino)
                    .addComponent(jRadioButtonFeminino)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAplicacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        //validacao dos campos obrigatorios
        if (jTextFieldNome.getText().isEmpty() ||
            jFormattedTextFieldCpf.getText().isEmpty() ||
            jFormattedTextFieldTelefone.getText().isEmpty() ||
            jFormattedTextFieldDataNascimento.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Prencha todos os campos obrigatórios");
                return;
        }
        //define variavel binaria sexo
        String sexo = "";
        if (jRadioButtonMasculino.isSelected())
            sexo = "Masculino";
        else if (jRadioButtonFeminino.isSelected())
            sexo = "Feminino";
        else
            JOptionPane.showMessageDialog(this, "Selecione o sexo do paciente!");
        //regex data de nascimento
        String dataRegex = "^(0[1-9]|[12][0-9]||3[01]/(0[1-9]|1[0-2]/\\d{4}))$";
        if (jFormattedTextFieldDataNascimento.getText().matches(dataRegex)){
            JOptionPane.showMessageDialog(this, "Data Invalida!");
            return;
        }
        //executa botao cadastar
        if (pacienteController.create(jFormattedTextFieldTelefone.getText(),
            jFormattedTextFieldDataNascimento.getText(),
            jTextFieldAlergias.getText(),
            sexo,
            jFormattedTextFieldCpf.getText(),
            jTextFieldNome.getText())){
        this.getListaPacientes();
        limpaCampos();
        JOptionPane.showMessageDialog(this, "Paciente salvo com sucesso!");
        }else{
            JOptionPane.showMessageDialog(this, "Nao foi possivel salvar o paciente!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        String sexo = "";
        if (jRadioButtonMasculino.isSelected())
            sexo = "Masculino";
        else if (jRadioButtonFeminino.isSelected())
            sexo = "Feminino";
        else
            JOptionPane.showMessageDialog(this, "Selecione o sexo do paciente!");
        
        if (pacienteController.update(idPaciente, jTextFieldNome.getText(), jFormattedTextFieldCpf.getText(), jFormattedTextFieldTelefone.getText(),
                                        jFormattedTextFieldTelefone.getText(), jTextFieldAlergias.getText(), sexo)){
            JOptionPane.showMessageDialog(this, "Paciente atualizado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(this, "Não foi possível atualizar o paciente!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        this.getListaPacientes();
        limpaCampos();
        
        /*if(jTablePacientes.getSelectedRow() != -1){
            if(pacienteController.update((int) jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 0),
                                         jFormattedTextFieldTelefone.getText(),
                                         jFormattedTextFieldDataNascimento.getText(),
                                         jTextFieldAlergias.getText(),
                                         sexo,
                                         jFormattedTextFieldCpf.getText(),
                                         jTextFieldNome.getText())){
                this.getListaPaciente();
                limpaCampos();
                JOptionPane.showMessageDialog(this, "Paciente atualizado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(this, "Não foi possível atualizar o paciente!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }*/
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (pacienteController.delete(idPaciente)){
            JOptionPane.showMessageDialog(this, "Paciente deletado com sucesso!");
        }else {
            JOptionPane.showMessageDialog(this, "Não foi possível deletar o paciente!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        this.getListaPacientes();
        limpaCampos();
        
        /*if(jTablePacientes.getSelectedRow() != -1){
            if(pacientecontroller.delete((int) jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 0))){
                getListaPaciente();
                limpaCampos();
                JOptionPane.showMessageDialog(this, "Paciente deletado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(this, "Não foi possível deletar o paciente!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um paciente para excluir");
        }*/
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnCadastrar.setEnabled(true);
        btnAtualizar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnExcluir.setEnabled(false);
        alterar = false;
        limpaCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscaActionPerformed
        jTextFieldBusca.setText("");
        if (cbBusca.getSelectedIndex() == 0){
            tableModel = new PacienteTableModel(pacienteController.read());
            jTablePacientes.setModel(tableModel);
        }
        jTextFieldBusca.requestFocus();
    }//GEN-LAST:event_cbBuscaActionPerformed

    private void jTablePacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacientesMouseClicked
        tableModel = (PacienteTableModel) jTablePacientes.getModel();
        Paciente paciente = tableModel.getPaciente(jTablePacientes.getSelectedRow());
        idPaciente = paciente.getId();
        jTextFieldNome.setText(paciente.getNome());
        jFormattedTextFieldCpf.setText(paciente.getCpf());
        jFormattedTextFieldTelefone.setText(paciente.getTelefone());
        jFormattedTextFieldDataNascimento.setText(paciente.getDataNascimento());
        jTextFieldAlergias.setText(paciente.getAlergias());
        btnExcluir.setEnabled(true);
        btnCadastrar.setEnabled(false);
        btnCadastrar.setEnabled(true);
        btnCancelar.setEnabled(true);
        this.alterar = true;        
    }//GEN-LAST:event_jTablePacientesMouseClicked

    private void jTextFieldBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaKeyTyped
        String chave = jTextFieldBusca.getText(); //CORRIGIR!!
        if (chave.equals("")){
            chave = String.valueOf(evt.getKeyChar());
        }else if (evt.getKeyChar() != '\b'){
            chave = chave + evt.getKeyChar();
        }
        switch(cbBusca.getSelectedIndex()){
            case 0:
                tableModel = new PacienteTableModel(pacienteController.getPacientesNome(chave));
                break;
            case 1:
                tableModel = new PacienteTableModel(pacienteController.getPacientesCpf(chave));
                break;
        }
        jTablePacientes.setModel(tableModel);
    }//GEN-LAST:event_jTextFieldBuscaKeyTyped

    private void jTextFieldNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyTyped
        if (alterar){
            btnCadastrar.setEnabled(true);
            btnAtualizar.setEnabled(true);
            btnExcluir.setEnabled(false);
            btnCancelar.setEnabled(true);
        }        
    }//GEN-LAST:event_jTextFieldNomeKeyTyped

    private void btnAplicacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicacoesActionPerformed
        int linhaSelecionada = jTablePacientes.getSelectedRow();
        
        if (linhaSelecionada != -1){
            Paciente pacienteSelecionado = tableModel.getPaciente(linhaSelecionada);
            
            AplicacaoVacinaView aplicacaoView = new AplicacaoVacinaView(pacienteSelecionado);
            aplicacaoView.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Selecione um paciente primeiro");
        }
    }//GEN-LAST:event_btnAplicacoesActionPerformed

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
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new PacienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicacoes;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JComboBox<String> cbBusca;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabelAlergias;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFeminino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePacientes;
    private javax.swing.JTextField jTextFieldAlergias;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
