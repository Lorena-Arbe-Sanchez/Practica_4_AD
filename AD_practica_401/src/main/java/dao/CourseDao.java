package dao;

import idao.ICourseDao;
import models.Course;
import models.Teacher;

import java.util.List;

public class CourseDao extends Dao<Course, Integer> implements ICourseDao {
    @Override
    public Course find(Integer id) {
        Course course = em.find(Course.class, id);
        return course;
    }

    public Teacher findTeacher(Integer id) {
        return em.find(Teacher.class, id);
    }

    public List<Course> listCoursesByTeacherLastName(String apellido) {
        return em.createQuery("SELECT c FROM Course c WHERE c.teacher.lastName = :lastName", Course.class)
                .setParameter("lastName", apellido).getResultList();
    }
}