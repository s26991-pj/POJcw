
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Tablica tablica = new Tablica();
        tablica.wypełnienie();
        System.out.println();
        tablica.zamianawierszy(0, 2);


    }
    static class Tablica {
        int[][] tabela = new int[3][3];

        void wypełnienie() {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tabela[i][j] = new Random().nextInt(10);
                    System.out.print(tabela[i][j] + " ");
                }
                System.out.println();
            }
        }
        void zamianawierszy(int wiersz1, int wiersz2) {
            int[] temp = tabela[wiersz1];
            tabela[wiersz1] = tabela[wiersz2];
            tabela[wiersz2] = temp;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabela[i][j] + " ");
                }
                System.out.println();
            }
            }

        }
    }



