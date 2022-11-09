
public class fastfood
{
    private String foodItems;
    private String resturantName;
    private int employees;


    public fastfood(String foodItems, int employees) {
        this.foodItems = foodItems;
        this.employees = employees;
    }

    public fastfood()
    {
        foodItems = "";
        employees = 0;
    }

    public String getfoodItems()
    {
        return foodItems;
    }

    public int getEmployees() {
        return employees;
    }

    public void setfoodItems(String burger) {
        if(!foodItems.matches("[A-Z][zA-Z]*"))
        {
            System.out.println("rejected!");
            this.foodItems = "return a food item";
        }
        else
        {
            this.foodItems = foodItems;
        }
    }

    @Override
    public String
    toString() {
        return "fast food{" +
                "food items='" + foodItems + '\'' +
                ", employees=" + employees +
                '}';
    }
}
