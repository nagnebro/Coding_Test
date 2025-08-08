// 2차원 평면 위의 점 N개가 주어진다.
// 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
// const fs = require('fs');

const {
  getOneLineWithSpace,
  getMultipleLineWithSpace,
} = require('../../utils/utils.stdin');

// const input = getOneLineWithSpace();
const { n, input } = getMultipleLineWithSpace();
const xArr = [];
const yArr = [];

// 데이터 가공
// 1. x축과 y축 좌표의 데이터를 배열로 구분해서 저장
input.forEach((elem) => {
  const [x, y] = elem.split(' ').map((string) => parseInt(string));

  xArr.push(x);
  yArr.push(y);
});

// 버블 정렬, 시간 복잡도 O(n제곱), 아마도 시간초과 할 것

// 1. x축 기준 오름차순으로 우선 정렬
for (let i = 0; i < n; i++) {
  for (let j = 0; j < n - i; j++) {
    let xTemp, yTemp;
    if (xArr[j] > xArr[j + 1]) {
      xTemp = xArr[j + 1];
      xArr[j + 1] = xArr[j];
      xArr[j] = xTemp;

      // x축으로 기준으로 정렬해야 하므로 y축도 인덱스를 공유해야 함
      yTemp = yArr[j + 1];
      yArr[j + 1] = yArr[j];
      yArr[j] = yTemp;
    }
    // x축이 같은 경우
    else if (xArr[j] === xArr[j + 1]) {
      // y축 값을 비교하여 y축값을 기준으로 정렬을 수행
      if (yArr[j] > yArr[j + 1]) {
        console.log('check!');
        console.log(xArr[j], yArr[j]);
        console.log(xArr[j + 1], yArr[j + 1]);
        xTemp = xArr[j + 1];
        xArr[j + 1] = xArr[j];
        xArr[j] = xTemp;

        // x축으로 기준으로 정렬해야 하므로 y축도 인덱스를 공유해야 함
        yTemp = yArr[j + 1];
        yArr[j + 1] = yArr[j];
        yArr[j] = yTemp;
      }
    }
  }
}
console.log(xArr);
console.log(yArr);

// 정답 출력
for (let i = 0; i < n; i++) {
  console.log(`${xArr[i]} ${yArr[i]}`);
}
