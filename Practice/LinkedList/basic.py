from contextlib import nullcontext


class Node:
    def __init__(self, val, next):
        self.val = val
        self.next = next

if __name__=="__main__":
    a = Node(1, )