package view;

import controller.AplicacaoVacinaController;
import model.bean.Paciente;
import controller.ProfissionalSaudeController;
import controller.VacinaController;
import javax.swing.JOptionPane;
import model.bean.ProfissionalSaude;
import model.bean.Vacina;
import tablemodel.AplicacaoVacinaTableModel;

public class AplicacaoVacinaView extends javax.swing.JFrame {
    
    public Paciente paciente;
    private boolean alterar = false;
    private int idAplicacaoVacina = 0;
    
    AplicacaoVacinaController aplicacaoVacinaController = new AplicacaoVacinaController();
    AplicacaoVacinaTableModel tableModelAplicacaoVacina;
    
    public AplicacaoVacinaView(Paciente paciente) {
        initComponents();
        this.paciente = paciente;
        
        jTextFieldPaciente.setText(paciente.getNome());
        getListaProfissionais();
        getListaVacinas();
        getAplicacaoVacina();
        
        jTextFieldPaciente.setText(paciente.getNome());
        
    }
    
    public void limpaCampos(){
        jComboBoxProfissional.setSelectedIndex(-1);
        jComboBoxVacina.setSelectedIndex(-1);
        jTextFieldLocal.setText("");
        jFormattedTextFieldData.setText("");
    }

    private void getListaProfissionais(){
        jComboBoxProfissional.removeAllItems();
        ProfissionalSaudeController profissionalController = new ProfissionalSaudeController();
        
        for (ProfissionalSaude p : profissionalController.read()){
            jComboBoxProfissional.addItem(p);
        }
    }
    
    private void getListaVacinas(){
        jComboBoxVacina.removeAllItems();
        VacinaController vacinaController = new VacinaController();
        
        for (Vacina v : vacinaController.read()){
            jComboBoxVacina.addItem(v);
        }
    }
    
    private void getAplicacaoVacina(){
        tableModelAplicacaoVacina = new AplicacaoVacinaTableModel(aplicacaoVacinaController.getAplicacaoVacina(this.paciente.getId()));
        
        jTableTabela.setModel(tableModelAplicacaoVacina);
        
        limpaCampos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelProfissional = new javax.swing.JLabel();
        jComboBoxProfissional = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxVacina = new javax.swing.JComboBox();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelPaciente = new javax.swing.JLabel();
        jTextFieldPaciente = new javax.swing.JTextField();
        jLabelLocal = new javax.swing.JLabel();
        jTextFieldLocal = new javax.swing.JTextField();
        jLabelData = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jLabelAplicacoes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelProfissional.setText("Profissional:");

        jLabel1.setText("Vacina:");

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
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

        jLabelPaciente.setText("Paciente:");

        jTextFieldPaciente.setEditable(false);

        jLabelLocal.setText("Local de Aplicação:");

        jTextFieldLocal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLocalKeyTyped(evt);
            }
        });

        jLabelData.setText("Data de Aplicação:");

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProfissional)
                            .addComponent(jLabelPaciente)
                            .addComponent(jLabel1)
                            .addComponent(jLabelLocal))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxProfissional, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxVacina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelData)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldData))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButtonSalvar)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonExcluir)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonCancelar)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonSair)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPaciente)
                    .addComponent(jTextFieldPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProfissional)
                    .addComponent(jComboBoxProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLocal)
                    .addComponent(jTextFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelData)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonSair))
                .addGap(41, 41, 41))
        );

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
        jScrollPane1.setViewportView(jTableTabela);

        jLabelAplicacoes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelAplicacoes.setText("Aplicações");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabelAplicacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabelAplicacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getListaProfissionais();
        getListaVacinas();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        ProfissionalSaude profissional = (ProfissionalSaude) jComboBoxProfissional.getSelectedItem();
        Vacina vacina = (Vacina) jComboBoxVacina.getSelectedItem();
        aplicacaoVacinaController.create(this.paciente, profissional, vacina, jFormattedTextFieldData.getText(), jTextFieldLocal.getText());
        this.getAplicacaoVacina();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        ProfissionalSaude profissional = (ProfissionalSaude) jComboBoxProfissional.getSelectedItem();
        Vacina vacina = (Vacina) jComboBoxVacina.getSelectedItem();
        if (aplicacaoVacinaController.delete(vacina.getId(), profissional.getId(), paciente.getId())){
            JOptionPane.showMessageDialog(this, "Aplicacao deletada com sucesso!");
        }else{
            JOptionPane.showMessageDialog(this, "Não foi possível deletar a aplicação", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        this.getAplicacaoVacina();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jButtonSalvar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        limpaCampos();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
        InterfacePrincipal main = new InterfacePrincipal();
        main.setVisible(true);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldLocalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLocalKeyTyped
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jTextFieldLocalKeyTyped

    private void jTableTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMouseClicked
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
    }//GEN-LAST:event_jTableTabelaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxProfissional;
    private javax.swing.JComboBox jComboBoxVacina;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAplicacoes;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelPaciente;
    private javax.swing.JLabel jLabelProfissional;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField jTextFieldLocal;
    private javax.swing.JTextField jTextFieldPaciente;
    // End of variables declaration//GEN-END:variables
}
