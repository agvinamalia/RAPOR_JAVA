package rapor.siswaa;

import java.util.Scanner;

public class RAPORSISWAA {
    public static void main(String[] args) {
        //deklarasi variable
        String nama;
        Double nilaiMatematika, nilaiKimia, nilaiFisika, nilaiBahasaIndonesia;
        Double jumlahNilai;
        boolean cek = true;
        Scanner scan = new Scanner (System.in);
       //perulangan
       //masukkan data yang akan di cek
        while(cek) {
            System.out.println ("pengecekan nilai rapor siswa SMK TELKOM MALANG");
            System.out.print ("Nama: ");
            nama = scan.next();
            System.out.print("Nilai Matematika: ");
            nilaiMatematika = scan.nextDouble();
            System.out.print("Nilai Kimia: ");
            nilaiKimia = scan.nextDouble();
            System.out.print("Nilai Fisika: ");
            nilaiFisika = scan.nextDouble();
            System.out.print("nilai Bahasa Indonesia: ");
            nilaiBahasaIndonesia = scan.nextDouble();
            //menghitung jumlah nilai
            jumlahNilai = (nilaiMatematika + nilaiKimia + nilaiFisika + nilaiBahasaIndonesia);
            System.out.println("Nilai Rata Rata "+nama+":"+jumlahNilai);
            
            if (jumlahNilai >= 75){
                System.out.println("selamat "+nama+" tidak perlu melakukan perbaikan nilai");
            }else {
                System.out.println("maaf "+nama+" perlu melakukan perbaikan nilai");
            }
            
            
                    
            
        }
    }
    
}
