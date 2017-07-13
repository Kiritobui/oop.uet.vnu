/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

/**
 *
 * @author Virgo
 */
public class StudentManagement {
    
    public static void main(String[] args) {
        /*Student sv1 = new Student();
        sv1.setName("Bui Xuan Vuong");
        sv1.setId("15020956");
        sv1.setGroup("K60CC");
        sv1.setEmail("inuyasha.ngoc2@gmail.com");
        System.out.println(sv1.getName());
        System.out.println(sv1.getInfo());
        
        Student sv2 = new Student("Bui Xuan Vuong", "15020956", "K60CC", "15020956@vnu.edu.vn");
        System.out.println(sv2.getInfo());
        
        Student sv3 = new Student(sv2);
        System.out.println(sv3.getInfo());*/
        
        Student sv1 = new Student("Niếp Phong", "14021234", "K59CLC", "Phong@gmail.com");
        Student sv2 = new Student("Lăng Tiếu", "14021235", "K59CLC", "Tieu@gmail.com");
        Student sv3 = new Student("Tiêu Viêm", "14021236", "K59CB", "Viem@gmail.com");
        System.out.println(sameGroup(sv1, sv2));
        System.out.println(sameGroup(sv1, sv3));
    }
  
     public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }
}
