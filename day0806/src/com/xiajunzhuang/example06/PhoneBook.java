package com.xiajunzhuang.example06;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private ArrayList<User> phoneBook = new ArrayList<>();

    public PhoneBook() {
    }

    public ArrayList<User> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(ArrayList<User> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public PhoneBook(ArrayList<User> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void addPhone(){
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("姓名：");
        user.setName(scanner.next());
        System.out.println("性别：");
        user.setGender(scanner.next());
        System.out.println("年龄：");
        user.setAge(scanner.nextInt());
        System.out.println("电话：");
        user.setPhone(scanner.next());
        System.out.println("qq：");
        user.setQq(scanner.next());
        System.out.println("地址：");
        user.setAddress(scanner.next());
        if(phoneBook.add(user)){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    public void deletePhone(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = scanner.next();
        for(int i = 0;i<phoneBook.size();i++){
            if(phoneBook.get(i).getName().equals(name)){
                phoneBook.remove(i);
                System.out.println("删除成功");
            }else {
                System.out.println("此人不存在");
            }
        }

    }

    public void updatePhone(int index){

        if(index>=0){
            User user = new User();
            Scanner scanner = new Scanner(System.in);
            System.out.println("姓名：");
            phoneBook.get(index).setName(scanner.next());
            System.out.println("性别：");
            phoneBook.get(index).setGender(scanner.next());
            System.out.println("年龄：");
            phoneBook.get(index).setAge(scanner.nextInt());
            System.out.println("电话：");
            phoneBook.get(index).setPhone(scanner.next());
            System.out.println("qq：");
            phoneBook.get(index).setQq(scanner.next());
            System.out.println("地址：");
            phoneBook.get(index).setAddress(scanner.next());
            System.out.println("姓名"+phoneBook.get(index).getName()+","
                    +"性别："+phoneBook.get(index).getGender()+","
                    +"年龄："+phoneBook.get(index).getAge()+","
                    +"电话："+phoneBook.get(index).getPhone()+","
                    +"QQ："+phoneBook.get(index).getQq()+","
                    +"地址："+phoneBook.get(index).getAddress());
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }


    }

    public void selectAll(){
        for(int i = 0; i<phoneBook.size();i++){
            System.out.println("姓名："+phoneBook.get(i).getName()+","
                    +"性别"+phoneBook.get(i).getGender()+","
            +"年龄："+phoneBook.get(i).getAge()+","
            +"电话："+phoneBook.get(i).getPhone()+","
            +"QQ："+phoneBook.get(i).getQq()+","
            +"地址："+phoneBook.get(i).getAddress());
        }
    }
    public int  selectByName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = scanner.next();
        for(int i = 0;i<phoneBook.size();i++){
            if(name.equals(phoneBook.get(i).getName())){
                System.out.println("姓名："+phoneBook.get(i).getName()+","
                        +"性别："+phoneBook.get(i).getGender()+","
                        +"年龄："+phoneBook.get(i).getAge()+","
                        +"电话："+phoneBook.get(i).getPhone()+","
                        +"QQ："+phoneBook.get(i).getQq()+","
                        +"地址："+phoneBook.get(i).getAddress());
                return i;
            }
        }
        System.out.println("查无此人");
        return -1;
    }

}
