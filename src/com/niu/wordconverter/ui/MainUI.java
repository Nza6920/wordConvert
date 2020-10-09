package com.niu.wordconverter.ui;

import javax.swing.*;

/**
 * UI
 *
 * @author [nza]
 * @version 1.0 [2020/10/09 10:34]
 * @createTime [2020/10/09 10:34]
 */
public class MainUI {
    public static void run() {

        // 创建 JFrame 实例
        JFrame frame = new JFrame("单复数转换");
        frame.setSize(350, 230);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // 创建面板
        JPanel panel = new JPanel();

        // 添加面板
        frame.add(panel);

        // 调用用户定义的方法并添加组件到面板
        new InputComponents(panel).placeComponents();

        // 设置界面可见
        frame.setVisible(true);
    }
}
