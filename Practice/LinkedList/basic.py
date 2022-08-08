from contextlib import nullcontext


class Node:
    def __init__(self, val):
        self.val = val
        self.next = next

    def traverse(self, head):
        head
        while head != None:
            print(head)
            head = head.next

if __name__=="__main__":
    a = Node(1)
    b = Node(2)
    c = Node(3)
    d = Node(4)
    e = Node(5)

    a.next = b
    b.next = c
    c.next = d
    d.next = e

    a.traverse(a)

