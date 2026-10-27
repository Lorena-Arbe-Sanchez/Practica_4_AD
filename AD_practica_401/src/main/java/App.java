import dao.CourseDao;
import dao.TeacherDao;

public class App {

    public static void main(String[] args) {

        TeacherDao teacherDao = new TeacherDao();
        System.out.println(teacherDao.find(1));

        CourseDao courseDao = new CourseDao();
        System.out.println(courseDao.find(1));
    }
}

// RESULTADO:
/*

Teacher{id=1, firstName='Ane', lastName='García'}

Course{id=1, title='Programación', teacher=Teacher{id=1, firstName='Ane', lastName='García'}}

 */