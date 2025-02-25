public class ChooseCar {
    private String selectedVehicle;

    public ChooseCar() {
        // สมมติว่าเลือกยานพาหนะ
        this.selectedVehicle = "Honda Civic 2022";
    }

    public void chooseVehicle() {
        // แสดงผลข้อมูลของยานพาหนะที่เลือก
        System.out.println("Selected Vehicle: " + selectedVehicle);
    }

    public String getSelectedVehicle() {
        return selectedVehicle;
    }
}