interface TextProcessor {
    String process(String input);
}

class BaseTextProcessor implements TextProcessor {

    @Override
    public String process(String input) {
        return input;
    }
}

abstract class TextProcessorDecorator implements TextProcessor {

    protected final TextProcessor processor;

    public TextProcessorDecorator(TextProcessor processor) {
        this.processor = processor;
    }

    @Override
    public String process(String input) {
        return processor.process(input);
    }
}

class UpperCaseDecorator extends TextProcessorDecorator {

    public UpperCaseDecorator(TextProcessor processor) {
        super(processor);
    }

    @Override
    public String process(String input) {
        return super.process(input).toUpperCase();
    }
}

class TrimDecorator extends TextProcessorDecorator {

    public TrimDecorator(TextProcessor processor) {
        super(processor);
    }

    @Override
    public String process(String input) {
        return super.process(input).trim();
    }
}

class RemoveExtraSpacesDecorator extends TextProcessorDecorator {

    public RemoveExtraSpacesDecorator(TextProcessor processor) {
        super(processor);
    }

    @Override
    public String process(String input) {
        return super.process(input).replaceAll("\\s+", " ");
    }
}

public class TextProcessorDecoratorDemo {

    public static void main(String[] args) {
        String text = "  Hello    World!   This   is   Java.  ";

        TextProcessor processor = new UpperCaseDecorator(
                new RemoveExtraSpacesDecorator(
                        new TrimDecorator(new BaseTextProcessor())));

        String result = processor.process(text);
        System.out.println("Original: '" + text + "'");
        System.out.println("Processed: '" + result + "'");

        TextProcessor simpleTrim = new TrimDecorator(new BaseTextProcessor());
        System.out.println("Trim only: '" + simpleTrim.process(text) + "'");
    }
}
