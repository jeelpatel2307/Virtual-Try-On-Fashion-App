import java.util.Scanner;

// Class to represent clothing items
class ClothingItem {
    private String name;
    private String type;
    private String imageUrl;

    public ClothingItem(String name, String type, String imageUrl) {
        this.name = name;
        this.type = type;
        this.imageUrl = imageUrl;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}

// Class to represent the virtual try-on fashion app
public class VirtualTryOnApp {
    private ClothingItem[] clothingItems;

    public VirtualTryOnApp() {
        // Initialize clothing items
        this.clothingItems = new ClothingItem[] {
            new ClothingItem("T-Shirt", "Top", "tshirt.jpg"),
            new ClothingItem("Jeans", "Bottom", "jeans.jpg"),
            new ClothingItem("Sneakers", "Footwear", "sneakers.jpg")
            // Add more clothing items as needed
        };
    }

    // Method to display available clothing items
    public void displayClothingItems() {
        System.out.println("Available Clothing Items:");
        for (ClothingItem item : clothingItems) {
            System.out.println(item.getName() + " - " + item.getType());
        }
    }

    // Method to try on a clothing item
    public void tryOn(String itemName) {
        for (ClothingItem item : clothingItems) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                System.out.println("Trying on " + item.getName() + "...");
                // Simulate trying on the clothing item by displaying its image
                System.out.println("Image URL: " + item.getImageUrl());
                // Here, you would typically overlay the item onto a user's image or video stream
                return;
            }
        }
        System.out.println("Clothing item not found.");
    }

    public static void main(String[] args) {
        VirtualTryOnApp app = new VirtualTryOnApp();
        Scanner scanner = new Scanner(System.in);

        // Display available clothing items
        app.displayClothingItems();

        // Prompt the user to select a clothing item to try on
        System.out.print("Enter the name of the clothing item you want to try on: ");
        String itemName = scanner.nextLine();

        // Try on the selected clothing item
        app.tryOn(itemName);

        scanner.close();
    }
}
