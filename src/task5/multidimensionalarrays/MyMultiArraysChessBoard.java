package task5.multidimensionalarrays;

public class MyMultiArraysChessBoard {
    public static void main(String[] args) {
        chessBoard();
    }

    /*
    1) Шахматная доска.
       Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам значения
       B(Black) или W(White). Результат:
       W B W B W B W B
       B W B W B W B W
       ...
     */
    public static void chessBoard() {
        String[][] board = new String[8][8];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ((row + col) % 2 == 0) ? "W" : "B";
            }
        }

        for (String[] row : board) {
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
                if (i < row.length - 1) System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("-".repeat(60));
    }
}