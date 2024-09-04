from typing import List


class Solution:
    def hash_fun(self, x, y):
        return x + 60001 * y

    def robotSim(self, commands: List[int], obstacles: List[List[int]]) -> int:
        x, y = 0, 0
        dir_idx = 0
        dir_ary = [(0, 1), (1, 0), (0, -1), (-1, 0)]
        obs_set = {self.hash_fun(x, y) for x, y in obstacles}
        max_distance = 0

        for command in commands:
            if command == -1:
                dir_idx = (dir_idx + 1) % 4
            elif command == -2:
                dir_idx = (dir_idx + 3) % 4
            else:
                dx, dy = dir_ary[dir_idx]
                for _ in range(command):
                    next_x, next_y = x + dx, y + dy
                    if self.hash_fun(next_x, next_y) in obs_set:
                        break
                    x, y = next_x, next_y

                max_distance = max(max_distance, x * x + y * y)

        return max_distance

if __name__ == '__main__':
    sol = Solution()
    print(sol.robotSim([4,-1,4,-2,4], [[2,4]]))