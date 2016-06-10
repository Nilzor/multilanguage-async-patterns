Promise.race([
    createPromise('job1'),
    createPromise('job2'),
    createPromise('job3')
]).then((result) => {
    console.log('Promise race', result);
}).catch((err) => {
    console.log(err);
});