#### Map trace

##### Step 1

```text
s: anagram
t: nagaram
 ^
m: a=3 n=1 g=1 r=1 m=1
```

##### Step 2

```text
s: anagram
t: nagaram
   ^
m: a=3 n=0 g=1 r=1 m=1
```

##### Step 3

```text
s: anagram
t: nagaram
    ^
m: a=2 g=1 r=1 m=1
```

##### Step 4

```text
s: anagram
t: nagaram
     ^
m: a=2 g=0 r=1 m=1
```

##### Step 5

```text
s: anagram
t: nagaram
      ^
m: a=1 r=1 m=1
```

##### Step 6

```text
s: anagram
t: nagaram
       ^
m: a=1 r=0 m=1
```

##### Step 7

```text
s: anagram
t: nagaram
        ^
m: a=0 m=1
```

##### Step 8

```text
s: anagram
t: nagaram
         ^
m: m=0
```

##### Step 9

```text
s: anagram
t: nagaram
          ^
m: []
output: true
```
