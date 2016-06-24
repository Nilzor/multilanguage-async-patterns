Observable<String> obs1 = Observable.just("Hello world");
obs1.flatMap(s -> {
    Observable<Integer> obs2 =  Observable.just(s.length());
    return obs2;
}).flatMap(i -> {
    Observable<String> obs3 = Observable.just("Length: " + i);
    return obs3;
}).subscribe(s ->{
    System.out.println(s);
    // Will output "Length: 11"
});

