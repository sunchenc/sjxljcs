/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//package com.zhoubin.src;
package test;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
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
 * @author ck 三角形路径测试
 */
public class demo extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame
     */

	public demo(){
        initComponents();
        TextArealineNotFinished.append("1->2->3->4->5->6->7->13->16->18->20\n");
        TextArealineNotFinished.append("1->2->3->4->5->7->13->16->18->20\n");
        TextArealineNotFinished.append("1->2->3->5->6->7->13->16->18->20\n");
        TextArealineNotFinished.append("1->2->3->5->7->13->16->18->20\n");
        TextArealineNotFinished.append("1->3->4->5->6->7->13->16->18->20\n");
        TextArealineNotFinished.append("1->3->4->5->7->13->16->18->20\n");
        TextArealineNotFinished.append("1->3->5->6->7->13->16->18->20\n");
        TextArealineNotFinished.append("1->3->5->7->13->16->18->20\n");
        TextArealineNotFinished.append("1->2->3->4->5->6->7->13->16->18->19->15\n");
        TextArealineNotFinished.append("1->2->3->4->5->7->13->16->18->19->15\n");
        TextArealineNotFinished.append("1->2->3->5->6->7->13->16->18->19->15\n");
        TextArealineNotFinished.append("1->2->3->5->7->13->16->18->19->15\n");
        TextArealineNotFinished.append("1->3->4->5->6->7->13->16->18->19->15\n");
        TextArealineNotFinished.append("1->3->4->5->7->13->16->18->19->15\n");
        TextArealineNotFinished.append("1->3->5->6->7->13->16->18->19->15\n");
        TextArealineNotFinished.append("1->3->5->7->13->16->18->19->15\n");
        TextArealineNotFinished.append("1->2->3->4->5->6->7->13->16->18->19->12\n");
        TextArealineNotFinished.append("1->2->3->4->5->7->13->16->18->19->12\n");
        TextArealineNotFinished.append("1->2->3->5->6->7->13->16->18->19->12\n");
        TextArealineNotFinished.append("1->2->3->5->7->13->16->18->19->12\n");
        TextArealineNotFinished.append("1->3->4->5->6->7->13->16->18->19->12\n");
        TextArealineNotFinished.append("1->3->4->5->7->13->16->18->19->12\n");
        TextArealineNotFinished.append("1->3->5->6->7->13->16->18->19->12\n");
        TextArealineNotFinished.append("1->3->5->7->13->16->18->19->12\n");

        TextArealineNotFinished.append("1->2->3->4->5->6->7->13->16->17->15\n");
        TextArealineNotFinished.append("1->2->3->4->5->7->13->16->17->15\n");
        TextArealineNotFinished.append("1->2->3->5->6->7->13->16->17->15\n");
        TextArealineNotFinished.append("1->2->3->5->7->13->16->17->15\n");
        TextArealineNotFinished.append("1->3->4->5->6->7->13->16->17->15\n");
        TextArealineNotFinished.append("1->3->4->5->7->13->16->17->15\n");
        TextArealineNotFinished.append("1->3->5->6->7->13->16->17->15\n");
        TextArealineNotFinished.append("1->3->5->7->13->16->17->15\n");

        TextArealineNotFinished.append("1->2->3->4->5->6->7->13->16->17->12\n");
        TextArealineNotFinished.append("1->2->3->4->5->7->13->16->17->12\n");
        TextArealineNotFinished.append("1->2->3->5->6->7->13->16->17->12\n");
        TextArealineNotFinished.append("1->2->3->5->7->13->16->17->12\n");
        TextArealineNotFinished.append("1->3->4->5->6->7->13->16->17->12\n");
        TextArealineNotFinished.append("1->3->4->5->7->13->16->17->12\n");
        TextArealineNotFinished.append("1->3->5->6->7->13->16->17->12\n");
        TextArealineNotFinished.append("1->3->5->7->13->16->17->12\n");

        TextArealineNotFinished.append("1->2->3->4->5->6->7->13->14->15\n");
        TextArealineNotFinished.append("1->2->3->4->5->7->13->14->15\n");
        TextArealineNotFinished.append("1->2->3->5->6->7->13->14->15\n");
        TextArealineNotFinished.append("1->2->3->5->7->13->14->15\n");
        TextArealineNotFinished.append("1->3->4->5->6->7->13->14->15\n");
        TextArealineNotFinished.append("1->3->4->5->7->13->14->15\n");
        TextArealineNotFinished.append("1->3->5->6->7->13->14->15\n");
        TextArealineNotFinished.append("1->3->5->7->13->14->15\n");

        TextArealineNotFinished.append("1->2->3->4->5->6->7->13->14->12\n");
        TextArealineNotFinished.append("1->2->3->4->5->7->13->14->12\n");
        TextArealineNotFinished.append("1->2->3->5->6->7->13->14->12\n");
        TextArealineNotFinished.append("1->2->3->5->7->13->14->12\n");
        TextArealineNotFinished.append("1->3->4->5->6->7->13->14->12\n");
        TextArealineNotFinished.append("1->3->4->5->7->13->14->12\n");
        TextArealineNotFinished.append("1->3->5->6->7->13->14->12\n");
        TextArealineNotFinished.append("1->3->5->7->13->14->12\n");

        TextArealineNotFinished.append("1->2->3->4->5->6->7->8->12\n");
        TextArealineNotFinished.append("1->2->3->4->5->7->8->12\n");
        TextArealineNotFinished.append("1->2->3->5->6->7->8->12\n");
        TextArealineNotFinished.append("1->2->3->5->7->8->12\n");
        TextArealineNotFinished.append("1->3->4->5->6->7->8->12\n");
        TextArealineNotFinished.append("1->3->4->5->7->8->12\n");
        TextArealineNotFinished.append("1->3->5->6->7->8->12\n");
        TextArealineNotFinished.append("1->3->5->7->8->12\n");

        TextArealineNotFinished.append("1->2->3->4->5->6->7->8->9->12\n");
        TextArealineNotFinished.append("1->2->3->4->5->7->8->9->12\n");
        TextArealineNotFinished.append("1->2->3->5->6->7->8->9->12\n");
        TextArealineNotFinished.append("1->2->3->5->7->8->9->12\n");
        TextArealineNotFinished.append("1->3->4->5->6->7->8->9->12\n");
        TextArealineNotFinished.append("1->3->4->5->7->8->9->12\n");
        TextArealineNotFinished.append("1->3->5->6->7->8->9->12\n");
        TextArealineNotFinished.append("1->3->5->7->8->9->12\n");

        TextArealineNotFinished.append("1->2->3->4->5->6->7->8->9->10->12\n");
        TextArealineNotFinished.append("1->2->3->4->5->7->8->9->10->12\n");
        TextArealineNotFinished.append("1->2->3->5->6->7->8->9->10->12\n");
        TextArealineNotFinished.append("1->2->3->5->7->8->9->10->12\n");
        TextArealineNotFinished.append("1->3->4->5->6->7->8->9->10->12\n");
        TextArealineNotFinished.append("1->3->4->5->7->8->9->10->12\n");
        TextArealineNotFinished.append("1->3->5->6->7->8->9->10->12\n");
        TextArealineNotFinished.append("1->3->5->7->8->9->10->12\n");

        TextArealineNotFinished.append("1->2->3->4->5->6->7->8->9->10->11\n");
        TextArealineNotFinished.append("1->2->3->4->5->7->8->9->10->11\n");
        TextArealineNotFinished.append("1->2->3->5->6->7->8->9->10->11\n");
        TextArealineNotFinished.append("1->2->3->5->7->8->9->10->11\n");
        TextArealineNotFinished.append("1->3->4->5->6->7->8->9->10->11\n");
        TextArealineNotFinished.append("1->3->4->5->7->8->9->10->11\n");
        TextArealineNotFinished.append("1->3->5->6->7->8->9->10->11\n");
        TextArealineNotFinished.append("1->3->5->7->8->9->10->11\n");


        
        //限制只能输入数字  
        inputA.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                int keyChar = e.getKeyChar();
                if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9) {

                } else {
                    e.consume(); //关键，屏蔽掉非法输入  
                }
            }
        });
        
        
        inputB.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                int keyChar = e.getKeyChar();
                if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9) {

                } else {
                    e.consume(); //关键，屏蔽掉非法输入  
                }
            }
        });
        
        
        inputC.addKeyListener(new KeyAdapter() {
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

        panelInput = new javax.swing.JPanel();
        inputA = new javax.swing.JTextField();
        inputB = new javax.swing.JTextField();
        inputC = new javax.swing.JTextField();
        inputLabelA = new javax.swing.JLabel();
        inputLabelB = new javax.swing.JLabel();
        inputLabelC = new javax.swing.JLabel();
        panelNotFinished = new javax.swing.JPanel();
        lineFinishedLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textAreaNotFinished = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        lineNotFinishedLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArealineNotFinished = new javax.swing.JTextArea();
        buttonSubmit = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        panelFinished = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 750));
        setResizable(false);

        inputLabelA.setFont(new java.awt.Font("宋体", 0, 20)); // NOI18N
        inputLabelA.setText("a");

        inputLabelB.setFont(new java.awt.Font("宋体", 0, 20)); // NOI18N
        inputLabelB.setText("b");

        inputLabelC.setFont(new java.awt.Font("宋体", 0, 20)); // NOI18N
        inputLabelC.setText("c");

        javax.swing.GroupLayout panelInputLayout = new javax.swing.GroupLayout(panelInput);
        panelInput.setLayout(panelInputLayout);
        panelInputLayout.setHorizontalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                        .addComponent(inputLabelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(inputB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addComponent(inputLabelA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(inputA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                        .addComponent(inputLabelC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(inputC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        panelInputLayout.setVerticalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLabelA))
                .addGap(18, 18, 18)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLabelB))
                .addGap(18, 18, 18)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLabelC))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lineFinishedLabel.setText("已走过的路径");

        textAreaNotFinished.setColumns(20);
        textAreaNotFinished.setRows(5);
        jScrollPane4.setViewportView(textAreaNotFinished);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelNotFinished);
        panelNotFinished.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lineFinishedLabel)
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
                .addComponent(lineFinishedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lineNotFinishedLabel.setText("未走的路径");

        TextArealineNotFinished.setColumns(20);
        TextArealineNotFinished.setRows(5);
        jScrollPane2.setViewportView(TextArealineNotFinished);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lineNotFinishedLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lineNotFinishedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        buttonSubmit.setText("确定");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonClear.setText("清空");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("100.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(panelFinished);
        panelFinished.setLayout(jPanel4Layout);
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
                        .addComponent(panelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSubmit)
                            .addComponent(buttonClear)))
                    .addComponent(panelNotFinished, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(panelFinished, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addComponent(panelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonClear)
                                .addGap(18, 18, 18)
                                .addComponent(buttonSubmit)
                                .addGap(34, 34, 34)))
                        .addComponent(panelNotFinished, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelFinished, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (inputA.getText() == null || inputA.getText() == "" || inputB.getText() == null || inputB.getText() == "" || inputC.getText() == null || inputC.getText() == "") {
            JOptionPane.showMessageDialog(null, "alert", "输入不能为空！", JOptionPane.ERROR_MESSAGE);
        }
        if (Integer.parseInt(inputA.getText()) <= 0 || Integer.parseInt(inputB.getText()) <= 0 || Integer.parseInt(inputC.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "alert", "请输入>0的数字", JOptionPane.ERROR_MESSAGE);
        }
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
        inputA.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //插入字符
                //    System.out.println("文本插入");
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/100.jpg"))); // NOI18N
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //删除字符
                //  System.out.println("文本删除");
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/100.jpg"))); // NOI18N
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //字符改变
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/100.jpg"))); // NOI18N
                //     System.out.println("属性改变"+e);
            }
        });
        inputB.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //插入字符
                //    System.out.println("文本插入");
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/100.jpg"))); // NOI18N
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //删除字符
                //  System.out.println("文本删除");
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/100.jpg"))); // NOI18N
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //字符改变
                //    System.out.println("属性改变"+e);
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/100.jpg"))); // NOI18N
            }
        });
        inputC.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //插入字符
                //   System.out.println("文本插入");
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/100.jpg"))); // NOI18N
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

        int a = Integer.parseInt(inputA.getText());
        int b = Integer.parseInt(inputB.getText());
        int c = Integer.parseInt(inputC.getText());
        String s = "";
        Graphics2D graphics = (Graphics2D) this.getGraphics();
        Stroke stroke = new BasicStroke(3);//设置线宽为3.0
        //      graphics.setColor(Color.WHITE);
        graphics.setColor(Color.RED);

        graphics.setStroke(stroke);

        graphics.drawRect(475, 100, 74, 21);  //输入a,b,c
        int match = 0;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //   LineDrawer ld =  new LineDrawer(510,120,510,120);
        LineDrawer ld = new LineDrawer();
        ld.drawArrow(graphics, 510, 120, 510, 150);//第一个箭头
        graphics.drawRect(475, 150, 74, 21);        //match=0;
        // ld = new LineDrawer(80, 80, 80, 80);       //箭头
        ld.drawArrow(graphics, 512, 171, 510, 200);//第二个箭头
        //1
        int[] xPoints2 = {485, 513, 538, 513};
        int[] yPoints2 = {217, 200, 217, 236};
        graphics.drawPolygon(xPoints2, yPoints2, 4);
        if (a == b) {
            //1->2
            ld.drawArrow(graphics, 535, 220, 600, 220);
            // 2    
            match = match + 1;
            graphics.drawRect(600, 200, 60, 30);
            //2->3
            ld.drawArrow(graphics, 630, 225, 515, 265);
            s += "1->2->3";
           // jTextArea4.append("1->2");
            // jTextArea4.append("->3");
        } else {
            //1-3
            ld.drawArrow(graphics, 513, 236, 513, 266);
            s += "1->3";
            // jTextArea4.append("1->3");
        }
        //3  a=c?
        int[] xPoints3 = {485, 515, 545, 515};
        int[] yPoints3 = {280, 265, 280, 295};
        graphics.drawPolygon(xPoints3, yPoints3, 4);
        if (a == c) {
            //3-4
            ld.drawArrow(graphics, 545, 280, 595, 280);
            s += "->4";
            //  jTextArea4.append("->4");
            //4
            match = match + 2;
            graphics.drawRect(595, 260, 70, 30);
            //4->5
            ld.drawArrow(graphics, 630, 290, 515, 325);
            s += "->5";
            //  jTextArea4.append("->5");
        } else {
            //3-5
            ld.drawArrow(graphics, 515, 290, 515, 320);
            s += "->5";
            // jTextArea4.append("->5");
        }
        //5
        int[] xPoints4 = {490, 515, 540, 515};
        int[] yPoints4 = {345, 325, 345, 360};
        graphics.drawPolygon(xPoints4, yPoints4, 4);
        if (b == c) {
            //5-6
            ld.drawArrow(graphics, 540, 345, 600, 345);
            s += "->6";
            //  jTextArea4.append("->6");
            //6
            match = match + 3;
            graphics.drawRect(600, 325, 65, 30);
            //6-7
            ld.drawArrow(graphics, 633, 355, 515, 390);
            s += "->7";
            //  jTextArea4.append("->7");
        } else {
            //5-7
            ld.drawArrow(graphics, 515, 360, 515, 390);
            s += "->7";
            //   jTextArea4.append("->7");
        }
        //7
        int[] xPoints5 = {480, 515, 560, 519};
        int[] yPoints5 = {415, 390, 415, 440};
        graphics.drawPolygon(xPoints5, yPoints5, 4);
        if (match == 0) {
            //7->8
            ld.drawArrow(graphics, 560, 415, 705, 431);
            s += "->8";
            //  jTextArea4.append("->8");
            //8
            int[] xPoints12 = {690, 720, 750, 720};
            int[] yPoints12 = {442, 418, 442, 462};
            graphics.drawPolygon(xPoints12, yPoints12, 4);

            if (a + b <= c) {
                //8-12
                ld.drawArrow(graphics, 690, 442, 624, 656);
                s += "->12";
                //   jTextArea4.append("->12");
            } else {
                //8-9
                ld.drawArrow(graphics, 720, 462, 722, 495);
                s += "->9";
                //    jTextArea4.append("->9");
                //9
                int[] xPoints13 = {690, 722, 752, 722};
                int[] yPoints13 = {517, 495, 517, 537};
                graphics.drawPolygon(xPoints13, yPoints13, 4);
            }
            if (b + c <= a) {
                //9-12
                ld.drawArrow(graphics, 690, 517, 636, 653);
                s += "->12";
                //     jTextArea4.append("->12");
            } else {
                //9-10
                ld.drawArrow(graphics, 722, 537, 722, 570);
                s += "->10";
                //    jTextArea4.append("->10");
                //10
                int[] xPoints14 = {690, 722, 752, 722};
                int[] yPoints14 = {592, 571, 592, 612};
                graphics.drawPolygon(xPoints14, yPoints14, 4);
            }
            if (a + c <= b) {
                //10-12
                ld.drawArrow(graphics, 690, 592, 655, 654);
                s += "->12";
                //   jTextArea4.append("->12");
            } else {
                //10-11
                ld.drawArrow(graphics, 722, 612, 722, 659);
                s += "->11";
                //      jTextArea4.append("->11");
                //11
                graphics.drawRect(688, 659, 76, 27);
            }
        } else {
            //7->13
            ld.drawArrow(graphics, 480, 415, 448, 438);
            s += "->13";
            //jTextArea4.append("->13");
            //13
            int[] xPoints6 = {405, 435, 465, 438};
            int[] yPoints6 = {453, 433, 453, 473};
            graphics.drawPolygon(xPoints6, yPoints6, 4);
            if (match == 1) {
                //13->14
                ld.drawArrow(graphics, 465, 453, 503, 475);
                s += "->14";
                // jTextArea4.append("->14");
                //14
                int[] xPoints9 = {488, 520, 552, 520};
                int[] yPoints9 = {488, 463, 488, 510};
                graphics.drawPolygon(xPoints9, yPoints9, 4);
                if (a + b <= c) {
                    //14->12
                    ld.drawArrow(graphics, 552, 488, 616, 650);
                    s += "->12";
                    //   jTextArea4.append("->12");
                } else {
                    //14->15
                    ld.drawArrow(graphics, 520, 510, 520, 663);
                    s += "->15";
                    // jTextArea4.append("->15");
                }
            } else {
                //13->16
                ld.drawArrow(graphics, 405, 453, 370, 475);
                s += "->16";
                //   jTextArea4.append("->16");
                //16
                int[] xPoints7 = {330, 360, 385, 357};
                int[] yPoints7 = {490, 470, 490, 510};
                graphics.drawPolygon(xPoints7, yPoints7, 4);
                if (match == 2) {
                    //16->17
                    ld.drawArrow(graphics, 385, 490, 420, 515);
                    s += "->17";
                    //   jTextArea4.append("->17");
                    //17
                    int[] xPoints10 = {407, 434, 466, 436};
                    int[] yPoints10 = {524, 503, 524, 544};
                    graphics.drawPolygon(xPoints10, yPoints10, 4);
                    if (a + c <= b) {
                        //17->12
                        ld.drawArrow(graphics, 466, 524, 605, 655);
                        s += "->12";
                        //    jTextArea4.append("->12");
                    } else {
                        //17->15
                        ld.drawArrow(graphics, 436, 544, 505, 662);
                        s += "->15";
                        //     jTextArea4.append("->15");
                    }
                } else {
                    //16->18
                    ld.drawArrow(graphics, 357, 510, 357, 568);
                    s += "->18";
                    // jTextArea4.append("->18");
                    //18
                    int[] xPoints8 = {332, 357, 385, 357};
                    int[] yPoints8 = {586, 568, 586, 603};
                    graphics.drawPolygon(xPoints8, yPoints8, 4);
                    if (match == 3) {
                        //18->19
                        ld.drawArrow(graphics, 385, 586, 427, 602);
                        s += "->19";
                        //   jTextArea4.append("->19");
                        //19
                        int[] xPoints11 = {407, 440, 470, 440};
                        int[] yPoints11 = {620, 597, 620, 640};
                        graphics.drawPolygon(xPoints11, yPoints11, 4);
                        if (b + c <= a) {
                            //19->12
                            ld.drawArrow(graphics, 470, 620, 587, 656);
                            s += "->12";
                            //   jTextArea4.append("->12\n");
                            //12
                            graphics.drawRect(594, 656, 60, 30); //非三角形
                        } else {
                            //19->15
                            ld.drawArrow(graphics, 440, 640, 490, 665);
                            s += "->15";
                            //    jTextArea4.append("->15\n");
                            //15
                            graphics.drawRect(492, 665, 60, 23);   //等腰三角形
                        }
                    } else {
                        //18->20 ?
                        ld.drawArrow(graphics, 357, 603, 357, 663);
                        //  jTextArea4.append("->20\n");
                        s += "->20";
                        graphics.drawRect(330, 668, 60, 23);  //20  等边三角形1
                    }
                }
            }
        }
        textAreaNotFinished.append(s+"\n");
        String[] lineString2 = TextArealineNotFinished.getText().split("\n");
    //    String[] lineString4 = jTextArea4.getText().split("\n");
    //    for (int i = 0; i < lineString4.length; i++) {
            for (int j = 0; j < lineString2.length; j++) {
                if (s.equals(lineString2[j])) {
                  // jTextArea2.remove(j);
                  try {
                        TextArealineNotFinished.getDocument().remove(j,s.length());
                    } catch (BadLocationException ex) {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        
        //      graphics.fillPolygon(xPoints2, yPoints2, 4);

    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        inputA.setText(null);
        inputB.setText(null);
        inputC.setText(null);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/100.jpg"))); // NOI18N


    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JButton buttonClear;
    private javax.swing.JLabel inputLabelA;
    private javax.swing.JLabel inputLabelB;
    private javax.swing.JLabel inputLabelC;
    private javax.swing.JLabel lineFinishedLabel;
    private javax.swing.JLabel lineNotFinishedLabel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panelInput;
    private javax.swing.JPanel panelNotFinished;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelFinished;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea TextArealineNotFinished;
    private javax.swing.JTextArea textAreaNotFinished;
    private javax.swing.JTextField inputA;
    private javax.swing.JTextField inputB;
    private javax.swing.JTextField inputC;
    // End of variables declaration//GEN-END:variables
}
