package dao;

import idao.IStudentDao;
import models.Student;

import java.util.List;

public class StudentDao extends Dao<Student, Integer> implements IStudentDao {

    @Override
    public Student find(Integer id) {
        return em.find(Student.class, id);
    }

    public List<Student> listStudentsByCourseId(Integer courseId) {
        return em.createQuery("SELECT s FROM Student s JOIN s.courses c WHERE c.id = :courseId", Student.class)
                .setParameter("courseId", courseId).getResultList();
    }
}