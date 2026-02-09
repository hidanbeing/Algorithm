def valid(s):
    left = []
    right = []

    for c in s:
        if c == '<':
            if left:
                right.append(left.pop())

        elif c == '>':
            if right:
                left.append(right.pop())   # ✅ pop(0) → pop()으로 수정

        elif c == '-':
            if left:
                left.pop()

        else:
            left.append(c)

    print("".join(left) + "".join(reversed(right)))

n = int(input())
for _ in range(n):
    valid(input())
