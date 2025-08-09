// 2차원 평면 위의 점 N개가 주어진다.
// 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
// const fs = require('fs');

const {
  getOneLineWithSpace,
  getMultipleLineWithSpace,
} = require('../../utils/utils.stdin');

// const input = getOneLineWithSpace();
const { n, input } = getMultipleLineWithSpace();

if (n == 1) {
  input.forEach((elem) => {
    console.log(elem);
  });
  return;
}

const xArr = [];
const yArr = [];

// 데이터 가공
// 1. x축과 y축 좌표의 데이터를 배열로 구분해서 저장
input.forEach((elem) => {
  const [x, y] = elem.split(' ').map((string) => parseInt(string));

  xArr.push(x);
  yArr.push(y);
});

// 1. 버블 정렬, 시간 복잡도 O(n제곱), 아마도 시간초과 할 것

// 1-1. x축 기준 오름차순으로 우선 정렬
// for (let i = 0; i < n; i++) {
//   for (let j = 0; j < n - i; j++) {
//     let xTemp, yTemp;
//     if (xArr[j] > xArr[j + 1]) {
//       xTemp = xArr[j + 1];
//       xArr[j + 1] = xArr[j];
//       xArr[j] = xTemp;

//       // x축으로 기준으로 정렬해야 하므로 y축도 인덱스를 공유해야 함
//       yTemp = yArr[j + 1];
//       yArr[j + 1] = yArr[j];
//       yArr[j] = yTemp;
//     }
//     // 1-2. x축이 같은 경우 y축 값을 비교하여 y축값을 기준으로 정렬을 수행
//     else if (xArr[j] === xArr[j + 1]) {
//       if (yArr[j] > yArr[j + 1]) {
//         console.log('check!');
//         console.log(xArr[j], yArr[j]);
//         console.log(xArr[j + 1], yArr[j + 1]);
//         xTemp = xArr[j + 1];
//         xArr[j + 1] = xArr[j];
//         xArr[j] = xTemp;

//         // x축으로 기준으로 정렬해야 하므로 y축도 인덱스를 공유해야 함
//         yTemp = yArr[j + 1];
//         yArr[j + 1] = yArr[j];
//         yArr[j] = yTemp;
//       }
//     }
//   }
// }

// 정답 출력
// for (let i = 0; i < n; i++) {
//   console.log(`${xArr[i]} ${yArr[i]}`);
// }

// 2. 힙 정렬, 시간 복잡도 O(nlogn), 공간복잡도는 버블 정렬보다 높으나 문제 요구사항에서 시간을 충족하지 못했기 떄문에 조금 더 개선된 버전으로 테스트 하기 위함

function getTreeLevel(arr) {
  let binaryNum = 0;
  let level = 0;

  while (true) {
    binaryNum = 2 ** level;

    if (arr.length < binaryNum * 2) break;
    level++;
  }
  return level;
}

function swap(arr, parentIdx, childIdx) {
  const temp = arr[parentIdx];
  arr[parentIdx] = arr[childIdx];
  arr[childIdx] = temp;
}
function setMaxHeap(arr, currentIdx) {
  const leftIdx = (currentIdx + 1) * 2 - 1;
  const rightIdx = (currentIdx + 1) * 2;

  // 왼쪽 오른쪽 노드 모두 존재하지 않는 리프노드일 경우에는 순회를 종료
  if (!arr[leftIdx] && !arr[rightIdx]) return;

  const biggerIdx = !arr[rightIdx]
    ? leftIdx
    : Number(arr[rightIdx].split(' ')[0]) > Number(arr[leftIdx].split(' ')[0])
    ? rightIdx
    : Number(arr[rightIdx].split(' ')[0]) < Number(arr[leftIdx].split(' ')[0])
    ? leftIdx
    : Number(arr[rightIdx].split(' ')[0]) ===
        Number(arr[leftIdx].split(' ')[0]) &&
      Number(arr[rightIdx].split(' ')[1]) > Number(arr[leftIdx].split(' ')[1])
    ? rightIdx
    : leftIdx;

  const biggerXValue = Number(arr[biggerIdx].split(' ')[0]);
  const parentNodeXValue = Number(arr[currentIdx].split(' ')[0]);

  // 부모 노드의 x값과 자식 노드의 x값을 먼저 비교한다
  // 만약 부모 노드와 자식 노드의 x값이 같다면 y값을 기준으로 다시 swap 조건을 결정한다.
  // 입력값을 기준으로 문자열은 '{x} {y}'로 이루저있으므로 문자열 인덱스로 접근한다.
  // 즉 [0]은 x값이고 [2]는 y값이다.
  if (biggerXValue > parentNodeXValue) {
    swap(arr, currentIdx, biggerIdx);
    setMaxHeap(arr, biggerIdx);
  } // 좌측 혹은 우측 자식 노드와 부모 노드의 x값이 같을 경우 y값에 대하여 다시 조건 판별
  // 문제 조건에서 x가 같으면서 y가 같은 경우는 존재하지 않음
  else if (biggerXValue === parentNodeXValue) {
    // 우측 노드는 undefined일 수 있기 때문에 배열 인덱스 접근시 예외가 발생할 수 있음
    // 좌측 노드는 위 validation에 의해 무조건 존재함이 보장됨
    // 즉 좌측 노드 혼자는 존재할 수 있지만 우측 노드는 혼자 존재할 수 없음(데이터가 선형 구조로 이루어져있기 때문)

    const biggerYValue = Number(arr[biggerIdx].split(' ')[1]);
    const parentNodeYValue = Number(arr[currentIdx].split(' ')[1]);

    if (biggerYValue > parentNodeYValue) {
      swap(arr, currentIdx, biggerIdx);
      setMaxHeap(arr, biggerIdx);
    }
  }
}

