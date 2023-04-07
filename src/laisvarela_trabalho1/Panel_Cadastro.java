package laisvarela_trabalho1;

import java.awt.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.text.JTextComponent;

public class Panel_Cadastro extends javax.swing.JPanel {

    Client client;
    boolean validar = true;

    public Panel_Cadastro() {
        initComponents();
        cb_bandeira.setVisible(false);
        lb_bandeira.setVisible(false);
        cb_pagamento.addItem("Boleto");
        cb_pagamento.addItem("Cartão");
        cb_pagamento.addItem("Pix");
        cb_bandeira.addItem("Débito - Visa");
        cb_bandeira.addItem("Crédito - Visa");
        cb_bandeira.addItem("Débido - Mastercard");
        cb_bandeira.addItem("Crédito - Mastercard");
        cb_bandeira.addItem("Débido - Elo");
        cb_bandeira.addItem("Crédito - Elo");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pn_cadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lb_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lb_cpf = new javax.swing.JLabel();
        lb_dataNasci = new javax.swing.JLabel();
        lb_pagamento = new javax.swing.JLabel();
        cb_pagamento = new javax.swing.JComboBox<>();
        cb_bandeira = new javax.swing.JComboBox<>();
        lb_bandeira = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lb_endereco = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        lb_numero = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        bt_cancelar = new javax.swing.JButton();
        bt_cadastro = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        lb_nome1 = new javax.swing.JLabel();
        lb_nome2 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        fTxt_dataNasci = new javax.swing.JFormattedTextField();
        fTxt_cpf = new javax.swing.JFormattedTextField();
        fTxt_celular = new javax.swing.JFormattedTextField();
        fTxt_numero = new javax.swing.JFormattedTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lb_login = new javax.swing.JLabel();
        txt_login = new javax.swing.JTextField();
        txt_senha = new javax.swing.JTextField();
        bt_verificar = new javax.swing.JButton();
        lb_nome3 = new javax.swing.JLabel();
        lb_nome4 = new javax.swing.JLabel();
        lb_nome5 = new javax.swing.JLabel();

        pn_cadastro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lb_nome.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_nome.setText("Nome:");

        txt_nome.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txt_nome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));

        lb_cpf.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_cpf.setText("CPF:");

        lb_dataNasci.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_dataNasci.setText("Data de Nascimento:");

        lb_pagamento.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_pagamento.setText("Forma de pagamento:");

        cb_pagamento.setBackground(new java.awt.Color(255, 255, 255));
        cb_pagamento.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cb_pagamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));
        cb_pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pagamentoActionPerformed(evt);
            }
        });

        cb_bandeira.setVisible(false);
        cb_bandeira.setBackground(new java.awt.Color(255, 255, 255));
        cb_bandeira.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cb_bandeira.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));

        lb_bandeira.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_bandeira.setText("Bandeira:");

        lb_endereco.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_endereco.setText("Endereço");

        txt_endereco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));

        lb_numero.setText("Número");

        jSeparator4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_cancelar.setBackground(new java.awt.Color(255, 255, 255));
        bt_cancelar.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_cancelar.setText("Cancelar");
        bt_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cancelarMouseClicked(evt);
            }
        });

        bt_cadastro.setBackground(new java.awt.Color(255, 255, 255));
        bt_cadastro.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_cadastro.setText("Cadastrar");
        bt_cadastro.setActionCommand("Verificar <br>\\tDisponibilidade<br>");
        bt_cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastroMouseClicked(evt);
            }
        });

        lb_nome1.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_nome1.setText("Contato");

        lb_nome2.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_nome2.setText("Email:");

        txt_email.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));

        fTxt_dataNasci.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));
        try {
            fTxt_dataNasci.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        fTxt_cpf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));
        try {
            fTxt_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        fTxt_celular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));
        try {
            fTxt_celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        fTxt_numero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));
        fTxt_numero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lb_login.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        lb_login.setText("Crie um usuário e uma senha!");

        txt_login.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txt_login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));

        txt_senha.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txt_senha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));

        bt_verificar.setBackground(new java.awt.Color(255, 255, 255));
        bt_verificar.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_verificar.setText("Verificar");
        bt_verificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_verificarMouseClicked(evt);
            }
        });

        lb_nome3.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_nome3.setText("Usuário:");

        lb_nome4.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_nome4.setText("Senha:");

        lb_nome5.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_nome5.setText("Celular:");

        javax.swing.GroupLayout pn_cadastroLayout = new javax.swing.GroupLayout(pn_cadastro);
        pn_cadastro.setLayout(pn_cadastroLayout);
        pn_cadastroLayout.setHorizontalGroup(
            pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_cadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_cadastroLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_endereco)
                            .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_cadastroLayout.createSequentialGroup()
                                .addComponent(lb_numero)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pn_cadastroLayout.createSequentialGroup()
                                .addComponent(fTxt_numero)
                                .addGap(31, 31, 31))))
                    .addGroup(pn_cadastroLayout.createSequentialGroup()
                        .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_cadastroLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_pagamento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_bandeira)
                                    .addComponent(cb_bandeira, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_cadastroLayout.createSequentialGroup()
                                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_cadastroLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(pn_cadastroLayout.createSequentialGroup()
                                                .addComponent(lb_cpf)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(fTxt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lb_dataNasci)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fTxt_dataNasci, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pn_cadastroLayout.createSequentialGroup()
                                                .addComponent(lb_nome)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pn_cadastroLayout.createSequentialGroup()
                                .addComponent(bt_cancelar)
                                .addGap(248, 248, 248)
                                .addComponent(bt_cadastro)))
                        .addGap(18, 18, 18))
                    .addGroup(pn_cadastroLayout.createSequentialGroup()
                        .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_cadastroLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_nome1)
                                    .addGroup(pn_cadastroLayout.createSequentialGroup()
                                        .addComponent(lb_nome2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lb_nome5)
                                        .addGap(12, 12, 12)
                                        .addComponent(fTxt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lb_login)
                            .addGroup(pn_cadastroLayout.createSequentialGroup()
                                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn_cadastroLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(lb_nome3))
                                    .addComponent(lb_nome4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(txt_login))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_verificar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pn_cadastroLayout.setVerticalGroup(
            pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_cadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cpf)
                    .addComponent(lb_dataNasci)
                    .addComponent(fTxt_dataNasci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fTxt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_endereco)
                    .addComponent(lb_numero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fTxt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_nome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome2)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fTxt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome5))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_pagamento)
                    .addComponent(lb_bandeira))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_bandeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_login, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome3)
                    .addComponent(bt_verificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancelar)
                    .addComponent(bt_cadastro))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pn_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cadastroMouseClicked
        boolean camposVazios = false;
        Component[] componentes = pn_cadastro.getComponents();
        // Verifica se tudo está preenchido corretamente
        for (Component componente : componentes) {
            if (componente instanceof JTextComponent) { // Verifica se é um componente de texto
                if (((JTextComponent) componente).getText().isEmpty()) { // Verifica se o texto está vazio
                    camposVazios = true;
                    JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
                    // os componentes do tipo JFormattedTextField não estão vazios
                    // pois possuem uma máscara
                    // é necessário fazer uma segunda verificação específica para estes componentes
                } else if (((JTextComponent) componente).getText().contains("-")
                        || ((JTextComponent) componente).getText().contains("/")) {
                    if (((JTextComponent) componente).getText().charAt(1) == ' ') {
                        // todos os componentes do tipo JFormattedTextField possuem um espaço em branco
                        // na segunda posição, uso isso como um ponto em comum para identificar se estão vazios
                        camposVazios = true;
                        JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }
                if (camposVazios == false) {
                    if (fTxt_numero.getText().length() > 4) {
                        camposVazios = true;
                        JOptionPane.showMessageDialog(null, "Número inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                        fTxt_numero.setText(null);
                    }
                    try {
                        LocalDate.parse(fTxt_dataNasci.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    } catch (DateTimeParseException e) {
                        // checa se dia/mês/ano são existentes
                        // se não, camposVazios = true e impede o erro de LocalDate.parse no if (x = falase)
                        camposVazios = true;
                        JOptionPane.showMessageDialog(null, "Data de nascimento não existe!", "Erro", JOptionPane.ERROR_MESSAGE);
                        fTxt_dataNasci.setValue("");
                        break;
                    }
                    if (camposVazios == false) {
                        // camposVazios != true significa data válida, então entra na segunda verificação
                        if (LocalDate.parse(fTxt_dataNasci.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")).isAfter(LocalDate.now())
                                || LocalDate.parse(fTxt_dataNasci.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")).isBefore(LocalDate.ofEpochDay(1823))) {
                            camposVazios = true;
                            JOptionPane.showMessageDialog(null, "Data de nascimento inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                            fTxt_dataNasci.setValue("");
                            break;
                        }
                        if (!Window.clientList.isEmpty()) {
                            for (Client item : Window.clientList) {
                                if (fTxt_cpf.getText().equals(item.getCpf())) {
                                    JOptionPane.showMessageDialog(null, "CPF já cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                                    fTxt_cpf.setValue("");
                                }
                            }
                        } else if (fTxt_cpf.getText().equals(Window.loginADM)) {
                            JOptionPane.showMessageDialog(null, "CPF já cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                            fTxt_cpf.setText(null);
                            fTxt_cpf.setValue("");
                        }
                    }
                }
            }
        }
        if (camposVazios == false) { // tudo está preenchido corretamente
            if (validar == true) { // o usuário é válido
                if (cb_pagamento.getSelectedItem().toString().equals("Cartões")) { // atribui valor em todas as variáveis do client
                    client = new Client(txt_nome.getText(), fTxt_cpf.getText(), txt_email.getText(), fTxt_celular.getText(),
                            txt_endereco.getText(), Integer.parseInt(fTxt_numero.getText()),
                            cb_pagamento.getSelectedItem().toString(), cb_bandeira.getSelectedItem().toString(),
                            LocalDate.parse(fTxt_dataNasci.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                            txt_login.getText(), txt_senha.getText());
                    Window.clientList.add(client);
                    limpar();
                } else { // bandeira não precisa de valor atribuito
                    client = new Client(txt_nome.getText(), fTxt_cpf.getText(), txt_email.getText(), fTxt_celular.getText(),
                            txt_endereco.getText(), Integer.parseInt(fTxt_numero.getText()),
                            cb_pagamento.getSelectedItem().toString(), LocalDate.parse(fTxt_dataNasci.getText(),
                            DateTimeFormatter.ofPattern("dd/MM/yyyy")), txt_login.getText(), txt_senha.getText());
                    Window.clientList.add(client);
                    Panel_ADM adm = new Panel_ADM();
                    adm.atualizaTree();
                    limpar();
                }
                Window.login = new Panel_Login();
                JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
                janela.remove(Window.cadastro);
                janela.add(Window.login);
                janela.pack();
            }
        }
    }//GEN-LAST:event_bt_cadastroMouseClicked

    private void bt_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cancelarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_cancelarMouseClicked

    private void cb_pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_pagamentoActionPerformed
        if (cb_pagamento.getSelectedItem().equals("Cartão")) {
            lb_bandeira.setVisible(true);
            cb_bandeira.setVisible(true);
        }
    }//GEN-LAST:event_cb_pagamentoActionPerformed

    private void bt_verificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_verificarMouseClicked
        if (!Window.clientList.isEmpty()) {
            for (Client item : Window.clientList) {
                if (item.getLogin().equals(txt_login.getText())) {
                    JOptionPane.showMessageDialog(null, "Já existe alguém com este nome de usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
                    txt_login.setText(null);
                    validar = false;
                } else {
                    validar = true;
                    JOptionPane.showMessageDialog(null, "Usuário disponível!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuário disponível!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bt_verificarMouseClicked

    private void limpar() {
        txt_nome.setText(null);
        txt_email.setText(null);
        txt_endereco.setText(null);
        fTxt_celular.setText(null);
        fTxt_cpf.setText(null);
        fTxt_dataNasci.setText(null);
        fTxt_numero.setText(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastro;
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_verificar;
    private javax.swing.JComboBox<String> cb_bandeira;
    private javax.swing.JComboBox<String> cb_pagamento;
    private javax.swing.JFormattedTextField fTxt_celular;
    private javax.swing.JFormattedTextField fTxt_cpf;
    private javax.swing.JFormattedTextField fTxt_dataNasci;
    private javax.swing.JFormattedTextField fTxt_numero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lb_bandeira;
    private javax.swing.JLabel lb_cpf;
    private javax.swing.JLabel lb_dataNasci;
    private javax.swing.JLabel lb_endereco;
    private javax.swing.JLabel lb_login;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_nome1;
    private javax.swing.JLabel lb_nome2;
    private javax.swing.JLabel lb_nome3;
    private javax.swing.JLabel lb_nome4;
    private javax.swing.JLabel lb_nome5;
    private javax.swing.JLabel lb_numero;
    private javax.swing.JLabel lb_pagamento;
    private static javax.swing.JPanel pn_cadastro;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_login;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_senha;
    // End of variables declaration//GEN-END:variables
}
