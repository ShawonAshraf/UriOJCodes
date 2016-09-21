#include <iostream>
using namespace std;

int main() {
  int x, z, tmp;

  cin >> x;
  while (1) {
    cin >> tmp;

    if (tmp > x) {
      z = tmp;
      int i, j;
      int sum = 0;
      for (i = 0, j = x; sum < z; i++, j++) {
        sum += j;
      }

      cout << i << endl;
      break;
    }
  }

  return 0;
}
