
function StatisticsCalculator() {
    this.minimum = function (input) {
        if(input.length === 0) return '';
        return input.reduce(function (min, currentNumber) {
            return min > currentNumber ?  currentNumber : min;
        })
    };

    this.average = function (input) {
        if(input.length === 0) return '';
        var sum = input.reduce(function (sum, currentNumber) {
            return sum + currentNumber ;
        });
        return sum / input.length;
    };

    this.maximum = function (input) {
        if(input.length ===0) return '';
        return input.reduce(function (max, currentNumber) {
            return max < currentNumber ? currentNumber : max;
        })
    };

    this.sequenceLength = function (input) {
        return input.length;
    };
}