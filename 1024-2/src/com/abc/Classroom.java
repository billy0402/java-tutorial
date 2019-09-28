package com.abc;

public class Classroom {
    // 成員
    private String roomName;
    private int capacity;
    private boolean isComputerRoom;

    // 建構元
    public Classroom(String roomName, int capacity, boolean isComputerRoom) {
        this.roomName = roomName;
        this.capacity = capacity;
        this.isComputerRoom = isComputerRoom;
    }

    public Classroom() {
        this.roomName = null;
        this.capacity = 0;
        this.isComputerRoom = true;
    }

    // getter
    public String getRoomName() {
        return this.roomName;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean getIsComputerRoom() {
        return this.isComputerRoom;
    }

    // setter void << 沒有
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setIsComputerRoom(boolean isComputerRoom) {
        this.isComputerRoom = isComputerRoom;
    }
}
