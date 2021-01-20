package org.example.a_principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

public class Demeter2 {

    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

class SchoolEmployee {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class SchoolManager {

    public List<SchoolEmployee> getAllSchoolEmployee() {
        List<SchoolEmployee> list = new ArrayList<SchoolEmployee>();
        for (int i = 1; i <= 5; i++) {
            SchoolEmployee schoolEmployee = new SchoolEmployee();
            schoolEmployee.setId("学校总部员工：id->" + i);
            list.add(schoolEmployee);
        }
        return list;
    }

    void printAllEmployee(CollegeManager collegeManager) {

        collegeManager.printCollegeEmployee();

        List<SchoolEmployee> schoolEmployees = this.getAllSchoolEmployee();
        for (SchoolEmployee schoolEmployee : schoolEmployees
        ) {
            System.out.println(schoolEmployee.getId());
        }
    }
}

class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManager {
    public List<CollegeEmployee> getAllCollegeEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 1; i <= 5; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工：id->" + i);
            list.add(collegeEmployee);
        }
        return list;
    }

    public void printCollegeEmployee() {
        List<CollegeEmployee> collegeEmployees = this.getAllCollegeEmployee();
        for (CollegeEmployee c : collegeEmployees) {
            System.out.println(c.getId());
        }
    }

}
