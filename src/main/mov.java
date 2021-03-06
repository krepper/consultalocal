/*
 * Copyright 2017 Felipe Vieira Sobral.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package main;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Felipe Vieira Sobral
 */
public class mov extends javax.swing.JFrame {

    /**
     * Creates new form mov
     */
    public mov() {
        initComponents();
        setIcon();
        
        String data = inicio.horas(0);
        String contem = null;
        int hora = Integer.parseInt(inicio.horas(3));
        String dt = inicio.horas(0);
        String caminho;
        String pasta = inicio.pasta(1,0);
        
        if (hora>=6 && hora<12){
                caminho = ("Estatística "+dt+"-M.txt");
            try {
                contem = ler(pasta+caminho);
            } catch (IOException ex) {
                System.out.println("NÃO LIDO");
                lbl1.setText("00");
            }
            } else if(hora>=12 && hora<18){
                caminho = ("Estatística "+dt+"-T.txt");
            try {
                contem = ler(pasta+caminho);
            } catch (IOException ex) {
                System.out.println("NÃO LIDO");
                lbl1.setText("00");
            }
            } else if(hora>=18 && hora<25){
                caminho = ("Estatística "+dt+"-N.txt");
            try {
                contem = ler(pasta+caminho);
            } catch (IOException ex) {
                System.out.println("NÃO LIDO");
                lbl1.setText("00");
            }
            }
        
        lbl2.setText(data);
        lbl1.setText(contem);
        try {
            lbl3.setText(ler(pasta+"Estatística "+dt+"-M.txt"));
        } catch (IOException ex) {
            //System.out.println("[MOV] - Não alterou o label");
        }
        try {
            lbl4.setText(ler(pasta+"Estatística "+dt+"-T.txt"));
        } catch (IOException ex) {
            //System.out.println("[MOV] - Não alterou o label");
        }
        try {
            lbl5.setText(ler(pasta+"Estatística "+dt+"-N.txt"));
        } catch (IOException ex) {
            //System.out.println("[MOV] - Não alterou o label");
        }
        
        
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
        jPanel2 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn1 = new javax.swing.JMenu();
        mn2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("USUÁRIO - UFPR PALOTINA");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setToolTipText("");

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("00");

        btn1.setBackground(new java.awt.Color(0, 186, 23));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("+");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setText("0");
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 186, 23));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("+");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(204, 0, 0));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("-");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(204, 0, 0));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("-");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/icons8_Refresh_16px.png"))); // NOI18N
        btn5.setText("ATUALIZAR");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn5)
                .addGap(81, 81, 81))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn5.getAccessibleContext().setAccessibleDescription("Sincronizar");

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MANHÃ: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TARDE: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOITE: ");

        lbl2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/icons8_Calendar_16px.png"))); // NOI18N
        lbl2.setText("00-00-00");

        lbl3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 255, 255));
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl3.setText("00");

        lbl4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setText("00");

        lbl5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl5.setForeground(new java.awt.Color(255, 255, 255));
        lbl5.setText("00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl3)
                    .addComponent(lbl4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(lbl5))
                .addGap(20, 20, 20)
                .addComponent(lbl2))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ESTÁTISTICA USUÁRIO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/icons8_Add_User_Male_32px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 204));

        mn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/icons8_Settings_16px.png"))); // NOI18N
        mn1.setText("Opções");

        mn2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        mn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/icons8_Genealogy_16px.png"))); // NOI18N
        mn2.setText("Histórico");
        mn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn2ActionPerformed(evt);
            }
        });
        mn1.add(mn2);

        jMenuBar1.add(mn1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        
        
        contar(0); // + 1
        atualizar();

        
    }//GEN-LAST:event_btn1ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        
        contar(2);
        atualizar();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        
        contar(1); // - 1
        atualizar();
        
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed

        contar(3);
        atualizar();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
                
        atualizar();
        
    }//GEN-LAST:event_btn5ActionPerformed

    private void mn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn2ActionPerformed
        // TODO add your handling code here:
        hist frame = new hist();
        frame.setVisible(true);
        
    }//GEN-LAST:event_mn2ActionPerformed

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
            java.util.logging.Logger.getLogger(mov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mov().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JMenu mn1;
    private javax.swing.JMenuItem mn2;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

    public static String ler(String dir) throws FileNotFoundException, IOException{
        String result;
        
        FileReader arquivo = new FileReader(dir);
        BufferedReader lerArq = new BufferedReader(arquivo);
        result = lerArq.readLine();
        
        lerArq.close();
        arquivo.close();
        
        return result;
    }
    
    public static void salvarArquivo(String x, String nome, String pasta){
		try{
                    new File(pasta).mkdirs();
                    File f = new File(pasta+nome);
                    
                    
                    
                    FileWriter arquivo = new FileWriter(f);
                    BufferedWriter grava = new BufferedWriter(arquivo);
                    
                                      
                    grava.write(x);
                    
                    
                    grava.flush();
                    grava.close();
                    
                    //System.out.println("Gravação concluida!");
                   
                }catch(IOException e){
			System.out.println("Erro: "+e.toString());
                        e.printStackTrace();
		}
    }
    
    public void contar(int escolha){
        String resultado = null;
        int numero = 0;
        int hora = Integer.parseInt(inicio.horas(3));
        String dt = inicio.horas(0);
        
        String pasta = inicio.pasta(1,0);
        String caminho = "0";
        
        mov salvar= new mov();
        
        String contem = "0";
        try {

            if (hora>=6 && hora<12){
                caminho = ("Estatística "+dt+"-M.txt");
                contem = ler(pasta+caminho);
            } else if(hora>=12 && hora<18){
                caminho = ("Estatística "+dt+"-T.txt");
                contem = ler(pasta+caminho);
            } else if(hora>=18 && hora<25){
                caminho = ("Estatística "+dt+"-N.txt");
                contem = ler(pasta+caminho);
            }
        } catch (IOException ex) {
            System.out.println("NÃO DEU");
        }
        
        switch (escolha) {
            case 0:
                resultado = Integer.toString(Integer.parseInt(contem)+1);
                break;
            case 1:
                resultado = Integer.toString(Integer.parseInt(contem)-1);
                break;
            case 2:
                numero = Integer.parseInt(txt1.getText());
                resultado = Integer.toString(Integer.parseInt(contem)+numero);
                break;
            case 3:
                numero = Integer.parseInt(txt1.getText());
                resultado = Integer.toString(Integer.parseInt(contem)-numero);
                break;
            default:
                break;
        }
        
        lbl1.setText(resultado);
        
        if (hora>=6 && hora<12){
            caminho = ("Estatística "+dt+"-M.txt");
            salvar.salvarArquivo(resultado, caminho, pasta);
        } else if(hora>=12 && hora<18){
            caminho = ("Estatística "+dt+"-T.txt");
            salvar.salvarArquivo(resultado, caminho, pasta);
        } else if(hora>=18 && hora<25){
            caminho = ("Estatística "+dt+"-N.txt");
            salvar.salvarArquivo(resultado, caminho, pasta);
        }

    }
    
    public void atualizar(){
        String contem = null;
        int hora = Integer.parseInt(inicio.horas(3));
        String dt = inicio.horas(0);
        String caminho;
        String pasta = inicio.pasta(1,0);
        if (hora>=6 && hora<12){
            caminho = ("Estatística "+dt+"-M.txt");
            try {
                contem = ler(pasta+caminho);
            } catch (IOException ex) {
                System.out.println("NÃO LIDO");
            }
        } else if(hora>=12 && hora<18){
            caminho = ("Estatística "+dt+"-T.txt");
            try {
                contem = ler(pasta+caminho);
            } catch (IOException ex) {
                System.out.println("NÃO LIDO");
            }
        } else if(hora>=18 && hora<25){
            caminho = ("Estatística "+dt+"-N.txt");
            try {
                contem = ler(pasta+caminho);
            } catch (IOException ex) {
                System.out.println("NÃO LIDO");
            }
        }
        lbl1.setText(contem);
        
        try {
            lbl3.setText(ler(pasta+"Estatística "+dt+"-M.txt"));
        } catch (IOException ex) {
            //System.out.println("[MOV] - Não alterou o label");
        }
        try {
            lbl4.setText(ler(pasta+"Estatística "+dt+"-T.txt"));
        } catch (IOException ex) {
            //System.out.println("[MOV] - Não alterou o label");
        }
        try {
            lbl5.setText(ler(pasta+"Estatística "+dt+"-N.txt"));
        } catch (IOException ex) {
            //System.out.println("[MOV] - Não alterou o label");
        }
    }
}
