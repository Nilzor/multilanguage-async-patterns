async.race([
    createCallback('job1'),
    createCallback('job1'),
    createCallback('job1')
], (err, result) => {
    console.log('Race callback', err, result);
});
