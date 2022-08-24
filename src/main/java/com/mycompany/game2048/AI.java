/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game2048;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Ahmed Mujtaba Butt
 */
public class AI {

    private final Logic game = new Logic();
    int side = game.getSIDE();
    int[][] board = new int[side][side];

    public AI() {
        while (true) {
            board = game.getGameField();

            System.out.println("");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(Logic.gameField[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");

            if (game.getMaxTileValue() >= 2048) {
                game.win();
                break;
            }
            if (isGameOver()) {
                game.gameOver();
                break;
            }

            String moveCode = getBestMove(6);
            System.out.println(moveCode);

            sendKeys(moveCode);
            Design.drawScene();
        }
    }

    private AI(Object object) {
        board = game.getGameField();
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int utility() {
        return game.getMaxTileValue();
    }

    private void sendKeys(String moveCode) {
        switch (moveCode) {
            case "UP":
                game.moveUp();
                break;
            case "DOWN":
                game.moveDown();
                break;
            case "LEFT":
                game.moveLeft();
                break;
            case "RIGHT":
                game.moveRight();
                break;
            default:
                break;
        }
    }

    private boolean canMoveUp() {
        for (int j = 0; j < side; j++) {
            int k = -1;
            for (int i = side - 1; i > -1; i--) {
                if (board[i][j] > 0) {
                    k = i;
                    break;
                }
            }
            if (k > -1) {
                for (int i = k; i > 0; i--) {
                    if (board[i - 1][j] == 0 || board[i][j] == board[i - 1][j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean canMoveDown() {
        for (int j = 0; j < side; j++) {
            int k = -1;
            for (int i = 0; i < side; i++) {
                if (board[i][j] > 0) {
                    k = i;
                    break;
                }
            }
            if (k > -1) {
                for (int i = k; i < side - 1; i++) {
                    if (board[i + 1][j] == 0 || board[i][j] == board[i + 1][j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean canMoveLeft() {
        for (int i = 0; i < side; i++) {
            int k = -1;
            for (int j = side - 1; j > -1; j--) {
                if (board[i][j] > 0) {
                    k = j;
                    break;
                }
            }
            if (k > -1) {
                for (int j = k; j > 0; j--) {
                    if (board[i][j - 1] == 0 || board[i][j] == board[i][j - 1]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean canMoveRight() {
        for (int i = 0; i < side; i++) {
            int k = -1;
            for (int j = 0; j < side; j++) {
                if (board[i][j] > 0) {
                    k = j;
                    break;
                }
            }
            if (k > -1) {
                for (int j = k; j < side - 1; j++) {
                    if (board[i][j + 1] == 0 || board[i][j] == board[i][j + 1]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean isGameOver() {
        return isTerminal("max");
    }

    private ArrayList<String> getAvailableMovesForMax() {
        ArrayList<String> moves = new ArrayList<>();
        if (canMoveUp()) {
            moves.add("UP");
        }
        if (canMoveDown()) {
            moves.add("DOWN");
        }
        if (canMoveLeft()) {
            moves.add("LEFT");
        }
        if (canMoveRight()) {
            moves.add("RIGHT");
        }
        return moves;
    }

    private ArrayList<int[]> getAvailableMovesForMin() {
        ArrayList<int[]> empty = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j] == 0) {
                    empty.add(new int[]{i, j, 2});
                    empty.add(new int[]{i, j, 4});
                }
            }
        }
        return empty;
    }

    private boolean isTerminal(String who) {
        if (who.equals("max")) {
            if (game.getMaxTileValue() >= 2048) {
                return true;
            }
            if (canMoveUp()) {
                return false;
            }
            if (canMoveDown()) {
                return false;
            }
            if (canMoveLeft()) {
                return false;
            }
            if (canMoveRight()) {
                return false;
            }
        } else if (who.equals("min")) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (board[i][j] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void up() {
        for (int j = 0; j < side; j++) {
            int w = 0;
            int k = 0;
            for (int i = 0; i < side; i++) {
                if (board[i][j] == 0) {
                    continue;
                }
                if (k == 0) {
                    k = board[i][j];
                } else if (k == board[i][j]) {
                    board[w][j] = 2 * k;
                    ++w;
                    k = 0;
                } else {
                    board[w][j] = k;
                    ++w;
                    k = board[i][j];
                }
            }
            if (k != 0) {
                board[w][j] = k;
                ++w;
            }
            for (int i = w; i < side; i++) {
                board[i][j] = 0;
            }
        }
    }

    private void down() {
        for (int j = 0; j < side; j++) {
            int w = side - 1;
            int k = 0;
            for (int i = side - 1; i > -1; i--) {
                if (board[i][j] == 0) {
                    continue;
                }
                if (k == 0) {
                    k = board[i][j];
                } else if (k == board[i][j]) {
                    board[w][j] = 2 * k;
                    --w;
                    k = 0;
                } else {
                    board[w][j] = k;
                    --w;
                    k = board[i][j];
                }
            }
            if (k != 0) {
                board[w][j] = k;
                --w;
            }
            for (int i = 0; i < w + 1; i++) {
                board[i][j] = 0;
            }
        }
    }

    private void left() {
        for (int i = 0; i < side; i++) {
            int w = 0;
            int k = 0;
            for (int j = 0; j < side; j++) {
                if (board[i][j] == 0) {
                    continue;
                }
                if (k == 0) {
                    k = board[i][j];
                } else if (k == board[i][j]) {
                    board[i][w] = 2 * k;
                    ++w;
                    k = 0;
                } else {
                    board[i][w] = k;
                    ++w;
                    k = board[i][j];
                }
            }
            if (k != 0) {
                board[i][w] = k;
                ++w;
            }
            for (int j = w; j < side; j++) {
                board[i][j] = 0;
            }
        }
    }

    private void right() {
        for (int i = 0; i < side; i++) {
            int w = side - 1;
            int k = 0;
            for (int j = 0; j < side; j++) {
                if (board[i][j] == 0) {
                    continue;
                }
                if (k == 0) {
                    k = board[i][j];
                } else if (k == board[i][j]) {
                    board[i][w] = 2 * k;
                    --w;
                    k = 0;
                } else {
                    board[i][w] = k;
                    --w;
                    k = board[i][j];
                }
            }
            if (k != 0) {
                board[i][w] = k;
                --w;
            }
            for (int j = 0; j < w + 1; j++) {
                board[i][j] = 0;
            }
        }
    }

    private void move(String mv) {
        switch (mv) {
            case "UP":
                up();
                break;
            case "DOWN":
                down();
                break;
            case "LEFT":
                left();
                break;
            case "RIGHT":
                right();
                break;
            default:
                break;
        }
    }

    private String getMoveTo(String move) {
        if (canMoveUp() && move.equals("UP")) {
            return "UP";
        }
        if (canMoveDown() && move.equals("DOWN")) {
            return "DOWN";
        }
        if (canMoveLeft() && move.equals("LEFT")) {
            return "LEFT";
        }
        return "RIGHT";
    }

    private List<Object> maximize(AI state, int a, int b, int d) {
        String maxMove = null;
        int maxUtility = Integer.MIN_VALUE;
        if (d == 0 || state.isTerminal("max")) {
            return Arrays.asList(null, state.utility());
        }
        --d;
        for (String mv : state.getAvailableMovesForMax()) {
            state.move(mv);
            List<Object> min = minimize(state, a, b, d);
            int utility = (int) min.get(1);
            if (utility > maxUtility) {
                maxMove = mv;
                maxUtility = utility;
            }
            if (maxUtility >= b) {
                break;
            }
            if (maxUtility > a) {
                a = maxUtility;
            }
        }
        return Arrays.asList(maxMove, maxUtility);
    }

    private List<Object> minimize(AI state, int a, int b, int d) {
        int[] minMove = null;
        int minUtility = Integer.MAX_VALUE;
        if (d == 0 || state.isTerminal("min")) {
            return Arrays.asList(null, state.utility());
        }
        --d;
        for (int[] cell : state.getAvailableMovesForMin()) {
            state.board[cell[0]][cell[1]] = cell[2];
            List<Object> max = maximize(state, a, b, d);
            int utility = (int) max.get(1);
            if (utility < minUtility) {
                minMove = cell;
                minUtility = utility;
            }
            if (minUtility <= a) {
                break;
            }
            if (minUtility < b) {
                b = minUtility;
            }
        }
        return Arrays.asList(minMove, minUtility);
    }

    private String getBestMove(int depth) {
        List<Object> max = maximize(new AI(null), Integer.MIN_VALUE, Integer.MAX_VALUE, depth);
        String move = (String) max.get(0);
        return getMoveTo(move);
    }
}
