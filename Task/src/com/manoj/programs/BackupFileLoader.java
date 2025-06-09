package com.manoj.programs;

public class BackupFileLoader {
    public static void main(String[] args) {
        try {
            throw new Exception("Main config load failed.");
        } catch (Exception e1) {
            System.out.println("Main config failed. Trying backup");
            try {
                System.out.println("Backup config loaded successfully.");
            } catch (Exception e2) {
                System.out.println("Backup config failed");
            }
        }
    }

}
