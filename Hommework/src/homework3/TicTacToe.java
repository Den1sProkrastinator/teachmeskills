package homework3;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ticTacToeField[][] = new char[3][3];
        char a = 0;
        char b = 0;
         int proverkaX=0;
         int provrkaO=0;
        for (int i = 0; i < ticTacToeField.length; i++) {
            for (int j = 0; j < ticTacToeField[i].length; j++) {
                ticTacToeField[i][j] = '-';
                System.out.print(" " + ticTacToeField[i][j]);
            }
            System.out.println();

        }

        for (int s = 0; s <=9;s++) {
            System.out.println("Player -X- ");
                System.out.println(" Enter  your move number  горизонталь " );
                a = (char) sc.nextInt();
                System.out.println(" Enter  your move number вертикаль   " );
                b= (char) sc.nextInt();

            ticTacToeField[a-1][b-1]='x';

            for (int i = 0 ; i< ticTacToeField.length; i++){
                for(int j = 0 ; j<ticTacToeField[i].length;j++){
                    System.out.print(" "+ ticTacToeField[i][j]);
                }

                System.out.println();

            }

            System.out.println("Player -O- ");


            System.out.println(" Enter  your move number  горизонталь  " );
            a = (char) sc.nextInt();
            System.out.println(" Enter  your move number вертикаль   " );
            b = (char) sc.nextInt();

            ticTacToeField[a-1][b-1]='o';

            for (int i = 0 ; i< ticTacToeField.length; i++){
                for(int j = 0 ; j<ticTacToeField[i].length;j++){
                    System.out.print(" "+ ticTacToeField[i][j]);
                }
                System.out.println();

            }



                }
            }

        }





