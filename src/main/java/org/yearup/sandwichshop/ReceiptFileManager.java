package org.yearup.sandwichshop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReceiptFileManager {
    private final Order order;

    public ReceiptFileManager(Order order) {
        this.order = order;
    }

    public void saveToFile() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String fileName = formatter.format(LocalDateTime.now()) + ".txt";
        String directoryPath = "receipts";
        String filePath = directoryPath + "/" + fileName;

        // Create the directory if it doesn't exist
        Path dirPathObj = Paths.get(directoryPath);
        boolean dirExists = Files.exists(dirPathObj);
        if (!dirExists) {
            try {
                Files.createDirectories(dirPathObj);
                System.out.println("Directory created successfully!");
            } catch (IOException e) {
                System.out.println("Failed to create directory!" + e.getMessage());
            }
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println("Order Details:");
            writer.println(order.getReceipt());
            writer.println("Total Price: " + order.getTotalPrice());
            System.out.println("Receipt saved to " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while trying to save the receipt.");
            e.printStackTrace();
        }
    }
}
