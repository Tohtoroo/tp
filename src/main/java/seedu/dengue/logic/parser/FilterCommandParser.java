package seedu.dengue.logic.parser;

import static java.util.Objects.requireNonNull;
import static seedu.dengue.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.dengue.logic.parser.CliSyntax.PREFIX_FILTER;

import seedu.dengue.commons.core.index.Index;
import seedu.dengue.commons.exceptions.IllegalValueException;
import seedu.dengue.logic.commands.FilterCommand;
import seedu.dengue.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new {@code RemarkCommand} object
 */
public class FilterCommandParser implements Parser<FilterCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the {@code RemarkCommand}
     * and returns a {@code RemarkCommand} object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public FilterCommand parse(String args) throws ParseException {
        requireNonNull(args);
        ArgumentMultimap argMultimap = ArgumentTokenizer.tokenize(args, PREFIX_FILTER);

        Index index;
        try {
            index = ParserUtil.parseIndex(argMultimap.getPreamble());
        } catch (IllegalValueException ive) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, FilterCommand.MESSAGE_USAGE), ive);
        }

        String remark = argMultimap.getValue(PREFIX_FILTER).orElse("");

        return new FilterCommand(index, remark);
    }
}