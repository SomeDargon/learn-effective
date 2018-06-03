package com.student.chapterOne;

/**
 * Builder Pattern 设计模式
 * 很有意思..
 */
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder{
        // Required parameters
        private final int servingSize;
        private final int servings;

        // Optional parameters - initialized to default values
        private int calories     = 0;
        private int carbohydrate = 0;
        private int fat          = 0;
        private int sodium       = 0;

        public Builder(int servingSize, int servings){
            this.servings    = servings;
            this.servingSize = servingSize;
        }

       public Builder calories(int val){
            calories = val;
            return this;
       }

       public Builder fat(int val){
            fat = val;
            return this;
       }

       public Builder carbohydrate(int val){
            carbohydrate = val;
            return this;
       }

       public Builder sodium(int val){
            sodium = val;
            return this;
       }

       public NutritionFacts build() {
            return new NutritionFacts(this);
       }

    }

    private NutritionFacts(Builder builder){
        servings     = builder.servings;
        carbohydrate = builder.carbohydrate;
        sodium       = builder.sodium;
        fat          = builder.fat;
        servingSize  = builder.servingSize;
        calories     = builder.calories;
    }

    /**
     * 初始化的时候可以选择性 设置值 很有意思额..
     * @param args
     */
    public static void main(String[] args) {
        //参数多了看起来就比较长
       NutritionFacts n = new NutritionFacts.Builder(200, 300)
               .fat(2).calories(3).carbohydrate(4).calories(5).build();
    }
}
