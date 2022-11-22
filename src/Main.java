public class Main {
    public static void main(String[] args) {
        MagicBox<String> boxBalls = new MagicBox<>(5);
        boxBalls.add("шар синий");
        boxBalls.add("шар зелёный");
        boxBalls.add("шар черный");
        boxBalls.add("шар голубой");
        boxBalls.add("шар желтый");
        boxBalls.pick();

        MagicBox<Integer> boxNum = new MagicBox<>(3);
        boxNum.add(25);
        boxNum.add(36);
        boxNum.add(1);
        boxNum.pick();
    }
}