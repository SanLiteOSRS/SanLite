import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("aw")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("ay")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("as")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("aj")
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-226500506"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lgu;",
		garbageValue = "1529565884"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lgu;",
		garbageValue = "-907549820"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1); // L: 108
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lgu;",
		garbageValue = "2145317836"
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lmt;III)V",
		garbageValue = "-302173760"
	)
	public static void method3518(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3681; // L: 952
		boolean var4 = var2 != var3.field3563; // L: 953
		var3.field3563 = var2; // L: 954
		if (var4) { // L: 955
			int var5;
			int var10;
			if (var3.field3563 == var1) { // L: 956
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) { // L: 957
					var10 = PlayerComposition.equipmentIndices[var5]; // L: 958
					if (var3.equipment[var10] > 0 && var3.equipment[var10] < 512) { // L: 959
						var3.equipment[var10] = var3.field3566[var10]; // L: 960
					}
				}
			} else {
				label100: {
					if (var3.equipment[0] >= 512) { // L: 966
						boolean var11;
						if (var3.equipment[0] < 512) { // L: 969
							var11 = false; // L: 974
						} else {
							ItemComposition var6 = class125.ItemComposition_get(var3.equipment[0] - 512); // L: 970
							var11 = var6.maleModel1 != class210.field2297.field2292 && var6.maleModel2 != class210.field2297.field2292; // L: 971
						}

						if (!var11) { // L: 976
							break label100;
						}
					}

					var3.equipment[class210.field2297.field2292] = 1; // L: 978
				}

				for (var5 = 0; var5 < 7; ++var5) { // L: 980
					var10 = PlayerComposition.equipmentIndices[var5]; // L: 981
					if (var3.equipment[var10] > 0 && var3.equipment[var10] < 512) { // L: 982
						int[] var7 = var3.equipment; // L: 983

						for (int var8 = 0; var8 < KitDefinition.field1939; ++var8) { // L: 985
							KitDefinition var9 = class132.KitDefinition_get(var8); // L: 986
							if (var9 != null && !var9.nonSelectable && (var2 == 1 ? 7 : 0) + var5 == var9.bodypartID) { // L: 987
								var7[PlayerComposition.equipmentIndices[var5]] = var8 + 256; // L: 988
								break; // L: 989
							}
						}
					}
				}
			}
		}

		var3.method6128(); // L: 997
	} // L: 998
}
