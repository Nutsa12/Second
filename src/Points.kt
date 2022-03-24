import java.lang.Math.pow
import kotlin.math.*
class Points(var y: Int, var x: Int) {
    fun distance(point: Points):Double{
        return sqrt(pow((x - point.x).toDouble(), 2.0) + pow((y - point.y).toDouble(), 2.0))
    }
    override fun equals(other: Any?): Boolean {
        if(other !is Points)
            return false
        return other.y == this.x && other.x == this.y
    }
    override fun toString(): String {
        return super.toString()
        return "y=$y; x=$x"
    }


}