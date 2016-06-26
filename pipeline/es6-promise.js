// createPromise is a method returning a promise which resolves to the input value
getSlowPromise('job1')
    .then((result) => {
        return getSlowPromise(result + '-job2');
    }).then((result) => {
        return getSlowPromise(result + '-job3');
    }).then((result) => {
        // Result from third job
    });