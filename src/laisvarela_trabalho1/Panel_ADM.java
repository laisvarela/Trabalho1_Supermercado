package laisvarela_trabalho1;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.JTextComponent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class Panel_ADM extends javax.swing.JPanel {

    JFrame janela = new JFrame();

    public Panel_ADM() {
        initComponents();
        atualizaTree();
        janela.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop_produtos = new javax.swing.JPopupMenu();
        menu_adicionar = new javax.swing.JMenuItem();
        menu_Remover = new javax.swing.JMenuItem();
        menu_editar = new javax.swing.JMenuItem();
        menu_visualizar = new javax.swing.JMenuItem();
        pop_Clientes = new javax.swing.JPopupMenu();
        menuC_visualizar = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_sair = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tree_sistema = new javax.swing.JTree();
        pn_visualizarProduto = new javax.swing.JPanel();
        lb_nome5 = new javax.swing.JLabel();
        lb_nome6 = new javax.swing.JLabel();
        lb_nome7 = new javax.swing.JLabel();
        lb_nome8 = new javax.swing.JLabel();
        bt_fecharVisualizarProduto = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        lb_nomeProduto = new javax.swing.JLabel();
        bt_editar = new javax.swing.JButton();
        lb_dataProduto = new javax.swing.JLabel();
        lb_codigoProduto = new javax.swing.JLabel();
        lb_valorProduto = new javax.swing.JFormattedTextField();
        pn_cadastroProduto = new javax.swing.JPanel();
        lb_nome1 = new javax.swing.JLabel();
        lb_nome2 = new javax.swing.JLabel();
        lb_nome3 = new javax.swing.JLabel();
        lb_nome4 = new javax.swing.JLabel();
        txt_produtoNome = new javax.swing.JTextField();
        txt_valor = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        txt_data = new javax.swing.JFormattedTextField();
        bt_cadastro = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        bt_fecharCadastro = new javax.swing.JButton();
        pn_visualizarCliente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        lb_endereco = new javax.swing.JLabel();
        lb_dataNasci = new javax.swing.JLabel();
        lb_cpf = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lb_numero = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lb_celular = new javax.swing.JLabel();
        bt_fecharVisualizarCliente = new javax.swing.JButton();

        menu_adicionar.setText("Adicionar produtos");
        menu_adicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_adicionarMousePressed(evt);
            }
        });
        pop_produtos.add(menu_adicionar);

        menu_Remover.setText("Remover");
        menu_Remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_RemoverMousePressed(evt);
            }
        });
        pop_produtos.add(menu_Remover);

        menu_editar.setText("Editar");
        menu_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_editarMousePressed(evt);
            }
        });
        pop_produtos.add(menu_editar);

        menu_visualizar.setText("Visualizar");
        menu_visualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_visualizarMousePressed(evt);
            }
        });
        pop_produtos.add(menu_visualizar);

        menuC_visualizar.setText("Visualizar");
        menuC_visualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuC_visualizarMousePressed(evt);
            }
        });
        pop_Clientes.add(menuC_visualizar);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Supermercado IFSC");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ifsc.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_sair.setBackground(new java.awt.Color(255, 255, 255));
        bt_sair.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_sair.setText("Sair");
        bt_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_sairMouseClicked(evt);
            }
        });

        jSeparator4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tree_sistema.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));
        tree_sistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tree_sistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_sistemaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tree_sistema);

        pn_cadastroProduto.setVisible(false);
        pn_visualizarProduto.setVisible(false);
        pn_visualizarCliente.setVisible(false);
        pn_visualizarProduto.setBackground(new java.awt.Color(255, 255, 255));
        pn_visualizarProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));

        lb_nome5.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_nome5.setText("Nome:");

        lb_nome6.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_nome6.setText("Data de Validade:");

        lb_nome7.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_nome7.setText("Código:");

        lb_nome8.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_nome8.setText("Valor: R$");

        bt_fecharVisualizarProduto.setBackground(new java.awt.Color(255, 255, 255));
        bt_fecharVisualizarProduto.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_fecharVisualizarProduto.setText("Fechar");
        bt_fecharVisualizarProduto.setActionCommand("Verificar <br>\\tDisponibilidade<br>");
        bt_fecharVisualizarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_fecharVisualizarProdutoMouseClicked(evt);
            }
        });

        lb_nomeProduto.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lb_nomeProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.pink));

        bt_editar.setBackground(new java.awt.Color(255, 255, 255));
        bt_editar.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_editar.setText("Editar");
        bt_editar.setActionCommand("Verificar <br>\\tDisponibilidade<br>");
        bt_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_editarMouseClicked(evt);
            }
        });

        lb_dataProduto.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lb_dataProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.pink));

        lb_codigoProduto.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lb_codigoProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.pink));

        lb_valorProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.pink));
        lb_valorProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        javax.swing.GroupLayout pn_visualizarProdutoLayout = new javax.swing.GroupLayout(pn_visualizarProduto);
        pn_visualizarProduto.setLayout(pn_visualizarProdutoLayout);
        pn_visualizarProdutoLayout.setHorizontalGroup(
            pn_visualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_visualizarProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_visualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8)
                    .addGroup(pn_visualizarProdutoLayout.createSequentialGroup()
                        .addComponent(lb_nome5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_nomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pn_visualizarProdutoLayout.createSequentialGroup()
                        .addComponent(bt_fecharVisualizarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(bt_editar))
                    .addGroup(pn_visualizarProdutoLayout.createSequentialGroup()
                        .addComponent(lb_nome7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_codigoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pn_visualizarProdutoLayout.createSequentialGroup()
                        .addComponent(lb_nome8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_valorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_visualizarProdutoLayout.createSequentialGroup()
                        .addComponent(lb_nome6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_dataProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_visualizarProdutoLayout.setVerticalGroup(
            pn_visualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_visualizarProdutoLayout.createSequentialGroup()
                .addGroup(pn_visualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pn_visualizarProdutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb_nome5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lb_nomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_visualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_visualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_dataProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_visualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_valorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome8))
                .addGap(18, 18, 18)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_visualizarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_fecharVisualizarProduto)
                    .addComponent(bt_editar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_cadastroProduto.setBackground(new java.awt.Color(255, 255, 255));
        pn_cadastroProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));

        lb_nome1.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_nome1.setText("Nome:");

        lb_nome2.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_nome2.setText("Data de Validade:");

        lb_nome3.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_nome3.setText("Código:");

        lb_nome4.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        lb_nome4.setText("Valor: R$");

        txt_produtoNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));

        txt_valor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));

        txt_codigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));

        txt_data.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));
        try {
            txt_data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        bt_cadastro.setBackground(new java.awt.Color(255, 255, 255));
        bt_cadastro.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_cadastro.setText("Salvar");
        bt_cadastro.setActionCommand("Verificar <br>\\tDisponibilidade<br>");
        bt_cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastroMouseClicked(evt);
            }
        });

        bt_fecharCadastro.setBackground(new java.awt.Color(255, 255, 255));
        bt_fecharCadastro.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_fecharCadastro.setText("Fechar");
        bt_fecharCadastro.setActionCommand("Verificar <br>\\tDisponibilidade<br>");
        bt_fecharCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_fecharCadastroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_cadastroProdutoLayout = new javax.swing.GroupLayout(pn_cadastroProduto);
        pn_cadastroProduto.setLayout(pn_cadastroProdutoLayout);
        pn_cadastroProdutoLayout.setHorizontalGroup(
            pn_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_cadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7)
                    .addGroup(pn_cadastroProdutoLayout.createSequentialGroup()
                        .addGroup(pn_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_cadastroProdutoLayout.createSequentialGroup()
                                .addComponent(lb_nome3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_codigo))
                            .addGroup(pn_cadastroProdutoLayout.createSequentialGroup()
                                .addComponent(lb_nome1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_produtoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_cadastroProdutoLayout.createSequentialGroup()
                                .addComponent(lb_nome2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_data))
                            .addGroup(pn_cadastroProdutoLayout.createSequentialGroup()
                                .addComponent(lb_nome4)
                                .addGap(10, 10, 10)
                                .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_cadastroProdutoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(bt_fecharCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_cadastro)))
                .addContainerGap())
        );
        pn_cadastroProdutoLayout.setVerticalGroup(
            pn_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_cadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome1)
                    .addComponent(txt_produtoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome3)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome2)
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome4)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cadastro)
                    .addComponent(bt_fecharCadastro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_visualizarCliente.setBackground(new java.awt.Color(255, 255, 255));
        pn_visualizarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.pink, java.awt.Color.lightGray));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel3.setText("Nome:");

        lb_nome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(255, 204, 204)));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel5.setText("CPF:");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel6.setText("Data de Nascimento:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel7.setText("Endereço:");

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jSeparator6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel8.setText("Número:");

        lb_endereco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(255, 204, 204)));

        lb_dataNasci.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(255, 204, 204)));

        lb_cpf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(255, 204, 204)));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel13.setText("Email:");

        lb_numero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(255, 204, 204)));

        lb_email.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(255, 204, 204)));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel15.setText("Celular:");

        lb_celular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(255, 204, 204)));

        bt_fecharVisualizarCliente.setBackground(new java.awt.Color(255, 255, 255));
        bt_fecharVisualizarCliente.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        bt_fecharVisualizarCliente.setText("Fechar");
        bt_fecharVisualizarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_fecharVisualizarClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_visualizarClienteLayout = new javax.swing.GroupLayout(pn_visualizarCliente);
        pn_visualizarCliente.setLayout(pn_visualizarClienteLayout);
        pn_visualizarClienteLayout.setHorizontalGroup(
            pn_visualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_visualizarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_visualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_visualizarClienteLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pn_visualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_visualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pn_visualizarClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lb_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(177, 177, 177))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_visualizarClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lb_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(203, 203, 203)))
                            .addGroup(pn_visualizarClienteLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_visualizarClienteLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_visualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_visualizarClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lb_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_visualizarClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lb_endereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_visualizarClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lb_dataNasci, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_visualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bt_fecharVisualizarCliente)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_visualizarClienteLayout.setVerticalGroup(
            pn_visualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_visualizarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_visualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_visualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_cpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_visualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(lb_dataNasci, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_visualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lb_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_visualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lb_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_visualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(lb_email, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_visualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(lb_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_fecharVisualizarCliente)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_sair)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn_cadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn_visualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn_visualizarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pn_visualizarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(pn_cadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_visualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_sair)
                .addGap(10, 10, 10))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sairMouseClicked
        Object[] opcoes = {"Sair", "Deslogar"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, "Deseja sair?", "Confirmação",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes);
        switch (opcaoSelecionada) {
            case 0 ->
                System.exit(0);
            case 1 -> {
                Window.login = new Panel_Login();
                janela = (JFrame) SwingUtilities.getWindowAncestor(this);
                janela.remove(Window.inicioADM);
                janela.add(Window.login);
                janela.pack();
            }
        }
    }//GEN-LAST:event_bt_sairMouseClicked

    private void bt_cadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cadastroMouseClicked
        boolean camposVazios = false;
        Component[] componentes = pn_cadastroProduto.getComponents();
        // Verifica se tudo está preenchido corretamente
        for (Component componente : componentes) {
            if (componente instanceof JTextComponent) { // Verifica se é um componente de texto
                if (((JTextComponent) componente).getText().isEmpty()) { // Verifica se o texto está vazio
                    camposVazios = true;
                    JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
                } else if (((JTextComponent) componente).getText().contains("/")) { // verifica se o componente de texto formatado está vazaio
                    if (((JTextComponent) componente).getText().charAt(1) == ' ') {
                        camposVazios = true;
                        JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }
                try { // verifica se data existe
                    LocalDate.parse(txt_data.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                } catch (DateTimeParseException e) {
                    camposVazios = true;
                    JOptionPane.showMessageDialog(null, "Data não existe!", "Erro", JOptionPane.ERROR_MESSAGE);
                    txt_data.setValue("");
                    break;
                }
                if (camposVazios == false) {
                    // verifica se é uma data válida
                    if (LocalDate.parse(txt_data.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")).isBefore(LocalDate.now())) {
                        camposVazios = true;
                        JOptionPane.showMessageDialog(null, "Data de validade inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                        txt_data.setValue("");
                        break;
                    }
                    for (Produto item : Window.produtoList) {
                        if (txt_codigo.equals(item.getCodigo())) {
                            JOptionPane.showMessageDialog(null, "Código inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                            txt_codigo.setText(null);
                        }
                    }
                    if (camposVazios == false) { // cria objeto Produto -> adiciona na lista de produto -> atualiza a JTree -> limpa todos os campos
                        Produto produto = new Produto(txt_produtoNome.getText(), txt_codigo.getText(),
                                Float.parseFloat(txt_valor.getText()), LocalDate.parse(txt_data.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                        Window.produtoList.add(produto);
                        atualizaTree();
                        limpar();
                        desabilitarPaineis();
                        tree_sistema.setEnabled(true);
                        break;
                    }
                }
            }

        }
    }//GEN-LAST:event_bt_cadastroMouseClicked
   
    private DefaultMutableTreeNode produtos() {
        DefaultMutableTreeNode nodeProdutos = new DefaultMutableTreeNode("Produtos"); // novo nodo Produtos
        DefaultMutableTreeNode produtosFilho = new DefaultMutableTreeNode("Nenhum produto cadastrado.");
        if (Window.produtoList.isEmpty()) { // adiciona o nodo que contém a String "Nenhum produto cadastrado
            nodeProdutos.add(produtosFilho);
        } else if (texto().equals("Nenhum produto cadastrado.") && !Window.produtoList.isEmpty()) {
            nodeProdutos.removeAllChildren(); // remove o nodo que contém a String "Nenhum produto cadastrado."
            for (Produto item : Window.produtoList) { // adiciona lista de produtos no nodo
                produtosFilho = new DefaultMutableTreeNode();
                produtosFilho.setUserObject(item.getCodigo());
                nodeProdutos.add(produtosFilho);
            }
        } else {
            for (Produto item : Window.produtoList) {
                produtosFilho = new DefaultMutableTreeNode();
                produtosFilho.setUserObject(item.getCodigo());
                nodeProdutos.add(produtosFilho);
            }
        }
        return nodeProdutos;
    } // método que adiciona nodos de acordo com a lista de produtos

    private DefaultMutableTreeNode clientes() {
        DefaultMutableTreeNode nodeClientes = new DefaultMutableTreeNode("Clientes"); // novo nodo Clientes
        DefaultMutableTreeNode clientesFilho = new DefaultMutableTreeNode("Nenhum cliente cadastrado."); // nodo filho do nodo Clientes
        if (Window.clientList.isEmpty()) {
            nodeClientes.add(clientesFilho);
        } else if (texto().equals("Nenhum cliente cadastrado.") && !Window.clientList.isEmpty()) {
            nodeClientes.removeAllChildren();
            for (Client item : Window.clientList) { // adiciona lista de clientes no nodo
                clientesFilho = new DefaultMutableTreeNode();
                clientesFilho.setUserObject(item.getCpf());
                nodeClientes.add(clientesFilho);
            }
        } else {
            for (Client item : Window.clientList) {
                clientesFilho = new DefaultMutableTreeNode();
                clientesFilho.setUserObject(item.getCpf());
                nodeClientes.add(clientesFilho);
            }
        }
        return nodeClientes;
    } // método que adiciona nodos de acordo com a lista de clientes

    public final void atualizaTree() {
        DefaultTreeModel model = (DefaultTreeModel) tree_sistema.getModel(); //obtem o modelo da arvore
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot(); // obtem a raiz da árvore
        root.removeAllChildren(); // remove todos os itens (tive que fazer em código, pois diretamente no componente não estava funcionando)
        root.setUserObject("Sistema"); // renomeia root para Sistema
        produtos();
        clientes();
        root.add(produtos());
        root.add(clientes());
        model.reload(); // atualiza árvore
    }

    private void bt_fecharVisualizarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_fecharVisualizarProdutoMouseClicked
        pn_visualizarProduto.setVisible(false);
    }//GEN-LAST:event_bt_fecharVisualizarProdutoMouseClicked

    private void bt_fecharCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_fecharCadastroMouseClicked
        pn_cadastroProduto.setVisible(false);
    }//GEN-LAST:event_bt_fecharCadastroMouseClicked
    
    private String texto() {
        String texto = "";
        try {
            texto = tree_sistema.getLastSelectedPathComponent().toString();
        } catch (Exception ex) {
            System.out.println("");
        }
        return texto;
    }

    private void controle_de_Paineis(JPanel atual, JPanel disable1, JPanel disable2) {
        if (disable1.isVisible()) {
            disable1.setVisible(false);
            atual.setVisible(true);
        } else if (disable2.isVisible()) {
            disable2.setVisible(false);
            atual.setVisible(true);
        } else {
            atual.setVisible(true);
        }
    }
    
    private void desabilitarPaineis(){
        pn_cadastroProduto.setVisible(false);
        pn_visualizarCliente.setVisible(false);
        pn_visualizarProduto.setVisible(false);
        
    }
    
    private void editar() {
        if (Window.produtoList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum produto foi cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            int x = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja editar este produto?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            switch (x) {
                case 0 -> {
                    for (Produto item : Window.produtoList) {
                        if (texto().equals(item.getCodigo())) {
                            Window.produtoList.remove(item);
                            controle_de_Paineis(pn_cadastroProduto, pn_visualizarCliente, pn_visualizarProduto);
                            tree_sistema.setEnabled(false);
                        }
                    }
                }
            }
        }
    }
    
    private void bt_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_editarMouseClicked
        editar();
    }//GEN-LAST:event_bt_editarMouseClicked

    private void menu_adicionarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_adicionarMousePressed
        controle_de_Paineis(pn_cadastroProduto, pn_visualizarProduto, pn_visualizarProduto);
    }//GEN-LAST:event_menu_adicionarMousePressed

    private void tree_sistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_sistemaMouseClicked
        tree_sistema.addMouseListener(new MouseAdapter() { // evento do mouseClicked
            @Override
            public void mousePressed(MouseEvent e) {
                String menu = null;
                try {
                    menu = tree_sistema.getLastSelectedPathComponent().toString();
                } catch (Exception ex) {

                }
                int linha = tree_sistema.getRowForLocation(e.getX(), e.getY()); // obtem a linha do nó / método retorna a linha do nó mais proximo das coordenadas do mouse
                TreePath caminho = tree_sistema.getPathForLocation(e.getX(), e.getY()); // e.getX(), e.getY() são as coordenadas do mouse/ esse método retorna o nó mais proximo das coordenadas do mouse
                if (linha != -1) {
                    DefaultMutableTreeNode node = (DefaultMutableTreeNode) caminho.getLastPathComponent(); // método retorna o último componente do caminho de uma árvore
                    if (node.isLeaf() && menu.equals("Nenhum produto cadastrado.")) { // isLeaf -> não possui nenhum nó filho, ou seja, neste caso são os elementos da lista
                        pop_produtos.show(e.getComponent(), e.getX(), e.getY());
                    } else if (node.isLeaf() && menu.equals("Nenhum cliente cadastrado.")) {
                        pop_Clientes.show(e.getComponent(), e.getX(), e.getY());
                    } else {
                        for (Client item : Window.clientList) {
                            if (node.isLeaf() && menu.equals(item.getCpf())) {
                                pop_Clientes.show(e.getComponent(), e.getX(), e.getY()); // abre o popup personalizado de cliente
                            }
                        }

                        for (Produto item : Window.produtoList) {
                            if (node.isLeaf() && menu.equals(item.getCodigo())) {
                                pop_produtos.show(e.getComponent(), e.getX(), e.getY()); // abre o poput personalizado de produto
                            }
                        }
                    }
                }
            }
        });
    }//GEN-LAST:event_tree_sistemaMouseClicked

    private void menu_visualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_visualizarMousePressed
        if (Window.produtoList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum produto foi cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            controle_de_Paineis(pn_visualizarProduto, pn_cadastroProduto, pn_visualizarCliente);
            if (pn_visualizarProduto.isVisible()) {
                if (!Window.produtoList.isEmpty()) {
                    for (Produto item : Window.produtoList) {
                        if (texto().equals(item.getCodigo())) {
                            lb_nomeProduto.setText(item.getNome());
                            lb_codigoProduto.setText(item.getCodigo());
                            lb_dataProduto.setText(String.valueOf(item.getDataValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
                            lb_valorProduto.setText(String.valueOf(item.getValor()));
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_menu_visualizarMousePressed

    private void menuC_visualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuC_visualizarMousePressed
        if (Window.clientList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum cliente foi cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            controle_de_Paineis(pn_visualizarCliente, pn_cadastroProduto, pn_visualizarProduto);
            if (pn_visualizarCliente.isVisible()) {
                if (!Window.clientList.isEmpty()) {
                    for (Client item : Window.clientList) {
                        if (texto().equals(item.getCpf())) {
                            lb_nome.setText(item.getNome());
                            lb_cpf.setText(item.getCpf());
                            lb_dataNasci.setText(String.valueOf(item.getDataNasci().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
                            lb_endereco.setText(item.getEndereco());
                            lb_numero.setText(String.valueOf(item.getNumero()));
                            lb_email.setText(item.getEmail());
                            lb_celular.setText(item.getCelular());
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_menuC_visualizarMousePressed

    private void bt_fecharVisualizarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_fecharVisualizarClienteMouseClicked
        pn_visualizarCliente.setVisible(false);
    }//GEN-LAST:event_bt_fecharVisualizarClienteMouseClicked

    private void menu_editarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_editarMousePressed
        editar();
    }//GEN-LAST:event_menu_editarMousePressed

    private void menu_RemoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_RemoverMousePressed
        if (Window.produtoList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum produto foi cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            for (Produto item : Window.produtoList) {
                if (texto().equals(item.getCodigo())) {
                    Window.produtoList.remove(item);
                    desabilitarPaineis();
                    JOptionPane.showMessageDialog(null, "Elemento removido!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    atualizaTree();
                }
            }
        }

    }//GEN-LAST:event_menu_RemoverMousePressed

    private void limpar() {
        txt_codigo.setText(null);
        txt_data.setText(null);
        txt_produtoNome.setText(null);
        txt_valor.setText(null);
        lb_nomeProduto.setText(null);
        lb_codigoProduto.setText(null);
        lb_dataProduto.setText(null);
        lb_valorProduto.setText(null);
        lb_celular.setText(null);
        lb_cpf.setText(null);
        lb_dataNasci.setText(null);
        lb_email.setText(null);
        lb_endereco.setText(null);
        lb_nome.setText(null);
        lb_numero.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastro;
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_fecharCadastro;
    private javax.swing.JButton bt_fecharVisualizarCliente;
    private javax.swing.JButton bt_fecharVisualizarProduto;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lb_celular;
    private javax.swing.JLabel lb_codigoProduto;
    private javax.swing.JLabel lb_cpf;
    private javax.swing.JLabel lb_dataNasci;
    private javax.swing.JLabel lb_dataProduto;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_endereco;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_nome1;
    private javax.swing.JLabel lb_nome2;
    private javax.swing.JLabel lb_nome3;
    private javax.swing.JLabel lb_nome4;
    private javax.swing.JLabel lb_nome5;
    private javax.swing.JLabel lb_nome6;
    private javax.swing.JLabel lb_nome7;
    private javax.swing.JLabel lb_nome8;
    private javax.swing.JLabel lb_nomeProduto;
    private javax.swing.JLabel lb_numero;
    private javax.swing.JFormattedTextField lb_valorProduto;
    private javax.swing.JMenuItem menuC_visualizar;
    private javax.swing.JMenuItem menu_Remover;
    private javax.swing.JMenuItem menu_adicionar;
    private javax.swing.JMenuItem menu_editar;
    private javax.swing.JMenuItem menu_visualizar;
    private javax.swing.JPanel pn_cadastroProduto;
    private javax.swing.JPanel pn_visualizarCliente;
    private javax.swing.JPanel pn_visualizarProduto;
    private javax.swing.JPopupMenu pop_Clientes;
    private javax.swing.JPopupMenu pop_produtos;
    private javax.swing.JTree tree_sistema;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JFormattedTextField txt_data;
    private javax.swing.JTextField txt_produtoNome;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
