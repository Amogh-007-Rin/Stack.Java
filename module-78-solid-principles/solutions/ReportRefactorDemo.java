import java.util.List;
import java.util.Map;

class ReportData {

    private final String title;
    private final List<String> entries;

    public ReportData(String title, List<String> entries) {
        this.title = title;
        this.entries = entries;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getEntries() {
        return entries;
    }
}

class HtmlFormatter {

    public String format(ReportData data) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><title>").append(data.getTitle()).append("</title></head><body>");
        sb.append("<h1>").append(data.getTitle()).append("</h1><ul>");
        for (String entry : data.getEntries()) {
            sb.append("<li>").append(entry).append("</li>");
        }
        sb.append("</ul></body></html>");
        return sb.toString();
    }
}

class FileSaver {

    public void save(String filename, String content) {
        System.out.println("Saving to file: " + filename);
        System.out.println("Content:\n" + content);
    }
}

public class ReportRefactorDemo {

    public static void main(String[] args) {
        ReportData data = new ReportData("Monthly Sales",
                List.of("January: $10,000", "February: $12,000", "March: $15,000"));

        HtmlFormatter formatter = new HtmlFormatter();
        String html = formatter.format(data);

        FileSaver saver = new FileSaver();
        saver.save("sales_report.html", html);
    }
}
