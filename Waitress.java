class Waitress {
  PancakeHouseMenu phm = new PancakeHouseMenu();
  DinerMenu dm = new DinerMenu();

  public void printMenu() {
    phm.forEach(item -> System.out.println(item));
    dm.forEach(item -> System.out.println(item));
  }
}
