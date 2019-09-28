import com.abc.*;

public class Main {
    public static void main(String args[]) {
        // --------------------------------------------------
        Student s = new Student("10556001", "王小明", 'M');

        System.out.println(s.stuNo);
        System.out.println(s.stuName);
        System.out.println(s.gender);
        System.out.println("------");
        // --------------------------------------------------
        Course c = new Course("Java", 2.5);

        System.out.println(c.getCrsName());
        System.out.println(c.getCrsCredit());
        System.out.println("------");
        // --------------------------------------------------
        Course c2 = new Course();
        c2.setCrsName("Chinese");
        c2.setCrsCredit(3);

        System.out.println(c2.getCrsName());
        System.out.println(c2.getCrsCredit());
        System.out.println("------");
        // --------------------------------------------------
        Classroom c3 = new Classroom("T404", 25, true);

        System.out.println(c3.getRoomName());
        System.out.println(c3.getCapacity());
        System.out.println(c3.getIsComputerRoom());
        System.out.println("------");
        // --------------------------------------------------
        Classroom c4 = new Classroom();
        c4.setRoomName("T708");
        c4.setCapacity(40);
        c4.setIsComputerRoom(true);

        System.out.println(c4.getRoomName());
        System.out.println(c4.getCapacity());
        System.out.println(c4.getIsComputerRoom());
        System.out.println("------");
        // --------------------------------------------------
        Teacher t = new Teacher("林宏仁", "資管");

        System.out.println(t.getTchName());
        System.out.println(t.getDepartment());
        System.out.println("------");
        // --------------------------------------------------
        Teacher t2 = new Teacher();
        t.setTchName("蘇建興");
        t.setDepartment("資管");

        System.out.println(t.getTchName());
        System.out.println(t.getDepartment());
        System.out.println("------");
        // --------------------------------------------------
    }
}