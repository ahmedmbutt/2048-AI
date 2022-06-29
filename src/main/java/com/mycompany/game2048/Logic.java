/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game2048;

import static com.mycompany.game2048.Design.Score;
import static com.mycompany.game2048.Design.drawScene;
import javax.swing.JOptionPane;

/**
 *
 * @author Ahmed
 */
public class Logic {

    private static final int SIDE = 4;
    private int score = 0;
    public static int[][] gameField = new int[SIDE][SIDE];

    public void createGame() {
        gameField = new int[SIDE][SIDE];
        createNewNumber();
        createNewNumber();
    }

    public boolean canUserMove() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                if (gameField[y][x] == 0) {
                    return true;
                } else if (y < SIDE - 1 && gameField[y][x] == gameField[y + 1][x]) {
                    return true;
                } else if ((x < SIDE - 1) && gameField[y][x] == gameField[y][x + 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private void createNewNumber() {
        if (getMaxTileValue() >= 2048) {
            win();
            return;
        }

        boolean isCreated = false;
        do {
            int x = (int) Math.floor(Math.random() * SIDE);
            int y = (int) Math.floor(Math.random() * SIDE);
            if (gameField[y][x] == 0) {
                gameField[y][x] = (int) Math.floor(Math.random() * 10) < 9 ? 2 : 4;
                isCreated = true;
            }
        } while (!isCreated);
    }

    private int getMaxTileValue() {
        int max = gameField[0][0];
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                if (gameField[y][x] > max) {
                    max = gameField[y][x];
                }
            }
        }
        return max;
    }

    public void gameOver() {
        int value = JOptionPane.showConfirmDialog(null, "GAME OVER!\nWould you like to play again?", "GAME OVER!", JOptionPane.YES_NO_OPTION);
        if (value == JOptionPane.YES_OPTION) {
            score = 0;
            Score.setText("Score: " + score);
            createGame();
            drawScene();
        } else if (value == JOptionPane.NO_OPTION) {
            System.exit(0);
        }
    }

    public void win() {
        int value = JOptionPane.showConfirmDialog(null, "YOU WIN!\nWould you like to play again?", "YOU WIN!", JOptionPane.YES_NO_OPTION);
        if (value == JOptionPane.YES_OPTION) {
            score = 0;
            Score.setText("Score: " + score);
            createGame();
            drawScene();
        } else if (value == JOptionPane.NO_OPTION) {
            System.exit(0);
        }
    }

    public void moveLeft() {
        boolean isNewNumberNeeded = false;
        for (int[] row : gameField) {
            boolean wasCompressed = compressRow(row);
            boolean wasMerged = mergeRow(row);
            if (wasMerged) {
                compressRow(row);
            }
            if (wasCompressed || wasMerged) {
                isNewNumberNeeded = true;
            }
        }
        if (isNewNumberNeeded) {
            createNewNumber();
        }
    }

    public void moveUp() {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }

    public void moveRight() {
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }

    public void moveDown() {
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }

    private boolean compressRow(int[] row) {
        int insertPosition = 0;
        boolean result = false;
        for (int x = 0; x < SIDE; x++) {
            if (row[x] > 0) {
                if (x != insertPosition) {
                    row[insertPosition] = row[x];
                    row[x] = 0;
                    result = true;
                }
                insertPosition++;
            }
        }
        return result;
    }

    private boolean mergeRow(int[] row) {
        boolean result = false;
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] != 0 && row[i] == row[i + 1]) {
                row[i] += row[i + 1];
                row[i + 1] = 0;
                result = true;
                score += row[i];
                Score.setText("Score: " + score);
            }
        }
        return result;
    }

    private void rotateClockwise() {
        int[][] result = new int[SIDE][SIDE];
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                result[j][SIDE - 1 - i] = gameField[i][j];
            }
        }
        gameField = result;
    }

}
