package maul;

import java.util.Scanner;

/**
 * NAMA  : MAULIDYA DWI RAHMAWATI 
 * KELAS : XRPL-6 
 * NO    : 29
 * MAPEL : PROUKTIF RPL
 */
public class Maul {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int tanggal, tahun;
        String hari, bulan;
        int a = 0;
        String kasir;
        int pilihan;
        int harga  = 0;
        int diskon = 0;
        int hasil, hasil2 = 0, hasil3=0, hasil4=0;
        String ulang = " ";
        System.out.println("MAULIDYA DWI RAHMWATAI/29/XRPL-6");
        System.out.println("================");
        System.out.println("TOKO SUMBER JAYA");
        System.out.println("================");
        System.out.println("  DAFTAR HARGA  ");
        System.out.println("1. BUKU      = Rp 4.500");//mencetak nilai dari objek
        System.out.println("2. PENGHAPUS = Rp 3.000");//mencetak nilai dari objek
        System.out.println("3. PENSIL    = Rp 4.000");//mencetak nilai dari objek
        System.out.println("4. PULPEN    = Rp 2.500");//mencetak nilai dari objek

        System.out.println("<terdapat diskon untuk pembelian berkelipatan 100k>");
        System.out.print(" DATE :  ");
        hari = scanner.next();
        tanggal = scanner.nextInt();
        bulan = scanner.next();
        tahun = scanner.nextInt();
        System.out.print(" KASIR : ");
        kasir = scanner.next();
        do{
        System.out.print("Masukan Pilihan Anda: ");
        pilihan = scanner.nextInt();
        if(pilihan == 1){
             harga = 4500;
        }
        if(pilihan == 2){
            harga = 3000;
        }
        if(pilihan == 3){
            harga = 4000;
        }
        if(pilihan == 4){
            harga = 2500;
        }
        if(pilihan >4){
            System.out.println("Pilihan salah");
        }else{
        int jumlah = 0;
        System.out.print("Jumlah Barang: ");
        jumlah = scanner.nextInt();
        hasil = jumlah*harga;
        hasil2 = hasil2+hasil;
        System.out.println("Harga Barang : Rp." +hasil);
        System.out.println("Ingin menambah barang ? Ya/Tidak ");
        ulang = scanner.next();
        }  
        }while (ulang.equalsIgnoreCase("ya"));
        System.out.println("Total harga = Rp." +hasil2);        
        int bayar;
        int kembalian;
        if(hasil2>100000){
            if(hasil2>200000){
                if(hasil2>500000){
                    diskon=50;
                    hasil3 = hasil2/100;
                    hasil4 = hasil3*diskon;
                }else{
                    diskon=80;
                    hasil3 = hasil2/100;
                    hasil4 = hasil3*diskon;
                }
            }else{
                    diskon=90;
                    hasil3 = hasil2/100;
                    hasil4 = hasil3*diskon;
                    }
        }
        System.out.println("diskon "+(100-diskon)+"% ="+hasil4);
        System.out.print("Bayar : ");
        bayar = scanner.nextInt();
        kembalian = bayar-hasil4;
        System.out.println("Kembalian : Rp. " +kembalian);
        
        System.out.println("====================================================");
        System.out.println("Barang yang sudah dibeli tidak dapat ditukar kembali");
    }
    }