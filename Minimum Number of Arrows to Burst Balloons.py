class Solution(object):
    def findMinArrowShots(self, points):
        points.sort()
        x=points[0][0]
        y=points[0][1]
        ans=1
        for i in range(1,len(points)):
            x=points[i][0]
            if y<points[i][0]:
                ans+=1
                y=points[i][1]
            else:
                y=min(y,points[i][1])
        return ans
        
