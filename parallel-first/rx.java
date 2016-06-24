// obs1, 2 and 3 are Observable<String>'s
// Assuming each observable only emits 1 value
obs1.mergeWith(obs2)
    .mergeWith(obs3)
    .first()
    .subscribe(result -> {
        // result is String
    });
