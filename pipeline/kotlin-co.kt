launch(CommonPool) {
    val res1 = getSlowStringJob("Hello")
    val res2 = getSlowIntJob(res1.length)
    val res3 = getSlowStringJob("First string length: " + res2)
    System.out.println(res3)
}