
public class Student_Inf extends javax.swing.JFrame {

   
    public Student_Inf() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        inputname = new javax.swing.JTextField();
        nameshow = new javax.swing.JTextField();
        name_show_button = new javax.swing.JButton();
        inputsec = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        ID_show = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        inputid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        idshow = new javax.swing.JTextField();
        id1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sectionshow = new javax.swing.JTextField();
        sec_show = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(29, 209, 161));

        jPanel1.setBackground(new java.awt.Color(225, 112, 85));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Information");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText(" Name       :");

        inputname.setBackground(new java.awt.Color(103, 230, 220));
        inputname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputname.setForeground(new java.awt.Color(255, 255, 255));
        inputname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputnameActionPerformed(evt);
            }
        });

        nameshow.setBackground(new java.awt.Color(103, 230, 220));
        nameshow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameshow.setForeground(new java.awt.Color(255, 255, 255));
        nameshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameshowActionPerformed(evt);
            }
        });

        name_show_button.setBackground(new java.awt.Color(225, 112, 85));
        name_show_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name_show_button.setForeground(new java.awt.Color(255, 255, 255));
        name_show_button.setText("Name Show");
        name_show_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_show_buttonActionPerformed(evt);
            }
        });

        inputsec.setBackground(new java.awt.Color(29, 209, 161));
        inputsec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inputsec.setForeground(new java.awt.Color(0, 204, 204));
        inputsec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "            Select", "                A", "                B", "                C", "                D", "                E", "                F" }));
        inputsec.setAlignmentX(1.0F);
        inputsec.setAlignmentY(1.0F);
        inputsec.setAutoscrolls(true);
        inputsec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputsecActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name Show    :");

        ID_show.setBackground(new java.awt.Color(225, 112, 85));
        ID_show.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ID_show.setForeground(new java.awt.Color(255, 255, 255));
        ID_show.setText("ID Show");
        ID_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_showActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText(" ID             :");

        inputid.setBackground(new java.awt.Color(103, 230, 220));
        inputid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputid.setForeground(new java.awt.Color(255, 255, 255));
        inputid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputidActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name Show    :");

        idshow.setBackground(new java.awt.Color(103, 230, 220));
        idshow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idshow.setForeground(new java.awt.Color(255, 255, 255));
        idshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idshowActionPerformed(evt);
            }
        });

        id1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id1.setForeground(new java.awt.Color(255, 255, 255));
        id1.setText("Section     :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Section Show    :");

        sectionshow.setBackground(new java.awt.Color(103, 230, 220));
        sectionshow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sectionshow.setForeground(new java.awt.Color(255, 255, 255));
        sectionshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionshowActionPerformed(evt);
            }
        });

        sec_show.setBackground(new java.awt.Color(225, 112, 85));
        sec_show.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sec_show.setForeground(new java.awt.Color(255, 255, 255));
        sec_show.setText("Sec_show");
        sec_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sec_showActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(225, 112, 85));
        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(id1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputsec, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputid, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputname, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(172, 172, 172)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameshow, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idshow, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectionshow, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(name_show_button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(ID_show, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(sec_show, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameshow, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(177, 177, 177))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idshow, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputsec, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectionshow, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_show, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_show_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sec_show, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 241, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_show_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_show_buttonActionPerformed
        String name = inputname.getText();
        nameshow.setText(name);


    }//GEN-LAST:event_name_show_buttonActionPerformed

    private void inputnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputnameActionPerformed

    private void inputsecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputsecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputsecActionPerformed

    private void nameshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameshowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameshowActionPerformed

    private void ID_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_showActionPerformed
        String id = inputid.getText();
        idshow.setText(id);
    }//GEN-LAST:event_ID_showActionPerformed

    private void inputidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputidActionPerformed

    private void idshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idshowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idshowActionPerformed

    private void sectionshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionshowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionshowActionPerformed

    private void sec_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sec_showActionPerformed

        sectionshow.setText((String) inputsec.getSelectedItem());

    }//GEN-LAST:event_sec_showActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        String clean = null;
        inputname.setText(clean);
        nameshow.setText(clean);
        inputid.setText(clean);
        idshow.setText(clean);
        sectionshow.setText(clean);
        inputsec.setSelectedItem("            Select");

    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Inf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Inf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Inf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Inf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Inf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ID_show;
    private javax.swing.JLabel Name;
    private javax.swing.JButton clear;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JTextField idshow;
    private javax.swing.JTextField inputid;
    private javax.swing.JTextField inputname;
    private javax.swing.JComboBox<String> inputsec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton name_show_button;
    private javax.swing.JTextField nameshow;
    private javax.swing.JButton sec_show;
    private javax.swing.JTextField sectionshow;
    // End of variables declaration//GEN-END:variables
}
