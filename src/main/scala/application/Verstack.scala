package application

object X extends App {
  
    class WalkActivity {
      def calories(lbs: Int, mins: Int, mph: Double = 3): Long = math.round(
          (WalkActivity.MET(mph) * 3.5 * lbs * 0.45) / 200.0 * mins
        )
    }

    object WalkActivity {
      var activity: String = ""

      def MET(mph: Double = 2.3) = mph match {
        case x:Double if(x < 1.7) => 2.3
        case x:Double if(x < 2.5) => 2.9
        case x:Double if(x < 3) => 3.3
        case x:Double if(x >= 3) => 3.3
        case _ => 2.3
      }

      def start = "started!"

      def start(s: String) = {
        activity += "/n[s] Activity started."
      }

      def stop(s: String) = {
        activity += "/n[s] Activity stopped."
      }

      def printActivity = println(activity)

    }
    
}