interface Formatter {
    void format();
}

class PdfFormatter implements Formatter {
    public void format() {
        System.out.println("Formatting as PDF");
    }
}

class CsvFormatter implements Formatter {
    public void format() {
        System.out.println("Formatting as CSV");
    }
}

class ReportGenerator {
    private final Formatter formatter;

    ReportGenerator(Formatter formatter) {
        this.formatter = formatter;
    }

    void generate() {
        formatter.format();
        System.out.println("Report generated");
    }
}

// Simplified module/binder (conceptually similar to Guice's AbstractModule)
class Binder {
    private Class<? extends Formatter> implementation;

    Binder bindFormatter(Class<? extends Formatter> impl) {
        this.implementation = impl;
        return this;
    }

    ReportGenerator createReportGenerator() throws Exception {
        Formatter formatter = implementation.getDeclaredConstructor().newInstance();
        return new ReportGenerator(formatter);
    }
}

public class Exercise04GuiceComparison {
    public static void main(String[] args) throws Exception {
        Binder binder = new Binder();
        binder.bindFormatter(PdfFormatter.class);

        ReportGenerator gen = binder.createReportGenerator();
        gen.generate();

        // Switch implementation
        Binder binder2 = new Binder();
        binder2.bindFormatter(CsvFormatter.class);
        ReportGenerator gen2 = binder2.createReportGenerator();
        gen2.generate();
    }
}
