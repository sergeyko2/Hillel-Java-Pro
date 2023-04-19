package hw32;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;


public class StudentDaoImpl implements StudentDao {
    private SessionFactory sessionFactory = HibernateSession.getSessionFactory();
    private Session sessionObj;

    @Override
    public boolean addStudent(Student student) {
        boolean result = false;
        Transaction transaction = null;
        try {
            sessionObj = sessionFactory.openSession();
            transaction = sessionObj.beginTransaction();
            sessionObj.persist(student);
            transaction.commit();
            result = true;
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
                e.printStackTrace();
            }
        } finally {
            sessionObj.close();
        }
        return result;
    }

    @Override
    public boolean deleteStudent(int id) {
        boolean result = false;
        Student student;
        Transaction transaction = null;
        try {
            sessionObj = sessionFactory.openSession();
            transaction = sessionObj.beginTransaction();
            student = sessionObj.get(Student.class, id);
            if (student != null) {
                sessionObj.remove(student);
                transaction.commit();
                result = true;
            }
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
                e.printStackTrace();
            }
        } finally {
            sessionObj.close();
        }
        return result;
    }

    @Override
    public boolean updateStudent(Student student) {
        boolean result = false;
        Transaction transaction = null;
        try {
            sessionObj = sessionFactory.openSession();
            transaction = sessionObj.beginTransaction();
            sessionObj.merge(student);
            transaction.commit();
            result = true;
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
                e.printStackTrace();
            }
        } finally {
            sessionObj.close();
        }
        return result;
    }

    @Override
    public Student findStudentById(int id) {
        Student student = null;
        try {
            sessionObj = sessionFactory.openSession();
            student = sessionObj.get(Student.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            sessionObj.close();
        }
        return student;
    }

    @Override
    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        try {
            sessionObj = sessionFactory.openSession();
            students = new ArrayList<>(sessionObj.createQuery("FROM Student", Student.class).list());
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            sessionObj.close();
        }
        return students;
    }
}

