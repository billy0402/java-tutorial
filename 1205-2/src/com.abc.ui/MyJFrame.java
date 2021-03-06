/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author USER
 */

package com.abc.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

// ---------------------------------------------
// 引用外部套件
// ---------------------------------------------
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.abc.Location;

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
        writeMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Name", "Type", "Lat", "Lng", "Dist"
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

        writeMenu.setText("Write");
        writeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                writeMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(writeMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void openMenuMouseClicked(java.awt.event.MouseEvent evt) {
        // ---------------------------------------------
        // 在MenuBar中的[開檔]被點擊時
        // ---------------------------------------------
        // 開啟FileChooser物件
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setDialogTitle("開啟檔案");

        // 如果有選擇檔案
        int returnVal = jFileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                // 設定檔案物件
                File file = jFileChooser.getSelectedFile();

                // 產生一個JSON解析物件
                JSONParser parser = new JSONParser();

                // 將檔案內容解析成JSON物件(可能是JSONArray或JSONObject)
                Object obj = parser.parse(new FileReader(file));

                // 將obj轉成JSONArray陣列物件
                JSONArray items = (JSONArray) obj;

                // 清除原有資料
                DefaultTableModel model = (DefaultTableModel) jTable.getModel();
                model.setRowCount(0);

                // 將JSON陣列物件逐個取出
                for (Object item : items) {
                    // 每個取出物件轉成JSON物件
                    JSONObject jsonItem = (JSONObject) item;

                    // ====================================================================
                    // 取出JSON物件中的資料(名稱, 型態, 緯度, 經度)
                    // 名稱, 型態, 緯度, 經度在JSON檔中均以字串表示, 因此轉成String, 如下:
                    // String lat = (String) jsonItem.get("latitude");
                    // 
                    // 如以整數表示, 轉成:
                    // Integer lat = (int) jsonItem.get("lat");
                    // 
                    // 如以浮點數表示, 轉成:
                    // Double lat = (double) jsonItem.get("latitude");
                    // ====================================================================
                    String name = (String) jsonItem.get("name");
                    String line = (String) jsonItem.get("line");
                    Double lng = (double) jsonItem.get("longitude");
                    Double lat = (double) jsonItem.get("latitude");
                    // ====================================================================

                    double dist = Location.distanceBetweenTwoLocations(lat, lng, 25.041871, 121.525652);
                    if (line.equals("文山內湖線")) {
                        // 將取出的檔位產生一個陣列
                        Object[] row = {name, line, lng, lat, dist};

                        // 將產生的陣列加入表格的資料物件中
                        model.addRow(row);
                    }
                    // =========================================
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "讀檔時發生錯誤!");
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "JSON格式解析錯誤!");
            }
        } else {
            System.out.println("取消檔案讀取");
        }
    }

    private void writeMenuMouseClicked(java.awt.event.MouseEvent evt) {
        // ---------------------------------------------
        // 在MenuBar中的[寫檔]被點擊時
        // ---------------------------------------------
        // 開啟FileChooser物件
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("儲存檔案");

        // 如果有選擇檔案
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // 設定檔案物件
            File file = fileChooser.getSelectedFile();

            try {
                // 設定檔案輸出writer
                FileWriter fw = new FileWriter(file);

                // 是否第一行
                boolean firstLine = true;

                // 取得jTable的model
                DefaultTableModel model = (DefaultTableModel) jTable.getModel();

                // 逐行處理jTable內的資料
                for (int i = 0; i < model.getRowCount(); i++) {
                    // 取出jTable中的資料
                    String stuNo = model.getValueAt(i, 0).toString();
                    String gender = model.getValueAt(i, 1).toString();
                    String chi = model.getValueAt(i, 2).toString();
                    String eng = model.getValueAt(i, 3).toString();

                    // 產生一行輸出資料(CSV格式, 用逗號隔開各項目)
                    String line = stuNo + "," + gender + "," + chi + "," + eng;

                    // 除了第一行, 其他資料輸出前先跳行
                    if (firstLine) {
                        firstLine = false;
                    } else {
                        fw.write("\n");
                    }

                    // 輸出
                    fw.write(line);
                }

                // 關檔
                fw.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "寫檔時發生錯誤!");
            }

            JOptionPane.showMessageDialog(this, "已存檔:" + file.getAbsolutePath());
        }
        // ---------------------------------------------
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        int result = JOptionPane.showConfirmDialog(this, "是否確定離開?", "確定", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (result == JOptionPane.YES_OPTION) {
            this.dispose();
            System.exit(0);
        } else {
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JMenu openMenu;
    private javax.swing.JMenu writeMenu;
    // End of variables declaration
}