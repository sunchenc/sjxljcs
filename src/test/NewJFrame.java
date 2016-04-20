/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

/**
 *
 * @author cc 三角形路径测试
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();   //获取当前屏幕大小
        Dimension frameSize = this.getPreferredSize();//获取当前窗口大小
        this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);//保持窗口弹出位置居中
        jTextArea2.append("1->2->3->4->5->6->7->13->16->18->20\n");
        jTextArea2.append("1->2->3->4->5->7->13->16->18->20\n");
        jTextArea2.append("1->2->3->5->6->7->13->16->18->20\n");
        jTextArea2.append("1->2->3->5->7->13->16->18->20\n");
        jTextArea2.append("1->3->4->5->6->7->13->16->18->20\n");
        jTextArea2.append("1->3->4->5->7->13->16->18->20\n");
        jTextArea2.append("1->3->5->6->7->13->16->18->20\n");
        jTextArea2.append("1->3->5->7->13->16->18->20\n");

        jTextArea2.append("1->2->3->4->5->6->7->13->16->18->19->15\n");
        jTextArea2.append("1->2->3->4->5->7->13->16->18->19->15\n");
        jTextArea2.append("1->2->3->5->6->7->13->16->18->19->15\n");
        jTextArea2.append("1->2->3->5->7->13->16->18->19->15\n");
        jTextArea2.append("1->3->4->5->6->7->13->16->18->19->15\n");
        jTextArea2.append("1->3->4->5->7->13->16->18->19->15\n");
        jTextArea2.append("1->3->5->6->7->13->16->18->19->15\n");
        jTextArea2.append("1->3->5->7->13->16->18->19->15\n");

        jTextArea2.append("1->2->3->4->5->6->7->13->16->18->19->12\n");
        jTextArea2.append("1->2->3->4->5->7->13->16->18->19->12\n");
        jTextArea2.append("1->2->3->5->6->7->13->16->18->19->12\n");
        jTextArea2.append("1->2->3->5->7->13->16->18->19->12\n");
        jTextArea2.append("1->3->4->5->6->7->13->16->18->19->12\n");
        jTextArea2.append("1->3->4->5->7->13->16->18->19->12\n");
        jTextArea2.append("1->3->5->6->7->13->16->18->19->12\n");
        jTextArea2.append("1->3->5->7->13->16->18->19->12\n");

        jTextArea2.append("1->2->3->4->5->6->7->13->16->17->15\n");
        jTextArea2.append("1->2->3->4->5->7->13->16->17->15\n");
        jTextArea2.append("1->2->3->5->6->7->13->16->17->15\n");
        jTextArea2.append("1->2->3->5->7->13->16->17->15\n");
        jTextArea2.append("1->3->4->5->6->7->13->16->17->15\n");
        jTextArea2.append("1->3->4->5->7->13->16->17->15\n");
        jTextArea2.append("1->3->5->6->7->13->16->17->15\n");
        jTextArea2.append("1->3->5->7->13->16->17->15\n");

        jTextArea2.append("1->2->3->4->5->6->7->13->16->17->12\n");
        jTextArea2.append("1->2->3->4->5->7->13->16->17->12\n");
        jTextArea2.append("1->2->3->5->6->7->13->16->17->12\n");
        jTextArea2.append("1->2->3->5->7->13->16->17->12\n");
        jTextArea2.append("1->3->4->5->6->7->13->16->17->12\n");
        jTextArea2.append("1->3->4->5->7->13->16->17->12\n");
        jTextArea2.append("1->3->5->6->7->13->16->17->12\n");
        jTextArea2.append("1->3->5->7->13->16->17->12\n");

        jTextArea2.append("1->2->3->4->5->6->7->13->14->15\n");
        jTextArea2.append("1->2->3->4->5->7->13->14->15\n");
        jTextArea2.append("1->2->3->5->6->7->13->14->15\n");
        jTextArea2.append("1->2->3->5->7->13->14->15\n");
        jTextArea2.append("1->3->4->5->6->7->13->14->15\n");
        jTextArea2.append("1->3->4->5->7->13->14->15\n");
        jTextArea2.append("1->3->5->6->7->13->14->15\n");
        jTextArea2.append("1->3->5->7->13->14->15\n");

        jTextArea2.append("1->2->3->4->5->6->7->13->14->12\n");
        jTextArea2.append("1->2->3->4->5->7->13->14->12\n");
        jTextArea2.append("1->2->3->5->6->7->13->14->12\n");
        jTextArea2.append("1->2->3->5->7->13->14->12\n");
        jTextArea2.append("1->3->4->5->6->7->13->14->12\n");
        jTextArea2.append("1->3->4->5->7->13->14->12\n");
        jTextArea2.append("1->3->5->6->7->13->14->12\n");
        jTextArea2.append("1->3->5->7->13->14->12\n");

        jTextArea2.append("1->2->3->4->5->6->7->8->12\n");
        jTextArea2.append("1->2->3->4->5->7->8->12\n");
        jTextArea2.append("1->2->3->5->6->7->8->12\n");
        jTextArea2.append("1->2->3->5->7->8->12\n");
        jTextArea2.append("1->3->4->5->6->7->8->12\n");
        jTextArea2.append("1->3->4->5->7->8->12\n");
        jTextArea2.append("1->3->5->6->7->8->12\n");
        jTextArea2.append("1->3->5->7->8->12\n");

        jTextArea2.append("1->2->3->4->5->6->7->8->9->12\n");
        jTextArea2.append("1->2->3->4->5->7->8->9->12\n");
        jTextArea2.append("1->2->3->5->6->7->8->9->12\n");
        jTextArea2.append("1->2->3->5->7->8->9->12\n");
        jTextArea2.append("1->3->4->5->6->7->8->9->12\n");
        jTextArea2.append("1->3->4->5->7->8->9->12\n");
        jTextArea2.append("1->3->5->6->7->8->9->12\n");
        jTextArea2.append("1->3->5->7->8->9->12\n");

        jTextArea2.append("1->2->3->4->5->6->7->8->9->10->12\n");
        jTextArea2.append("1->2->3->4->5->7->8->9->10->12\n");
        jTextArea2.append("1->2->3->5->6->7->8->9->10->12\n");
        jTextArea2.append("1->2->3->5->7->8->9->10->12\n");
        jTextArea2.append("1->3->4->5->6->7->8->9->10->12\n");
        jTextArea2.append("1->3->4->5->7->8->9->10->12\n");
        jTextArea2.append("1->3->5->6->7->8->9->10->12\n");
        jTextArea2.append("1->3->5->7->8->9->10->12\n");

        jTextArea2.append("1->2->3->4->5->6->7->8->9->10->11\n");
        jTextArea2.append("1->2->3->4->5->7->8->9->10->11\n");
        jTextArea2.append("1->2->3->5->6->7->8->9->10->11\n");
        jTextArea2.append("1->2->3->5->7->8->9->10->11\n");
        jTextArea2.append("1->3->4->5->6->7->8->9->10->11\n");
        jTextArea2.append("1->3->4->5->7->8->9->10->11\n");
        jTextArea2.append("1->3->5->6->7->8->9->10->11\n");
        jTextArea2.append("1->3->5->7->8->9->10->11\n");

        //限制只能输入数字  
        jTextFielda.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                int keyChar = e.getKeyChar();
                if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9) {

                } else {
                    e.consume(); //关键，屏蔽掉非法输入  
                }
            }
        });
        jTextFieldb.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                int keyChar = e.getKeyChar();
                if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9) {

                } else {
                    e.consume(); //关键，屏蔽掉非法输入  
                }
            }
        });
        jTextFieldc.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                int keyChar = e.getKeyChar();
                if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9) {

                } else {
                    e.consume(); //关键，屏蔽掉非法输入  
                }
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

        jPanel1 = new javax.swing.JPanel();
        jTextFielda = new javax.swing.JTextField();
        jTextFieldb = new javax.swing.JTextField();
        jTextFieldc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel1.setText("a");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel2.setText("b");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel3.setText("c");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldb, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jTextFielda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFielda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel4.setText("已走过的路径");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel5.setText("未走的路径");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButton1.setText("确定");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("清空");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/100.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 278, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(34, 34, 34)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTextFielda.getText() == null || "".equals(jTextFielda.getText()) || jTextFieldb.getText() == null || jTextFieldb.getText() == "" || jTextFieldc.getText() == null || jTextFieldc.getText() == "") {
            JOptionPane.showMessageDialog(null,"输入不能为空！", "alert",  JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (Integer.parseInt(jTextFielda.getText()) <= 0 || Integer.parseInt(jTextFieldb.getText()) <= 0 || Integer.parseInt(jTextFieldc.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "请输入>0的数字","alert", JOptionPane.ERROR_MESSAGE);
            return;
        }
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/100.jpg"))); // NOI18N
        /*  jTextArea2.append("1->2->3->4->5->6->7\n");
         jTextArea2.append("1->2->3->4->5->7\n");
         jTextArea2.append("1->2->3->5->6->7\n");
         jTextArea2.append("1->2->3->5->7\n");
         jTextArea2.append("1->3->4->5->6->7\n");
         jTextArea2.append("1->3->4->5->7\n");
         jTextArea2.append("1->3->5->6->7\n");
         jTextArea2.append("1->3->5->7\n");
         */

        //     jTextArea2.append("1->3->5->7->13->16->18->20\n");
        //     jTextArea2.append("1->3->5->7->13->16->18->19->15\n");
        //     jTextArea2.append("1->3->5->7->13->16->18->19->12\n");
        //       jTextArea2.append("1->3->5->7->13->16->17->15\n");
        //      jTextArea2.append("1->3->5->7->13->16->17->12\n");
        //       jTextArea2.append("1->3->5->7->13->14->15\n");
