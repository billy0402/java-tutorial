package com.abc;

import javax.swing.*;
import java.awt.*; // <<學習目標>>

// 繼承
public class MyFrame1 extends JFrame {
    // 建構元
    public MyFrame1() {
        initUI();
    }

    // 一個僅可在類別內被其他方法呼叫的私用方法
    private void initUI() {
        // 父親
        super.setTitle("我的JFrame");
        // 兒子
        this.getContentPane().setBackground(new Color(100, 100, 100));
        this.setSize(new Dimension(500, 300));
        this.setVisible(true);
    }
}