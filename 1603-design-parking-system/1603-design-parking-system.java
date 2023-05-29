class ParkingSystem {

    private int a[];
    public ParkingSystem(int big, int medium, int small) {
        a = new int[]{big,medium,small};
    }
    
    public boolean addCar(int carType) {
        if(a[carType-1]>0)
        {   
            a[carType-1]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */