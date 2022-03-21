package homework3;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ticTacToeField[][] = new char[3][3];

        char a ;
        char b ;

        for (int i = 0; i < ticTacToeField.length; i++) {
            for (int j = 0; j < ticTacToeField[i].length; j++) {
                ticTacToeField[i][j] = '-';
                System.out.print(" " + ticTacToeField[i][j]);

            }
            System.out.println();

        }


        for (;;) {
         int k=0;
           k++;
            if (k==10){
                System.out.println(" Вы оба проиграли !");
                break;

            }

            System.out.println("Player -X- ");


            for (; ; ) {
                System.out.println(" Enter  your move number  горизонталь ");
                a = (char) sc.nextInt();
                System.out.println(" Enter  your move number вертикаль   ");
                b = (char) sc.nextInt();
                if (ticTacToeField[a - 1][b - 1] == 'x' || ticTacToeField[a - 1][b - 1] == 'o') {
                    System.out.println("Клетка занята - попробуйте выбрать свободную !");


                } else {
                    ticTacToeField[a - 1][b - 1] = 'x';
                    break;

                }
            }


            // рисование
            for (int i = 0; i < ticTacToeField.length; i++) {
                for (int j = 0; j < ticTacToeField[i].length; j++) {
                    System.out.print(" " + ticTacToeField[i][j]);
                }

                System.out.println();

            }


            //проверка на победу X

            for (int i = 0; i < ticTacToeField.length; i++) {
                for (int j = 0; j < ticTacToeField[i].length; j++) {
                    if (ticTacToeField[0][0] == 'x' && ticTacToeField[0][1] == 'x' && ticTacToeField[0][2] == 'x') {
                        System.out.println("победил Х");
                        return;
                    } else if (ticTacToeField[1][0] == 'x' && ticTacToeField[1][1] == 'x' && ticTacToeField[1][2] == 'x') {
                        System.out.println("победил Х");
                        return;

                    } else if (ticTacToeField[2][0] == 'x' && ticTacToeField[2][1] == 'x' && ticTacToeField[2][2] == 'x') {
                        System.out.println("победил Х");
                        return;

                    } else if (ticTacToeField[0][0] == 'x' && ticTacToeField[1][0] == 'x' && ticTacToeField[2][0] == 'x') {
                        System.out.println("победил Х");
                        return;

                    } else if (ticTacToeField[0][1] == 'x' && ticTacToeField[1][1] == 'x' && ticTacToeField[2][1] == 'x') {
                        System.out.println("победил Х");
                        return;

                    } else if (ticTacToeField[0][2] == 'x' && ticTacToeField[1][2] == 'x' && ticTacToeField[2][2] == 'x') {
                        System.out.println("победил Х");
                        return;

                    } else if (ticTacToeField[0][0] == 'x' && ticTacToeField[1][1] == 'x' && ticTacToeField[2][2] == 'x') {
                        System.out.println("победил Х");
                        return;

                    } else if (ticTacToeField[0][2] == 'x' && ticTacToeField[1][1] == 'x' && ticTacToeField[2][0] == 'x') {
                        System.out.println("победил Х");
                        return;

                    }
                }
            }


            System.out.println("Player -O- ");

            for (; ; ){

                System.out.println(" Enter  your move number  горизонталь  ");
            a = (char) sc.nextInt();
            System.out.println(" Enter  your move number вертикаль   ");
            b = (char) sc.nextInt();
                if (ticTacToeField[a - 1][b - 1] == 'x' || ticTacToeField[a - 1][b - 1] == 'o') {
                    System.out.println("Клетка занята - попробуйте выбрать свободную !");


                } else {
                    ticTacToeField[a - 1][b - 1] = 'o';
                    break;

                }


        }

            for (int i = 0 ; i< ticTacToeField.length; i++){
                for(int j = 0 ; j<ticTacToeField[i].length;j++){
                    System.out.print(" "+ ticTacToeField[i][j]);
                }
                System.out.println();

            }

            //Проверка победы игрока -0-
            for (int i = 0 ; i< ticTacToeField.length; i++){
                for(int j = 0 ; j<ticTacToeField[i].length;j++){
                    if (ticTacToeField[0][0]== 'o' && ticTacToeField[0][1]=='o' && ticTacToeField[0][2]=='o') {
                        System.out.println("победил O");
                        return;
                    }
                    else if (ticTacToeField[1][0]=='o'&& ticTacToeField[1][1]=='o' && ticTacToeField[1][2]=='o'){
                        System.out.println("победил O");
                        return;

                    }
                    else if (ticTacToeField[2][0]=='o' && ticTacToeField[2][1]=='o' && ticTacToeField[2][2]=='o'){
                        System.out.println("победил O");
                        return;

                    }
                    else if (ticTacToeField[0][0]=='o' && ticTacToeField[1][0]=='o' && ticTacToeField[2][0]=='o'){
                        System.out.println("победил O");
                        return;

                    }
                    else if (ticTacToeField[0][1]=='o' && ticTacToeField[1][1]=='o' && ticTacToeField[2][1]=='o'){
                        System.out.println("победил O");
                        return;

                    }
                    else if (ticTacToeField[0][2]=='o' && ticTacToeField[1][2]=='o' && ticTacToeField[2][2]=='o'){
                        System.out.println("победил O");
                        return;

                    }
                    else if (ticTacToeField[0][0]=='o' && ticTacToeField[1][1]=='o' && ticTacToeField[2][2]=='o'){
                        System.out.println("победил O");
                        return;

                    }
                    else if (ticTacToeField[0][2]=='o' && ticTacToeField[1][1]=='o' && ticTacToeField[2][0]=='o'){
                        System.out.println("победил O");
                        return;

                    }
                }
            }

                }

            }

        }