function sortingHeap(arr, currentIdx, heapSize) {
  const leftIdx = (currentIdx + 1) * 2 - 1;
  const rightIdx = (currentIdx + 1) * 2;

  // 왼쪽 오른쪽 노드 모두 존재하지 않는 리프노드일 경우에는 순회를 종료
  if (!arr[leftIdx] && !arr[rightIdx]) return;

  // 최대힙의 위치를 바꿨으므로 바꾼 위치만큼 스왑해야 하는 힙사이즈는 점차 줄어든다.

  const biggerIdx = !arr[rightIdx]
    ? leftIdx
    : Number(arr[rightIdx].split(' ')[0]) > Number(arr[leftIdx].split(' ')[0])
    ? rightIdx
    : Number(arr[rightIdx].split(' ')[0]) < Number(arr[leftIdx].split(' ')[0])
    ? leftIdx
    : Number(arr[rightIdx].split(' ')[0]) ===
        Number(arr[leftIdx].split(' ')[0]) &&
      Number(arr[rightIdx].split(' ')[1]) > Number(arr[leftIdx].split(' ')[1])
    ? rightIdx
    : leftIdx;

  // 스왑해야 하는 자식 노드의 index가 이미 정렬이 완료된 인덱스라면 return
  if (biggerIdx >= heapSize) return;

  const biggerXValue = Number(arr[biggerIdx].split(' ')[0]);
  const parentNodeXValue = Number(arr[currentIdx].split(' ')[0]);

  // 부모 노드의 x값과 자식 노드의 x값을 먼저 비교한다
  // 만약 부모 노드와 자식 노드의 x값이 같다면 y값을 기준으로 다시 swap 조건을 결정한다.
  // 입력값을 기준으로 문자열은 '{x} {y}'로 이루저있으므로 문자열 인덱스로 접근한다.
  // 즉 [0]은 x값이고 [2]는 y값이다.
  if (biggerXValue > parentNodeXValue) {
    swap(arr, currentIdx, biggerIdx);
    sortingHeap(arr, biggerIdx, heapSize);
  } // 좌측 혹은 우측 자식 노드와 부모 노드의 x값이 같을 경우 y값에 대하여 다시 조건 판별
  // 문제 조건에서 x가 같으면서 y가 같은 경우는 존재하지 않음
  else if (biggerXValue === parentNodeXValue) {
    // 우측 노드는 undefined일 수 있기 때문에 배열 인덱스 접근시 예외가 발생할 수 있음
    // 좌측 노드는 위 validation에 의해 무조건 존재함이 보장됨
    // 즉 좌측 노드 혼자는 존재할 수 있지만 우측 노드는 혼자 존재할 수 없음(데이터가 선형 구조로 이루어져있기 때문)

    const biggerYValue = Number(arr[biggerIdx].split(' ')[1]);
    const parentNodeYValue = Number(arr[currentIdx].split(' ')[1]);

    if (biggerYValue > parentNodeYValue) {
      swap(arr, currentIdx, biggerIdx);
      sortingHeap(arr, biggerIdx, heapSize);
    }
  }
}

const level = getTreeLevel(input);
// 2-1. 오름 차순 정렬을 위해 최대힙 생성, x는 그냥 정렬하면 되는데 y는 x의 값을 키값으로 가진 상태에서 x의 값이 같을떄만 정렬해야 한다.
// 따라서 문자열을 그떄그떄 split하여 같은 조건에 한하여 swap 조건을 다르게 설정한다.

for (let i = 2 ** level - 2; i >= 0; i--) {
  setMaxHeap(input, i);
}

// 힙 정렬
// 추후에 마지막 인덱스 - 1 만큼만 순회할 것.
// 2**level-2로 설정해도 될듯?
for (let i = 0; i <= input.length - 1; i++) {
  swap(input, 0, input.length - 1 - i);
  sortingHeap(input, 0, input.length - 1 - i);
}

if (
  Number(input[0].split(' ')[0]) > Number(input[1].split(' ')[0]) ||
  (Number(input[0].split(' ')[0]) == Number(input[1].split(' ')[0]) &&
    Number(input[0].split(' ')[1]) > Number(input[1].split(' ')[1]))
) {
  swap(input, 0, 1);
}
// console.log(`sorted arr : ${arr}`);
console.log(`sorting result : ${input})`);

input.forEach((elem) => {
  console.log(elem);
});
