// Assuming promise1, 2 and 3 are created
// before this code executing
Promise.all([
    promise1,
    promise2,
    promise3
]).then((results) => {
    // 'results' is array of results from each promise
})