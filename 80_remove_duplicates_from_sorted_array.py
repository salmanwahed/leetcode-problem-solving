from typing import List

nums = [1,1,1,2,2,3]
def kind_of_binary_search(start, end, cur_num):
    mid = (start + end) // 2
    print(f"{start} | {mid} | {end}")
    if start == end:
        return
    if nums[mid] == cur_num:
        if nums[mid + 1] > cur_num:
            cur_num = nums[mid + 1]
            start = mid + 1
        else:
            start = mid
    else:
        if nums[mid] > cur_num:
            end = mid
        else:
            start = mid
    print(f"{cur_num}: {mid}")
    return kind_of_binary_search(start, end, cur_num)


if __name__ == '__main__':
    kind_of_binary_search(0, len(nums), nums[0])
