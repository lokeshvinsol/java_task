public enum MovieType {
    //Fixed movie type so that all the movie can be stored in one of this type.
    TOLLYWOOD("Dosa"), BOLLYWOOD("Dal Makhani"), HOLLYWOOD("Pepper Steak");

    private String mFreeFoodDish;
    private double mAverageCostOfProduction;

    MovieType(String mFreeFoodDish) {
        this.mFreeFoodDish = mFreeFoodDish;
    }

    public String getFreeFoodDish() {
        return mFreeFoodDish;
    }

    public double getAverageCostOfProduction() {
        return mAverageCostOfProduction;
    }

    public void setAverageCostOfProduction(double mAverageCostOfProduction) {
        this.mAverageCostOfProduction = mAverageCostOfProduction;
    }
}
