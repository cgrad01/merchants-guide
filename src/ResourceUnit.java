public class ResourceUnit extends StatementReader {
    private String statement;

    @Override
    boolean isUnitStatement(String line) {
        statement = line;
        return !statement.endsWith("?") && !isCreditStatement(line);
    }

    @Override
    void setValue() {

    }
}
