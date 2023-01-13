#!/bin/python3

# still definitely pseudocode and not python I promise

def insertion_sort(to_sort):
    sorted = [to_sort.pop(0)]
    while len(to_sort) > 0:
        nextItem = to_sort.pop(0)
        if nextItem < sorted[0]: # if the new element is the smallest
            sorted.insert(0, nextItem)
            continue
        for i, num in enumerate(sorted):
            if num > nextItem:
                sorted.insert(i, nextItem)
                break
        else: # else in a for loop executes if the loop does not break
            sorted.append(nextItem)
    return sorted

print(insertion_sort([10,9,8,7,6,5,4,3,2,1]))

