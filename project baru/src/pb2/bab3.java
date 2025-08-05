/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pb2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MyBook Hype AMD
 */
public class bab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException  {
        // TODO code application logic here
        {
String namaDepan = "";
String namaBelakang = "";
//buat objek dari inputStream
InputStreamReader ireader =
new InputStreamReader(System.in);
//buat objek bufferreader
BufferedReader breader =
new BufferedReader(ireader);
System.out.println("Nama Depan : ");
//membaca inputan user
namaDepan =
breader.readLine();
System.out.println("Nama Belakang : ");
//membaca inputan user
namaBelakang =
breader.readLine();
System.out.println("Nama Saya adalah :");
System.out.println(namaDepan + " " +
namaBelakang);
}
       
    }
}
    
    

