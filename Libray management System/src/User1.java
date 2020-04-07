/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsan
 */
class User1 {
    
    
    
      private String student_id, book_id, name, department;
    private int semester,year;

    User1(String a, String b, String c, String d, int e, int f) {
        this.student_id = a;
        this.book_id = b;
        this.name = c;
        this.department = d;
        this.semester = e;
        this.year = f;

    }

    public String get_student_id() {
        return student_id;
    }

    public String get_book_id() {
        return book_id;
    }
    public String get_name() {
        return name;
    }
    public String get_department() {
        return department;
    }
    public int get_semester() {
        return semester;
    }
    public int get_year() {
        return year;
    }
  
}
