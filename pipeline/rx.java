Observable<String> obs1 = Observable.just("Hello world");
    obs1.flatMap(s -> {
        Observable<Integer> obs2 =  Observable.just(s.length());
      return obs2;
    }).flatMap(integer -> {
        Observable<String> obs3 = Observable.just(
            "Length of first string: " + integer);
        return obs3;
    }).subscribe(s ->{
        System.out.println(s);
        // Will output "Length of first string: 11"
    });

