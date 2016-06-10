// createPromise is a method returning a promise which resolves to the input value
createPromise('job1')
    .then((result) => {
        return createPromise(result + '-job2');
    }).then((result) => {
        return createPromise(result + '-job3');
    }).then((result) => {
        console.log('Promise sequence', result);
    }).catch((err) => {
        console.log(err);
    });