
package latihan_1;
import java.io.*;

public class Bubprogram_lat1 {
    public static int totalSPP; //variabel global (bisa dibaca semua blok program)
   
    public static void main(String[] args) {
       
        BufferedReader br = new BufferedReader
                (new InputStreamReader (System.in));
         try {
             
            do {
             
             //variabel 
             String nim, nama;
             int jml_semester, totalSPP;
             
             System.out.println("----------------");
             System.out.println("1. Input Data");
             System.out.println("2. Output Data");
             System.out.println("3. Logout");
             System.out.println("----------------");
             System.out.println("Pilih Menu : ");
             //inputan buefferedReader
             int menu = Integer.parseInt(br.readLine());
             
             switch(menu) {
                 case 1 : // menu 
                     System.out.print("Isi NIM : "); 
                     nim = br.readLine();
                     System.out.print("Isi Nama : ");
                     nama = br.readLine();
                     System.out.print("Isi Semester yang "
                                + "Sudah Ditempuh : ");
              jml_semester = Integer.parseInt(br.readLine());
                    //cara call fungsi/function         
                     total_SPP(jml_semester);
                     //gunakan println jika didalam fungsi tidak ada
                     //system.out.println
                     
                     System.out.println("Total SPP : " +
                             total_SPP(jml_semester));
                   
                     break; //program break //program break
                 case 2 : // menu 2
                     //cetak data (nim,nama,jumlh semester,total spp)
                     break; //program break
                 default:
                       System.exit(0); //perintah keluar program
             }
            } while (true);

      } 
             catch (Exception e)
          System.out.println("error adalah"
                    + e.getMessage()); 
    }
       static public int total_SPP(int smt){
            //nilai yang dikembaliakn = variabel tottal spp
            //contoh ;  4 smt * 15.000.000 = 60.000.000
             totalSPP = smt * 15000000;
             return totalSPP;
         }
         
        static public void cetakData(){
             
         }


    }
