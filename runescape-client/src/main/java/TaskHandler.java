import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("a")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("f")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("r")
	public static short[] field1780;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("h")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("j")
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lfy;",
		garbageValue = "-1390753324"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task(); // L: 90
		var5.type = var1;
		var5.intArgument = var2;
		var5.objectArgument = var4;
		synchronized(this) {
			if (this.task != null) { // L: 95
				this.task.next = var5; // L: 96
				this.task = var5;
			} else {
				this.task = this.current = var5;
			}

			this.notify();
			return var5;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lfy;",
		garbageValue = "1"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lfy;",
		garbageValue = "-24807431"
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
				throw var6;
			} catch (Throwable var7) {
				var1.status = 2;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqk;B)V",
		garbageValue = "85"
	)
	static final void method3340(PacketBuffer var0) {
		int var1 = 0; // L: 81
		var0.importIndex(); // L: 82

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 83
			var5 = Players.Players_indices[var2]; // L: 84
			if ((Players.field1323[var5] & 1) == 0) { // L: 85
				if (var1 > 0) { // L: 86
					--var1; // L: 87
					var10000 = Players.field1323; // L: 88
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1); // L: 91
					if (var4 == 0) { // L: 92
						var1 = Interpreter.method2005(var0); // L: 93
						var10000 = Players.field1323; // L: 94
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						class71.readPlayerUpdate(var0, var5); // L: 97
					}
				}
			}
		}

		var0.exportIndex(); // L: 100
		if (var1 != 0) { // L: 101
			throw new RuntimeException(); // L: 102
		} else {
			var0.importIndex(); // L: 104

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 105
				var5 = Players.Players_indices[var2]; // L: 106
				if ((Players.field1323[var5] & 1) != 0) { // L: 107
					if (var1 > 0) { // L: 108
						--var1; // L: 109
						var10000 = Players.field1323; // L: 110
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1); // L: 113
						if (var4 == 0) { // L: 114
							var1 = Interpreter.method2005(var0); // L: 115
							var10000 = Players.field1323; // L: 116
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							class71.readPlayerUpdate(var0, var5); // L: 119
						}
					}
				}
			}

			var0.exportIndex(); // L: 122
			if (var1 != 0) { // L: 123
				throw new RuntimeException(); // L: 124
			} else {
				var0.importIndex(); // L: 126

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 127
					var5 = Players.Players_emptyIndices[var2]; // L: 128
					if ((Players.field1323[var5] & 1) != 0) { // L: 129
						if (var1 > 0) { // L: 130
							--var1; // L: 131
							var10000 = Players.field1323; // L: 132
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1); // L: 135
							if (var4 == 0) { // L: 136
								var1 = Interpreter.method2005(var0); // L: 137
								var10000 = Players.field1323; // L: 138
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (class412.updateExternalPlayer(var0, var5)) { // L: 141
								var10000 = Players.field1323;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 144
				if (var1 != 0) { // L: 145
					throw new RuntimeException(); // L: 146
				} else {
					var0.importIndex(); // L: 148

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 149
						var5 = Players.Players_emptyIndices[var2]; // L: 150
						if ((Players.field1323[var5] & 1) == 0) { // L: 151
							if (var1 > 0) { // L: 152
								--var1; // L: 153
								var10000 = Players.field1323; // L: 154
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1); // L: 157
								if (var4 == 0) { // L: 158
									var1 = Interpreter.method2005(var0); // L: 159
									var10000 = Players.field1323; // L: 160
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (class412.updateExternalPlayer(var0, var5)) { // L: 163
									var10000 = Players.field1323;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 166
					if (var1 != 0) { // L: 167
						throw new RuntimeException(); // L: 168
					} else {
						Players.Players_count = 0; // L: 170
						Players.Players_emptyIdxCount = 0; // L: 171

						for (var2 = 1; var2 < 2048; ++var2) { // L: 172
							var10000 = Players.field1323; // L: 173
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 174
							if (var3 != null) { // L: 175
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 176
							}
						}

					}
				}
			}
		}
	} // L: 178
}