//        jTextArea2.append("1->3->5->7->13->14->12\n");
//        jTextArea2.append("1->3->5->7->8->12\n");
        //      jTextArea2.append("1->3->5->7->8->9->12\n");
        //       jTextArea2.append("1->3->5->7->8->9->10->12\n");
        //      jTextArea2.append("1->3->5->7->8->9->10->11\n");
        //     jTextArea4.removeAll();
        jTextFielda.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //插入字符
                //    System.out.println("文本插入");
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/100.jpg"))); // NOI18N
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //删除字符
                //  System.out.println("文本删除");
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/100.jpg"))); // NOI18N
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //字符改变
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/100.jpg"))); // NOI18N
                //     System.out.println("属性改变"+e);
            }
        });
        jTextFieldb.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //插入字符
                //    System.out.println("文本插入");
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/100.jpg"))); // NOI18N
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //删除字符
                //  System.out.println("文本删除");
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/100.jpg"))); // NOI18N
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //字符改变
                //    System.out.println("属性改变"+e);
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/100.jpg"))); // NOI18N
            }
        });
        jTextFieldc.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //插入字符
                //   System.out.println("文本插入");
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/100.jpg"))); // NOI18N
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //删除字符
                //      System.out.println("文本删除");
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/100.jpg"))); // NOI18N
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //字符改变
                //   System.out.println("属性改变"+e);
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/100.jpg"))); // NOI18N
            }
        });

        int a = Integer.parseInt(jTextFielda.getText());
        int b = Integer.parseInt(jTextFieldb.getText());
        int c = Integer.parseInt(jTextFieldc.getText());
        String s = "";
        Graphics2D graphics = (Graphics2D) this.getGraphics();
        Stroke stroke = new BasicStroke(3);//设置线宽为3.0
        //      graphics.setColor(Color.WHITE);
        graphics.setColor(Color.RED);

        graphics.setStroke(stroke);

        graphics.drawRect(475, 100, 74, 21);  //输入a,b,c
        wwait();
        int match = 0;

        //   LineDrawer ld =  new LineDrawer(510,120,510,120);
        LineDrawer ld = new LineDrawer();
        ld.drawArrow(graphics, 510, 120, 510, 150);//第一个箭头
        wwait();
        graphics.drawRect(475, 150, 74, 21);        //match=0;
        wwait();
        // ld = new LineDrawer(80, 80, 80, 80);       //箭头
        ld.drawArrow(graphics, 512, 171, 512, 200);//第二个箭头
        wwait();
        //1
        int[] xPoints2 = {485, 513, 538, 513};
        int[] yPoints2 = {217, 200, 217, 236};
        graphics.drawPolygon(xPoints2, yPoints2, 4);
        wwait();
        if (a == b) {
            //1->2
            ld.drawArrow(graphics, 537, 217, 598, 217);
            wwait();
            // 2    
            match = match + 1;
            graphics.drawRect(598, 200, 62, 30);
            wwait();
            //2->3
            ld.drawArrow(graphics, 630, 225, 515, 265);
            wwait();
            s += "1->2->3";
            // jTextArea4.append("1->2");
            // jTextArea4.append("->3");
        } else {
            //1-3
            ld.drawArrow(graphics, 513, 236, 513, 266);
            wwait();
            s += "1->3";
            // jTextArea4.append("1->3");
        }
        //3  a=c?
        int[] xPoints3 = {485, 515, 545, 515};
        int[] yPoints3 = {280, 265, 280, 295};
        graphics.drawPolygon(xPoints3, yPoints3, 4);
        wwait();
        if (a == c) {
            //3-4
            ld.drawArrow(graphics, 545, 280, 595, 280);
            wwait();
            s += "->4";
            //  jTextArea4.append("->4");
            //4
            match = match + 2;
            graphics.drawRect(595, 260, 70, 30);
            wwait();
            //4->5
            ld.drawArrow(graphics, 632, 290, 515, 325);
            wwait();
            s += "->5";
            //  jTextArea4.append("->5");
        } else {
            //3-5
            ld.drawArrow(graphics, 515, 290, 515, 320);
            wwait();
            s += "->5";
            // jTextArea4.append("->5");
        }
        //5
        int[] xPoints4 = {490, 515, 540, 515};
        int[] yPoints4 = {345, 325, 345, 360};
        graphics.drawPolygon(xPoints4, yPoints4, 4);
        wwait();
        if (b == c) {
            //5-6
            ld.drawArrow(graphics, 540, 345, 600, 345);
            wwait();
            s += "->6";
            //  jTextArea4.append("->6");
            //6
            match = match + 3;
            graphics.drawRect(600, 325, 65, 30);
            wwait();
            //6-7
            ld.drawArrow(graphics, 633, 355, 515, 390);
            wwait();
            s += "->7";
            //  jTextArea4.append("->7");
        } else {
            //5-7
            ld.drawArrow(graphics, 515, 360, 515, 390);
            wwait();
            s += "->7";
            //   jTextArea4.append("->7");
        }
        //7
        int[] xPoints5 = {480, 515, 560, 519};
        int[] yPoints5 = {415, 390, 415, 440};
        graphics.drawPolygon(xPoints5, yPoints5, 4);
        wwait();
        if (match == 0) {
            //7->8
            ld.drawArrow(graphics, 560, 415, 705, 431);
            wwait();
            s += "->8";
            //  jTextArea4.append("->8");
            //8
            int[] xPoints12 = {690, 720, 750, 720};
            int[] yPoints12 = {442, 418, 442, 462};
            graphics.drawPolygon(xPoints12, yPoints12, 4);
            wwait();

            if (a + b <= c) {
                //8-12
                ld.drawArrow(graphics, 690, 442, 624, 656);
                wwait();
                s += "->12";
                //12
                graphics.drawRect(594, 656, 60, 30); //非三角形
                wwait();
                //   jTextArea4.append("->12");
            } else {
                //8-9
                ld.drawArrow(graphics, 720, 462, 722, 495);
                wwait();
                s += "->9";
                //    jTextArea4.append("->9");
                //9
                int[] xPoints13 = {690, 722, 752, 722};
                int[] yPoints13 = {517, 495, 517, 537};
                graphics.drawPolygon(xPoints13, yPoints13, 4);
                wwait();
                if (b + c <= a) {
                    //9-12
                    ld.drawArrow(graphics, 690, 517, 636, 653);
                    wwait();
                    s += "->12";
                    //12
                    graphics.drawRect(594, 656, 60, 30); //非三角形
                    wwait();
                    //     jTextArea4.append("->12");
                } else {
                    //9-10
                    ld.drawArrow(graphics, 722, 537, 722, 570);
                    wwait();
                    s += "->10";
                    //    jTextArea4.append("->10");
                    //10
                    int[] xPoints14 = {690, 722, 752, 722};
                    int[] yPoints14 = {592, 571, 592, 612};
                    graphics.drawPolygon(xPoints14, yPoints14, 4);
                    wwait();

                    if (a + c <= b) {
                        //10-12
                        ld.drawArrow(graphics, 690, 592, 655, 654);
                        wwait();
                        s += "->12";
                        //   jTextArea4.append("->12");
                        //12
                        graphics.drawRect(594, 656, 60, 30); //非三角形
                        wwait();
                    } else {
                        //10-11
                        ld.drawArrow(graphics, 722, 612, 722, 659);
                        wwait();
                        s += "->11";
                        //      jTextArea4.append("->11");
                        //11
                        graphics.drawRect(688, 659, 76, 27);
                        wwait();
                    }
                }
            }
        } else {
            //7->13
            ld.drawArrow(graphics, 480, 415, 448, 438);
            wwait();
            s += "->13";
            //jTextArea4.append("->13");
            //13
            int[] xPoints6 = {405, 435, 465, 438};
            int[] yPoints6 = {453, 433, 453, 473};
            graphics.drawPolygon(xPoints6, yPoints6, 4);
            wwait();
            if (match == 1) {
                //13->14
                ld.drawArrow(graphics, 465, 453, 503, 475);
                wwait();
                s += "->14";
                // jTextArea4.append("->14");
                //14
                int[] xPoints9 = {488, 520, 552, 520};
                int[] yPoints9 = {488, 463, 488, 510};
                graphics.drawPolygon(xPoints9, yPoints9, 4);
                wwait();
                if (a + b <= c) {
                    //14->12
                    ld.drawArrow(graphics, 552, 488, 616, 650);
                    wwait();
                    s += "->12";
                    //12
                    graphics.drawRect(594, 656, 60, 30); //非三角形
                    wwait();
                    //   jTextArea4.append("->12");
                } else {
                    //14->15
                    ld.drawArrow(graphics, 520, 510, 520, 663);
                    wwait();
                    s += "->15";
                    //15
                    graphics.drawRect(492, 665, 60, 23);   //等腰三角形
                    wwait();
                    // jTextArea4.append("->15");
                }
            } else {
                //13->16
                ld.drawArrow(graphics, 405, 453, 370, 475);
                wwait();
                s += "->16";
                //   jTextArea4.append("->16");
                //16
                int[] xPoints7 = {330, 360, 385, 357};
                int[] yPoints7 = {490, 470, 490, 510};
                graphics.drawPolygon(xPoints7, yPoints7, 4);
                wwait();
                if (match == 2) {
                    //16->17
                    ld.drawArrow(graphics, 385, 490, 420, 515);
                    wwait();
                    s += "->17";
                    //   jTextArea4.append("->17");
                    //17
                    int[] xPoints10 = {407, 434, 466, 436};
                    int[] yPoints10 = {524, 503, 524, 544};
                    graphics.drawPolygon(xPoints10, yPoints10, 4);
                    wwait();
                    if (a + c <= b) {
                        //17->12
                        ld.drawArrow(graphics, 466, 524, 605, 655);
                        wwait();
                        s += "->12";
                        //    jTextArea4.append("->12");
                        //12
                        graphics.drawRect(594, 656, 60, 30); //非三角形
                        wwait();
                    } else {
                        //17->15
                        ld.drawArrow(graphics, 436, 544, 505, 662);
                        wwait();
                        s += "->15";
                        //     jTextArea4.append("->15");
                        //15
                        graphics.drawRect(492, 665, 60, 23);   //等腰三角形
                        wwait();
                    }
                } else {
                    //16->18
                    ld.drawArrow(graphics, 357, 510, 357, 568);
                    wwait();
                    s += "->18";
                    // jTextArea4.append("->18");
                    //18
                    int[] xPoints8 = {330, 357, 385, 357};
                    int[] yPoints8 = {586, 568, 586, 605};
                    graphics.drawPolygon(xPoints8, yPoints8, 4);
                    wwait();
                    if (match == 3) {
                        //18->19
                        ld.drawArrow(graphics, 385, 586, 427, 602);
                        wwait();
                        s += "->19";
                        //   jTextArea4.append("->19");
                        //19
                        int[] xPoints11 = {407, 440, 470, 440};
                        int[] yPoints11 = {620, 597, 620, 640};
                        graphics.drawPolygon(xPoints11, yPoints11, 4);
                        wwait();
                        if (b + c <= a) {
                            //19->12
                            ld.drawArrow(graphics, 470, 620, 587, 656);
                            wwait();
                            s += "->12";
                            //   jTextArea4.append("->12\n");
                            //12
                            graphics.drawRect(594, 656, 60, 30); //非三角形
                            wwait();
                        } else {
                            //19->15
                            ld.drawArrow(graphics, 440, 640, 490, 665);
                            wwait();
                            s += "->15";
                            //    jTextArea4.append("->15\n");
                            //15
                            graphics.drawRect(492, 665, 60, 23);   //等腰三角形
                            wwait();
                        }
                    } else {
                        //18->20 ?
                        ld.drawArrow(graphics, 357, 603, 357, 663);
                        wwait();
                        //  jTextArea4.append("->20\n");
                        s += "->20";
                        graphics.drawRect(330, 668, 60, 23);  //20  等边三角形1
                        wwait();
                    }
                }
            }
        }
        String[] lineString4 = jTextArea4.getText().split("\n");
        int i = 0;
        for (; i < lineString4.length && (!s.equals(lineString4[i])); i++);

        if (i == lineString4.length) {
            jTextArea4.append(s + "\n");
        }

        String[] lineString2 = jTextArea2.getText().split("\n");
        for (int j = 0; j < lineString2.length; j++) {
            if (s.equals(lineString2[j])) {
                try {
                    // jTextArea2.remove(j);
                    //   jTextArea2.getDocument().remove(j, s.length());
                    int selectionStart = jTextArea2.getLineStartOffset(j);
                    int selectionEnd = jTextArea2.getLineEndOffset(j);
                    jTextArea2.replaceRange("", selectionStart, selectionEnd);
                } catch (BadLocationException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //      graphics.fillPolygon(xPoints2, yPoints2, 4);

    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextFielda.setText(null);
        jTextFieldb.setText(null);
        jTextFieldc.setText(null);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/100.jpg"))); // NOI18N


    }//GEN-LAST:event_jButton2ActionPerformed
    public void wwait() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextFielda;
    private javax.swing.JTextField jTextFieldb;
    private javax.swing.JTextField jTextFieldc;
    // End of variables declaration//GEN-END:variables
}
