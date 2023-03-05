package com.habibian.todoapp.data.models

import androidx.room.Entity
import com.habibian.todoapp.util.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class ToDoTask(

    val id: Int = 0,
    val tile: String,
    val description: String,
    val priority: Priority
)
