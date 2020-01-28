package com.example.mobicomp0114

import androidx.room.*

@Entity(tableName = "reminders")
data class Reminder (
    @PrimaryKey(autoGenerate = true) var uid: Int?,
    @ColumnInfo(name = "time") var time: Long?,
    @ColumnInfo(name = "location") var location: String?,
    @ColumnInfo(name = "message") var message: String
)

@Dao
interface ReminderDao {
    @Transaction @Insert
    fun insert(reminder: Reminder)

    @Query("SELECT * FROM reminders")
    fun getreminders(): List<Reminder>
}
