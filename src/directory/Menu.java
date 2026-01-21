package directory;
import java.sql.SQLOutput;
import java.util.*;
import java.io.*;
import file.File;
import validate.*;
public class Menu {
      public static void caseMenu() {
          System.out.println("---CHUONG TRINH QUAN LY DANH BA---");
          System.out.println("1.Xem danh sach");
          System.out.println("2.Them moi");
          System.out.println("3.Cap nhat");
          System.out.println("4.Xoa");
          System.out.println("5.Tim kiem");
          System.out.println("6.Doc tu file");
          System.out.println("7.Ghi vao file");
          System.out.println("8.Thoat");
          System.out.println("Chon chuc nang");
      }
      public static void hienthi(String path)
      {
          List<Directory> list=new ArrayList<>();
          list=File.readFile(path);
          for (Directory dir : list) {
              System.out.println(dir);
          }
      }
      public static void ADD(String path)
          {
              Scanner sc=new Scanner(System.in);
          List<Directory> list=new ArrayList<>();
          list=File.readFile(path);
              System.out.println("Nhap so dien thoai");
              String numberPhone=sc.nextLine();
              while(!validateNumberPhone.ktsdt(numberPhone))
                  {
                  System.out.println("So dien thoai khong hop le,vui long nhap lai");
                  numberPhone=sc.nextLine();
                  }
              System.out.println("Nhap nhom danh ba");
              String contactGroud=sc.nextLine();
              System.out.println("Nhap ten danh ba");
              String name=sc.nextLine();
              System.out.println("Nhap gioi tinh(nam/nu)");
              String gender=sc.nextLine();
              while (!gender.equals("nam")&&(!gender.equals("nu"))) {
                  System.out.println("Gioi tinh khong hop le,vui long nhap lai(nam/nu)");
                  gender=sc.nextLine();
              }
              System.out.println("Nhap dia chi");
              String address=sc.nextLine();
              System.out.println("Nhap ngay sinh");
              String day=sc.nextLine();
              System.out.println("Nhap email");
              String email=sc.nextLine();
              while (!validateEmail.validate(email)) {
                  System.out.println("Nhap email khong hop le,vui long nhap lai");
                  email=sc.nextLine();
              }
              list.add(new Directory(numberPhone, contactGroud, name, gender, address, day, email));
              System.out.println("Them thanh cong lien he moi");
              File.writeFile(list, path);
          }
          public static void update(String path)
          {
              Scanner sc=new Scanner(System.in);
              List<Directory> list=new ArrayList<>();
              list=File.readFile(path);
              System.out.println("Nhap so dien thoai can sua");
              String numberPhone=sc.nextLine();
              while(!validateNumberPhone.ktsdt(numberPhone))
              {
                  System.out.println("So dien thoai khong hop le,vui long nhap lai");
                  numberPhone=sc.nextLine();
              }int kt=0;
              for (Directory dir : list) {
                  if  (dir.getNumberPhone().equals(numberPhone)) {
                      kt=1;
                      System.out.println("Nhap nhom danh ba");
                      String contactGroud=sc.nextLine();
                      dir.setContactGroup(contactGroud);
                      System.out.println("Nhap ten danh ba");
                      String name=sc.nextLine();
                      dir.setName(name);
                      System.out.println("Nhap gioi tinh(nam/nu)");
                      String gender=sc.nextLine();
                      while (!gender.equals("nam")&&(!gender.equals("nu"))) {
                          System.out.println("Gioi tinh khong hop le,vui long nhap lai(nam/nu)");
                          gender=sc.nextLine();
                      }
                      dir.setGender(gender);
                      System.out.println("Nhap dia chi");
                      String address=sc.nextLine();
                      dir.setAddress(address);
                      System.out.println("Nhap ngay sinh");
                      String day=sc.nextLine();
                      dir.setDay(day);
                      System.out.println("Nhap email");
                      String email=sc.nextLine();
                      while (!validateEmail.validate(email)) {
                          System.out.println("Nhap email khong hop le,vui long nhap lai");
                          email=sc.nextLine();
                      }
                      dir.setEmail(email);
                  }

              }
              if (kt==1) System.out.println("Sua thanh cong");
              else System.out.println("Lien he can sua khong ton tai");
              File.writeFile(list, path);
          }
          public  static void delete(String path)
          {
              Scanner sc=new Scanner(System.in);
              List<Directory> list=new ArrayList<>();
              list=File.readFile(path);
              System.out.println("Nhap so dien thoai can xoa");
              String numberPhone=sc.nextLine();
              System.out.println("ban co chac chan muon xoa(Yes/No)");
              String xoa = sc.nextLine();
              int kt=0;
              Iterator<Directory> it = list.iterator();
              while (it.hasNext()) {
                  Directory dir = it.next();
                  if (dir.getNumberPhone().equals(numberPhone)) {
                      if (xoa.equals("Yes")) {
                          it.remove();
                          kt = 1;
                      } else kt = -1;
                  }
              }
              if (kt == -1) System.out.println("Huy xoa thanh cong");
              else if (kt == 1) System.out.println("Xoa thanh cong");
              else System.out.println("So dien thoai can xoa khong ton tai");
              File.writeFile(list, path);
          }
          public  static void find(String path)
          {
              Scanner sc=new Scanner(System.in);
              List<Directory> list=new ArrayList<>();
              list=File.readFile(path);
              System.out.println("Nhap so dien thoai/Ho va ten can tim");
              String s=sc.nextLine();

              for (Directory dir : list) {
                  if (dir.getNumberPhone().equals(s)||dir.getName().equals(s)) {
                      System.out.println(dir);
                  }
              }
          }
          public static void docfile(String path)
          {
              Scanner sc=new Scanner(System.in);
              List<Directory> list=new ArrayList<>();
              list=File.readFile(path);
              System.out.println("Ban muon doc file(Y/N)");
              String s=sc.nextLine();
              while (!s.equals("Y") && !s.equals("N")) {
                  System.out.println("Nhap khong hop le,vui long nhap lai(Y/N)");
                  s=sc.nextLine();
              }
              if (s.equals("Y")) {
                  System.out.println("Doc file thanh cong");
                  for (Directory dir : list) {
                      System.out.println(dir);
                  }
              }else System.out.println("Huy doc file thanh cong");
          }
          public static void ghiFile(String path)
          {
              Scanner sc=new Scanner(System.in);
              List<Directory> list=new ArrayList<>();
              list=File.readFile(path);
              System.out.println("Ban muon ghi file(Y/N)");
              String s=sc.nextLine();
              while (!s.equals("Y") && !s.equals("N")) {
                  System.out.println("Nhap khong hop le,vui long nhap lai(Y/N)");
                  s=sc.nextLine();
              }
              if (s.equals("Y")) {
                  System.out.println("Ghi file thanh cong");
                  File.writeFile(list, path);}
              else System.out.println("Huy ghi file thanh cong");

          }

}
