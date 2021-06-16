class Person(val name:String,val age:Int) extends Ordered[Person] {

  override def compare(that: Person): Int = {

    if(this.name.equals(that.name))
    {
      if (this.age<that.age) -1 else  0
    }
    else if (this.name.length<that.name.length) -1 else 0

  }

}