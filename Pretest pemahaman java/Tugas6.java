import java.util.Scanner;

public class Tugas6{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inputkan Nilai : ");
        int nilai = scanner.nextInt();
        String hasil = HitungNilai(nilai);
        System.out.println("nilai anda adalah " + nilai + " jadi anda " + hasil);
     }
     
     public static String HitungNilai(int a1) {
      int nilai = a1;
      
      String hasil;
      if (nilai < 60 ){
        hasil = "tidak lolos";
      }else{
        hasil = "lolos ";  
      }
      
      return hasil; 
     }
}
