/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author USER
 */

package com.abc.ui;

import com.abc.Customer;
import com.abc.MonthlyCustomer;
import com.abc.MeteredCustomer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
                        "編號", "姓名", "薪水"
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
                String data;

                // 清除原有資料
                DefaultTableModel model = (DefaultTableModel) jTable.getModel();
                model.setRowCount(0);

                // =======================================================
                // (1)建立一個存放所有員工物件(父親類別)的arrayList
                // =======================================================
                ArrayList<Customer> arrayList = new ArrayList();
                // =======================================================

                while ((data = b.readLine()) != null) {
                    // 切割以逗號分隔的項目(-1:全部項目均要分割; n表示只分割前n個)
                    String items[] = data.split(",", -1);

                    // ======================================================================
                    // (2)產生一個員工物件(可能是全職/兼職員工), 將它加入arrayList中
                    // ======================================================================
                    // 分別取出員工編號(String), 姓名(String), 職等(char)
                    String type = items[0];
                    String phoneNo = items[1];
                    String name = items[2];
                    int minutes = Integer.parseInt(items[3]);

                    if (type.equals("月租型")) {
                        // 如果是全職員工, 取出銷售總金額
                        int baseFee = Integer.parseInt(items[4]);
                        int freeMinutes = Integer.parseInt(items[5]);

                        // 產生全職員工物件, 加入陣列中
                        arrayList.add(new MonthlyCustomer(type, phoneNo, name, minutes, baseFee, freeMinutes));
                    } else if (type.equals("易付卡型")) {
                        // 產生兼職員工物件, 加入陣列中
                        arrayList.add(new MeteredCustomer(type, phoneNo, name, minutes));
                    } else {
                        System.out.println("員工:" + name + "資料有誤!");
                    }
                    // ======================================================================
                }

                // =================================================================================
                // (3)逐個取出arrayList中的員工資料(父親類別, 其內容可能是全職/兼職員工), 加入表格中
                // =================================================================================
                for (int i = 0; i < arrayList.size(); i++) {
                    // 取出arrayList中的第i個物件
                    Customer s = arrayList.get(i);

                    // 將取出的檔位產生一個陣列
                    Object[] row = {s.getType(), s.getName(), s.fee()};

                    // 將產生的陣列加入表格的資料物件中
                    model.addRow(row);
                }
                // =================================================================================       
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