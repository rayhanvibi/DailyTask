import repository.DailyTaskRepository;
import repository.DailyTaskRepositoryImpl;
import service.DailyTaskService;
import service.DailyTaskServiceImpl;
import view.DailyTaskView;

public class AplikasiDailyTask
{
    public static void main(String[] args)
    {
        DailyTaskRepository dailyTaskRepository = new DailyTaskRepositoryImpl();
        DailyTaskService dailyTaskService = new DailyTaskServiceImpl(dailyTaskRepository);
        DailyTaskView dailyTaskView = new DailyTaskView(dailyTaskService);

        dailyTaskView.showDailyTask();
    }
}
