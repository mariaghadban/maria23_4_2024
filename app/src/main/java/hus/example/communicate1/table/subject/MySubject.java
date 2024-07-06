package hus.example.communicate1.table.subject;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class MySubject {


    @PrimaryKey(autoGenerate = true)//تحديد الصفة كمفتاح رئيسي والذي يُنتجح بشكل تلقائي
    public long roomId;
    public String name;
    public String tName;
    public String id;
    public String userId;
    public String title;


    public long getRoomId() {
        return roomId;
    }

    public String getName() {
        return name;
    }

    public String gettName() {
        return tName;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTName(String tName) {
        this.tName = tName;
    }

    @Override
    public String toString() {
        return "MySubject{" +
                "keyId=" + roomId +
                ", name=" + name +
                ", tName='" + tName + '\'' +
                '}';
    }
}





