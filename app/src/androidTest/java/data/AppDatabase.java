package data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


import data.usersTable.table.subject.MySubject;
import data.usersTable.table.subject.mySubjectQurey;
import data.usersTable.table.task.MyTask;
import data.usersTable.table.task.MyTaskQurey;
import data.usersTable.table.user.MyUser;
import data.usersTable.table.user.myUserQurey;

//3
@Database(entities = {MyUser.class, MySubject.class, MyTask.class},version = 5)
//الفئة المسؤولة عن بناء قاعدة البيانات بكل جداولها وتوفر لنا كائن للتعامل مع قاعدة البيانات
public abstract class AppDatabase extends RoomDatabase
{
    /**
     * كائن للتعامل مع قاعدة البيانات
     */
    private static AppDatabase db;//يعيد كائن لعمليات جدول المستعملين
    public abstract myUserQurey getMyUserQuery();
    //يعيد كائن لعمليات جدول المواضيع
    public abstract mySubjectQurey getMySubjectQuery();
    //يعيد كاىن لعمليات جدول المهمات
    public abstract MyTaskQurey getMyTaskQuery();
    public static AppDatabase getDB(Context context)
    {
        if(db==null)
        {
            db = Room.databaseBuilder(context, AppDatabase.class,
                            "database-name")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return db;
    }
}

