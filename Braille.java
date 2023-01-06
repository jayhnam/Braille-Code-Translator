import java.util.*;
import java.io.*;

public class Braille {
        public static void main(String[] args) throws Exception {
                BufferedReader in = new BufferedReader(new FileReader("Braille.in"));
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Braille.out")));
                String st = in.readLine();

                out.println("Braille Code:");

                String[][] a = {
                                { "•", " " },
                                { " ", " " },
                                { " ", " " } };

                String[][] b = {
                                { "•", " " },
                                { "•", " " },
                                { " ", " " } };

                String[][] c = {
                                { "•", "•" },
                                { " ", " " },
                                { " ", " " } };

                String[][] d = {
                                { "•", "•" },
                                { " ", "•" },
                                { " ", " " } };

                String[][] e = {
                                { "•", " " },
                                { " ", "•" },
                                { " ", " " } };

                String[][] f = {
                                { "•", "•" },
                                { "•", " " },
                                { " ", " " } };

                String[][] g = {
                                { "•", "•" },
                                { "•", "•" },
                                { " ", " " } };

                String[][] h = {
                                { "•", " " },
                                { "•", "•" },
                                { " ", " " } };

                String[][] i = {
                                { " ", "•" },
                                { "•", " " },
                                { " ", " " } };

                String[][] j = {
                                { " ", "•" },
                                { "•", "•" },
                                { " ", " " } };

                String[][] k = {
                                { "•", " " },
                                { " ", " " },
                                { "•", " " } };

                String[][] l = {
                                { "•", " " },
                                { "•", " " },
                                { "•", " " } };

                String[][] m = {
                                { "•", "•" },
                                { " ", " " },
                                { "•", " " } };

                String[][] n = {
                                { "•", "•" },
                                { " ", "•" },
                                { "•", " " } };

                String[][] o = {
                                { "•", " " },
                                { " ", "•" },
                                { "•", " " } };

                String[][] p = {
                                { "•", "•" },
                                { "•", " " },
                                { "•", " " } };

                String[][] q = {
                                { "•", "•" },
                                { "•", "•" },
                                { "•", " " } };

                String[][] r = {
                                { "•", " " },
                                { "•", "•" },
                                { "•", " " } };

                String[][] s = {
                                { " ", "•" },
                                { "•", " " },
                                { "•", " " } };

                String[][] t = {
                                { " ", "•" },
                                { "•", "•" },
                                { "•", " " } };

                String[][] u = {
                                { "•", " " },
                                { " ", " " },
                                { "•", "•" } };

                String[][] v = {
                                { "•", " " },
                                { "•", " " },
                                { "•", "•" } };

                String[][] w = {
                                { " ", "•" },
                                { "•", "•" },
                                { " ", "•" } };

                String[][] x = {
                                { "•", "•" },
                                { " ", " " },
                                { "•", "•" } };

                String[][] y = {
                                { "•", "•" },
                                { " ", "•" },
                                { "•", "•" } };

                String[][] z = {
                                { "•", " " },
                                { " ", "•" },
                                { "•", "•" } };

                String[][] space = {
                                { " ", " " },
                                { " ", " " },
                                { " ", " " } };

                String[][] period = {
                                { " ", " " },
                                { "•", "•" },
                                { " ", "•" } };

                String[][] exclaim = {
                                { " ", " " },
                                { "•", "•" },
                                { "•", " " } };

                String[][] question = {
                                { " ", " " },
                                { "•", " " },
                                { "•", "•" } };

                String[][] comma = {
                                { " ", " " },
                                { "•", " " },
                                { " ", " " } };

                // first row
                for (int index = 0; index < st.length(); index++) {
                        if (st.substring(index, index + 1).equals(".")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(period[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("!")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(exclaim[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("?")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(question[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals(",")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(comma[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("a") || st.substring(index, index + 1).equals("A")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(a[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("b") || st.substring(index, index + 1).equals("B")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(b[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("c") || st.substring(index, index + 1).equals("C")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(c[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("d") || st.substring(index, index + 1).equals("D")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(d[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("e") || st.substring(index, index + 1).equals("E")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(e[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("f") || st.substring(index, index + 1).equals("F")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(f[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("g") || st.substring(index, index + 1).equals("G")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(g[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("h") || st.substring(index, index + 1).equals("H")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(h[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("i") || st.substring(index, index + 1).equals("I")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(i[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("j") || st.substring(index, index + 1).equals("J")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(j[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("k") || st.substring(index, index + 1).equals("K")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(k[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("l") || st.substring(index, index + 1).equals("L")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(l[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("m") || st.substring(index, index + 1).equals("M")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(m[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("n") || st.substring(index, index + 1).equals("N")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(n[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("o") || st.substring(index, index + 1).equals("O")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(o[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("p") || st.substring(index, index + 1).equals("P")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(p[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("q") || st.substring(index, index + 1).equals("Q")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(q[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("r") || st.substring(index, index + 1).equals("R")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(r[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("s") || st.substring(index, index + 1).equals("S")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(s[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("t") || st.substring(index, index + 1).equals("T")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(t[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("u") || st.substring(index, index + 1).equals("U")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(u[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("v") || st.substring(index, index + 1).equals("V")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(v[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("w") || st.substring(index, index + 1).equals("w")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(w[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("x") || st.substring(index, index + 1).equals("x")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(x[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("y") || st.substring(index, index + 1).equals("Y")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(y[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("z") || st.substring(index, index + 1).equals("Z")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(z[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals(" ") || st.substring(index, index + 1).equals(" ")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(space[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }
                }

                out.println();

                // second row
                for (int index = 0; index < st.length(); index++) {
                        if (st.substring(index, index + 1).equals(".")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(period[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("!")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(exclaim[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("?")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(question[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals(",")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(comma[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("a") || st.substring(index, index + 1).equals("A")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(a[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("b") || st.substring(index, index + 1).equals("B")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(b[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("c") || st.substring(index, index + 1).equals("C")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(c[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("d") || st.substring(index, index + 1).equals("D")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(d[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("e") || st.substring(index, index + 1).equals("E")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(e[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("f") || st.substring(index, index + 1).equals("F")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(f[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("g") || st.substring(index, index + 1).equals("G")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(g[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("h") || st.substring(index, index + 1).equals("H")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(h[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("i") || st.substring(index, index + 1).equals("I")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(i[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("j") || st.substring(index, index + 1).equals("J")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(j[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("k") || st.substring(index, index + 1).equals("K")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(k[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("l") || st.substring(index, index + 1).equals("L")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(l[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("m") || st.substring(index, index + 1).equals("M")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(m[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("n") || st.substring(index, index + 1).equals("N")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(n[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("o") || st.substring(index, index + 1).equals("O")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(o[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("p") || st.substring(index, index + 1).equals("P")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(p[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("q") || st.substring(index, index + 1).equals("Q")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(q[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("r") || st.substring(index, index + 1).equals("R")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(r[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("s") || st.substring(index, index + 1).equals("S")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(s[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("t") || st.substring(index, index + 1).equals("T")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(t[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("u") || st.substring(index, index + 1).equals("U")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(u[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("v") || st.substring(index, index + 1).equals("V")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(v[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("w") || st.substring(index, index + 1).equals("w")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(w[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("x") || st.substring(index, index + 1).equals("x")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(x[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("y") || st.substring(index, index + 1).equals("Y")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(y[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("z") || st.substring(index, index + 1).equals("Z")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(z[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals(" ") || st.substring(index, index + 1).equals(" ")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(space[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }
                }

                out.println();

                // third row
                for (int index = 0; index < st.length(); index++) {
                        if (st.substring(index, index + 1).equals(".")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(period[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("!")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(exclaim[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("?")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(question[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals(",")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(comma[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }
                        if (st.substring(index, index + 1).equals("a") || st.substring(index, index + 1).equals("A")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(a[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("b") || st.substring(index, index + 1).equals("B")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(b[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("c") || st.substring(index, index + 1).equals("C")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(c[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("d") || st.substring(index, index + 1).equals("D")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(d[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("e") || st.substring(index, index + 1).equals("E")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(e[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("f") || st.substring(index, index + 1).equals("F")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(f[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("g") || st.substring(index, index + 1).equals("G")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(g[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("h") || st.substring(index, index + 1).equals("H")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(h[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("i") || st.substring(index, index + 1).equals("I")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(i[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("j") || st.substring(index, index + 1).equals("J")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(j[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("k") || st.substring(index, index + 1).equals("K")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(k[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("l") || st.substring(index, index + 1).equals("L")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(l[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("m") || st.substring(index, index + 1).equals("M")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(m[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("n") || st.substring(index, index + 1).equals("N")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(n[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("o") || st.substring(index, index + 1).equals("O")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(o[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("p") || st.substring(index, index + 1).equals("P")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(p[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("q") || st.substring(index, index + 1).equals("Q")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(q[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("r") || st.substring(index, index + 1).equals("R")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(r[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("s") || st.substring(index, index + 1).equals("S")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(s[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("t") || st.substring(index, index + 1).equals("T")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(t[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("u") || st.substring(index, index + 1).equals("U")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(u[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("v") || st.substring(index, index + 1).equals("V")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(v[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("w") || st.substring(index, index + 1).equals("w")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(w[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("x") || st.substring(index, index + 1).equals("x")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(x[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("y") || st.substring(index, index + 1).equals("Y")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(y[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("z") || st.substring(index, index + 1).equals("Z")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(z[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals(" ") || st.substring(index, index + 1).equals(" ")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 2; column++) {
                                                out.print(space[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }
                }

                out.println();
                out.println();
                out.println("Error-Correcting Braille Code:");

                String[][] aC = {
                                { "•", " ", "•" },
                                { " ", " ", " " },
                                { " ", " ", " " },
                                { "•", " ", "•" } };

                String[][] bC = {
                                { "•", " ", "•" },
                                { "•", " ", "•" },
                                { " ", " ", " " },
                                { " ", " ", " " } };
                String[][] cC = {
                                { "•", "•", " " },
                                { " ", " ", " " },
                                { " ", " ", " " },
                                { "•", "•", " " } };
                String[][] dC = {
                                { "•", "•", " " },
                                { " ", "•", "•" },
                                { " ", " ", " " },
                                { "•", " ", "•" } };
                String[][] eC = {
                                { "•", " ", "•" },
                                { " ", "•", "•" },
                                { " ", " ", " " },
                                { "•", "•", " " } };
                String[][] fC = {
                                { "•", "•", " " },
                                { "•", " ", "•" },
                                { " ", " ", " " },
                                { " ", "•", "•" } };
                String[][] gC = {
                                { "•", "•", " " },
                                { "•", "•", " " },
                                { " ", " ", " " },
                                { " ", " ", " " } };
                String[][] hC = {
                                { "•", " ", "•" },
                                { "•", "•", " " },
                                { " ", " ", " " },
                                { " ", "•", "•" } };
                String[][] iC = {
                                { " ", "•", "•" },
                                { "•", " ", "•" },
                                { " ", " ", " " },
                                { "•", "•", " " } };
                String[][] jC = {
                                { " ", "•", "•" },
                                { "•", "•", " " },
                                { " ", " ", " " },
                                { "•", " ", "•" } };
                String[][] kC = {
                                { "•", " ", "•" },
                                { " ", " ", " " },
                                { "•", " ", "•" },
                                { " ", " ", " " } };
                String[][] lC = {
                                { "•", " ", "•" },
                                { "•", " ", "•" },
                                { "•", " ", "•" },
                                { "•", " ", "•" } };
                String[][] mC = {
                                { "•", "•", " " },
                                { " ", " ", " " },
                                { "•", " ", "•" },
                                { " ", "•", "•" } };
                String[][] nC = {
                                { "•", "•", " " },
                                { " ", "•", "•" },
                                { "•", " ", "•" },
                                { " ", " ", " " } };
                String[][] oC = {
                                { "•", " ", "•" },
                                { " ", "•", "•" },
                                { "•", " ", "•" },
                                { " ", "•", "•" } };
                String[][] pC = {
                                { "•", "•", " " },
                                { "•", " ", "•" },
                                { "•", " ", "•" },
                                { "•", "•", " " } };
                String[][] qC = {
                                { "•", "•", " " },
                                { "•", "•", " " },
                                { "•", " ", "•" },
                                { "•", " ", "•" } };

                String[][] rC = {
                                { "•", " ", "•" },
                                { "•", "•", " " },
                                { "•", " ", "•" },
                                { "•", "•", " " } };
                String[][] sC = {
                                { " ", "•", "•" },
                                { "•", " ", "•" },
                                { "•", " ", "•" },
                                { " ", "•", "•" } };
                String[][] tC = {
                                { " ", "•", "•" },
                                { "•", "•", " " },
                                { "•", " ", "•" },
                                { " ", " ", " " } };
                String[][] uC = {
                                { "•", " ", "•" },
                                { " ", " ", " " },
                                { "•", "•", " " },
                                { " ", "•", "•" } };
                String[][] vC = {
                                { "•", " ", "•" },
                                { "•", " ", "•" },
                                { "•", "•", " " },
                                { "•", "•", " " } };
                String[][] wC = {
                                { " ", "•", "•" },
                                { "•", "•", " " },
                                { " ", "•", "•" },
                                { "•", "•", " " } };
                String[][] xC = {
                                { "•", "•", " " },
                                { " ", " ", " " },
                                { "•", "•", " " },
                                { " ", " ", " " } };
                String[][] yC = {
                                { "•", "•", " " },
                                { " ", "•", "•" },
                                { "•", "•", " " },
                                { " ", "•", "•" } };
                String[][] zC = {
                                { "•", " ", "•" },
                                { " ", "•", "•" },
                                { "•", "•", " " },
                                { " ", " ", " " } };

                String[][] spaceC = {
                                { " ", " ", " " },
                                { " ", " ", " " },
                                { " ", " ", " " },
                                { " ", " ", " " } };

                String[][] periodC = {
                                { " ", " ", " " },
                                { "•", "•", " " },
                                { " ", "•", "•" },
                                { "•", " ", "•" } };

                String[][] exclaimC = {
                                { " ", " ", " " },
                                { "•", "•", " " },
                                { "•", " ", "•" },
                                { " ", "•", "•" } };

                String[][] questionC = {
                                { " ", " ", " " },
                                { "•", " ", "•" },
                                { "•", "•", " " },
                                { " ", "•", "•" } };

                String[][] commaC = {
                                { " ", " ", " " },
                                { "•", " ", "•" },
                                { " ", " ", " " },
                                { "•", " ", "•" } };

                for (int index = 0; index < st.length(); index++) {
                        if (st.substring(index, index + 1).equals(".")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(periodC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("!")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(exclaimC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("?")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(questionC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals(",")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(commaC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("a") || st.substring(index, index + 1).equals("A")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(aC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("b") || st.substring(index, index + 1).equals("B")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(bC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("c") || st.substring(index, index + 1).equals("C")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(cC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("d") || st.substring(index, index + 1).equals("D")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(dC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("e") || st.substring(index, index + 1).equals("E")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(eC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("f") || st.substring(index, index + 1).equals("F")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(fC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("g") || st.substring(index, index + 1).equals("G")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(gC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("h") || st.substring(index, index + 1).equals("H")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(hC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("i") || st.substring(index, index + 1).equals("I")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(iC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("j") || st.substring(index, index + 1).equals("J")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(jC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("k") || st.substring(index, index + 1).equals("K")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(kC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("l") || st.substring(index, index + 1).equals("L")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(lC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("m") || st.substring(index, index + 1).equals("M")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(mC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("n") || st.substring(index, index + 1).equals("N")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(nC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("o") || st.substring(index, index + 1).equals("O")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(oC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("p") || st.substring(index, index + 1).equals("P")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(pC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("q") || st.substring(index, index + 1).equals("Q")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(qC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("r") || st.substring(index, index + 1).equals("R")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(rC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("s") || st.substring(index, index + 1).equals("S")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(sC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("t") || st.substring(index, index + 1).equals("T")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(tC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("u") || st.substring(index, index + 1).equals("U")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(uC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("v") || st.substring(index, index + 1).equals("V")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(vC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("w") || st.substring(index, index + 1).equals("w")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(wC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("x") || st.substring(index, index + 1).equals("x")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(xC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("y") || st.substring(index, index + 1).equals("Y")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(yC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("z") || st.substring(index, index + 1).equals("Z")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(zC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals(" ") || st.substring(index, index + 1).equals(" ")) {
                                for (int row = 0; row < 1; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(spaceC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }
                }

                out.println();
                // second row

                for (int index = 0; index < st.length(); index++) {
                        if (st.substring(index, index + 1).equals(".")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(periodC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("!")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(exclaimC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("?")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(questionC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals(",")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(commaC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("a") || st.substring(index, index + 1).equals("A")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(aC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("b") || st.substring(index, index + 1).equals("B")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(bC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("c") || st.substring(index, index + 1).equals("C")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(cC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("d") || st.substring(index, index + 1).equals("D")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(dC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("e") || st.substring(index, index + 1).equals("E")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(eC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("f") || st.substring(index, index + 1).equals("F")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(fC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("g") || st.substring(index, index + 1).equals("G")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(gC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("h") || st.substring(index, index + 1).equals("H")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(hC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("i") || st.substring(index, index + 1).equals("I")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(iC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("j") || st.substring(index, index + 1).equals("J")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(jC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("k") || st.substring(index, index + 1).equals("K")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(kC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("l") || st.substring(index, index + 1).equals("L")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(lC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("m") || st.substring(index, index + 1).equals("M")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(mC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("n") || st.substring(index, index + 1).equals("N")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(nC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("o") || st.substring(index, index + 1).equals("O")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(oC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("p") || st.substring(index, index + 1).equals("P")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(pC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("q") || st.substring(index, index + 1).equals("Q")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(qC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("r") || st.substring(index, index + 1).equals("R")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(rC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("s") || st.substring(index, index + 1).equals("S")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(sC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("t") || st.substring(index, index + 1).equals("T")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(tC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("u") || st.substring(index, index + 1).equals("U")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(uC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("v") || st.substring(index, index + 1).equals("V")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(vC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("w") || st.substring(index, index + 1).equals("w")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(wC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("x") || st.substring(index, index + 1).equals("x")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(xC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("y") || st.substring(index, index + 1).equals("Y")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(yC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("z") || st.substring(index, index + 1).equals("Z")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(zC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals(" ") || st.substring(index, index + 1).equals(" ")) {
                                for (int row = 1; row < 2; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(spaceC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }
                }

                out.println();
                // third row

                for (int index = 0; index < st.length(); index++) {
                        if (st.substring(index, index + 1).equals(".")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(periodC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("!")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(exclaimC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("?")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(questionC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals(",")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(commaC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("a") || st.substring(index, index + 1).equals("A")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(aC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("b") || st.substring(index, index + 1).equals("B")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(bC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("c") || st.substring(index, index + 1).equals("C")) {
                                for (int row = 2; row < 33; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(cC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("d") || st.substring(index, index + 1).equals("D")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(dC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("e") || st.substring(index, index + 1).equals("E")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(eC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("f") || st.substring(index, index + 1).equals("F")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(fC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("g") || st.substring(index, index + 1).equals("G")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(gC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("h") || st.substring(index, index + 1).equals("H")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(hC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("i") || st.substring(index, index + 1).equals("I")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(iC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("j") || st.substring(index, index + 1).equals("J")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(jC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("k") || st.substring(index, index + 1).equals("K")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(kC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("l") || st.substring(index, index + 1).equals("L")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(lC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("m") || st.substring(index, index + 1).equals("M")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(mC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("n") || st.substring(index, index + 1).equals("N")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(nC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("o") || st.substring(index, index + 1).equals("O")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(oC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("p") || st.substring(index, index + 1).equals("P")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(pC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("q") || st.substring(index, index + 1).equals("Q")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(qC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("r") || st.substring(index, index + 1).equals("R")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(rC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("s") || st.substring(index, index + 1).equals("S")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(sC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("t") || st.substring(index, index + 1).equals("T")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(tC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("u") || st.substring(index, index + 1).equals("U")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(uC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("v") || st.substring(index, index + 1).equals("V")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(vC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("w") || st.substring(index, index + 1).equals("w")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(wC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("x") || st.substring(index, index + 1).equals("x")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(xC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("y") || st.substring(index, index + 1).equals("Y")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(yC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("z") || st.substring(index, index + 1).equals("Z")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(zC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals(" ") || st.substring(index, index + 1).equals(" ")) {
                                for (int row = 2; row < 3; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(spaceC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }
                }

                out.println();

                // fourth row

                for (int index = 0; index < st.length(); index++) {
                        if (st.substring(index, index + 1).equals(".")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(periodC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("!")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(exclaimC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("?")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(questionC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals(",")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(commaC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("a") || st.substring(index, index + 1).equals("A")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(aC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("b") || st.substring(index, index + 1).equals("B")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(bC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("c") || st.substring(index, index + 1).equals("C")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(cC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("d") || st.substring(index, index + 1).equals("D")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(dC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("e") || st.substring(index, index + 1).equals("E")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(eC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("f") || st.substring(index, index + 1).equals("F")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(fC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("g") || st.substring(index, index + 1).equals("G")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(gC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("h") || st.substring(index, index + 1).equals("H")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(hC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("i") || st.substring(index, index + 1).equals("I")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(iC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("j") || st.substring(index, index + 1).equals("J")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(jC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("k") || st.substring(index, index + 1).equals("K")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(kC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("l") || st.substring(index, index + 1).equals("L")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(lC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("m") || st.substring(index, index + 1).equals("M")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(mC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("n") || st.substring(index, index + 1).equals("N")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(nC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("o") || st.substring(index, index + 1).equals("O")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(oC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("p") || st.substring(index, index + 1).equals("P")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(pC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("q") || st.substring(index, index + 1).equals("Q")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(qC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("r") || st.substring(index, index + 1).equals("R")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(rC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("s") || st.substring(index, index + 1).equals("S")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(sC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("t") || st.substring(index, index + 1).equals("T")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(tC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("u") || st.substring(index, index + 1).equals("U")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(uC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("v") || st.substring(index, index + 1).equals("V")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(vC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("w") || st.substring(index, index + 1).equals("w")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(wC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("x") || st.substring(index, index + 1).equals("x")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(xC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("y") || st.substring(index, index + 1).equals("Y")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(yC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals("z") || st.substring(index, index + 1).equals("Z")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(zC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }

                        if (st.substring(index, index + 1).equals(" ") || st.substring(index, index + 1).equals(" ")) {
                                for (int row = 3; row < 4; row++) {
                                        for (int column = 0; column < 3; column++) {
                                                out.print(spaceC[row][column]);
                                                out.print(" ");
                                        }
                                }
                        }
                }

                out.println();
                out.close();
        }
}