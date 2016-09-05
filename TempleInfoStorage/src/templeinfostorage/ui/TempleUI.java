/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templeinfostorage.ui;

import java.awt.Color;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.text.Document;
import templeinfostorage.acc.*;
import templeinfostorage.acc.properties.*;
import templeinfostorage.validate.Validate;

/**
 *
 * @author tonyl
 */
public class TempleUI extends javax.swing.JFrame {
    private User m_User;
    private UserInfo m_UserInfo;
    private Validate m_Number;
    private Validate m_Name;
    private ImageIcon m_icNotificationIncomplete;
    private ImageIcon m_icNotificationComplete;
    private boolean   m_bComplete = false;
    private Thread m_StatusThread;
    private int m_iState;
    private Object[] m_oEmptyText = new Object[9];
    /**
     * Creates new form TempleUI
     */
    public TempleUI() {
        initComponents();
        initDesign();
        initMajorList();
        initStatusThread();
    }
    
    /**
     * Initializes application design
     */
    private void initDesign(){
        String res = System.getProperty("user.dir") + "\\src\\res\\";
        
        // IMAGES
        m_icNotificationIncomplete = new ImageIcon(res + "icon_incomplete.png");
        m_icNotificationComplete   = new ImageIcon(res + "icon_complete.png");
        
        // LOGIC 
        m_User     = new Student();
        m_UserInfo = new UserInfo();
        
        
        // DESIGN 
        
        m_iState = 0;
        
        // NOTIFICATION ICON
        btnReadyNotification.setIcon(m_icNotificationIncomplete);
        btnReadyNotification.setBackground(new Color(190,50,40));
        btnReadyNotification.setBorder(BorderFactory.createEmptyBorder());
        btnReadyNotification.setBorderPainted(false); 
        btnReadyNotification.setContentAreaFilled(false); 
        btnReadyNotification.setFocusPainted(false); 
        btnReadyNotification.setOpaque(false);
        
        // SAVE BUTTON
        btnSave.setBackground(new Color(190,50,40));
        btnSave.setBorder(BorderFactory.createEmptyBorder());
        btnSave.setBorderPainted(false);
        btnSave.setFocusPainted(false); 
        btnSave.setOpaque(false);
    }
    
