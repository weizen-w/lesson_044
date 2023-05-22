package pizza;

import java.util.Comparator;

public class PizzaComparator implements Comparator<Pizza> {

  @Override
  public int compare(Pizza o1, Pizza o2) {
    if (!(o1.getTitle().equals(o2.getTitle()))) {
      return o1.getTitle().compareTo(o2.getTitle());
    }
    if (!(o1.getSize().equals(o2.getSize()))) {
      if (o1.getSize().equals("SMALL")) {
        return -1;
      }
      if (o2.getSize().equals("SMALL")) {
        return 1;
      }
      if (o1.getSize().equals("MEDIUM")) {
        return -1;
      }
      if (o2.getSize().equals("MEDIUM")) {
        return 1;
      }
    }
    if (!o1.isCheesyBorder()) {
      return -1;
    }
    if (!o2.isCheesyBorder()) {
      return 1;
    }
    return 0;
  }
}
