import collections

N=int(input())

b=input().split()

l=[]

c=collections.Counter(b)

for key, value in c.iteritems():

    if value>1:

        l.append(key)
      

print(' '.join(str(x) for x in l))
