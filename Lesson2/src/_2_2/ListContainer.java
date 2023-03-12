package _2_2;

import java.util.ArrayList;

public class ListContainer
{
  private ArrayList<Integer> list;
  public ListContainer()
  {
    list = new ArrayList<Integer>();
  }
  public  synchronized void add(int i)
  {
    list.add(i);
  }
  public int getLength()
  {
    return list.size();
  }
  public void print(int n)
  {
    list.forEach(System.out::println);
  }

}
