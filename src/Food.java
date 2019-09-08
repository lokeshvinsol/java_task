public class Food {
    private String mFoodName;
    private Double mPrice;

    public Food(String mFoodName, Double mPrice) {
        this.mFoodName = mFoodName;
        this.mPrice = mPrice;
    }

    public String getFoodName() {
        return mFoodName;
    }

    public void setFoodName(String mFoodName) {
        this.mFoodName = mFoodName;
    }

    public Double getPrice() {
        return mPrice;
    }

    public void setPrice(Double mPrice) {
        this.mPrice = mPrice;
    }
}