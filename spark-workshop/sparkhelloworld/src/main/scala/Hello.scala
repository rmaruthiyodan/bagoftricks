import org.apache.spark.sql.SparkSession

object Hello extends Greeting with App {
  val spark = SparkSession.builder.appName(appName).getOrCreate()

  println(greeting)
  println(spark.version)
}
trait Greeting {
  lazy val appName = "Hello World Spark App"
  lazy val greeting: String = "hello"
}