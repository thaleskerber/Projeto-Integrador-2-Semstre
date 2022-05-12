/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto.GUI.menu;

import projeto.GUI.mensagem.ConsultarMensagem;
import projeto.GUI.mensagem.CadastrarMensagem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import projeto.GUI.TelaSobreGeral;
import projeto.GUI.mensagem.CadastrarMensagemCliente;
import projeto.Main;

/**
 *
 * @author jenny
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setTitle("Pro4Tech");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e){
            Main.getConnectionFactory().closeConnection();
            System.exit(0);
        }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        label_pro4Tech = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        menu_mensagens = new javax.swing.JMenu();
        menuItem_adicionarMensagem = new javax.swing.JMenuItem();
        menuItem_consultarMensagem = new javax.swing.JMenuItem();
        menu_sobre = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        label_pro4Tech.setBackground(new java.awt.Color(255, 255, 255));
        label_pro4Tech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/pro4tech.png"))); // NOI18N

        jDesktopPane1.setLayer(label_pro4Tech, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_pro4Tech, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(label_pro4Tech)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jMenuBar2.setBackground(new java.awt.Color(204, 204, 204));

        menu_mensagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/email_attach.png"))); // NOI18N
        menu_mensagens.setText("Mensagens");
        menu_mensagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_mensagensActionPerformed(evt);
            }
        });

        menuItem_adicionarMensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/+.png"))); // NOI18N
        menuItem_adicionarMensagem.setText("Adicionar");
        menuItem_adicionarMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_adicionarMensagemActionPerformed(evt);
            }
        });
        menu_mensagens.add(menuItem_adicionarMensagem);

        menuItem_consultarMensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/Lupa.png"))); // NOI18N
        menuItem_consultarMensagem.setText("Consultar");
        menuItem_consultarMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_consultarMensagemActionPerformed(evt);
            }
        });
        menu_mensagens.add(menuItem_consultarMensagem);

        jMenuBar2.add(menu_mensagens);

        menu_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/Imagens/exclamation.png"))); // NOI18N
        menu_sobre.setText("Sobre");
        menu_sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sobreActionPerformed(evt);
            }
        });
        jMenuBar2.add(menu_sobre);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem_adicionarMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_adicionarMensagemActionPerformed
     
         new CadastrarMensagemCliente().setVisible(true);
        
    }//GEN-LAST:event_menuItem_adicionarMensagemActionPerformed

    private void menu_mensagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_mensagensActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_menu_mensagensActionPerformed

    private void menuItem_consultarMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_consultarMensagemActionPerformed
        // TODO add your handling code here:
        
        new ConsultarMensagem().setVisible(true);
    }//GEN-LAST:event_menuItem_consultarMensagemActionPerformed

    private void menu_sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sobreActionPerformed
        // TODO add your handling code here:
        new TelaSobreGeral().setVisible(true);
    }//GEN-LAST:event_menu_sobreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel label_pro4Tech;
    private javax.swing.JMenuItem menuItem_adicionarMensagem;
    private javax.swing.JMenuItem menuItem_consultarMensagem;
    private javax.swing.JMenu menu_mensagens;
    private javax.swing.JMenu menu_sobre;
    // End of variables declaration//GEN-END:variables
}
