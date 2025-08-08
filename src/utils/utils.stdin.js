const fs = require('fs');

/**
 * @description 하나의 줄, 여러개의 공백으로 구분된 입력 처리
 * @returns {Array} input
 */
module.exports.getOneLineWithSpace = function () {
  const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');
  console.log(input);
  return input;
};

/**
 * @description 여러줄로 된 입력처리
 * @returns {Array} input
 */
module.exports.getMultipleLine = function () {
  const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
  return input;
};

/**
 * @description 첫번째 줄에 입력의 개수가 주어지고 두번째 줄부터 공백으로 이루어진 입력이 주어질때
 * @returns {object} data
 * @example
 * const result = getMultipleLineWithSpace();
 * console.log(result.n); // 2
 * console.log(result.input); // [ '1 2', '3 4' ]
 */
module.exports.getMultipleLineWithSpace = function getMultipleLineWithSpace() {
  let input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
  console.log(input);
  const n = input[0];
  input = input.slice(1);
  return { n, input };
};
