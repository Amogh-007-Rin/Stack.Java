public class Exercise3 {
    public static void main(String[] args) {
        String[][] data = {
            {"Name", "Age", "City"},
            {"Alice", "30", "New York"},
            {"Bob", "25", "London"},
            {"Charlie", "35", "Tokyo"}
        };

        StringBuilder sb = new StringBuilder();
        sb.append("<table>\n");

        for (String[] row : data) {
            sb.append("  <tr>\n");
            for (String cell : row) {
                sb.append("    <td>").append(cell).append("</td>\n");
            }
            sb.append("  </tr>\n");
        }

        sb.append("</table>");

        System.out.println(sb.toString());
    }
}
