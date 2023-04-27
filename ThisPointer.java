/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thispointer;

/**
 *
 * @author HP
 */
public class ThisPointer {
    
    private String name;
    private int age;
    
    public ThisPointer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    
    public static void main(String[] args) {
        ThisPointer person = new ThisPointer("John", 30);
        person.printInfo();
    }
}
