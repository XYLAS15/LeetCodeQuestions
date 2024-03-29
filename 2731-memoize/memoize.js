/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    const cacheobj = {};
    return function(...args) {
        const key = JSON.stringify(args);
        if(key in cacheobj)
        return cacheobj[key];
        else{
            const res = fn(...args);
            cacheobj[key] = res;
            return res;
        }
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */