public enum MovieType {
    TOLLYWOOD("Dosa"), BOLLYWOOD("Dal Makhani"), HOLLYWOOD("Pepper Steak");

    private String mFreeFoodDish;
    private double mAverageCostOfProduction;

    MovieType(String mFreeFoodDish) {
        this.mFreeFoodDish = mFreeFoodDish;
    }

    public String getFreeFoodDish() {
        return mFreeFoodDish;
    }

    public double getAverageCostOfProduction(){
        return mAverageCostOfProduction;
    }
}
