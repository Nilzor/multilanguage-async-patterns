Promise.all([
    createPromise('job1'),
    createPromise('job2'),
    createPromise('job2')
]).then((results) => {
    console.log('Parallell promise', results);
}).catch((err) => {
    console.log(err);
});