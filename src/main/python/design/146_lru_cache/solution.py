from task import LRUCache


class MyLRUCache(LRUCache):
    def __init__(self, capacity: int):
        super().__init__(capacity)
        self.capacity = capacity
        self.cache = {}
        self.head = None
        self.tail = None

    def get(self, key: int) -> int:
        if key in self.cache:
            node = self.cache.get(key)
            self.move_at_head(node)
            return node.value
        return -1

    def put(self, key: int, value: int) -> None:
        if key in self.cache:
            node = self.cache.get(key)
            node.value = value
            self.move_at_head(node)
        else:
            if len(self.cache) == self.capacity:
                self.cache.pop(self.tail.key)
                self.remove_at_tail()
            node = Node(key, value)
            self.cache[key] = node
            self.add_at_head(node)

    def add_at_head(self, node):
        if self.head is None:
            self.head = node
            self.tail = node
            return
        node.next = self.head
        self.head.prev = node
        self.head = node

    def remove_at_tail(self):
        prev = self.tail.prev
        if prev is None:
            self.head = None
            self.tail = None
            return
        prev.next = None
        self.tail = prev

    def move_at_head(self, node):
        if node.prev is None:
            return
        prev = node.prev
        if node.next is None:
            prev.next = None
            self.tail = prev
        else:
            nxt = node.next
            prev.next = nxt
            nxt.prev = prev
        node.next = self.head
        node.prev = None
        self.head.prev = node
        self.head = node


class Node:
    def __init__(self, key, value):
        self.key = key
        self.value = value
        self.next = None
        self.prev = None
