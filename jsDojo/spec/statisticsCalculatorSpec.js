describe('StatisticsCalculator', function () {
    it('should calculate minimum value from empty sequence', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.minimum([])).toBe('');
    });

    it('should calculate minimum value from single sequence', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.minimum([1])).toBe(1);
    });

    it('should calculate minimum value from a sequence', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.minimum([2, 1])).toBe(1);
    });
    it('should calculate minimum value from big sequence', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.minimum([2, 1, 888])).toBe(1);
    });


    it('should calculate average value from empty sequence', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.average([])).toBe('');
    });

    it('should calculate average value from single sequence', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.average([3])).toBe(3);
    });

    it('should calculate average value from a simple sequence', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.average([2, 4])).toBe(3);
    });

    it('should calculate average value from big sequence', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.average([2, 4, 6])).toBe(4);
    });


    it("should calculate max value from empty sequence", function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.maximum([])).toBe('');
    });

    it("should calculate max value from single sequence", function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.maximum([1])).toBe(1);
    });

    it("should calculate max value from simple sequence", function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.maximum([1,3])).toBe(3);
    });

    it("should calculate max value from big sequence", function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.maximum([1,3,2])).toBe(3);
    });

    it("should calculate length from empty", function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.sequenceLength([])).toBe(0);
    });

    it("should calculate length from single sequence", function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.sequenceLength([1])).toBe(1);
    });


    it("should calculate length from simple sequence", function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.sequenceLength([1,2])).toBe(2);
    });

});
