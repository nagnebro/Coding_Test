// 힙정렬 예제

const arr = generateRandomArray();
console.log(`random arr : ${arr}`);

// 시각화 시 (n)은 인덱스를 뜻함
//           3(0)   ----------- 0
//        /        \
//       5(1)       2(2) ------------ 1
//     /  \       /   \
//    1(3) 6(4)  8(5) 10(6) ------------ 2

// 힙의 깊이를 구하기 위한 과정
let level = 0;
let binaryNum = 2;
while (true) {
  binaryNum = 2 ** level;

  if (arr.length < binaryNum * 2) break;
  level++;
}

console.log('level', level);

function recursiveGenerateRandom(arr, range) {
  let random = Math.floor(Math.random() * range);
  console.log(random);
  const findNumber = arr.find((element) => element === random);
  if (findNumber !== undefined) {
    random = recursiveGenerateRandom(arr, range);
  }
  return random;
}
function generateRandomArray() {
  const arr = [];
  const range = 20;
  for (let i = 0; i < range; i++) {
    arr[i] = recursiveGenerateRandom(arr, range);
  }
  return arr;
}

function recursiveSwap(arr, currentIdx, maxIdx) {
  const leftChildNodeIdx = (currentIdx + 1) * 2 - 1;
  const rightChildNodeIdx = (currentIdx + 1) * 2;

  // 하위 노드가 없을 시 return
  if (!arr[leftChildNodeIdx] && !arr[rightChildNodeIdx]) return;

  // 완전 이진트리에서는 우측 노드만 존재하는 케이스가 발생하지 않음
  const biggerIdx = !arr[rightChildNodeIdx]
    ? leftChildNodeIdx
    : arr[leftChildNodeIdx] >= arr[rightChildNodeIdx]
    ? leftChildNodeIdx
    : rightChildNodeIdx;

  // 더 큰값이 이미 swap한 값이라도 반대 노드의 값도 비교해서 swap을 실시해야 함
  if (biggerIdx >= maxIdx) {
    console.log(`bigger ${biggerIdx}, maxIdx:${maxIdx}`);
    console.log('final node skipped for sorting');
    return;
  }

  console.log(`left child node : ${arr[leftChildNodeIdx]}`);
  console.log(`right child node : ${arr[rightChildNodeIdx]}`);
  console.log(`bigger IDx: ${biggerIdx}`);

  if (arr[biggerIdx] > arr[currentIdx]) {
    // const temp = arr[biggerIdx];
    // arr[biggerIdx] = arr[currentIdx];
    // arr[currentIdx] = temp;
    swap(arr, currentIdx, biggerIdx);
    // 여기서 childeNodeIdx가 리프노드라면 recursive를 호출할 필요가 없음.
    // 그러나 결국은 return 될 것이기 떄문에 비등하다고 보고 우선 배제
    recursiveSwap(arr, biggerIdx, maxIdx);
    return;
  }
}
function swap(target, parentIdx, childIdx) {
  const temp = target[parentIdx];
  target[parentIdx] = target[childIdx];
  target[childIdx] = temp;
}

// 정렬을 위한 스왑
// 오름차순을 기준으로 설정
function swapForSorting(target, parentIdx, childIdx) {
  if (target[parentIdx] <= target[childIdx]) return;

  const temp = target[parentIdx];
  target[parentIdx] = target[childIdx];
  target[childIdx] = temp;
}

// 1. 오름차순 정렬을 위해 최대힙 생성
// 가장 하위의 리프 노드를 제외한 노드들에 대해서만 수행해야하고 이 노드의 개수는 배열의 길이를 2로 나눈 몫에서 1을 뺀 값이다.
// level만큼 노드를 순회하면서 sift down 수행
// 최대힙(최소힙) 생성 과정에서의 순회 순서는 뒤에서, 즉 리프노드를 제외한 level-1에 위치한 가장 우측의 노드부터 진행돼야 한다.
// 앞에서부터 진행하면 하위 노드에 대한 sift down 작업은 루트노드와의 스왑이 일어나는 것이 아니기 떄문이다. -> 너무 당연한 말인가?
// 시작인덱스에 -2를 하는 이유는 level - 1의 노드개수만큼 순회를 실시해야하는데 인덱스에 접근해야하기 떄문에 추가로 1을 빼줌
for (let i = 2 ** level - 2; i >= 0; i--) {
  console.log(`current node sequence : ${i}`);
  console.log(`current node value: ${arr[i]}`);
  // 자식 노드를 확인하기 위해서는 현재 노드의 (인덱스 +1) * 2가 우측 자식 노드, (인덱스+1)*2 -1 이 좌측 자식 노드이다.
  // +1을 해주는 이유는 실제 노드는 n번째에 위치해있더라도 인덱스는 -1로 처리되기 때문.

  // sift down 방식은 현재 부모 노드가 자식 노드보다 작다면 swap을 실행한다.
  // 최대힙은 반정렬 상태이기 때문에 우측과 좌측 노드의 값 비교는 의미없음
  // swap 과정은 재귀호출로 일어나야 한다. 즉 n번쨰의 노드에 대해 스왑 과정이 한번이라도 일어났다면 리프노드 윗 노드까지는 수행해야 하는 것이다.
  recursiveSwap(arr, i);
}
console.log(`max heap result : ${arr}`);

// 2. sift-down 재귀호출을 통해 현재 노드를 리프노드까지 이동 시킴
// 3. 2의 n-2승 개의 노드에 대해 끝날때까지 반복할 것.

// max heap을 생성했다면 이제부터 최대힙 상태를 유지하면서 정렬을 수행
for (let i = 0; i <= arr.length - 1; i++) {
  // 루트노드와 리프노드를 스왑

  console.log(arr);
  swapForSorting(arr, 0, arr.length - 1 - i);
  recursiveSwap(arr, 0, arr.length - 1 - i);
}

// if (arr[0] > arr[1]) swap(arr, 0, 1);
console.log(`sorted arr : ${arr}`);
