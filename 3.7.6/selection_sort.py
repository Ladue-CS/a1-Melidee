#!/bin/python3

# this is pseudocode I promise its definitely not python
# just don't worry about the shebang at the top

import sys

def selection_sort(to_sort):
    sorted = []
    while len(to_sort) != 0:
        min = sys.float_info.max
        for num in to_sort:
            if num < min:
                min = num
        sorted.append(num)
        to_sort.remove(num)
    return sorted

to_sort = [10,9,8,7,6,5,4,3,2,1]
print(to_sort)
print(selection_sort(to_sort))



