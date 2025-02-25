public class Main {
    public static void main(String[] args) {
        // เลือกรถยนต์
        ChooseCar chooseCar = new ChooseCar();
        chooseCar.chooseVehicle();
        
        // สร้างใบเสนอราคาสำหรับรถยนต์ที่เลือก
        String selectedVehicle = chooseCar.getSelectedVehicle();
        Quotation quotation = new Quotation(selectedVehicle, 25000.0); // กำหนดราคาเป็นตัวอย่าง
        quotation.displayQuotation();
    }
}
