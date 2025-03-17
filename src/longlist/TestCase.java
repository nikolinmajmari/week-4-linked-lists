package longlist;


import longlist.table.RecordTable;

public class TestCase {
    public static void main(String[] args) {
        RecordTable students = new RecordTable();
        for (int i = 0; i < 10000; i++) {
            students.add(new Object[]{
            // id, name, programid, cityid , cgpa
               i,"Student "+i,i%20,i%40,Math.random()*4
            });
        }
        RecordTable cities = new RecordTable();
        for (int i = 0; i < 25; i++) {
            cities.add(new Object[]{
                    // id, name, state
                    i, "City "+i,i%2,
            });
        }
        RecordTable states = new RecordTable();
        for (int i = 0; i < 5; i++) {
            states.add(new Object[]{
                    // id, name, state
                    i, "State "+i,
            });
        }
        RecordTable programs = new RecordTable();
        for (int i = 0; i < 55; i++) {
            programs.add(new Object[]{
                    // id, name, state
                    i, "Program "+i,
            });
        }
    }
}
