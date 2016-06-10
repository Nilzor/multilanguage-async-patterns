async.parallel({
    job1: createCallback('job1'),
    job2: createCallback('job2'),
    job3: createCallback('job3')
}, (err, result) => {
    console.log('Parallell callback', err, result);
});