package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;



public class WireFrame extends JFrame
{
    JPanel mainPanel = new JPanel();
    ButtonGroup buttonGroup = new ButtonGroup();
    JRadioButton jRadioButton2 = new JRadioButton();
    JRadioButton jRadioButton1 = new JRadioButton();
    JTextField titleCard = new JTextField();
    JPanel jpanel = new JPanel();





    public WireFrame() throws HeadlessException
    {
        setTitle("WireFrame");
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exitForm(e);
            }
        });

        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints;

        titleCard = new JTextField();
        titleCard.setPreferredSize(new Dimension(280,50));
        titleCard.setEditable(false);
        titleCard.setBackground(Color.BLUE);
        titleCard.setForeground(Color.RED);
        titleCard.setLayout(new GridBagLayout());
        titleCard.setText("WireFrame");
        titleCard.setHorizontalAlignment(SwingConstants.CENTER);
        titleCard.setFont(new Font("Ariel", Font.BOLD, 24));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(10,10,10,10);
        getContentPane().add(titleCard, gridBagConstraints);


        mainPanel.setPreferredSize(new Dimension(280, 280));
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        getContentPane().add(mainPanel, gridBagConstraints);

        jpanel.setPreferredSize(new Dimension(160,75));
        jpanel.setBackground((Color.RED));
        jpanel.setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new Insets(5,10,5,10);
        gridBagConstraints.anchor = gridBagConstraints.EAST;
        getContentPane().add(jpanel, gridBagConstraints);



        jRadioButton1.setText("uno");
        jRadioButton1.setBackground(Color.GREEN);
        buttonGroup.add(jRadioButton1);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = gridBagConstraints.WEST;
        jpanel.add(jRadioButton1, gridBagConstraints);

        jRadioButton2.setText("dos");
        jRadioButton2.setBackground(Color.YELLOW);
        buttonGroup.add(jRadioButton2);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = gridBagConstraints.WEST;
        jpanel.add(jRadioButton2, gridBagConstraints);



        //you need to pack for anything to show up when the game is started
        pack();
        Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int)(0.5 * (screenSize.width - getWidth())), (int)(0.5 * (screenSize.height - getHeight())), getWidth(), getHeight());
    }



    public void exitForm(WindowEvent windowEvent)
    {
        System.exit(0);
    }

}

