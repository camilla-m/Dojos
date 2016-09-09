'use strict';
var Application = function() {
    return {
        init: function() {
            document.getElementById('min').onclick = function() {
                var inputArray = document.getElementById('input-box').value.split(",").map(function (str) {
                    return Number(str);
                });
                var minimum = new StatisticsCalculator().minimum(inputArray);
                document.getElementById('result-value').textContent = minimum;
            };

            document.getElementById('average').onclick = function() {
                var inputArray = document.getElementById('input-box').value.split(",").map(function (str) {
                    return Number(str);
                });
                var average = new StatisticsCalculator().average(inputArray);
                document.getElementById('result-value').textContent = average;
            };

            document.getElementById('max').onclick = function() {
                var inputArray = document.getElementById('input-box').value.split(",").map(function (str) {
                    return Number(str);
                });
                var maximum = new StatisticsCalculator().maximum(inputArray);
                document.getElementById('result-value').textContent = maximum;
            };

            document.getElementById('length').onclick = function() {
                var input = document.getElementById('input-box').value;
                if(input == "")
                {
                    document.getElementById('result-value').textContent = 0;
                }
                else
                {
                    var inputArray = input.split(",").map(function (str) {
                        return Number(str);
                    });
                    var length = new StatisticsCalculator().sequenceLength(inputArray);
                    document.getElementById('result-value').textContent = length;
                }
            };
        }
    };
};

new Application().init();