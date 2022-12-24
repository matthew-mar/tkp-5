public class LabSeven extends javax.swing.JFrame {
    private javax.swing.Box.Filler filler1;
    
    private javax.swing.Box.Filler filler2;
    
    private javax.swing.JButton jButton1;
    
    private javax.swing.JCheckBox jCheckBox1;
    
    private javax.swing.JFrame jFrame1;
    
    private javax.swing.JLabel jLabel2;
    
    private javax.swing.JLabel jLabel3;
    
    private javax.swing.JLabel jLabel4;
    
    private javax.swing.JLabel jLabel5;
    
    private javax.swing.JLabel jLabel6;
    
    private javax.swing.JLabel jLabel7;
    
    private javax.swing.JLabel jLabel8;
    
    private javax.swing.JRadioButton jRadioButton1;
    
    private javax.swing.JScrollPane jScrollPane1;
    
    private javax.swing.JSlider jSlider1;
    
    private javax.swing.JTextField jTextField1;
    
    private javax.swing.JTextField jTextField2;
    
    private javax.swing.JTextField jTextField3;
    
    private javax.swing.JTextField jTextField4;
    
    private javax.swing.JTextField jTextField5;
    
    private javax.swing.JTextField jTextField6;
    
    private javax.swing.JTextField jTextField7;
    
    private javax.swing.JTextField jTextField8;
    
    private javax.swing.JTextField jTextField9;
    
    private javax.swing.JTree jTree1;

    public LabSeven() {
        initComponents();
    }

    private void initComponents() {
        jFrame1 = new javax.swing.JFrame();
        
        jTextField1 = new javax.swing.JTextField();
        
        jTextField2 = new javax.swing.JTextField();
        
        jTextField3 = new javax.swing.JTextField();
        
        jTextField4 = new javax.swing.JTextField();
        
        jTextField5 = new javax.swing.JTextField();
        
        jTextField6 = new javax.swing.JTextField();
        
        jTextField7 = new javax.swing.JTextField();
        
        jScrollPane1 = new javax.swing.JScrollPane();
        
        jTree1 = new javax.swing.JTree();
        
        jTextField8 = new javax.swing.JTextField();
        
        jSlider1 = new javax.swing.JSlider();
        
        jLabel2 = new javax.swing.JLabel();
        
        jLabel3 = new javax.swing.JLabel();
        
        jLabel4 = new javax.swing.JLabel();
        
        jLabel5 = new javax.swing.JLabel();
        
        jLabel6 = new javax.swing.JLabel();
        
        jLabel7 = new javax.swing.JLabel();
        
        jLabel8 = new javax.swing.JLabel();
        
        jRadioButton1 = new javax.swing.JRadioButton();
        
        jButton1 = new javax.swing.JButton();
        
        jTextField9 = new javax.swing.JTextField();
        
        jCheckBox1 = new javax.swing.JCheckBox();
        
        filler1 = new javax.swing.Box.Filler(
            new java.awt.Dimension(0, 0), 
            new java.awt.Dimension(0, 0), 
            new java.awt.Dimension(32767, 32767)
        );
        
        filler2 = new javax.swing.Box.Filler(
            new java.awt.Dimension(0, 0), 
            new java.awt.Dimension(0, 0), 
            new java.awt.Dimension(32767, 32767)
        );
        
        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(
            jFrame1.getContentPane()
        );
        
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 500));
        
        jTextField1.setText("Текстовое поле 1");
        
        jTextField1.setToolTipText("Текстовое поле 1");
        
        jTextField1.setName(""); // NOI18N
        
        jTextField2.setText("Текстовое поле 2");
        
        jTextField3.setText("Текстовое поле 3");
        
        jTextField4.setText("Текстовое поле 4");
        
        jTextField5.setText("Текстовое поле 5");
        
        jTextField6.setText("Текстовое поле 6");
        
        jTextField7.setText("Текстовое поле 7");
        
        jScrollPane1.setViewportView(jTree1);
        
        jTextField8.setText("Текстовое поле 8");
        
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        
        jSlider1.setValue(0);
        
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        
        jLabel2.setText("Метка 1");
        
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        
        jLabel3.setText("Метка 2");
        
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        
        jLabel4.setText("Метка 0");
        
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        
        jLabel5.setText("Метка 3");
        
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        
        jLabel6.setText("Метка 4");
        
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        
        jLabel7.setText("Метка 5");
        
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        
        jLabel8.setText("Метка 6");
        
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        jRadioButton1.setText("Выбор 2");
        
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Кнопка");
        
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        jTextField9.setText("Текстовое поле");
        
        jCheckBox1.setText("Выбор 1");
        
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new
        javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup()

                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jSlider1,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                    Short.MAX_VALUE)
                                .addComponent(jCheckBox1,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton1,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 102,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))

                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField7,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jTextField2,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jTextField3,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jTextField4,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jTextField5,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jTextField6,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jTextField8,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jTextField1,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jTextField9)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()

                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filler1,
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(100, 100, 100)
                                        .addComponent(jLabel7,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(100, 100, 100)
                                        .addComponent(jLabel8,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                            javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel2,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel3,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel5,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 107, Short.MAX_VALUE)))))
                .addContainerGap())
            .addComponent(filler2, javax.swing.GroupLayout.Alignment.TRAILING,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                        30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                        30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                        30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                        30, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE,
                        30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE,
                        30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE,
                        30, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                            javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                            javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                            javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                            javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                            javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                            javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                            javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addComponent(jScrollPane1,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 11,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
                        36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addContainerGap())
        );
        jTextField1.getAccessibleContext().setAccessibleName("");
        pack();
    }
    
    int value = 0;
    
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel4.setText("CheckBox ac");
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel3.setText("Button ac");
    }
    
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel2.setText("RadioBtn ac");
    }
    
    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {
        jLabel6.setText("Hide");
    }
    
    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {
        jLabel6.setText("Метка 4");
    }
    
    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {
        value += 10;
        jSlider1.setValue(value);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabSeven().setVisible(true);
            }
        });
    }
}