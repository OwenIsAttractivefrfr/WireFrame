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
    JButton jButton = new JButton();
    JRadioButton one = new JRadioButton();
    JRadioButton two = new JRadioButton();
    ButtonGroup onetwo = new ButtonGroup();
    JPanel onetwoPanel = new JPanel();
    JRadioButton un = new JRadioButton();
    JRadioButton duex = new JRadioButton();
    ButtonGroup unduex = new ButtonGroup();
    JPanel unduexPanel = new JPanel();
    JTextField jTextField = new JTextField();





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
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(5,10,5,10);
        getContentPane().add(jpanel, gridBagConstraints);



        jRadioButton1.setText("uno");
        jRadioButton1.setBackground(Color.GREEN);
        buttonGroup.add(jRadioButton1);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jpanel.add(jRadioButton1, gridBagConstraints);

        jRadioButton2.setText("dos");
        jRadioButton2.setBackground(Color.YELLOW);
        buttonGroup.add(jRadioButton2);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = gridBagConstraints.WEST;
        jpanel.add(jRadioButton2, gridBagConstraints);



        onetwoPanel.setPreferredSize(new Dimension(160, 75));
        onetwoPanel.setBackground(Color.GREEN);
        onetwoPanel.setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx =  1;
        gridBagConstraints.gridy = 1;

        getContentPane().add(onetwoPanel, gridBagConstraints);

        one.setText("One");
        one.setBackground(Color.YELLOW);
        onetwo.add(one);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        onetwoPanel.add(one, gridBagConstraints);

        two.setText("Two");
        two.setBackground(Color.yellow);
        onetwo.add(two);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        onetwoPanel.add(two, gridBagConstraints);



        unduexPanel.setPreferredSize(new Dimension(160,75));
        unduexPanel.setBackground(Color.MAGENTA);
        unduexPanel.setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        getContentPane().add(unduexPanel, gridBagConstraints);

        un.setText("Un");
        un.setBackground(Color.pink);
        unduex.add(un);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        unduexPanel.add(un, gridBagConstraints);

        duex.setText("Duex");
        duex.setBackground(Color.PINK);
        unduex.add(duex);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        unduexPanel.add(duex, gridBagConstraints);


        jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(250,250));
        jTextField.setBackground(Color.lightGray);
        jTextField.setText("Text");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        mainPanel.add(jTextField, gridBagConstraints);

        jButton.setText("Button");
        jButton.setSize(new Dimension(50,25));
        jButton.setBackground(Color.CYAN);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jButton, gridBagConstraints);



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

