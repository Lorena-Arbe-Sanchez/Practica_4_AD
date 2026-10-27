import dao.CourseDao;
import dao.TeacherDao;
import models.Course;
import models.Teacher;

public class App {

    public static void main(String[] args) {

        TeacherDao teacherDao = new TeacherDao();
        System.out.println(teacherDao.find(1));

        /* ----- TAREA 1 ----- */
        CourseDao courseDao = new CourseDao();
        System.out.println(courseDao.find(1));

        /* ----- TAREA 2 ----- */

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

        /* ----- TAREA 3 ----- */

        // Crear un curso sin profesor asociado
        Course course = new Course();
        course.setTitle("Programación");

        // Intentar guardar el curso en la BBDD
        // Debe producir un error porque necesita un profesor
//        courseDao.create(course);

        /* ----- TAREA 4.1 ----- */

        // Crear un Teacher, pero NO persistirlo
        Teacher teacher2 = new Teacher(null, "Tania", "Fernandez", null);

        // Crear un Course
        Course course2 = new Course();
        course2.setTitle("Programación");

        // Asociar el Teacher al Course
        course2.setTeacher(teacher2);

        // Intentar persistir el Course sin haber guardado el Teacher
        // Debe producir un error porque necesita un profesor guardado en BD
//        courseDao.create(course2);

        /* ----- TAREA 4.2 ~ Crear teacher, persistirlo, crear course, asociarle el teacher y persistirlo ----- */

        // Crear un Teacher
        Teacher teacher3 = new Teacher(null, "Eider", "Arbaiza", null);

        // Persistir primero el Teacher
        teacherDao.create(teacher3);

        // Crear un Course
        Course course3 = new Course();
        course3.setTitle("Programación de Servicios y Procesos");

        // Asociar el Teacher al Course
        course3.setTeacher(teacher3);

        // Persistir el Course
        courseDao.create(course3);

        System.out.println("Curso creado: " + course3);
    }
}

// RESULTADO:
/*

Teacher{id=1, firstName='Ane', lastName='García'}

Course{id=1, title='Programación', teacher=Teacher{id=1, firstName='Ane', lastName='García'}}

Profesor creado: Teacher{id=2, firstName='Pedro', lastName='Jimenez'}
Profesor actualizado: Teacher{id=2, firstName='Pepe', lastName='Gil'}
Profesor eliminado

Exception in thread "main" jakarta.persistence.PersistenceException: Converting `org.hibernate.PropertyValueException` to JPA `PersistenceException` : not-null property references a null or transient value : models.Course.teacher
Caused by: org.hibernate.PropertyValueException: not-null property references a null or transient value : models.Course.teacher

Exception in thread "main" java.lang.IllegalStateException: org.hibernate.TransientPropertyValueException: Not-null property references a transient value - transient instance must be saved before current operation : models.Course.teacher -> models.Teacher
Caused by: org.hibernate.TransientPropertyValueException: Not-null property references a transient value - transient instance must be saved before current operation : models.Course.teacher -> models.Teacher

Curso creado: Course{id=2, title='Programación de Servicios y Procesos', teacher=Teacher{id=8, firstName='Eider', lastName='Arbaiza'}}

 */