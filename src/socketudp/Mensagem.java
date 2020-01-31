/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author frapi
 */
public class Mensagem extends javax.swing.JFrame {

    /**
     * Creates new form Mensagem
     */
    public Mensagem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JButton();
        jcbFonte = new javax.swing.JComboBox<>();
        jcbTamanho = new javax.swing.JComboBox<>();
        jcbCor = new javax.swing.JComboBox<>();
        jckbNegrito = new javax.swing.JCheckBox();
        jckbItalico = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jtxNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaMensagem = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Mensagem");

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jcbFonte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fonte", "Arial", "Times New Roman" }));

        jcbTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tamanho", "2", "4", "6", "8", "10", "12", "14", "30" }));

        jcbCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cor", "Preto", "Amarelo", "Verde", "Azul" }));

        jckbNegrito.setText("Negrito");

        jckbItalico.setText("Itálico");

        jLabel2.setText("Nome do arquivo");

        jLabel3.setText("Mensagem");

        jtaMensagem.setColumns(20);
        jtaMensagem.setRows(5);
        jScrollPane2.setViewportView(jtaMensagem);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jckbNegrito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jckbItalico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbFonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbSalvar))
                    .addComponent(jtxNome)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbFonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jckbNegrito)
                    .addComponent(jckbItalico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try{
            DatagramSocket socket = new DatagramSocket();
            boolean verificaNegrito = jckbNegrito.isSelected();
            boolean verificaItalico = jckbItalico.isSelected();
            String cNegrito = "";
            if(verificaNegrito == true){
                cNegrito = "ativado";
            }
            String cItalico = "";
            if(verificaItalico == true){
                cItalico = "ativado";
            }
            
            String mensagem = jtaMensagem.getText();
            String titul = jtxNome.getText();
            String f = (String) jcbFonte.getSelectedItem();
            String t = (String) jcbTamanho.getSelectedItem();
            String c = (String) jcbCor.getSelectedItem();
            byte[] msg = mensagem.getBytes();
            byte[] tit = titul.getBytes();
            byte[] fonte = f.getBytes();
            byte[] tamanho = t.getBytes();
            byte[] color = c.getBytes();
            byte[] neg = cNegrito.getBytes();
            byte[] ita = cItalico.getBytes();
            DatagramPacket pacote = new DatagramPacket(msg,msg.length,InetAddress.getByName("127.0.0.1"),1100);
            DatagramPacket titulo = new DatagramPacket(tit,tit.length,InetAddress.getByName("127.0.0.1"),1100);
            DatagramPacket font = new DatagramPacket(fonte,fonte.length,InetAddress.getByName("127.0.0.1"),1100);
            DatagramPacket tam = new DatagramPacket(tamanho,tamanho.length,InetAddress.getByName("127.0.0.1"),1100);
            DatagramPacket cor = new DatagramPacket(color,color.length,InetAddress.getByName("127.0.0.1"),1100);
            DatagramPacket negrito = new DatagramPacket(neg,neg.length,InetAddress.getByName("127.0.0.1"),1100);
            DatagramPacket italico = new DatagramPacket(ita,ita.length,InetAddress.getByName("127.0.0.1"),1100);
            
            socket.send(pacote);
            socket.send(titulo);
            socket.send(cor);
            socket.send(tam);
            socket.send(negrito);
            socket.send(italico);
            socket.send(font);
            System.out.println(c);
        }catch(SocketException e){
            System.out.println("Erro na conexao: "+ e.getMessage());
        }catch(IOException e){
            System.out.println("Erro no recebimento/envio do pacote!"+ e.getMessage());
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(Mensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mensagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbCor;
    private javax.swing.JComboBox<String> jcbFonte;
    private javax.swing.JComboBox<String> jcbTamanho;
    private javax.swing.JCheckBox jckbItalico;
    private javax.swing.JCheckBox jckbNegrito;
    private javax.swing.JTextArea jtaMensagem;
    private javax.swing.JTextField jtxNome;
    // End of variables declaration//GEN-END:variables
}
