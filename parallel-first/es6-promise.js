Promise.race([
    promise1,
    promise2,
    promise3
]).then((result) => {
    // result is first to return
})