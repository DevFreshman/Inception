package Math;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class FoodInfo {
    public FoodInfo(String foodName, int rating) {
        this.foodName = foodName;
        this.rating = rating;
    }
    public FoodInfo(String foodName, String cuisine, int rating) {
        this.foodName = foodName;
        this.cuisine = cuisine;
        this.rating = rating;
    }
    String foodName;
    String cuisine;
    int rating;
}

public class FoodRatings {
    Map<String, FoodInfo> foodMap = new HashMap<>();
    Map<String, TreeSet<FoodInfo>> cuisineMap = new HashMap<>();
    Comparator<FoodInfo> cmp = (a, b) -> {
        if (a.rating != b.rating)
            return b.rating - a.rating;
        return a.foodName.compareTo(b.foodName);
    };

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        int size = foods.length;
        for (int i = 0; i < size; i++) {
            foodMap.put(foods[i], new FoodInfo(foods[i],cuisines[i] ,ratings[i]));
            cuisineMap
                    .computeIfAbsent(cuisines[i], k -> new TreeSet<>(cmp))
                    .add(foodMap.get(foods[i]));
        }
    }

    public void changeRating(String food, int newRating) {
        FoodInfo foodInfo = foodMap.get(food);
        cuisineMap.get(foodInfo.cuisine).remove(foodInfo);
        foodInfo.rating = newRating;
        cuisineMap.get(foodInfo.cuisine).add(foodInfo);
    }

    public String highestRated(String cuisine) {
        return cuisineMap.get(cuisine).first().foodName;
    }
}
