// public class main {
//     public static void main (Stringp[]args){
//         int x = 10;
//         try{
//             x = x / 0;
//         }catch(){
//             e.printStackTrace();
//             System.out.println("Error karena pembagiannya nol");
//         }
//         System.out.println("Program selesai");
//     }
// }

// package latihan;

// public class Demo{
//     static void validate(int age){
//         if(age<18)
//         throw new ArithmeticException("not valid");
//         else
//         Syste.out.prinln("Wellcome to vote");
//     }
//     public static void main(String[] args){
//         validate(13);
//         System.out.prinln("end the code...");
//     }
// }

// class Soal{
//     public static void main(String[] args){
//         int a = 100/0;
//         System.out.println("Hasil perhitungan = "+a);
//     }
// }

// public class Main {
//     public static void main(String[] args){
//         try{
//             int[] myNumbers = {1, 2, 3};
//             System.out.prinln(myNumbers[3]);
//         }catch(Exception e){
//             System.out.prinln("Something went wrong.");
//         }
//     }
// }

// package latihan;
// public class CreateFile{
//     public static void main(String[] args){
//         try{
//             File myObj = new File("filename.txt");

//             if(myObj.CreateFile()){
//                 System.out.println("File created: " + myObj.getName());
//             }else{
//                 System.out.println("File already exists");
//             }
//         }catch (IOException){
//             System.out.println("An error occured");
//         }
//     }
// }

interface Sistem{
    public void login();
    public void logout();
}

class Student implements Sistem{
    public void login(){
        System.out.println("Ani berhasil Login");
    }
    public void logout(){
        System.out.println("Ani berhasil Logout");
    }
}

public class Main{
    public static void main(String[] args){
        Student ani = new Student();
        ani.login();
        ani.logout();
    }
}