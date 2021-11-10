package service;

import data.Dailytask;
import repository.DailyTaskRepository;

public class DailyTaskServiceImpl implements DailyTaskService
{   
    private DailyTaskRepository dailyTaskRepository;

    public DailyTaskServiceImpl(DailyTaskRepository dailyTaskRepository) 
    {
    this.dailyTaskRepository = dailyTaskRepository;
    }   
    
    @Override
    public void showDailyTask()
    {
        Dailytask[] model = dailyTaskRepository.getAll();
        
        System.out.println("Daily Task");
        for (var i = 0; i < model.length; i++) 
        {
          var dailytask = model[i];
          var no = i + 1;

          if (dailytask != null) 
          {
            System.out.println(no + ". " + dailytask.getTask());
          }
        }   
    }
    
    @Override
    public void addDailyTask(String task)
    {
        Dailytask dailytask = new Dailytask(task);
        dailyTaskRepository.add(dailytask);
        System.out.println("SUKSES MENAMBAH TASK : " + task);   
    }
    
    @Override
    public void removeDailyTask(Integer number)
    {
        boolean success = dailyTaskRepository.remove(number);
        if (success) 
        {
          System.out.println("SUKSES MENGHAPUS TASK : " + number);
        } 
        else 
        {
          System.out.println("GAGAL MENGHAPUS TASK : " + number);
        }
    }
}
