package com.niu.wordconverter.ui;

import com.niu.wordconverter.utils.Inflector;

import javax.swing.*;
import java.awt.*;

/**
 * 输入组件
 *
 * @author [nza]
 * @version 1.0 [2020/10/09 10:36]
 * @createTime [2020/10/09 10:36]
 */
public class InputComponents {

    /**
     * 单词转换器
     */
    private static final Inflector wordConvert = Inflector.getInstance();

    private final JPanel panel;

    public InputComponents(JPanel panel) {
        this.panel = panel;
    }

    public void placeComponents() {

        panel.setLayout(null);

        // 创建 JLabel
        JLabel userLabel = new JLabel("单词:");

        // 输入 Label
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        // 输入文本域
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // 复数 Label
        JLabel pluralityLabel = new JLabel("复数:");
        pluralityLabel.setBackground(Color.WHITE);
        pluralityLabel.setBounds(10, 50, 80, 25);
        panel.add(pluralityLabel);
        // 复数文本域
        JTextField pluralityText = new JTextField(20);
        pluralityText.setBounds(100, 50, 165, 25);
        pluralityText.setEditable(false);
        pluralityText.setBackground(Color.WHITE);
        panel.add(pluralityText);

        // 单数 Label
        JLabel singuleLabel = new JLabel("单数:");
        singuleLabel.setBackground(Color.WHITE);
        singuleLabel.setBounds(10, 80, 80, 25);
        panel.add(singuleLabel);
        // 单数文本域
        JTextField singularizeText = new JTextField(20);
        singularizeText.setBounds(100, 80, 165, 25);
        singularizeText.setEditable(false);
        singularizeText.setBackground(Color.WHITE);
        panel.add(singularizeText);

        // 下划线 Label
        JLabel underLineLabel = new JLabel("下划线:");
        underLineLabel.setBackground(Color.WHITE);
        underLineLabel.setBounds(10, 110, 80, 25);
        panel.add(underLineLabel);
        // 下划线 文本域
        JTextField underLineLabelText = new JTextField(20);
        underLineLabelText.setBounds(100, 110, 165, 25);
        underLineLabelText.setEditable(false);
        underLineLabelText.setBackground(Color.WHITE);
        panel.add(underLineLabelText);

        // 创建登录按钮
        JButton convertBtn = new JButton("转换");
        convertBtn.setBounds(10, 140, 80, 25);
        panel.add(convertBtn);
        convertBtn.addActionListener(e -> {
            String pluralize = wordConvert.pluralize(userText.getText());
            pluralityText.setText(pluralize);

            String singularize = wordConvert.singularize(userText.getText());
            singularizeText.setText(singularize);

            String underline = wordConvert.tableize(userText.getText());
            underLineLabelText.setText(underline);
        });
    }
}
