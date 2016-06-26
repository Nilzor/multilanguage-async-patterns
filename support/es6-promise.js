// Resolves the input value after 300ms
function getSlowPromise(returnValue) {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve(returnValue);
        }, 300);
    });
}