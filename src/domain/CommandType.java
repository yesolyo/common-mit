package domain;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public enum CommandType {
	LIST {
		@Override
		public List<Map<String, Object>> doTask(String directoryPath) {
			List<Map<String, Object>> ret = new ArrayList<>();
			File[] files = new File(directoryPath).listFiles();

			for (File file : Objects.requireNonNull(files)) {
				try {
					if (file.isFile()) {
						ret.add(Map.of(file.getName(), Files.size(file.toPath())));
						continue;
					}
					if (file.isDirectory()) {
						ret.addAll(doTask(file.getPath()));
					}
				} catch (IOException e) {
					throw new IllegalArgumentException("[ERROR] 잘못된 경로를 입력했습니다.");
				}
			}
			return ret;
		}
	}, HASH {
		@Override
		public List<Map<String, Object>> doTask(String directoryPath) {
			return null;
		}
	}, ZLIB {
		@Override
		public List<Map<String, Object>> doTask(String directoryPath) {
			return null;
		}
	};

	public abstract List<Map<String, Object>> doTask(String directoryPath);

	public static CommandType of(String command) {
		return switch (command) {
			case "list" -> LIST;
			case "hash" -> HASH;
			case "zlib" -> ZLIB;
			default -> throw new IllegalArgumentException("[ERROR] 명령어는 [list, hash, zlib] 중 하나여야 합니다.");
		};
	}
}
