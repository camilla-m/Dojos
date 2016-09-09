'use strict';

/*
  Note: This test uses an HTML Fixture. Fixture elements are essentially an insertion of HTML onto your DOM for your tests to run on if your JS operates on the DOM.
  Using fixtures is a good practice in JS testing, and generally fixtures should be separated out from the code.
*/

describe('application', function () {
    var container, application;

    beforeEach(function () {
        container = fixture(
            '<input id="input-box" > '+
            '<div id="result-value"></div>' +
            '<button id="min"></button>' +
            '<button id="average"></button>' +
            '<button id="max"></button> ' +
            '<button id="length"></button>'
        );
        document.body.appendChild(container);
        application = new Application(document);
    });

    afterEach(function () {
        document.body.removeChild(container);
    });

    it('should change results-value to be 0 value when input is empty and button is clicked', function () {
        application.init()
        document.getElementById('input-box').value = '';
        document.getElementById('min').click();

        expect(document.getElementById('result-value').textContent).toEqual('0');
    });

    it('should change results-value to be min value when input is 5 and button is clicked', function () {
        application.init()
        document.getElementById('input-box').value = '5';
        document.getElementById('min').click();

        expect(document.getElementById('result-value').textContent).toEqual('5');
    });

    it('should change results-value to be min value when input is 5,4 and button is clicked', function () {
        application.init()
        document.getElementById('input-box').value = '5,4';
        document.getElementById('min').click();

        expect(document.getElementById('result-value').textContent).toEqual('4');
    });

    it('should change results-value to be 0 when input is empty and button is clicked', function () {
        application.init()
        document.getElementById('input-box').value = '';
        document.getElementById('average').click();

        expect(document.getElementById('result-value').textContent).toEqual('0');
    });

    it('should change results-value to be average value when input is 2 and button is clicked', function () {
        application.init()
        document.getElementById('input-box').value = '2';
        document.getElementById('average').click();

        expect(document.getElementById('result-value').textContent).toEqual('2');
    });

    it('should change results-value to be average value when input is 2,4 and button is clicked', function () {
        application.init()
        document.getElementById('input-box').value = '2,4';
        document.getElementById('average').click();

        expect(document.getElementById('result-value').textContent).toEqual('3');
    });

    it('should change results-value to be 0 when input is empty and button is clicked', function () {
        application.init()
        document.getElementById('input-box').value = '';
        document.getElementById('max').click();

        expect(document.getElementById('result-value').textContent).toEqual('0');
    });

    it('should change results-value to be maximum value when input is 2,3 and button is clicked', function () {
        application.init()
        document.getElementById('input-box').value = '2,3';
        document.getElementById('max').click();

        expect(document.getElementById('result-value').textContent).toEqual('3');
    });

    it('should change results-value to be maximum value when input is 2,6,3 and button is clicked', function () {
        application.init()
        document.getElementById('input-box').value = '2,6,3';
        document.getElementById('max').click();

        expect(document.getElementById('result-value').textContent).toEqual('6');
    });

    it('should change results-value to be maximum value when input is 2 and button is clicked', function () {
        application.init()
        document.getElementById('input-box').value = '2';
        document.getElementById('max').click();

        expect(document.getElementById('result-value').textContent).toEqual('2');
    });

    it('should change results-value to be 0 when input is empty and button is clicked', function () {
        application.init()
        document.getElementById('input-box').value = '';
        document.getElementById('length').click();

        expect(document.getElementById('result-value').textContent).toEqual('0');
    });

    it('should change results-value to be 1 when input is 1 and button is clicked', function () {
        application.init()
        document.getElementById('input-box').value = '1';
        document.getElementById('length').click();

        expect(document.getElementById('result-value').textContent).toEqual('1');
    });

    it('should change results-value to be 2 when input is 3,4 and button is clicked', function () {
        application.init()
        document.getElementById('input-box').value = '3,4';
        document.getElementById('length').click();

        expect(document.getElementById('result-value').textContent).toEqual('2');
    });

});

function fixture(html) {
  var div = document.createElement('div');
  div.innerHTML = html;
  return div;
}
