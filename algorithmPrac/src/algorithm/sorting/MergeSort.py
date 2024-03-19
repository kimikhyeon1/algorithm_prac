def merge(array):
    result = []

    if len(array) <= 1:
        return array

    pointer = len(array) //2
    left_array = merge(array[:pointer])
    right_array = merge(array[pointer:])

    first_pointer = 0
    second_pointer = 0

    while first_pointer < len(left_array) and second_pointer < len(right_array):
        if left_array[first_pointer] < right_array[second_pointer]:
            result.append(left_array[first_pointer])
            first_pointer += 1
        else:
            result.append(right_array[second_pointer])
            second_pointer += 1

    while first_pointer < len(left_array):
        result.append(left_array[first_pointer])
        first_pointer += 1

    while second_pointer < len(right_array):
        result.append(right_array[second_pointer])
        second_pointer += 1

    return result

print(merge([1,5,2,6,9,10,4,3]))