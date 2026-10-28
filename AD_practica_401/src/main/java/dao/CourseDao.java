package dao;

import idao.ICourseDao;
import models.Course;
import models.Teacher;

public class CourseDao extends Dao<Course, Integer> implements ICourseDao {
    @Override
    public Course find(Integer id) {
        Course course = em.find(Course.class, id);
        return course;
    }

    public Teacher findTeacher(Integer id) {
        return em.find(Teacher.class, id);
    }

    /*@Override
    public void listCoursesByTeacherLastName() {
        // todo
    }*/
}