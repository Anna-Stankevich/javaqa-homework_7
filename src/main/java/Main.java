import ru.netology.statistic.StatisticsService;

public class Main {
    public static void main(String[] args){

        StatisticsService service = new StatisticsService();
        long[] incomes = {1, 15, 33};
        System.out.println(service.findMax(incomes));
    }
}
