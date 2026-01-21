package directory;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int choice=-1;
        Scanner sc = new Scanner(System.in);
        while(choice!=8){
            Menu.caseMenu();
            try{
                choice = sc.nextInt();}
            catch(InputMismatchException e){
            }
                sc.nextLine();
                switch (choice) {
                    case 1:
                        Menu.hienthi("data/contacts.csv");
                        break;
                    case 2:Menu.ADD("data/contacts.csv");
                        break;
                    case 3:Menu.update("data/contacts.csv");
                    break;
                    case 4:Menu.delete("data/contacts.csv");
                    break;
                    case 5:Menu.find("data/contacts.csv");
                    break;
                    case 6:Menu.docfile("data/contacts.csv");
                    break;
                    case 7:Menu.ghiFile("data/contacts.csv");
                    break;
                    case 8:
                        System.out.println("Chuong trinh ket thuc");
                    break;
                    default:
                        System.out.println("Nhap khong hop le,vui long nhap lai");
                        break;
                }


        }

    }
}
