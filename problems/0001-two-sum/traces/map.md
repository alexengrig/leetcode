#### Map trace

##### Step 1

```text
tar: 11
idx: 0 1 2 3
val: 2 4 7 8
   ^
map: []
```

##### Step 2

```text
tar: 11
idx: 0 1 2 3
val: 2 4 7 8
     ^
map: 9=0
```

##### Step 3

```text
tar: 11
idx: 0 1 2 3
val: 2 4 7 8
       ^
map: 9=0 7=1
```

##### Step 4

```text
tar: 11
idx: 0 1 2 3
val: 2 4 7 8
         ^
map: 9=0 7=1
output: 1 2
```
