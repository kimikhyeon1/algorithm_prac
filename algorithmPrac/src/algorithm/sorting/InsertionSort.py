def insertion_sort(array):
    for i in range(1, len(array)):
        temp = i - 1

        while array[temp] > array[i] and temp > -1:
            array[temp], array[i] = array[i], array[temp]
            temp -= 1
            i -= 1

    return array


print(insertion_sort([4, 2, 6, 5, 1, 3]))

"""
    EXPECTED OUTPUT:
    ----------------
    [1, 2, 3, 4, 5, 6]

 """

