package application

object X extends App {
  def squareThem(args: Int*):Int = args.map(a => a*a ).sum
}

class Family(args:String*) {
  def familySize():Int = args.size
}

class FlexibleFamily(mother:String, father:String, children:String*) {
  def familySize():Int = 2 + children.size
}

class Cup5 (var percentFull:Int = 0) {
  val max = 100
  def increase(changes:Int*):Int = {
    changes.map(iteration => {
      percentFull += iteration
      if (percentFull > max) percentFull = max
      if (percentFull < 0) percentFull = 0
    })
    percentFull
  }
}