    /**
     * Populates Major list
     */
    private void initMajorList(){
        String res = System.getProperty("user.dir") + "\\src\\res\\";
        final List<String> lMajor = new LinkedList<>();
        TreeSet<String> tree = new TreeSet<>();
        Scanner sMajor = null;       
        String  strMajor;
        
        try{
            sMajor = new Scanner(new File(res + "raw\\majors.txt"));
            
            while (sMajor.hasNextLine() && (strMajor = sMajor.nextLine()) != null)
                lMajor.add(strMajor);
            
            sMajor.close();           
            lMajor.sort(tree.comparator());
            lstMajors.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = lMajor.toArray(new String[lMajor.size()]);
                @Override
                public int getSize() { return strings.length; }
                @Override
                public String getElementAt(int i) { return strings[i]; }
            });
            
        }catch (Exception err){
            if (sMajor != null)
                sMajor.close();
            
            System.out.println(err.getMessage());
            System.exit(1);
        }
    }
    
    private void initStatusThread(){
        Runnable work = new Runnable() {
            @Override
            public void run(){
                boolean bReady = true;
                try{
                    while (true){
                        bReady = true;
                        
                        // CHECK TEXTFIELDS 
                        for (Object empty : m_oEmptyText){
                            if (empty == null){
                                bReady = false;
                                break;
                            }
                        }
                        
                        // CHECK RADIO BUTTONS
                        if (bReady && !(rdGrad.isSelected() || rdUngrad.isSelected())){
                            m_bComplete = false;
                            bReady = false;
                        }
                        
                        // CHECK SELECTION LIST
                        if (bReady && lstMajors.isSelectionEmpty()){
                            m_bComplete = false;
                            bReady = false;
                        }
                        if (bReady){
                            m_bComplete = true;
                            
                            if (m_iState != 1){
                                btnReadyNotification.setIcon(m_icNotificationComplete);
                                m_iState = 1;
                            }
                        }else{
                            m_bComplete = false;
                            
                            if (m_iState != 0){
                                btnReadyNotification.setIcon(m_icNotificationIncomplete);
                                m_iState = 0;
                            }
                        }
                        
                        Thread.sleep(10);
                    }
                }catch (Exception err){
                    // DO NOTHING
                }
            }
        };
        
        // ADD EVEMT LISTENERS
        txtFirstName.getDocument().addDocumentListener(new JTextEmptyListener(new Object[] {m_oEmptyText, 0}));
        txtLastName.getDocument().addDocumentListener(new JTextEmptyListener(new Object[] {m_oEmptyText, 1}));
        txtBDMonth.getDocument().addDocumentListener(new JTextEmptyListener(new Object[] {m_oEmptyText, 2}));
        txtBDDay.getDocument().addDocumentListener(new JTextEmptyListener(new Object[] {m_oEmptyText, 3}));
        txtBDYear.getDocument().addDocumentListener(new JTextEmptyListener(new Object[] {m_oEmptyText, 4}));
        txtEGYear.getDocument().addDocumentListener(new JTextEmptyListener(new Object[] {m_oEmptyText, 5}));
        txtPhoneNumber.getDocument().addDocumentListener(new JTextEmptyListener(new Object[] {m_oEmptyText, 6}));
        txtTUID.getDocument().addDocumentListener(new JTextEmptyListener(new Object[] {m_oEmptyText, 7}));
        txtEmail.getDocument().addDocumentListener(new JTextEmptyListener(new Object[] {m_oEmptyText, 8}));
        
        m_StatusThread = new Thread(work);
        m_StatusThread.start();
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
        txtLastName = new javax.swing.JTextField();
        btnReadyNotification = new javax.swing.JButton();
        lblFMLName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
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
        lblComma = new javax.swing.JLabel();
        txtEGYear = new javax.swing.JTextField();
        lblTUID = new javax.swing.JLabel();
        txtTUID = new javax.swing.JTextField();
        lblFMLName9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMajors = new javax.swing.JList<>();
        rdGrad = new javax.swing.JRadioButton();
        rdUngrad = new javax.swing.JRadioButton();
        lblGradUndergrad = new javax.swing.JLabel();
        lblSelectMajor = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 28), new java.awt.Dimension(0, 28), new java.awt.Dimension(32767, 28));
        seperator = new javax.swing.JSeparator();
        btnSave = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(40, 40, 40));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(190, 50, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  LOCAL TEMPLE INFORMATION STORAGE ");

        txtLastName.setBackground(new java.awt.Color(200, 200, 200));
        txtLastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtLastName.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        btnReadyNotification.setBackground(new java.awt.Color(190, 50, 40));

        lblFMLName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFMLName.setForeground(new java.awt.Color(255, 255, 255));
        lblFMLName.setText("First, Middle, and Last Name:");

        txtFirstName.setBackground(new java.awt.Color(200, 200, 200));
        txtFirstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFirstName.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        txtMiddleName.setBackground(new java.awt.Color(200, 200, 200));
        txtMiddleName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtMiddleName.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        lblBirthDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBirthDate.setForeground(new java.awt.Color(255, 255, 255));
        lblBirthDate.setText("Birth Date:");

        txtBDMonth.setBackground(new java.awt.Color(200, 200, 200));
        txtBDMonth.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBDMonth.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        lblPhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber.setText("Phone Number:");

        txtPhoneNumber.setBackground(new java.awt.Color(200, 200, 200));
        txtPhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPhoneNumber.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        txtBDDay.setBackground(new java.awt.Color(200, 200, 200));
        txtBDDay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBDDay.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        txtBDYear.setBackground(new java.awt.Color(200, 200, 200));
        txtBDYear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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

        lblComma.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblComma.setForeground(new java.awt.Color(255, 255, 255));
        lblComma.setText(",");

        txtEGYear.setBackground(new java.awt.Color(200, 200, 200));
        txtEGYear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtEGYear.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        lblTUID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTUID.setForeground(new java.awt.Color(255, 255, 255));
        lblTUID.setText("TUID:");

        txtTUID.setBackground(new java.awt.Color(200, 200, 200));
        txtTUID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTUID.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        lblFMLName9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFMLName9.setForeground(new java.awt.Color(255, 255, 255));
        lblFMLName9.setText("Temple Email:");

        txtEmail.setBackground(new java.awt.Color(200, 200, 200));
        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtEmail.setSelectedTextColor(new java.awt.Color(0, 0, 0));

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

        btnSave.setBackground(new java.awt.Color(190, 50, 40));
        btnSave.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");

        jComboBox1.setBackground(new java.awt.Color(200, 200, 200));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

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
                            .addComponent(lblTUID)
                            .addComponent(lblFMLName9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                    .addComponent(txtTUID)
                                    .addComponent(txtEmail)))
                            .addComponent(lblGradUndergrad)
                            .addComponent(lblBirthDate)
                            .addComponent(lblExpectedGraduation))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdGrad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdUngrad))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtBDMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblDash1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBDDay, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblDash2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBDYear, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblComma, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(txtEGYear, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addComponent(seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSelectMajor)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnReadyNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
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
                            .addComponent(lblFMLName)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 44, Short.MAX_VALUE))
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
                    .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectMajor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReadyNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                            .addComponent(lblComma)
                                            .addComponent(txtEGYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblGradUndergrad)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdGrad)
                                    .addComponent(rdUngrad)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))))
        );

        txtLastName.getAccessibleContext().setAccessibleName("txtLastName");
        lblFMLName.getAccessibleContext().setAccessibleName("lblFMLName");
        txtFirstName.getAccessibleContext().setAccessibleName("txtFirstName");
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

    private void rdGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdGradActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdGradActionPerformed

    /**
     * @param args the command line arguments
     */
    public void start(String args[]) {
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
            @Override
            public void run() {
                new TempleUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReadyNotification;
    private javax.swing.JButton btnSave;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBirthDate;
    private javax.swing.JLabel lblComma;
    private javax.swing.JLabel lblDash1;
    private javax.swing.JLabel lblDash2;
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
    private javax.swing.JTextField txtEGYear;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtTUID;
    // End of variables declaration//GEN-END:variables
}
