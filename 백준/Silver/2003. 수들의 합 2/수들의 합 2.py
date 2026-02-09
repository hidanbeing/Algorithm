n,m=map(int, input().split())
ar=list(map(int, input().split()))


re=0

i=0
j=0

p=sum(ar[i:j])

while True:
    if j>n: break
    p=sum(ar[i:j])
    #print(i,j,p)
    if (p<m):
        j+=1
    else:
        if (p==m):
            re+=1
        i+=1
        


print(re)