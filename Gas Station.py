class Solution(object):
    def canCompleteCircuit(self, gas, cost):
        if sum(gas) < sum(cost): 
            return -1
        
        sp = 0
        p_gas = 0
        for i in range(len(gas)):
            p_gas += gas[i] - cost[i]
            if p_gas < 0:
                sp = i+1
                p_gas = 0

        return sp
