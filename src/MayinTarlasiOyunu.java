import java.util.Scanner;

public class MayinTarlasiOyunu {
    static void oyun(String[][] x){
        for (String [] row : x){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int satir, sutun;
        int secim_satir, secim_sutun;
        int tur;
        System.out.print("Satır sayısını giriniz : ");
        satir = input.nextInt();
        System.out.print("Sütun sayısını giriniz : ");
        sutun = input.nextInt();

        String[][] mayinKonum = new String[satir][sutun];
        String[][] mayinsizKonum = new String[satir][sutun];

        System.out.println("Mayınların Konumu");
        int mayinSayisi = (satir * sutun) / 4;
        Math.round(mayinSayisi);
        tur = ((satir * sutun) - mayinSayisi);
        for (int x = 0; x < mayinKonum.length; x++){
            for (int y = 0; y < mayinKonum[x].length; y++){
                mayinKonum[x][y] = "- ";
            }
        }
        while (0 != mayinSayisi){
            int a = (int) (Math.random() * (satir));
            int b = (int) (Math.random() * (sutun));
            mayinKonum[a][b] = "* ";
            mayinSayisi--;
        }
        oyun(mayinKonum);

        System.out.println("===============================");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");

        for (int x = 0; x < mayinsizKonum.length; x++){
            for (int y = 0; y < mayinsizKonum[x].length; y++){
                mayinsizKonum[x][y] = "- ";
            }
        }
        oyun(mayinsizKonum);

        while (tur != 0){
            System.out.println("---------------------");
            System.out.print("Satır seçiminiz : ");
            secim_satir = input.nextInt();
            System.out.print("Sütun seçiminiz : ");
            secim_sutun = input.nextInt();

            if (mayinKonum[secim_satir][secim_sutun].equals("* ")) {
                mayinsizKonum[secim_satir][secim_sutun] = "* ";
                oyun(mayinsizKonum);
                System.out.println("Oyun Bitti !!");
                System.out.println("Oyunu Kaybettiniz !!");
                break;
            }
            if (mayinKonum[secim_satir][secim_sutun].equals("- ")) {
                if (secim_satir != 0 && secim_sutun != 0 && secim_satir < (satir - 1) && secim_sutun < (sutun - 1)) {
                    int sayi = 0;
                    for (int i = secim_satir - 1; i <= secim_satir + 1; i++) {
                        for (int j = secim_sutun - 1; j <= secim_sutun + 1; j++) {
                            if (mayinKonum[i][j].equals("* ")) {
                                sayi++;
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }else {
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }
                        }
                    }
                }
                if (secim_satir == 0 && secim_sutun == 0) {
                    int sayi = 0;
                    for (int i = secim_satir; i <= secim_satir + 1; i++) {
                        for (int j = secim_sutun; j <= secim_sutun + 1; j++) {
                            if (mayinKonum[i][j].equals("* ")) {
                                sayi++;
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }else {
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }
                        }
                    }
                }
                if (secim_satir == 0 && secim_sutun == (sutun - 1)) {
                    int sayi = 0;
                    for (int i = secim_satir; i <= secim_satir + 1; i++) {
                        for (int j = secim_sutun - 1; j <= secim_sutun; j++) {
                            if (mayinKonum[i][j].equals("* ")) {
                                sayi++;
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }else {
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }
                        }
                    }
                }
                if (secim_satir == (satir - 1) && secim_sutun == (sutun - 1)) {
                    int sayi = 0;
                    for (int i = secim_satir - 1; i <= secim_satir; i++) {
                        for (int j = secim_sutun - 1; j <= secim_sutun; j++) {
                            if (mayinKonum[i][j].equals("* ")) {
                                sayi++;
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }else {
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }
                        }
                    }
                }
                if (secim_satir == (satir - 1) && secim_sutun == 0) {
                    int sayi = 0;
                    for (int i = secim_satir - 1; i <= secim_satir; i++) {
                        for (int j = secim_sutun; j <= secim_sutun + 1; j++) {
                            if (mayinKonum[i][j].equals("* ")) {
                                sayi++;
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }else {
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }
                        }
                    }
                }
                if (secim_satir == 0 && secim_sutun < (sutun - 1) && secim_sutun != 0) {
                    int sayi = 0;
                    for (int i = secim_satir; i <= secim_satir + 1; i++) {
                        for (int j = secim_sutun - 1; j <= secim_sutun + 1; j++) {
                            if (mayinKonum[i][j].equals("* ")) {
                                sayi++;
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }else {
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }
                        }
                    }
                }
                if (secim_satir < (satir - 1) && secim_sutun == 0 && secim_satir != 0) {
                    int sayi = 0;
                    for (int i = secim_satir - 1; i <= secim_satir + 1; i++) {
                        for (int j = secim_sutun; j <= secim_sutun + 1; j++) {
                            if (mayinKonum[i][j].equals("* ")) {
                                sayi++;
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }else {
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }
                        }
                    }
                }if (secim_satir == (satir - 1) && secim_sutun != 0 && secim_sutun < (sutun - 1)){
                    int sayi = 0;
                    for (int i = secim_satir - 1; i <= secim_satir; i++) {
                        for (int j = secim_sutun - 1; j <= secim_sutun + 1; j++) {
                            if (mayinKonum[i][j].equals("* ")) {
                                sayi++;
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }else {
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }
                        }
                    }
                }if (secim_sutun == (sutun - 1) && secim_satir != 0 && secim_satir < (satir - 1)) {
                    int sayi = 0;
                    for (int i = secim_satir - 1; i <= secim_satir + 1; i++) {
                        for (int j = secim_sutun - 1; j <= secim_sutun; j++) {
                            if (mayinKonum[i][j].equals("* ")) {
                                sayi++;
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }else {
                                String str_sayi = String.valueOf(sayi);
                                mayinsizKonum[secim_satir][secim_sutun] = str_sayi + " ";
                            }
                        }
                    }
                }
                oyun(mayinsizKonum);
            }
            tur--;
        }
        if (tur == 0) {
            System.out.println("Oyunu Kazandınız !!");
        }
    }
}