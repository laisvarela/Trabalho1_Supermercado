package laisvarela_trabalho1;

import javax.swing.table.DefaultTableModel;

public class Panel_NotaFiscal extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();

    public Panel_NotaFiscal() {
        initComponents();
        modelo = (DefaultTableModel) tb_produtos.getModel();
        for (Client client : Window.clientList) {
            if (client.getCpf().equals(Window.cpf)) {
                lb_nome.setText(client.getNome());
                lb_cpf.setText(client.getCpf());
                for (Supermercado supermercado : Panel_Cliente.carrinho) {
                    modelo.addRow(new Object[]{supermercado.getNome(),
                        supermercado.getQtd(), supermercado.getValor(), supermercado.getValor() * supermercado.getQtd(),});
                    lb_total.setText(String.valueOf(supermercado.getTotal()));
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_pagamento1 = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        lb_pagamento3 = new javax.swing.JLabel();
        lb_cpf = new javax.swing.JLabel();
        lb_pagamento5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lb_pagamento6 = new javax.swing.JLabel();
        lb_pagamento8 = new javax.swing.JLabel();
        lb_total = new javax.swing.JLabel();
        bt_sair = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_produtos = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lb_pagamento1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lb_pagamento1.setText("Nome:");

        lb_nome.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lb_nome.setText("nome");

        lb_pagamento3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lb_pagamento3.setText("CPF:");

        lb_cpf.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lb_cpf.setText("cpf");

        lb_pagamento5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lb_pagamento5.setText("NOTA FISCAL");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lb_pagamento6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lb_pagamento6.setText("PRODUTOS");

        lb_pagamento8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lb_pagamento8.setText("TOTAL: R$");

        lb_total.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lb_total.setText("total");

        bt_sair.setBackground(new java.awt.Color(255, 255, 255));
        bt_sair.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_sair.setText("Sair");
        bt_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_sairMouseClicked(evt);
            }
        });

        jSeparator4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tb_produtos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));
        tb_produtos.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        tb_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quantidade", "Preço", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_produtos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tb_produtos);
        if (tb_produtos.getColumnModel().getColumnCount() > 0) {
            tb_produtos.getColumnModel().getColumn(0).setResizable(false);
            tb_produtos.getColumnModel().getColumn(1).setResizable(false);
            tb_produtos.getColumnModel().getColumn(2).setResizable(false);
            tb_produtos.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lb_pagamento1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(143, 143, 143))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lb_pagamento3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lb_pagamento6))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lb_pagamento8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_pagamento5)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_sair)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_pagamento5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_pagamento1)
                    .addComponent(lb_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_pagamento3)
                    .addComponent(lb_cpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_pagamento6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_total)
                    .addComponent(lb_pagamento8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_sair)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_sairMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lb_cpf;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_pagamento1;
    private javax.swing.JLabel lb_pagamento3;
    private javax.swing.JLabel lb_pagamento5;
    private javax.swing.JLabel lb_pagamento6;
    private javax.swing.JLabel lb_pagamento8;
    private javax.swing.JLabel lb_total;
    private javax.swing.JTable tb_produtos;
    // End of variables declaration//GEN-END:variables
}
