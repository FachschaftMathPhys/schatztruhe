package info.mathphys.schatztruhe.data

import androidx.room.TypeConverter
import java.util.*


class DateTypeConverter {
    @TypeConverter
    fun convertDateToLong(date: Date): Long {
        return date.time
    }

    @TypeConverter
    fun convertLongToDate(time: Long): Date {
        return Date(time)
    }
}