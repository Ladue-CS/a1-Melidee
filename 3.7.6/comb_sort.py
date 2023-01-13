#!/bin/python3

import random

SHRINK_FACTOR = 1.3

def combsort(to_sort):
  length = len(to_sort)
  # set the initial gap size
  gap = length - 1
  # iterate until gap = 1 (sorted)
  while gap >= 1:
    for i in range(length - gap):
      if to_sort[i] > to_sort[i+gap]:
        # swap the elements if left is greater than right
        to_sort[i], to_sort[i+gap] = to_sort[i+gap], to_sort[i]
    # shrink the gap by the shrink factor
    gap = int(gap // 1.3)
  return to_sort

print(combsort([random.randint(-100, 100) for x in range(25)]))

