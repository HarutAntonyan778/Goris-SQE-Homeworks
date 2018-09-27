
input a
input b
input c

double D = b * b - 4.0 * a * c;
if (D > 0) {
                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);
                sout("Armatnern en "  x1 " and " x2);
            } else if (D == 0) {
                double x1 = -b / (2 * a);
                sout("Armatn e " x1);
            } else {
                sout("Armat chuni");
  }
