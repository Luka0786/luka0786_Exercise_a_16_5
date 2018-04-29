package Kap16Exercise5;

public class Exercise5
{
    /*
    Write a method called countDuplicates that returns the number of
    duplicates in a sorted list. The list will be in sorted order, so
    all of the duplicates will be grouped together. For example, if a
    variable list stores the values
    [1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40], the call of list.countDuplicates()
    should return 7 because there are 2 duplicates of 1, 1 duplicate of 3, 1 duplicate
    of 15, 2 duplicates of 23, and 1 duplicate of 40.
    */

    public static void main(String[] args)
    {
        LinkedIntListExercise5 list = new LinkedIntListExercise5();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(15);
        list.add(15);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(40);
        list.add(40);

        System.out.println(list.countDuplicates());
    }
}
