val job1 = async(CommonPool) { getSlowIntJob(1) }
val job2 = async(CommonPool) { getSlowIntJob(2) }
val job3 = async(CommonPool) { getSlowIntJob(3) }
launch(CommonPool) {
    val sum = job1.await() + job2.await() + job3.await()
    System.out.println("Sum: " + sum)
}