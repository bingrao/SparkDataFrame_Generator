package org.ucf.spark
import implement._
/**
  * @author 
  */
object ScalaApp {
  def main(args: Array[String]): Unit = {
//    SpiderFileReader.genSparkDataFrame()
    SpiderFileReader.builderDatabase()
//    WikiSQLFileReader.genSparkDataFrame()
  }
}