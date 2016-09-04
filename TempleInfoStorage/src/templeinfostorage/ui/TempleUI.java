/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templeinfostorage.ui;

/**
 *
 * @author tonyl
 */
public class TempleUI extends javax.swing.JFrame {

    /**
     * Creates new form TempleUI
     */
    public TempleUI() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        btnSave = new javax.swing.JButton();
        txtLastName = new javax.swing.JTextField();
        btnReadyNotification = new javax.swing.JButton();
        lblFMLName = new javax.swing.JLabel();
        txtFirstName1 = new javax.swing.JTextField();
        txtMiddleName = new javax.swing.JTextField();
        lblBirthDate = new javax.swing.JLabel();
        txtBDMonth = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        txtBDDay = new javax.swing.JTextField();
        txtBDYear = new javax.swing.JTextField();
        lblDash1 = new javax.swing.JLabel();
        lblDash2 = new javax.swing.JLabel();
        lblExpectedGraduation = new javax.swing.JLabel();
        txtEGMonth = new javax.swing.JTextField();
        lblDash3 = new javax.swing.JLabel();
        lblDash4 = new javax.swing.JLabel();
        txtEGYear = new javax.swing.JTextField();
        txtEGDay = new javax.swing.JTextField();
        lblTUID = new javax.swing.JLabel();
        txtTUID = new javax.swing.JTextField();
        lblFMLName9 = new javax.swing.JLabel();
        txtFirstName10 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMajors = new javax.swing.JList<>();
        rdGrad = new javax.swing.JRadioButton();
        rdUngrad = new javax.swing.JRadioButton();
        lblGradUndergrad = new javax.swing.JLabel();
        lblSelectMajor = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 28), new java.awt.Dimension(0, 28), new java.awt.Dimension(32767, 28));
        seperator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(40, 40, 40));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(190, 50, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  LOCAL TEMPLE INFORMATION STORAGE ");

        btnSave.setBackground(new java.awt.Color(90, 50, 40));
        btnSave.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jScrollPane1.setViewportView(btnSave);

        txtLastName.setBackground(new java.awt.Color(200, 200, 200));
        txtLastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtLastName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtLastName.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        lblFMLName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFMLName.setForeground(new java.awt.Color(255, 255, 255));
        lblFMLName.setText("First, Middle, and Last Name:");

        txtFirstName1.setBackground(new java.awt.Color(200, 200, 200));
        txtFirstName1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFirstName1.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFirstName1.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        txtMiddleName.setBackground(new java.awt.Color(200, 200, 200));
        txtMiddleName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtMiddleName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtMiddleName.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        lblBirthDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBirthDate.setForeground(new java.awt.Color(255, 255, 255));
        lblBirthDate.setText("Birth Date:");

        txtBDMonth.setBackground(new java.awt.Color(200, 200, 200));
        txtBDMonth.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBDMonth.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBDMonth.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        lblPhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber.setText("Phone Number:");

        txtPhoneNumber.setBackground(new java.awt.Color(200, 200, 200));
        txtPhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPhoneNumber.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPhoneNumber.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        txtBDDay.setBackground(new java.awt.Color(200, 200, 200));
        txtBDDay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBDDay.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBDDay.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        txtBDYear.setBackground(new java.awt.Color(200, 200, 200));
        txtBDYear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBDYear.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBDYear.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        lblDash1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDash1.setForeground(new java.awt.Color(255, 255, 255));
        lblDash1.setText("/");

        lblDash2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDash2.setForeground(new java.awt.Color(255, 255, 255));
        lblDash2.setText("/");

        lblExpectedGraduation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblExpectedGraduation.setForeground(new java.awt.Color(255, 255, 255));
        lblExpectedGraduation.setText("Expected Graduation:");

        txtEGMonth.setBackground(new java.awt.Color(200, 200, 200));
        txtEGMonth.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtEGMonth.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEGMonth.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        lblDash3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDash3.setForeground(new java.awt.Color(255, 255, 255));
        lblDash3.setText("/");

        lblDash4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDash4.setForeground(new java.awt.Color(255, 255, 255));
        lblDash4.setText("/");

        txtEGYear.setBackground(new java.awt.Color(200, 200, 200));
        txtEGYear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtEGYear.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEGYear.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        txtEGDay.setBackground(new java.awt.Color(200, 200, 200));
        txtEGDay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtEGDay.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEGDay.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        lblTUID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTUID.setForeground(new java.awt.Color(255, 255, 255));
        lblTUID.setText("TUID:");

        txtTUID.setBackground(new java.awt.Color(200, 200, 200));
        txtTUID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTUID.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTUID.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        lblFMLName9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFMLName9.setForeground(new java.awt.Color(255, 255, 255));
        lblFMLName9.setText("Temple Email:");

        txtFirstName10.setBackground(new java.awt.Color(200, 200, 200));
        txtFirstName10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFirstName10.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFirstName10.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        lstMajors.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstMajors);

        rdGrad.setBackground(new java.awt.Color(190, 50, 40));
        rdGrad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdGrad.setForeground(new java.awt.Color(255, 255, 255));
        rdGrad.setText("Graduate");
        rdGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdGradActionPerformed(evt);
            }
        });

        rdUngrad.setBackground(new java.awt.Color(190, 50, 40));
        rdUngrad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdUngrad.setForeground(new java.awt.Color(255, 255, 255));
        rdUngrad.setText("Undergraduate");

        lblGradUndergrad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblGradUndergrad.setForeground(new java.awt.Color(255, 255, 255));
        lblGradUndergrad.setText("Graduate/Undergraduate:");

        lblSelectMajor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectMajor.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectMajor.setText("Select Major:");

        seperator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhoneNumber)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblExpectedGraduation)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtBDMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(lblDash1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBDDay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblDash2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBDYear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTUID)
                            .addComponent(lblFMLName9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTUID, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFirstName10, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblGradUndergrad)
                            .addComponent(lblBirthDate)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEGMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDash3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEGDay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(lblDash4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEGYear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rdGrad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdUngrad)
                                .addGap(7, 7, 7)))))
                .addGap(18, 18, 18)
                .addComponent(seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSelectMajor)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnReadyNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFMLName))))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lblFMLName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFirstName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectMajor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReadyNotification, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(lblBirthDate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtBDMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDash1)
                                            .addComponent(txtBDDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDash2)
                                            .addComponent(txtBDYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblExpectedGraduation)
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtEGMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDash3)
                                            .addComponent(txtEGDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDash4)
                                            .addComponent(txtEGYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPhoneNumber)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTUID)
                                        .addGap(5, 5, 5)
                                        .addComponent(txtTUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFMLName9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFirstName10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblGradUndergrad)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdGrad)
                                    .addComponent(rdUngrad))))
                        .addGap(40, 40, 40))))
        );

        txtLastName.getAccessibleContext().setAccessibleName("txtLastName");
        lblFMLName.getAccessibleContext().setAccessibleName("lblFMLName");
        txtFirstName1.getAccessibleContext().setAccessibleName("txtFirstName");
        txtMiddleName.getAccessibleContext().setAccessibleName("txtMiddleName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void rdGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdGradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdGradActionPerformed

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
            java.util.logging.Logger.getLogger(TempleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TempleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TempleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TempleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TempleUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReadyNotification;
    private javax.swing.JButton btnSave;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblDash1;
    private javax.swing.JLabel lblDash2;
    private javax.swing.JLabel lblDash3;
    private javax.swing.JLabel lblDash4;
    private javax.swing.JLabel lblExpectedGraduation;
    private javax.swing.JLabel lblFMLName;
    private javax.swing.JLabel lblFMLName9;
    private javax.swing.JLabel lblGradUndergrad;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSelectMajor;
    private javax.swing.JLabel lblTUID;
    private javax.swing.JList<String> lstMajors;
    private javax.swing.JRadioButton rdGrad;
    private javax.swing.JRadioButton rdUngrad;
    private javax.swing.JSeparator seperator;
    private javax.swing.JTextField txtBDDay;
    private javax.swing.JTextField txtBDMonth;
    private javax.swing.JTextField txtBDYear;
    private javax.swing.JTextField txtEGDay;
    private javax.swing.JTextField txtEGMonth;
    private javax.swing.JTextField txtEGYear;
    private javax.swing.JTextField txtFirstName1;
    private javax.swing.JTextField txtFirstName10;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtTUID;
    // End of variables declaration//GEN-END:variables
}
