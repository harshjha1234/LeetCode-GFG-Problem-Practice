lass Solution(object):
    def minimumRounds(self, tasks):
        cnt = Counter(tasks).values()
        return -1 if 1 in cnt else sum((t + 2) // 3 for t in cnt)
        
