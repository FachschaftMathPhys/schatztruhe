package info.mathphys.schatztruhe.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ThekeDao {
    @Query("SELECT * from theke_table  ORDER BY name ASC")
    fun getAllTheken(): LiveData<List<Theke>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(theke: Theke)

    @Query("DELETE FROM theke_table")
    fun deleteAll()

    @Query("SELECT * from theke_table WHERE id=:theken_id ORDER BY name ASC LIMIT 1")
    fun getTheke(theken_id: Long): Theke
}