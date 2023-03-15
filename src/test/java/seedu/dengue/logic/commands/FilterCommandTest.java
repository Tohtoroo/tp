package seedu.dengue.logic.commands;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static seedu.dengue.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.dengue.testutil.TypicalPersons.getTypicalDengueHotspotTracker;

import org.junit.jupiter.api.Test;

import seedu.dengue.model.Model;
import seedu.dengue.model.ModelManager;
import seedu.dengue.model.UserPrefs;

/**
 * Contains integration tests (interaction with the Model) and unit tests for FilterCommand.
 */
public class FilterCommandTest {

    private Model model = new ModelManager(getTypicalDengueHotspotTracker(), new UserPrefs());

    @Test
    public void execute() {
        //assertCommandFailure(new FilterCommand(), model, );

    }
}