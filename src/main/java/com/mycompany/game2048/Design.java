/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.game2048;

import java.awt.Color;
import java.awt.event.KeyEvent;
import static com.mycompany.game2048.Logic.gameField;

/**
 *
 * @author Ahmed Mujtaba Butt
 */
public class Design extends javax.swing.JFrame {

    private final Logic game = new Logic();

    /**
     * Creates new form GameDesign
     */
    public Design() {
        initComponents();
        game.createGame();
        drawScene();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Game = new javax.swing.JPanel();
        Cell1 = new javax.swing.JLabel();
        Cell2 = new javax.swing.JLabel();
        Cell3 = new javax.swing.JLabel();
        Cell4 = new javax.swing.JLabel();
        Cell5 = new javax.swing.JLabel();
        Cell6 = new javax.swing.JLabel();
        Cell7 = new javax.swing.JLabel();
        Cell8 = new javax.swing.JLabel();
        Cell9 = new javax.swing.JLabel();
        Cell10 = new javax.swing.JLabel();
        Cell11 = new javax.swing.JLabel();
        Cell12 = new javax.swing.JLabel();
        Cell13 = new javax.swing.JLabel();
        Cell14 = new javax.swing.JLabel();
        Cell15 = new javax.swing.JLabel();
        Cell16 = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Game2048 = new javax.swing.JLabel();
        shutdown = new javax.swing.JLabel();
        solve = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        Game.setBackground(new java.awt.Color(255, 255, 255));
        Game.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray));
        Game.setForeground(java.awt.Color.gray);

        Cell1.setBackground(new java.awt.Color(255, 255, 255));
        Cell1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell1.setForeground(new java.awt.Color(51, 51, 51));
        Cell1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell1.setOpaque(true);

        Cell2.setBackground(java.awt.Color.white);
        Cell2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell2.setForeground(new java.awt.Color(51, 51, 51));
        Cell2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell2.setOpaque(true);

        Cell3.setBackground(java.awt.Color.white);
        Cell3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell3.setForeground(new java.awt.Color(51, 51, 51));
        Cell3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell3.setOpaque(true);

        Cell4.setBackground(new java.awt.Color(255, 255, 255));
        Cell4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell4.setForeground(new java.awt.Color(51, 51, 51));
        Cell4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell4.setOpaque(true);

        Cell5.setBackground(new java.awt.Color(255, 255, 255));
        Cell5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell5.setForeground(new java.awt.Color(51, 51, 51));
        Cell5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell5.setOpaque(true);

        Cell6.setBackground(java.awt.Color.white);
        Cell6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell6.setForeground(new java.awt.Color(51, 51, 51));
        Cell6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell6.setOpaque(true);

        Cell7.setBackground(java.awt.Color.white);
        Cell7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell7.setForeground(new java.awt.Color(51, 51, 51));
        Cell7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell7.setOpaque(true);

        Cell8.setBackground(new java.awt.Color(255, 255, 255));
        Cell8.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell8.setForeground(new java.awt.Color(51, 51, 51));
        Cell8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell8.setOpaque(true);

        Cell9.setBackground(new java.awt.Color(255, 255, 255));
        Cell9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell9.setForeground(new java.awt.Color(51, 51, 51));
        Cell9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell9.setOpaque(true);

        Cell10.setBackground(java.awt.Color.white);
        Cell10.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell10.setForeground(new java.awt.Color(51, 51, 51));
        Cell10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell10.setOpaque(true);

        Cell11.setBackground(java.awt.Color.white);
        Cell11.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell11.setForeground(new java.awt.Color(51, 51, 51));
        Cell11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell11.setOpaque(true);

        Cell12.setBackground(new java.awt.Color(255, 255, 255));
        Cell12.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell12.setForeground(new java.awt.Color(51, 51, 51));
        Cell12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell12.setOpaque(true);

        Cell13.setBackground(new java.awt.Color(255, 255, 255));
        Cell13.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell13.setForeground(new java.awt.Color(51, 51, 51));
        Cell13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell13.setOpaque(true);

        Cell14.setBackground(java.awt.Color.white);
        Cell14.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell14.setForeground(new java.awt.Color(51, 51, 51));
        Cell14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell14.setOpaque(true);

        Cell15.setBackground(java.awt.Color.white);
        Cell15.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell15.setForeground(new java.awt.Color(51, 51, 51));
        Cell15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell15.setOpaque(true);

        Cell16.setBackground(new java.awt.Color(255, 255, 255));
        Cell16.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Cell16.setForeground(new java.awt.Color(51, 51, 51));
        Cell16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cell16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Cell16.setOpaque(true);

        Score.setBackground(java.awt.Color.white);
        Score.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        Score.setForeground(java.awt.Color.darkGray);
        Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Score.setText("Score: 0");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Game2048.setBackground(java.awt.Color.white);
        Game2048.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        Game2048.setForeground(java.awt.Color.darkGray);
        Game2048.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Game2048.setText("2048");

        shutdown.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shutdown.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmed\\OneDrive\\Documents\\Projects\\2048-AI\\img\\shutdown-icon.png")); // NOI18N
        shutdown.setToolTipText("Close!");
        shutdown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shutdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                shutdownMousePressed(evt);
            }
        });

        solve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        solve.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmed\\OneDrive\\Documents\\Projects\\2048-AI\\img\\solve-icon.png")); // NOI18N
        solve.setToolTipText("Solve with AI!");
        solve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        solve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                solveMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(solve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Game2048, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(shutdown, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Game2048, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shutdown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout GameLayout = new javax.swing.GroupLayout(Game);
        Game.setLayout(GameLayout);
        GameLayout.setHorizontalGroup(
            GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cell1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cell5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cell9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cell13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameLayout.createSequentialGroup()
                                .addComponent(Cell2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Cell3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Cell4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameLayout.createSequentialGroup()
                                .addComponent(Cell6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Cell7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Cell8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameLayout.createSequentialGroup()
                                .addComponent(Cell10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Cell11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Cell12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameLayout.createSequentialGroup()
                                .addComponent(Cell14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Cell15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Cell16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addComponent(Score, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        GameLayout.setVerticalGroup(
            GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cell4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cell2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cell3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cell1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cell8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cell6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cell7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cell5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cell12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cell10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cell11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cell9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cell16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cell14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cell15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cell13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Game, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (!game.canUserMove()) {
            game.gameOver();
            return;
        }

        switch (evt.getKeyCode()) {
            case KeyEvent.VK_UP:
                game.moveUp();
                break;
            case KeyEvent.VK_RIGHT:
                game.moveRight();
                break;
            case KeyEvent.VK_DOWN:
                game.moveDown();
                break;
            case KeyEvent.VK_LEFT:
                game.moveLeft();
                break;
            default:
                return;
        }
        drawScene();
    }//GEN-LAST:event_formKeyPressed

    private void shutdownMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shutdownMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_shutdownMousePressed

    private void solveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solveMousePressed
        // TODO add your handling code here:
        AI auto = new AI();
    }//GEN-LAST:event_solveMousePressed

    private static Color getColorByValue(int value) {
        switch (value) {
            case 0:
                return Color.decode("#FFFFFF");
            case 2:
                return Color.decode("#DDA0DD");
            case 4:
                return Color.decode("#6A5ACD");
            case 8:
                return Color.decode("#1E90FF");
            case 16:
                return Color.decode("#00CED1");
            case 32:
                return Color.decode("#3CB371");
            case 64:
                return Color.decode("#32CD32");
            case 128:
                return Color.decode("#FF8C00");
            case 256:
                return Color.decode("#FA8072");
            case 512:
                return Color.decode("#FF4500");
            case 1024:
                return Color.decode("#FF1493");
            case 2048:
                return Color.decode("#C71585");
            default:
                return Color.decode("#000000");
        }
    }

    public static void drawScene() {
        int value;
        Color color;
        String str;

        value = gameField[0][0];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell1.setText(str);
        Cell1.setBackground(color);

        value = gameField[0][1];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell2.setText(str);
        Cell2.setBackground(color);

        value = gameField[0][2];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell3.setText(str);
        Cell3.setBackground(color);

        value = gameField[0][3];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell4.setText(str);
        Cell4.setBackground(color);

        value = gameField[1][0];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell5.setText(str);
        Cell5.setBackground(color);

        value = gameField[1][1];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell6.setText(str);
        Cell6.setBackground(color);

        value = gameField[1][2];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell7.setText(str);
        Cell7.setBackground(color);

        value = gameField[1][3];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell8.setText(str);
        Cell8.setBackground(color);

        value = gameField[2][0];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell9.setText(str);
        Cell9.setBackground(color);

        value = gameField[2][1];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell10.setText(str);
        Cell10.setBackground(color);

        value = gameField[2][2];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell11.setText(str);
        Cell11.setBackground(color);

        value = gameField[2][3];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell12.setText(str);
        Cell12.setBackground(color);

        value = gameField[3][0];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell13.setText(str);
        Cell13.setBackground(color);

        value = gameField[3][1];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell14.setText(str);
        Cell14.setBackground(color);

        value = gameField[3][2];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell15.setText(str);
        Cell15.setBackground(color);

        value = gameField[3][3];
        color = getColorByValue(value);
        str = value > 0 ? "" + value : "";
        Cell16.setText(str);
        Cell16.setBackground(color);
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
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Design().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel Cell1;
    private static javax.swing.JLabel Cell10;
    private static javax.swing.JLabel Cell11;
    private static javax.swing.JLabel Cell12;
    private static javax.swing.JLabel Cell13;
    private static javax.swing.JLabel Cell14;
    private static javax.swing.JLabel Cell15;
    private static javax.swing.JLabel Cell16;
    private static javax.swing.JLabel Cell2;
    private static javax.swing.JLabel Cell3;
    private static javax.swing.JLabel Cell4;
    private static javax.swing.JLabel Cell5;
    private static javax.swing.JLabel Cell6;
    private static javax.swing.JLabel Cell7;
    private static javax.swing.JLabel Cell8;
    private static javax.swing.JLabel Cell9;
    private javax.swing.JPanel Game;
    private javax.swing.JLabel Game2048;
    public static javax.swing.JLabel Score;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel shutdown;
    private javax.swing.JLabel solve;
    // End of variables declaration//GEN-END:variables
}
