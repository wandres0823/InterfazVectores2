/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author adalberto
 */
public class ejercicio2 extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio2
     */
    
    
    double v[];
    public ejercicio2() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidaV = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdcrear = new javax.swing.JButton();
        cmdPar = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        cmdPares = new javax.swing.JButton();
        cmdPrimos = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdBorrar2 = new javax.swing.JButton();
        cmdImpar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEsultado = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(9, 210, 217));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 1, 242));
        jLabel1.setText("numero pares impares primos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 330, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "datos del vector", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(255, 8, 8)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("cantidad del vector");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtCantidaV.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txtCantidaV.setForeground(new java.awt.Color(102, 102, 102));
        txtCantidaV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidaVKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, 110));
        jPanel1.getAccessibleContext().setAccessibleName("datos del vector\n");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdcrear.setBackground(new java.awt.Color(186, 244, 161));
        cmdcrear.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        cmdcrear.setForeground(new java.awt.Color(102, 102, 102));
        cmdcrear.setText("Crear");
        cmdcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdcrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, -1));

        cmdPar.setBackground(new java.awt.Color(186, 244, 161));
        cmdPar.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        cmdPar.setForeground(new java.awt.Color(102, 102, 102));
        cmdPar.setText("LLenado manual");
        cmdPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdParActionPerformed(evt);
            }
        });
        jPanel3.add(cmdPar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, -1));

        cmdAutomatico.setBackground(new java.awt.Color(186, 244, 161));
        cmdAutomatico.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        cmdAutomatico.setForeground(new java.awt.Color(102, 102, 102));
        cmdAutomatico.setText("llenar automatico");
        cmdAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, -1));

        cmdPares.setBackground(new java.awt.Color(186, 244, 161));
        cmdPares.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        cmdPares.setForeground(new java.awt.Color(102, 102, 102));
        cmdPares.setText("Pares");
        cmdPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdParesActionPerformed(evt);
            }
        });
        jPanel3.add(cmdPares, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, -1));

        cmdPrimos.setBackground(new java.awt.Color(186, 244, 161));
        cmdPrimos.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        cmdPrimos.setForeground(new java.awt.Color(102, 102, 102));
        cmdPrimos.setText("Primos");
        cmdPrimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrimosActionPerformed(evt);
            }
        });
        jPanel3.add(cmdPrimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, -1));

        cmdMostrar.setBackground(new java.awt.Color(186, 244, 161));
        cmdMostrar.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        cmdMostrar.setForeground(new java.awt.Color(102, 102, 102));
        cmdMostrar.setText("Mostar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, -1));

        cmdBorrar2.setBackground(new java.awt.Color(186, 244, 161));
        cmdBorrar2.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        cmdBorrar2.setForeground(new java.awt.Color(102, 102, 102));
        cmdBorrar2.setText("Borrar");
        cmdBorrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrar2ActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBorrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, -1));

        cmdImpar.setBackground(new java.awt.Color(186, 244, 161));
        cmdImpar.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        cmdImpar.setForeground(new java.awt.Color(102, 102, 102));
        cmdImpar.setText("Impar");
        cmdImpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdImparActionPerformed(evt);
            }
        });
        jPanel3.add(cmdImpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 160, 240));

        jButton5.setBackground(new java.awt.Color(153, 0, 153));
        jButton5.setFont(new java.awt.Font("Ravie", 2, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 102, 102));
        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(255, 31, 81)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEsultado.setEditable(false);
        txtEsultado.setColumns(20);
        txtEsultado.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txtEsultado.setForeground(new java.awt.Color(102, 102, 102));
        txtEsultado.setRows(5);
        jScrollPane2.setViewportView(txtEsultado);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, 130));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 250, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cmdParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdParActionPerformed
    double numero;
      double n;
         if (txtCantidaV.getText().trim().isEmpty ()){          
            JOptionPane.showMessageDialog(this, "Digite la cantidad", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCantidaV.requestFocusInWindow();
         }else{
       for (int i = 0; i < v.length; i++){
           n = Double.parseDouble (JOptionPane.showInputDialog(this, "Digite el elemento en la posición "+i));
           v[i]=n;
       }
       }
    }//GEN-LAST:event_cmdParActionPerformed

    private void cmdcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcrearActionPerformed
      int canumero;
      
        if (txtCantidaV.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la cantdad a calcular", "Error", JOptionPane.ERROR_MESSAGE);
            txtCantidaV.requestFocusInWindow();
        } else if (Integer.parseInt(txtCantidaV.getText().trim())==0) {
            JOptionPane.showMessageDialog(this, "la cantidad de elemento no puede ser cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtCantidaV.requestFocusInWindow();
            txtCantidaV.selectAll();
            
        }else{
        canumero =Integer.parseInt(txtCantidaV.getText());
        v = new double [canumero];
        JOptionPane.showMessageDialog(this, "vector creado exitosamen");
        
     }
         
     
    }//GEN-LAST:event_cmdcrearActionPerformed

    private void cmdAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticoActionPerformed
      double nu,numero;
       if (txtCantidaV.getText().trim().isEmpty ()){          
            JOptionPane.showMessageDialog(this, "Digite la longitud", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCantidaV.requestFocusInWindow();
         }else{
            
            numero = Double.parseDouble (JOptionPane.showInputDialog(this, "Digite el numero hasta donde quiere el llenado automatico "));
           while (numero<v.length){
            JOptionPane.showMessageDialog(this, "Digite un numero mayor a : "+v.length);
            numero = Double.parseDouble (JOptionPane.showInputDialog(this, "Digite el numero hasta desea  el llenado automatico "));
           }
        for (int i = 0; i < v.length; i++) {
             
           nu = (int) (Math.random()*numero + 1);
           v[i]=nu;
        }
       JOptionPane.showMessageDialog(this,"Vector llenado correctamente");  
        }
    }//GEN-LAST:event_cmdAutomaticoActionPerformed

    private void cmdParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdParesActionPerformed
      String res;
        double contapar = 0;
        
        if(txtCantidaV.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite la cantidad", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCantidaV.requestFocusInWindow();
        }else{
            for (int i = 0; i < v.length; i++) {
                if(v[i]%2==0){
                    contapar++;
                }else{
                    
                } 
            }
            res=String.valueOf(contapar);
            txtEsultado.setText("La cantidad de números pares son: ");
            txtEsultado.append(res);
        }
    }//GEN-LAST:event_cmdParesActionPerformed

    private void cmdImparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdImparActionPerformed
       String res;
        double contaimpar=0;
        
        if(txtCantidaV.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite la cantidad.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCantidaV.requestFocusInWindow();
        }else{
            for (int i = 0; i < v.length; i++) {
                if(v[i]%2!=0){
                    contaimpar++;
                } 
            }
            res=String.valueOf(contaimpar);
            txtEsultado.setText("La cantidad de números impares son: ");
            txtEsultado.append(res);
        }
    }//GEN-LAST:event_cmdImparActionPerformed

    private void cmdPrimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrimosActionPerformed
     String res;
        double contprimo=0;
        
        if (txtCantidaV.getText().trim().isEmpty ()){          
            JOptionPane.showMessageDialog(this, "Digite la cantidad", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCantidaV.requestFocusInWindow();
         }else{
            for (int i = 0; i < v.length; i++) {
               if(v[i]%v[i]==0&&v[i]%2!=0){ 
             contprimo++; 
               }else{
               }
            }
            res=String.valueOf(contprimo);
            txtEsultado.setText("La cantidad de números primos son ");
            txtEsultado.append(res);
        }
    }//GEN-LAST:event_cmdPrimosActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        if (txtCantidaV.getText().trim().isEmpty ()){          
            JOptionPane.showMessageDialog(this, "Digite la cantidad.", "Error", JOptionPane.ERROR_MESSAGE);
            txtCantidaV.requestFocusInWindow();
       
    }else{

        for (int i = 0; i < v.length; i++) {
            txtEsultado.append (v[i]+"\n");
      }
    }
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdBorrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrar2ActionPerformed
        txtCantidaV.setText("");
        txtEsultado.setText("");
        txtCantidaV.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrar2ActionPerformed

    private void txtCantidaVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidaVKeyTyped
         char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          } 
    }//GEN-LAST:event_txtCantidaVKeyTyped

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
            java.util.logging.Logger.getLogger(ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdBorrar2;
    private javax.swing.JButton cmdImpar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdPar;
    private javax.swing.JButton cmdPares;
    private javax.swing.JButton cmdPrimos;
    private javax.swing.JButton cmdcrear;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtCantidaV;
    private javax.swing.JTextArea txtEsultado;
    // End of variables declaration//GEN-END:variables
}
