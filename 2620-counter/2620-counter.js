/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    let cnt = 0
    return function() {
        if(cnt == 0){
            cnt++
            return n
        }
        else return n+=1
    };
};
createCounter()
/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */