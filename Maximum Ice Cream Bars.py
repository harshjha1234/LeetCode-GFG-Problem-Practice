class Solution(object):
    def maxIceCream(self, costs, coins):
        costs.sort()
        s, c = 0, 0
        for i in range(len(costs)):
            s = s + costs[i]
            if s > coins:
                return c
            else:
                c += 1
        return c
