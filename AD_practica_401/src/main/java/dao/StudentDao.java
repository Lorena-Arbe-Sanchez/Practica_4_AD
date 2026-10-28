package dao;

import idao.IStudentDao;
import models.Student;

public class StudentDao extends Dao<Student, Integer> implements IStudentDao {

    @Override
    public Student find(Integer id) {
        return em.find(Student.class, id);
    }
}