package laisvarela_trabalho1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Panel_Cliente extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();
    static LinkedList<Supermercado> carrinho = new LinkedList<>();
    Supermercado sm = new Supermercado();

    public Panel_Cliente() {
        initComponents();
        lb_user.setText(Window.user); // atualiza nome do usuário
        lb_pagamento.setText(Window.pagamento); // atualiza label de pagamento
        lb_bandeira.setText(Window.bandeira); // atualiza label de bandeira

        modelo = (DefaultTableModel) tb_produtos.getModel();
        for (Produto item : Window.produtoList) {
            modelo.addRow(new Object[]{item.getNome(), item.getCodigo(), item.getDataValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                item.getValor(), false, item.getQtd()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop_deslogar = new javax.swing.JPopupMenu();
        menu_delogar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb_user = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_produtos = new javax.swing.JTable();
        bt_sair = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pn_qtd = new javax.swing.JPanel();
        bt_qtdSubtrair = new javax.swing.JButton();
        bt_qtdSomar = new javax.swing.JButton();
        lb_qtd = new javax.swing.JLabel();
        pn_total = new javax.swing.JPanel();
        bt_confirmar = new javax.swing.JButton();
        bt_alterar = new javax.swing.JButton();
        lb_pagamento = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_total = new javax.swing.JLabel();
        lb_bandeira = new javax.swing.JLabel();
        pn_pagamento = new javax.swing.JPanel();
        lb_pagamento1 = new javax.swing.JLabel();
        cb_pagamento = new javax.swing.JComboBox<>();
        lb_bandeira1 = new javax.swing.JLabel();
        cb_bandeira = new javax.swing.JComboBox<>();
        bt_salvar = new javax.swing.JButton();

        menu_delogar.setText("jMenuItem1");
        pop_deslogar.add(menu_delogar);

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente.jpg"))); // NOI18N
        jLabel1.setComponentPopupMenu(pop_deslogar);

        lb_user.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lb_user.setForeground(new java.awt.Color(255, 255, 255));
        lb_user.setText("User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_user, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_user)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tb_produtos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));
        tb_produtos.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tb_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Código", "Validade", "Preço", "Carrinho", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.Boolean.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_produtos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb_produtos.setGridColor(new java.awt.Color(51, 102, 0));
        tb_produtos.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tb_produtos.getTableHeader().setReorderingAllowed(false);
        tb_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_produtosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_produtos);
        if (tb_produtos.getColumnModel().getColumnCount() > 0) {
            tb_produtos.getColumnModel().getColumn(0).setResizable(false);
            tb_produtos.getColumnModel().getColumn(1).setResizable(false);
            tb_produtos.getColumnModel().getColumn(2).setResizable(false);
            tb_produtos.getColumnModel().getColumn(3).setResizable(false);
            tb_produtos.getColumnModel().getColumn(4).setResizable(false);
            tb_produtos.getColumnModel().getColumn(5).setResizable(false);
        }

        bt_sair.setBackground(new java.awt.Color(255, 255, 255));
        bt_sair.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_sair.setText("Sair");
        bt_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_sairMouseClicked(evt);
            }
        });

        pn_qtd.setBackground(new java.awt.Color(255, 255, 255));

        bt_qtdSubtrair.setBackground(new java.awt.Color(255, 255, 255));
        bt_qtdSubtrair.setText("-");
        bt_qtdSubtrair.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bt_qtdSubtrair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_qtdSubtrairMouseClicked(evt);
            }
        });

        bt_qtdSomar.setBackground(new java.awt.Color(255, 255, 255));
        bt_qtdSomar.setText("+");
        bt_qtdSomar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bt_qtdSomar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_qtdSomarMouseClicked(evt);
            }
        });

        lb_qtd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_qtd.setText("0");

        javax.swing.GroupLayout pn_qtdLayout = new javax.swing.GroupLayout(pn_qtd);
        pn_qtd.setLayout(pn_qtdLayout);
        pn_qtdLayout.setHorizontalGroup(
            pn_qtdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_qtdLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_qtdSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_qtdSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        pn_qtdLayout.setVerticalGroup(
            pn_qtdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_qtdLayout.createSequentialGroup()
                .addGroup(pn_qtdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_qtdSubtrair)
                    .addComponent(bt_qtdSomar)
                    .addComponent(lb_qtd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pn_total.setBackground(new java.awt.Color(255, 255, 255));

        bt_confirmar.setBackground(new java.awt.Color(255, 255, 255));
        bt_confirmar.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_confirmar.setText("Confirmar");
        bt_confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_confirmarMouseClicked(evt);
            }
        });

        bt_alterar.setBackground(new java.awt.Color(255, 255, 255));
        bt_alterar.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_alterar.setText("Alterar");
        bt_alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_alterarMouseClicked(evt);
            }
        });

        lb_pagamento.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lb_pagamento.setText("jLabel8");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel7.setText("Forma de pagamento:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setText("Total: R$");

        lb_total.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        lb_total.setText("0.0");

        lb_bandeira.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lb_bandeira.setText("b");

        javax.swing.GroupLayout pn_totalLayout = new javax.swing.GroupLayout(pn_total);
        pn_total.setLayout(pn_totalLayout);
        pn_totalLayout.setHorizontalGroup(
            pn_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_totalLayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_pagamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_bandeira)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_confirmar))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_totalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_total)
                .addContainerGap())
        );
        pn_totalLayout.setVerticalGroup(
            pn_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_totalLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(pn_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lb_total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_confirmar)
                    .addComponent(bt_alterar)
                    .addComponent(lb_pagamento)
                    .addComponent(jLabel7)
                    .addComponent(lb_bandeira)))
        );

        pn_pagamento.setVisible(false);
        cb_bandeira.setVisible(false);
        lb_bandeira1.setVisible(false);
        cb_pagamento.addItem("Boleto");
        cb_pagamento.addItem("Cartão");
        cb_pagamento.addItem("Pix");
        cb_bandeira.addItem("Débito - Visa");
        cb_bandeira.addItem("Crédito - Visa");
        cb_bandeira.addItem("Débido - Mastercard");
        cb_bandeira.addItem("Crédito - Mastercard");
        cb_bandeira.addItem("Débido - Elo");
        cb_bandeira.addItem("Crédito - Elo");
        pn_pagamento.setBackground(new java.awt.Color(255, 255, 255));

        lb_pagamento1.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_pagamento1.setText("Forma de pagamento:");

        cb_pagamento.setBackground(new java.awt.Color(255, 255, 255));
        cb_pagamento.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cb_pagamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));
        cb_pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pagamentoActionPerformed(evt);
            }
        });

        lb_bandeira1.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_bandeira1.setText("Bandeira:");

        cb_bandeira.setVisible(false);
        cb_bandeira.setBackground(new java.awt.Color(255, 255, 255));
        cb_bandeira.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cb_bandeira.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));

        bt_salvar.setBackground(new java.awt.Color(255, 255, 255));
        bt_salvar.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_salvar.setText("Salvar");
        bt_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_salvarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_pagamentoLayout = new javax.swing.GroupLayout(pn_pagamento);
        pn_pagamento.setLayout(pn_pagamentoLayout);
        pn_pagamentoLayout.setHorizontalGroup(
            pn_pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_pagamentoLayout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addComponent(bt_salvar)
                .addContainerGap())
            .addGroup(pn_pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_pagamentoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pn_pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cb_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_pagamento1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lb_bandeira1)
                        .addComponent(cb_bandeira, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );
        pn_pagamentoLayout.setVerticalGroup(
            pn_pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_pagamentoLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(bt_salvar)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(pn_pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_pagamentoLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(pn_pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_pagamento1)
                        .addComponent(lb_bandeira1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(pn_pagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_bandeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(69, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_sair)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pn_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pn_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(bt_sair)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_alterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_alterarMouseClicked
        pn_total.setVisible(false);
        pn_pagamento.setVisible(true);
    }//GEN-LAST:event_bt_alterarMouseClicked

    private void bt_confirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_confirmarMouseClicked
        Object[] opcoes = {"Sim", "Não"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, "Deseja confirmar compra?", "Confirmação",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes);
        switch (opcaoSelecionada) {
            case 0 -> {
                if (!carrinho.isEmpty()) {
                    Window.notaFiscal = new Panel_NotaFiscal();
                    JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
                    janela.remove(Window.inicioClient);
                    janela.add(Window.notaFiscal);
                    janela.pack();
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum item no carrinho!", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_bt_confirmarMouseClicked

    private void bt_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sairMouseClicked
        Object[] opcoes = {"Sair", "Deslogar"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, "Deseja sair?", "Confirmação",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes);
        switch (opcaoSelecionada) {
            case 0 ->
                System.exit(0);
            case 1 -> {
                Window.login = new Panel_Login();
                JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
                janela.remove(Window.inicioClient);
                janela.add(Window.login);
                janela.pack();
            }
        }
    }//GEN-LAST:event_bt_sairMouseClicked
    private int checarRowSelecionado(String operador) {
        int row = tb_produtos.getSelectedRow(); // obtem a linha selecionada
        Object rowProdtuo = null, rowValor = null;
        BigDecimal arredondar;
        float x = 0; // calculo do total {valor*qtd}
        boolean check = (boolean) modelo.getValueAt(row, 4);
        if (tb_produtos.isRowSelected(row)) { // verifica se a linha está seleciodada

            rowProdtuo = modelo.getValueAt(row, 1); // obtem a string contida na linha selecionada, coluna Código
            rowValor = modelo.getValueAt(row, 3);
            int valor = (int) modelo.getValueAt(row, 5); // pega o valor contido na linha selecionada, coluna Quantidade
            lb_qtd.setText(String.valueOf(valor)); // altera o valor da lb_qtd

            if (operador.equals("soma")) { // Verifica que o botão soma foi pressionado
                for (Produto item : Window.produtoList) {
                    if (rowProdtuo.equals(item.getCodigo())) { // verifica se o código na linha existe na lista
                        item.setQtd(item.getQtd() + 1);
                        modelo.setValueAt(item.getQtd(), row, 5); // atualiza o da quantidade
                        valor = (int) modelo.getValueAt(row, 5);
                        lb_qtd.setText(String.valueOf(valor)); // atualiza da lb_qtd
                        if (!carrinho.isEmpty()) {
                            for (Supermercado supermercado : carrinho) {
                                if (rowProdtuo.equals(supermercado.getCodigo())) {
                                    supermercado.setQtd(supermercado.getQtd() + 1);
                                    if (rowValor.equals(supermercado.getValor()) && check == true) {
                                        sm.setTotal(sm.getTotal() + supermercado.getValor());
                                        arredondar = BigDecimal.valueOf(sm.getTotal()).setScale(2, RoundingMode.HALF_UP);
                                        lb_total.setText(String.valueOf(arredondar));
                                        supermercado.setTotal(Float.parseFloat(lb_total.getText()));
                                    }
                                }
                            }
                        }

                    }
                }
            } else if (operador.equals("subtrair")) {
                if (valor > 0) {
                    for (Produto item : Window.produtoList) {
                        if (rowProdtuo.equals(item.getCodigo())) {
                            item.setQtd(item.getQtd() - 1);
                            modelo.setValueAt(item.getQtd(), row, 5);
                            valor = (int) modelo.getValueAt(row, 5);
                            lb_qtd.setText(String.valueOf(valor));
                            if (!carrinho.isEmpty()) {
                                for (Supermercado supermercado : carrinho) {
                                    if (rowProdtuo.equals(supermercado.getCodigo())) {
                                        supermercado.setQtd(supermercado.getQtd() - 1);
                                        if (rowValor.equals(supermercado.getValor()) && check == true) {
                                            sm.setTotal(sm.getTotal() - supermercado.getValor());
                                            arredondar = BigDecimal.valueOf(sm.getTotal()).setScale(2, RoundingMode.HALF_UP);
                                            lb_total.setText(String.valueOf(arredondar));
                                            supermercado.setTotal(Float.parseFloat(lb_total.getText()));
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Quantidade igual a zero!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else if (operador.equals("checkBox")) {
                boolean adiciona = false; // variável de controle 
                if (check == true) {
                    for (Supermercado item : carrinho) { // verifica se o item já existe na lista
                        if (rowProdtuo.equals(item.getCodigo())) { // se sim -> adiciona = true
                            adiciona = true;
                        }
                    }
                    if (adiciona == false) { // adiciona na lista 
                        Supermercado supermercado = new Supermercado((String) modelo.getValueAt(row, 0),
                                (String) modelo.getValueAt(row, 1), LocalDate.parse((CharSequence) modelo.getValueAt(row, 2), DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                                (float) modelo.getValueAt(row, 3), (int) modelo.getValueAt(row, 5), Float.parseFloat(lb_total.getText()));
                        carrinho.add(supermercado);
                    }

                    if (lb_total.getText().equals("0.0")) {
                        x = total((float) modelo.getValueAt(row, 3), (int) modelo.getValueAt(row, 5));
                        sm.setTotal(x);
                        lb_total.setText(String.valueOf(sm.getTotal()));
                        for (Supermercado item : carrinho) {
                            if (rowProdtuo.equals(item.getCodigo())) { 
                                item.setTotal(Float.parseFloat(lb_total.getText()));
                            }
                        }
                    } else if (adiciona == false) {
                        x = total((float) modelo.getValueAt(row, 3), (int) modelo.getValueAt(row, 5));
                        sm.setTotal(sm.getTotal() + x);
                        arredondar = BigDecimal.valueOf(sm.getTotal()).setScale(2, RoundingMode.HALF_UP);
                        lb_total.setText(String.valueOf(arredondar));
                        for (Supermercado item : carrinho) { 
                            if (rowProdtuo.equals(item.getCodigo())) { 
                                item.setTotal(Float.parseFloat(lb_total.getText()));
                            }
                        }
                    }

                } else {
                    if (!carrinho.isEmpty()) {
                        for (Supermercado item : carrinho) {
                            if (rowValor.equals(item.getValor())) {
                                x = total(item.getValor(), item.getQtd());
                                sm.setTotal(sm.getTotal() - x);
                                arredondar = BigDecimal.valueOf(sm.getTotal()).setScale(2, RoundingMode.HALF_UP);
                                lb_total.setText(String.valueOf(arredondar));
                                item.setTotal(Float.parseFloat(lb_total.getText()));
                                carrinho.remove(item);
                            }
                        }
                    }
                }
            }
        }
        return row;
    }

    private float total(float valor, int qtd) {
        return valor * qtd;
    }
    private void bt_qtdSomarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_qtdSomarMouseClicked
        checarRowSelecionado("soma");

    }//GEN-LAST:event_bt_qtdSomarMouseClicked

    private void bt_qtdSubtrairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_qtdSubtrairMouseClicked
        checarRowSelecionado("subtrair");
    }//GEN-LAST:event_bt_qtdSubtrairMouseClicked

    private void tb_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_produtosMouseClicked
        checarRowSelecionado("");
        boolean x = (boolean) modelo.getValueAt(checarRowSelecionado(""), 4);
        if (tb_produtos.isRowSelected(checarRowSelecionado("")) && (x == true || x == false)) {
            checarRowSelecionado("checkBox");
        }
    }//GEN-LAST:event_tb_produtosMouseClicked

    private void cb_pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_pagamentoActionPerformed
        if (cb_pagamento.getSelectedItem().equals("Cartão")) {
            lb_bandeira.setVisible(true);
            cb_bandeira.setVisible(true);
        }
    }//GEN-LAST:event_cb_pagamentoActionPerformed

    private void bt_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salvarMouseClicked
        for (Client cliente : Window.clientList) {
            if (cliente.getCpf().equals(Window.cpf)) {
                if (cb_pagamento.getSelectedItem().equals("Cartão")) {
                    cliente.setPagamento((String) cb_pagamento.getSelectedItem());
                    cliente.setBandeira((String) cb_bandeira.getSelectedItem());
                    lb_bandeira.setText(cliente.getBandeira());
                    lb_pagamento.setText(cliente.getPagamento());
                } else {
                    cliente.setPagamento((String) cb_pagamento.getSelectedItem());
                    lb_pagamento.setText(cliente.getPagamento());
                }
            }
        }
        pn_total.setVisible(true);
        pn_pagamento.setVisible(false);
    }//GEN-LAST:event_bt_salvarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_cancelar1;
    private javax.swing.JButton bt_confirmar;
    private javax.swing.JButton bt_qtdSomar;
    private javax.swing.JButton bt_qtdSubtrair;
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JComboBox<String> cb_bandeira;
    private javax.swing.JComboBox<String> cb_pagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_bandeira;
    private javax.swing.JLabel lb_bandeira1;
    private javax.swing.JLabel lb_pagamento;
    private javax.swing.JLabel lb_pagamento1;
    private javax.swing.JLabel lb_qtd;
    private javax.swing.JLabel lb_total;
    private javax.swing.JLabel lb_user;
    private javax.swing.JMenuItem menu_delogar;
    private javax.swing.JPanel pn_pagamento;
    private javax.swing.JPanel pn_qtd;
    private javax.swing.JPanel pn_total;
    private javax.swing.JPopupMenu pop_deslogar;
    private javax.swing.JTable tb_produtos;
    // End of variables declaration//GEN-END:variables
}
