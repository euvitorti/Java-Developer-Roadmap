package OOP.Composition;

// Represents a Room in the house
class Room {
    private String type;  // The type of the room (e.g., "Living Room", "Bedroom")

    // Constructor to initialize the type of the room
    public Room(String type) {
        this.type = type;
    }

    // Getter method to retrieve the type of the room
    public String getType() {
        return type;
    }
}

// Represents a House that contains a Room
class House {
    private Room room;  // Composition: House owns a Room. The Room is a part of the House

    // Constructor to initialize the House with a room type
    public House(String roomType) {
        // A new Room is created when the House is created
        this.room = new Room(roomType);
    }

    // Method to display the type of room in the house
    public void showRoom() {
        // Prints the type of room the house has (retrieved from the Room object)
        System.out.println("This house has a " + room.getType());
    }
}

// Main class to run the example
class Composition {
    public static void main(String[] args) {
        // Create a House object with a "Living Room"
        House house = new House("Living Room");

        // Show the type of room in the house
        house.showRoom();
    }
}
