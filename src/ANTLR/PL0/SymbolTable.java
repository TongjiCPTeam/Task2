package ANTLR.PL0;

import java.util.HashMap;
import java.util.Map;

// 符号表类
public class SymbolTable {
	private final Map<String, Kind> entries;

	public SymbolTable() {
		entries = new HashMap<>();
	}

	public void addEntry(String name, Kind kind) {
		entries.put(name, kind);
	}

	public Kind lookup(String name) {
		if (!entries.containsKey(name)) {
			return null;
		}
		return entries.get(name);
	}
}
