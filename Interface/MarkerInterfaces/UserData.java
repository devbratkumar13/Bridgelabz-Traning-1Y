package com.gla.Interface.MarkerInterfaces;
interface BackupSerializable {
}
class UserData implements BackupSerializable {
    private String name;

    public UserData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class BackupService {

    public static void processBackup(Object obj) {
        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object");
        } else {
            System.out.println("Not eligible for backup");
        }
    }
}

