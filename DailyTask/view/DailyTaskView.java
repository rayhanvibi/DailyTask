package view;

import service.DailyTaskService;
import util.InputUtil;
public class DailyTaskView
{
  private DailyTaskService dailyTaskService;

  public DailyTaskView(DailyTaskService dailyTaskService) 
  {
    this.dailyTaskService = dailyTaskService;
  }

  public void showDailyTask()
  {
        while (true) 
        {
            dailyTaskService.showDailyTask();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = InputUtil.input("Pilih");

            if (input.equals("1")) 
            {
                addDailyTask();
            } 
      
            else if (input.equals("2")) 
            {
                removeDailyTask();
            } 
      
            else if (input.equals("x")) 
            {
                break;
            } 
      
            else 
            {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    
  }
  
  public void addDailyTask()
  {
        System.out.println("MENAMBAH DAILY TASK");

        var task = InputUtil.input("Task (x Jika Batal)");

        if (task.equals("x")) 
        {
          // batal
        } 
        
        else 
        {
          dailyTaskService.addDailyTask(task);
        }
  }
  
    public void removeDailyTask()
    {
        System.out.println("MENGHAPUS DAILY TASK");

        var number = InputUtil.input("Nomor yang Dihapus (x Jika Batal)");

        if (number.equals("x")) 
        {
          // batal
        } 
        
        else 
        {
          dailyTaskService.removeDailyTask(Integer.valueOf(number));
        }
    }
  
  
}
