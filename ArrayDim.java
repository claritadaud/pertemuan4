package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author Ririn2201010655
 * tgl ; 2024-04-22
 */
public class ArrayDim {
    int jdta = 5;
    String[] dteman = new String[jdta];
    Scanner dtIN = new Scanner(System.in);
    public void storedata(){
        System.out.println("Isikan Data Teman");
        System.out.println("~~~~~~~~~~~~~~~~~");
        
        int num=0;
        for(int i=0; i<jdta;i++ ){
            num++;
        System.out.print("Data ke-1: ");
        dteman[0] = dtIN.nextLine();
        
        }
        
/**        
        System.out.print("Data ke-2: ");
        dteman[1] = dtIN.nextLine();
        
        System.out.print("Data ke-3: ");
        dteman[2] = dtIN.nextLine();
        
        System.out.print("Data ke-4: ");
        dteman[3] = dtIN.nextLine();
        
        System.out.print("Data ke-5: ");
        dteman[4] = dtIN.nextLine();
**/
        
        
        dteman[0] = "Emon";
        dteman[1] = "Ririn";
        dteman[2] = "Pepik";
        dteman[3] = "Huri";
        dteman[4] = "Indri";
    }
    public void viewdata(){
        System.out.println("daftar teman");
        System.out.println("~~~~~~~~~~~~");
        int no = 0;
        for(int i=0; i<jdta; i++){
            no++;
            System.out.println(no+". "+dteman[i]);
        
    }
    }
     public void editdata(){
         System.out.println("ubah data teman");
         System.out.println("~~~~~~~~~~~~~~~");
         System.out.print ("Index Data yang diubah: ");
         int idx = dtIN.nextInt();
         System.out.print("Data yang diubah: "+dteman[idx]);
         System.out.print("diubah menjadi: ");
         String newdt = dtIN.nextLine();
         dteman[idx] = newdt;
         System.out.println("Data index ke-"+idx+"telah diubah");
         
         
     }
     public void destroydata(){
         System.out.println("Hapus data teman");
         System.out.println("~~~~~~~~~~~~~~~");
         System.out.print ("Index Data yang di Hapus: ");
          String id = dtIN.nextLine();
          int idx = Integer.parseInt(id);
          dteman[idx]="";
          System.out.println("Data index ke-"+idx+"telah di Hapus");
          
    }
}
