package com.habibian.todoapp.data.models

import androidx.compose.ui.graphics.Color
import com.habibian.todoapp.ui.theme.HighPriorityColor
import com.habibian.todoapp.ui.theme.LowPriorityColor
import com.habibian.todoapp.ui.theme.MediumPriorityColor
import com.habibian.todoapp.ui.theme.NonePriorityColor


enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}