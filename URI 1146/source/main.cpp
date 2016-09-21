#include <iostream>

using namespace std;

int main() {
  int n;
  while (cin >> n) {
<<<<<<< HEAD
    for (int i = 1; i <= n; i++) {
      cout << i << " ";
=======
    if (n == 0)
      break;
    for (int i = 1; i <= n; i++) {
      if (i < n)
        cout << i << " ";
      else
        cout << i;
>>>>>>> origin/master
    }
    cout << endl;
  }
  return 0;
}
