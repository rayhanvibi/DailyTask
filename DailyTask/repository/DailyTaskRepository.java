package repository;

import data.Dailytask;

public interface DailyTaskRepository
{
  
  Dailytask[] getAll();

  public void add(Dailytask dailytask);

  public boolean remove(Integer number);

}
