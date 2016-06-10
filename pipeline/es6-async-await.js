async.seq(
    createCallback('job1'),
    (result, callback) => {
        createCallback(result + '-job2')(callback);
    },
    (result, callback) => {
        createCallback(result + '-job3')(callback);
    }
)((err, result) => {
    console.log('Callback sequence', err, result);
});
