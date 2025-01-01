```groovy
def myMethod(List<String> list) {
  if (list != null) {
    list.each { item ->
      if (item == null) {
        println "Null item found"
      } else {
        println item
      }
    }
  } else {
    println "List is null"
  }
}

myMethod(null)
myMethod(['apple', 'banana', null, 'orange']) 
```