package application

object X extends App {
}

class Family(args:String*) {
  def familySize():Int = args.size
}

class FlexibleFamily(mother:String, father:String, children:String*) {
  def familySize():Int = 2 + children.size
}
