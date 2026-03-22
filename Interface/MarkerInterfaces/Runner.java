package com.gla.Interface.MarkerInterfaces;
public class Runner {
    public static void main(String[] args) {

        UserData user = new UserData("Rahul");
        String data = "Test";

        BackupService.processBackup(user);
        BackupService.processBackup(data);
    }
}
