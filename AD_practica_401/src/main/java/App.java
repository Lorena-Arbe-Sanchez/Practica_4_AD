import dao.TeacherDao;

public class App {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        System.out.println(teacherDao.find(1));
    }
}

// RESULTADO:
/*
Teacher{id=1, firstName='Ane', lastName='García'}
 */