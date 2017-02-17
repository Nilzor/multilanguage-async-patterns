val job1 = async(CommonPool) { getSlowIntJob(1) }
val job2 = async(CommonPool) { getSlowIntJob(2) }
val job3 = async(CommonPool) { getSlowIntJob(3) }
launch(CommonPool) {
    val jobs = arrayOf(job1, job2, job3)
    val first = awaitFirst(jobs)
    System.out.println("Finished first: " + first.getCompleted())
}