class Waitress {
  PancakeHouseMenu phm = new PancakeHouseMenu();
  DinerMenu dm = new DinerMenu();

  public void printMenu() {
    printMenu(phm.createIterator());
    printMenu(dm.createIterator());
  }

  private void printMenu(Iterator<MenuItem> iter) {
    while (iter.hasNext()) {
      MenuItem item = iter.next();
      System.out.println(item);
    }
  }
}
