#### Sort trace

##### Step 1

```text
idx: 0 1 2 3
val: 1 2 3 2
   ^
```

##### Step 2

```text
idx: 0 1 2 3
val: 1 2 2 3
   ^
```

##### Step 3

```text
idx: 0 1 2 3
val: 1 2 2 3
       ^
1 != 2
```

##### Step 4

```text
idx: 0 1 2 3
val: 1 2 2 3
         ^
1 != 2
2 == 2
output: true
```
