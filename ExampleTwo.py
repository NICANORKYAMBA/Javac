#!/usr/bin/python3

# Change module name to conform to snake_case naming style
# Also, change constant name to UPPER_CASE naming style
my_array = [2, 5, 3, 8, 6, 4, 7, 3, 9, 1]

# Calculate length of the array
LENGTH = len(my_array)

# Square each element in the array
for i in range(LENGTH):
    my_array[i] *= my_array[i]

# Implement selection sort to sort the squared array
for i in range(LENGTH):
    min_index = i
    for j in range(i + 1, LENGTH):
        if my_array[j] < my_array[min_index]:
            min_index = j
    my_array[i], my_array[min_index] = my_array[min_index], my_array[i]

# Print the sorted squared array
for num in my_array:
    print(num, end=' ')
print()
