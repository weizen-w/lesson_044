package pizza;

import java.util.Comparator;

public class PizzaComparator implements Comparator<Pizza> {

  @Override
  public int compare(Pizza o1, Pizza o2) {
    if (!(o1.getTitle().equals(o2.getTitle()))) {
      return o1.getTitle().compareTo(o2.getTitle());
    }
    if (!(o1.getSize().equals(o2.getSize()))) {
      return o1.getSize().compareTo(o2.getSize());
    }
    return Boolean.compare(o1.isCheesyBorder(), o2.isCheesyBorder());
  }
}
