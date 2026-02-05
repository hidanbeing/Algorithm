n, m = map(int, input().split())
ar = list(map(int, input().split()))

dic = {}
i = 0
j = 0
re = 0

while j < n:                     # 👉 j 기준 반복
    # 1) 오른쪽 확장
    if ar[j] in dic:
        dic[ar[j]] += 1
    else:
        dic[ar[j]] = 1

    # 2) 조건이 깨졌다면 왼쪽을 줄이기
    while dic[ar[j]] > m:
        dic[ar[i]] -= 1
        i += 1

    # 3) 길이 갱신 (★ 핵심 수정)
    re = max(re, j - i + 1)

    # 4) 오른쪽 이동
    j += 1

print(re)