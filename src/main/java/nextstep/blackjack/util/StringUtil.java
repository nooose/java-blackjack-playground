package nextstep.blackjack.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtil {

    public static final String SPLIT_DELIMITER = ",";

    public static List<String> parsingPlayerNames(String names) {
        return Arrays.stream(names.split(SPLIT_DELIMITER))
                .map(String::trim)
                .collect(Collectors.toList());
    }
}
