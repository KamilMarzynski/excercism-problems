class SqueakyClean {
    static String clean(String identifier) {
        String response = removeWhitespace(identifier);
        response = kebabCaseToCamelCase(response);
        response = removeLeetSpeak(response);
        response = removeNonLetters(response);
        return response;
    }

    private static String removeWhitespace(String identifier) {
        return identifier.replaceAll(" ", "_");
    }

    private static String kebabCaseToCamelCase(String identifier) {
        String[] words = identifier.split("-");
        StringBuilder camelCase = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            camelCase.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1));
        }
        return camelCase.toString();
    }

    private static String removeLeetSpeak(String identifier) {
        return identifier.replaceAll("1", "l").replaceAll("3", "e").replaceAll("0", "o").replaceAll("7", "t")
                .replaceAll("4", "a");
    }

    private static String removeNonLetters(String identifier) {
        return identifier.replaceAll("[^a-zA-Z_]", "");
    }
}
