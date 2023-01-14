class Solution:
    def smallestEquivalentString(self, s1: str, s2: str, baseStr: str) -> str:
        if not s1 and not s2:
            return baseStr
        if not baseStr:
            return None
        graph = defaultdict(set)
        for i in range(len(s1)):
            graph[s1[i]].add(s2[i])
            graph[s2[i]].add(s1[i])

        def dfs(c, visited):
            smaller = c
            visited.add(c)
            for nei in graph[c]:
                if nei not in visited:
                    smaller = min(smaller, dfs(nei, visited))
            return smaller
        result = {c:dfs(c,set()) for c in 'abcdefghijklmnopqrstuvwxyz'}
        
        return ''.join([result[c] for c in baseStr])
