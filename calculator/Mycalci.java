/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

/**
 *
 * @author sangh
 */
public class Mycalci extends javax.swing.JFrame {

    /**
     * Creates new form Mycalci
     */
    
    public Mycalci() {
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

        jTextField1 = new javax.swing.JTextField();
        Seven = new javax.swing.JButton();
        Eight = new javax.swing.JButton();
        Nine = new javax.swing.JButton();
        Multiply = new javax.swing.JButton();
        Four = new javax.swing.JButton();
        Five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        One = new javax.swing.JButton();
        Two = new javax.swing.JButton();
        Three = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        EqualsTo = new javax.swing.JButton();
        cutButton = new javax.swing.JButton();
        zero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setBackground(new java.awt.Color(102, 102, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Seven.setBackground(new java.awt.Color(153, 204, 255));
        Seven.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Seven.setText("7");
        Seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenActionPerformed(evt);
            }
        });

        Eight.setBackground(new java.awt.Color(153, 204, 255));
        Eight.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Eight.setText("8");
        Eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EightActionPerformed(evt);
            }
        });

        Nine.setBackground(new java.awt.Color(153, 204, 255));
        Nine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nine.setText("9");
        Nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineActionPerformed(evt);
            }
        });

        Multiply.setBackground(new java.awt.Color(153, 204, 255));
        Multiply.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Multiply.setText("*");
        Multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyActionPerformed(evt);
            }
        });

        Four.setBackground(new java.awt.Color(153, 204, 255));
        Four.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Four.setText("4");
        Four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourActionPerformed(evt);
            }
        });

        Five.setBackground(new java.awt.Color(153, 204, 255));
        Five.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Five.setText("5");
        Five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(153, 204, 255));
        six.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        Minus.setBackground(new java.awt.Color(153, 204, 255));
        Minus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Minus.setText("-");
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });

        One.setBackground(new java.awt.Color(153, 204, 255));
        One.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        One.setText("1");
        One.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneActionPerformed(evt);
            }
        });

        Two.setBackground(new java.awt.Color(153, 204, 255));
        Two.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Two.setText("2");
        Two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoActionPerformed(evt);
            }
        });

        Three.setBackground(new java.awt.Color(153, 204, 255));
        Three.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Three.setText("3");
        Three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeActionPerformed(evt);
            }
        });

        Plus.setBackground(new java.awt.Color(153, 204, 255));
        Plus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Plus.setText("+");
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });

        Divide.setBackground(new java.awt.Color(153, 204, 255));
        Divide.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Divide.setText("/");
        Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideActionPerformed(evt);
            }
        });

        EqualsTo.setBackground(new java.awt.Color(153, 204, 255));
        EqualsTo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EqualsTo.setText("=");
        EqualsTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsToActionPerformed(evt);
            }
        });

        cutButton.setBackground(new java.awt.Color(153, 204, 255));
        cutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cutButton.setText("cut");
        cutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutButtonActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(153, 204, 255));
        zero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Seven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(One, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Four, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Eight, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Five, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(six, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Three, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EqualsTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seven)
                    .addComponent(Eight)
                    .addComponent(Nine)
                    .addComponent(Multiply))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Four)
                    .addComponent(Five)
                    .addComponent(six)
                    .addComponent(Minus))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(One)
                    .addComponent(Two)
                    .addComponent(Three)
                    .addComponent(Plus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero)
                    .addComponent(cutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EqualsTo)
                    .addComponent(Divide))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenActionPerformed
        // TODO add your handling code here:
        txt = "7";
        String s =  jTextField1.getText();
        String m = s + txt;
        jTextField1.setText(m);
       
    }//GEN-LAST:event_SevenActionPerformed

    private void cutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutButtonActionPerformed
        // TODO add your handling code here:
        txt = "";
        jTextField1.getText();
        jTextField1.setText(txt);
        
       
       
    }//GEN-LAST:event_cutButtonActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
        txt = "0";
        String s =  jTextField1.getText();
       String m = s + txt;
       jTextField1.setText(m);
       
    }//GEN-LAST:event_zeroActionPerformed

    private void EqualsToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsToActionPerformed
        // TODO add your handling code here:
       String str = jTextField1.getText();
        int operand1 = 0, operand2 = 0;
        char operator = ' ';
        int i = 0;

         while (i < str.length() && Character.isDigit(str.charAt(i))) {
            operand1 = operand1 * 10 + (str.charAt(i) - '0');
            i++;
        }

            if (i < str.length()) {
              operator = str.charAt(i);
                  i++;
            }


        while (i < str.length() && Character.isDigit(str.charAt(i))) {
         operand2 = operand2 * 10 + (str.charAt(i) - '0');
             i++;
        }


            int solution = 0;
            if (operator == '+') {
                solution = operand1 + operand2;
            } else if (operator == '-') {
                solution = operand1 - operand2;
            } else if (operator == '*') {
                solution = operand1 * operand2;
            } else{
                   
                solution = operand1 / operand2;
                 
                return ;
            }
                

        jTextField1.setText(Integer.toString(solution));

        
        
        
        
        
    }//GEN-LAST:event_EqualsToActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeActionPerformed
        // TODO add your handling code here:
        txt = "3";
        String s =  jTextField1.getText();
       String m = s + txt;
       jTextField1.setText(m);
       
    }//GEN-LAST:event_ThreeActionPerformed

    private void TwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoActionPerformed
        // TODO add your handling code here:
        txt = "2";
        String s =  jTextField1.getText();
       String m = s + txt;
       jTextField1.setText(m);
       
    }//GEN-LAST:event_TwoActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
        txt = "6";
         String s =  jTextField1.getText();
       String m = s + txt;
       jTextField1.setText(m);
       
    }//GEN-LAST:event_sixActionPerformed

    private void FiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveActionPerformed
        // TODO add your handling code here:
        txt = "5";
        String s =  jTextField1.getText();
       String m = s + txt;
       jTextField1.setText(m);
       
    }//GEN-LAST:event_FiveActionPerformed

    private void FourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourActionPerformed
        // TODO add your handling code here:
        txt = "4";
        String s =  jTextField1.getText();
       String m = s + txt;
       jTextField1.setText(m);
       
    }//GEN-LAST:event_FourActionPerformed

    private void EightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EightActionPerformed
        // TODO add your handling code here:
        txt = "8";
        String s =  jTextField1.getText();
       String m = s + txt;
       jTextField1.setText(m);
       
    }//GEN-LAST:event_EightActionPerformed

    private void NineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NineActionPerformed
        // TODO add your handling code here:
        txt = "9";
        String s =  jTextField1.getText();
       String m = s + txt;
       jTextField1.setText(m);
       
    }//GEN-LAST:event_NineActionPerformed

    private void MultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyActionPerformed
        // TODO add your handling code here:
        txt = "*";
        String s =  jTextField1.getText();
       String m = s + txt;
       jTextField1.setText(m);
       
    }//GEN-LAST:event_MultiplyActionPerformed

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
        // TODO add your handling code here:
        txt = "-";
        String s =  jTextField1.getText();
       String m = s + txt;
       jTextField1.setText(m);
       
    }//GEN-LAST:event_MinusActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        // TODO add your handling code here:
        txt = "+";
       String s =  jTextField1.getText();
       String m = s + txt;
       jTextField1.setText(m);
       
        
    }//GEN-LAST:event_PlusActionPerformed

    private void DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideActionPerformed
        // TODO add your handling code here:
        txt = "/";
        String s =  jTextField1.getText();
       String m = s + txt;
       jTextField1.setText(m);
       
    }//GEN-LAST:event_DivideActionPerformed

    private void OneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneActionPerformed
        // TODO add your handling code here:
        txt = "1";
         String s =  jTextField1.getText();
       String m = s + txt;
       jTextField1.setText(m);
       
        
       
    }//GEN-LAST:event_OneActionPerformed

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
            java.util.logging.Logger.getLogger(Mycalci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mycalci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mycalci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mycalci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mycalci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Divide;
    private javax.swing.JButton Eight;
    private javax.swing.JButton EqualsTo;
    private javax.swing.JButton Five;
    private javax.swing.JButton Four;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Multiply;
    private javax.swing.JButton Nine;
    private javax.swing.JButton One;
    private javax.swing.JButton Plus;
    private javax.swing.JButton Seven;
    private javax.swing.JButton Three;
    private javax.swing.JButton Two;
    private javax.swing.JButton cutButton;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton six;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
    private String txt;
    // private StringBuffer sb = new StringBuffer();
   
}
