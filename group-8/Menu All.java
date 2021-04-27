package Eighth;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Menu m=new Menu();
        m.menu();
    }
    public void showMenu() {
        System.out.println("========图书管理系统========");
        System.out.println("1.------查询");
        System.out.println("2.------删除");
        System.out.println("0.------结束");
        System.out.println("==========================");
    }
    public void menu(){
        Book b=new Book();
        Scanner sc=new Scanner(System.in);
        showMenu();
        System.out.print("请输入选择：");
        int n = sc.nextInt();
        if (n==1){
            System.out.print("请输入书名：");
            String book = sc.next();
            System.out.println(b.query(book));
            menu();
        }else if (n==2){
            System.out.print("请输入你要删除的书名：");
            String name=sc.next();
            b.delete(name);
            menu();
        }else if (n==0){
            System.out.println("结束");
        }else {
            System.out.println("输入错误请重新输入");
            menu();
        }
    }
}
