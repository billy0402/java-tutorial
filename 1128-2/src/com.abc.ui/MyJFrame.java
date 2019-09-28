/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author USER
 */

package com.abc.ui;

import com.abc.Salary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MyJFrame extends javax.swing.JFrame {

    /*
     * Creates new form MyJFrame
     */
    public MyJFrame() {
        initComponents();
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        openMenu = new javax.swing.JMenu();
        exitMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "員工編號", "姓名", "職等", "加班時數", "薪水"
                }
        ));
        jScrollPane1.setViewportView(jTable);

        openMenu.setText("Open");
        openMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(openMenu);

        exitMenu.setText("Exit");
        jMenuBar1.add(exitMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void openMenuMouseClicked(java.awt.event.MouseEvent evt) {
        // ---------------------------------------------
        // 在MenuBar中的Open被點擊時
        // ---------------------------------------------
        // 開啟FileChooser物件
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setDialogTitle("開啟檔案");

        // 如果有選擇檔案
        int returnVal = jFileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            // 設定檔案物件
            File file = jFileChooser.getSelectedFile();

            // 逐筆讀取檔案內容
            try {
                // 產生一個BufferedReader物件, 用來逐筆讀取檔案
                BufferedReader b = new BufferedReader(new FileReader(file));

                // 存放每次讀入的單行內容
                String readLine = null;

                // 逐筆讀取檔案內容, 可進行某些處理
                int cnt = 0;

                // 清除原有資料
                DefaultTableModel model = (DefaultTableModel) jTable.getModel();
                model.setRowCount(0);

                // 是否第一行
                boolean firstLine = true;

                while ((readLine = b.readLine()) != null) {
                    // 累加記錄筆數
                    cnt++;

                    // 切割以逗號分隔的項目(-1:全部項目均要分割; n表示只分割前n個)
                    String items[] = readLine.split(",", -1);

                    // 分別取出員工編號, 姓名, 職等, 加班時數, 薪水
                    String empNo = items[0];
                    String name = items[1];
                    String rank = items[2];
                    int overtime = Integer.parseInt(items[3]);

                    int salary = Salary.salary(empNo, name, rank, overtime);

                    // 將取出的檔位產生一個陣列
                    Object[] row = {empNo, name, rank, overtime, salary};

                    // 將產生的陣列加入表格的資料物件中
                    model.addRow(row);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "讀檔時發生錯誤!");
            }
        } else {
            System.out.println("取消檔案讀取");
        }
        // ---------------------------------------------
    }

    // Variables declaration - do not modify
    private javax.swing.JMenu exitMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JMenu openMenu;
    // End of variables declaration
}