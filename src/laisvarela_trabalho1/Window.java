package laisvarela_trabalho1;

import java.awt.BorderLayout;
import java.time.LocalDate;
import java.util.LinkedList;

public class Window extends javax.swing.JFrame {

    static Panel_Cadastro cadastro;
    static Panel_Login login;
    static Panel_ADM inicioADM;
    static Panel_Cliente inicioClient;
    static Panel_NotaFiscal notaFiscal;
    static protected String loginADM = "000.000.000-00";
    static protected String senhaADM = "0";
    static protected LinkedList<Client> clientList = new LinkedList<>();
    static protected LinkedList<Produto> produtoList = new LinkedList<>();
    static String user, pagamento, bandeira, cpf;

    public Window() {
        initComponents();
        login = new Panel_Login();
        this.setLayout(new BorderLayout());
        this.add(Window.login);
        this.pack();
    }

    public static void main(String[] args) {
        Window w = new Window();
        w.setVisible(true);
        w.setLocationRelativeTo(null);
        Produto produto = new Produto("banana", "b123t4", 4.45f, LocalDate.of(2023, 05, 21), 1);
        produtoList.add(produto);
        produto = new Produto("abacate", "a14c65", 5.35f, LocalDate.of(2023, 10, 21), 3);
        produtoList.add(produto);
        
        Client cliente = new Client("Geraldo", "111.111.111-11", "geraldo@email.com",
                "(49) 9 8888-8888", "casa", 1, "boleto",
                LocalDate.of(1979, 04, 15), "Geraldinho.Gameplays69", "1");
        clientList.add(cliente);
        
        // cliente com pagamento em cartão
        cliente = new Client("Lais Varela", "222.222.222-22", "lais@ifsc.aluno.com",
                "(49) 9 9999-9999", "ifsc", 2, "cartão", "Débido - Mastercard",
                LocalDate.of(1999, 06, 21), "Lais", "2");
        clientList.add(cliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
