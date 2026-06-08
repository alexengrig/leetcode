# Set trace

## Step 1

```text
idx: 0 1 2 3
val: 1 2 3 1
   ^
set: []
```

## Step 2

```text
idx: 0 1 2 3
val: 1 2 3 1
     ^
set: [1]
```

## Step 3

```text
idx: 0 1 2 3
val: 1 2 3 1
       ^
set: [1 2]
```

## Step 4

```text
idx: 0 1 2 3
val: 1 2 3 1
         ^
set: [1 2 3]
```

## Step 5

```text
idx: 0 1 2 3
val: 1 2 3 1
           ^
set: [1 2 3]
      ^
output: true
```
