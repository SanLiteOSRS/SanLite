import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ff")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("o")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("q")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1971059873
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("c")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("w")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null; // L: 11
		this.task = null; // L: 12
		this.isClosed = false; // L: 14
		javaVendor = "Unknown"; // L: 20
		javaVersion = "1.6"; // L: 21

		try {
			javaVendor = System.getProperty("java.vendor"); // L: 23
			javaVersion = System.getProperty("java.version"); // L: 24
		} catch (Exception var2) { // L: 26
		}

		this.isClosed = false; // L: 27
		this.thread = new Thread(this); // L: 28
		this.thread.setPriority(10); // L: 29
		this.thread.setDaemon(true); // L: 30
		this.thread.start(); // L: 31
	} // L: 32

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1663558948"
	)
	@Export("close")
	public final void close() {
		synchronized(this) { // L: 35
			this.isClosed = true; // L: 36
			this.notifyAll(); // L: 37
		} // L: 38

		try {
			this.thread.join(); // L: 40
		} catch (InterruptedException var3) { // L: 42
		}

	} // L: 43

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lfz;",
		garbageValue = "2040134052"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task(); // L: 90
		var5.type = var1; // L: 91
		var5.intArgument = var2; // L: 92
		var5.objectArgument = var4; // L: 93
		synchronized(this) { // L: 94
			if (this.task != null) { // L: 95
				this.task.next = var5; // L: 96
				this.task = var5; // L: 97
			} else {
				this.task = this.current = var5; // L: 100
			}

			this.notify(); // L: 102
			return var5; // L: 104
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lfz;",
		garbageValue = "-1762952522"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1); // L: 108
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lfz;",
		garbageValue = "-212575664"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1); // L: 112
	}

	public final void run() {
		while (true) {
			Task var1;
			synchronized(this) { // L: 48
				while (true) {
					if (this.isClosed) { // L: 50
						return;
					}

					if (this.current != null) { // L: 51
						var1 = this.current; // L: 52
						this.current = this.current.next; // L: 53
						if (this.current == null) { // L: 54
							this.task = null;
						}
						break;
					}

					try {
						this.wait(); // L: 58
					} catch (InterruptedException var8) { // L: 60
					}
				}
			}

			try {
				int var5 = var1.type; // L: 64
				if (var5 == 1) { // L: 65
					var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument); // L: 66
				} else if (var5 == 2) { // L: 68
					Thread var3 = new Thread((Runnable)var1.objectArgument); // L: 69
					var3.setDaemon(true); // L: 70
					var3.start(); // L: 71
					var3.setPriority(var1.intArgument); // L: 72
					var1.result = var3; // L: 73
				} else if (var5 == 4) { // L: 75
					var1.result = new DataInputStream(((URL)var1.objectArgument).openStream()); // L: 76
				}

				var1.status = 1; // L: 78
			} catch (ThreadDeath var6) { // L: 80
				throw var6; // L: 81
			} catch (Throwable var7) { // L: 83
				var1.status = 2; // L: 84
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "784335958"
	)
	static int method3253(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget; // L: 1140
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1141
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.scrollX; // L: 1142
			return 1; // L: 1143
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1145
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.scrollY; // L: 1146
			return 1; // L: 1147
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1149
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.text; // L: 1150
			return 1; // L: 1151
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1153
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1154
			return 1; // L: 1155
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1157
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1158
			return 1; // L: 1159
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1161
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1162
			return 1; // L: 1163
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1165
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1166
			return 1; // L: 1167
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1169
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1170
			return 1; // L: 1171
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1173
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1174
			return 1; // L: 1175
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1177
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1178
			return 1; // L: 1179
		} else if (var0 == 1610) { // L: 1181
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1182
			return 1; // L: 1183
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1185
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.color; // L: 1186
			return 1; // L: 1187
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1189
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.color2; // L: 1190
			return 1; // L: 1191
		} else if (var0 == 1613) { // L: 1193
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1194
			return 1; // L: 1195
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1197
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1198
			return 1; // L: 1199
		} else if (var0 != 1615 && var0 != 1616) { // L: 1201
			return 2; // L: 1205
		} else {
			++Interpreter_intStackSize; // L: 1202
			return 1; // L: 1203
		}
	}
}
