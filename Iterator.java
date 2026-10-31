class DinerMenuIterator implements Iterator<MenuItem> {
  MenuItem[] items; int position = 0;
  DinerMenuIterator(MenuItem[] a) { items = a; }

  public MenuItem next() {
    MenuItem menuItem = items[position];
    position = position + 1;
    return menuItem;
  }

  public boolean hasNext() {
    if (position >= items.length || items[position] == null)
      return false;
    else
      return true;
  }
}

class PancakeHouseMenuIterator implements Iterator<MenuItem> {
  List<MenuItem> items; int position = 0;

  PancakeHouseMenuIterator(List<MenuItem> l) { items = l; }

  public MenuItem next() {
    MenuItem item = items.get(position);
    position = position + 1;
    return item;
  }

  public boolean hasNext() {
    return position < items.size();
  }
}
