package domain;

public enum CommandType {
	LIST, HASH, ZLIB;

	public static CommandType of(String command) {
		return switch (command) {
			case "list" -> LIST;
			case "hash" -> HASH;
			case "zlib" -> ZLIB;
			default -> throw new IllegalArgumentException("[ERROR] 명령어는 [list, hash, zlib] 중 하나여야 합니다.");
		};
	}
}
