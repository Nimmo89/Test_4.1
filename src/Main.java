public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 5000;
        int bonusMile = service.calculate(price);
        System.out.println(bonusMile);
    }
}
