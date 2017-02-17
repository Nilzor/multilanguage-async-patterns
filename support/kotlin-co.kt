suspend fun getSlowStringJob(s: String) : String {
    delay(250)
    return s
}

suspend fun getSlowIntJob(i: Int) : Int {
    delay(250)
    return i
}

// Returns the deferred job which completes first
suspend fun <T> awaitFirst(jobs : Array<Deferred<T>>) : Deferred<T> {
    var doneJob : Deferred<T>? = null
    while (doneJob == null) {
        for (job in jobs) {
            if (job.isCompleted) {
                doneJob = job
                break;
            }
            yield()
        }
    }
    return doneJob
}