package data.usersTable.table.subject;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import data.usersTable.table.subject.MySubject;

@Dao
public interface mySubjectQurey {
    @Query("SELECT * FROM MySubject")
    List<MySubject> getAll();

    @Query("SELECT * FROM mysubject WHERE roomId IN (:userIds)")
    List<MySubject> loadAllByIds(int[] userIds);

    @Query("Delete From MySubject WHERE roomId=:id ")
    void delete(int id);

    @Insert
    void insertAll(MySubject... users);

    @Delete
    void delete(MySubject user);

    @Update
    void update(MySubject... values);

    @Query("SELECT * FROM MySubject WHERE tName=:subjectText ")
    static MySubject checkSubject(String subjectText) {
        return null;
    }


    @Query("SELECT * FROM MySubject ")
    List<MySubject> getAllSubjects();

}
