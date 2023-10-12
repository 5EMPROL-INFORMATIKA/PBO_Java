package com.praktikum.tugas4;

public class Tugas4 {
    static void StudiKasus1(){
        int suku = 1;
        for(int i=0; i < 10; i++){
            System.out.println(suku);
            suku *= 2;
        }
    }
    
    static void StudiKasus2(){
        int suku  = 5;
        for(int i=0; i < 10; i++){
            System.out.println(suku);
            suku += 3;
        }
    }
    
    static void StudiKasus3(){
        int sukup = 5; // deklarasi variable suku pertama
        int xx = 3; // deklarasi variable selisih
        int jmlhSuku = 10; // deklarasi variable jumlah suku
        
        int i,x; // deklarasi variable i dan x
        x = sukup; // deklrasi variable x dengan nilai suku pertama
        
        // mulai melakukan pengulangan
        for(i=1; i <= jmlhSuku; i++){
            System.out.println(x); //print hasil x
            sukup += xx; 
            xx += 2;
            x = sukup;
        }
    }

    public static void main(String[] args) {
        System.out.println("Nama\n: Tengku Arya Saputa");
        System.out.println("NIM\n: 20220801084");
        System.out.println("Tugas\n: Pertemuan 4");
        System.out.println("======Studi Kasus 1=======");
        StudiKasus1();
        System.out.println("==========================");
        System.out.println("======Studi Kasus 2=======");
        StudiKasus2();
        System.out.println("==========================");
        System.out.println("======Studi Kasus 3=======");
        StudiKasus3();
        System.out.println("==========================");
    }
}
