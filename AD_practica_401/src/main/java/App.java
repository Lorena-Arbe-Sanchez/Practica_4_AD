import dao.CourseDao;
import dao.TeacherDao;
import models.Course;
import models.Teacher;

public class App {

    public static void main(String[] args) {

        TeacherDao teacherDao = new TeacherDao();
        System.out.println(teacherDao.find(1));

        // CREATE: crear un profesor
        Teacher teacher = new Teacher(null, "Pedro", "Jimenez", null);
        teacherDao.create(teacher);
        System.out.println("Profesor creado: " + teacher);

        // UPDATE: modificar el profesor
        teacher.setFirstName("Pepe");
        teacher.setLastName("Gil");
        teacherDao.update(teacher);
        System.out.println("Profesor actualizado: " + teacher);

        // DELETE: eliminar el profesor
        teacherDao.delete(teacher);
        System.out.println("Profesor eliminado");

        CourseDao courseDao = new CourseDao();
        System.out.println(courseDao.find(1));

        // Crear un curso sin profesor asociado
        Course course = new Course();
        course.setTitle("Programación");

        // Intentar guardar el curso en la BBDD
        courseDao.create(course);
    }
}

// RESULTADO:
/*

Teacher{id=1, firstName='Ane', lastName='García'}

Profesor creado: Teacher{id=2, firstName='Pedro', lastName='Jimenez'}
Profesor actualizado: Teacher{id=2, firstName='Pepe', lastName='Gil'}
Profesor eliminado

Course{id=1, title='Programación', teacher=Teacher{id=1, firstName='Ane', lastName='García'}}

Exception in thread "main" jakarta.persistence.PersistenceException: Converting `org.hibernate.PropertyValueException` to JPA `PersistenceException` : not-null property references a null or transient value : models.Course.teacher
Caused by: org.hibernate.PropertyValueException: not-null property references a null or transient value : models.Course.teacher

 */