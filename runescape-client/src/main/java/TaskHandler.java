import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("aw")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("ay")
	public static String field2320;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("ar")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("as")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null; // L: 11
		this.task = null; // L: 12
		this.isClosed = false;
		GrandExchangeOfferUnitPriceComparator.javaVendor = "Unknown";
		javaVersion = "1.6";

		try {
			GrandExchangeOfferUnitPriceComparator.javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.isClosed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "208627683"
	)
	@Export("close")
	public final void close() {
		synchronized(this) {
			this.isClosed = true;
			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;B)Lii;",
		garbageValue = "-56"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lii;",
		garbageValue = "197291801"
	)
	public final Task method4189(String var1, int var2) {
		return this.newTask(1, var2, 0, var1); // L: 108
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;IB)Lii;",
		garbageValue = "64"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1); // L: 112
	}

	public final void run() {
		while (true) {
			Task var1;
			synchronized(this) {
				while (true) {
					if (this.isClosed) { // L: 50
						return;
					}

					if (this.current != null) { // L: 51
						var1 = this.current; // L: 52
						this.current = this.current.next; // L: 53
						if (this.current == null) {
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
					var3.setPriority(var1.intArgument);
					var1.result = var3;
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;Ljava/lang/String;S)I",
		garbageValue = "10333"
	)
	public static int method4203(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 14
		int var4 = var1.length(); // L: 17
		byte[] var5 = new byte[var4]; // L: 18

		for (int var6 = 0; var6 < var4; ++var6) { // L: 19
			char var7 = var1.charAt(var6); // L: 20
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 21
				var5[var6] = (byte)var7;
			} else if (var7 == 8364) { // L: 22
				var5[var6] = -128;
			} else if (var7 == 8218) { // L: 23
				var5[var6] = -126;
			} else if (var7 == 402) { // L: 24
				var5[var6] = -125;
			} else if (var7 == 8222) { // L: 25
				var5[var6] = -124;
			} else if (var7 == 8230) { // L: 26
				var5[var6] = -123;
			} else if (var7 == 8224) {
				var5[var6] = -122; // L: 27
			} else if (var7 == 8225) { // L: 28
				var5[var6] = -121;
			} else if (var7 == 710) { // L: 29
				var5[var6] = -120;
			} else if (var7 == 8240) { // L: 30
				var5[var6] = -119;
			} else if (var7 == 352) { // L: 31
				var5[var6] = -118;
			} else if (var7 == 8249) { // L: 32
				var5[var6] = -117;
			} else if (var7 == 338) { // L: 33
				var5[var6] = -116;
			} else if (var7 == 381) { // L: 34
				var5[var6] = -114;
			} else if (var7 == 8216) { // L: 35
				var5[var6] = -111;
			} else if (var7 == 8217) { // L: 36
				var5[var6] = -110;
			} else if (var7 == 8220) { // L: 37
				var5[var6] = -109;
			} else if (var7 == 8221) { // L: 38
				var5[var6] = -108;
			} else if (var7 == 8226) { // L: 39
				var5[var6] = -107;
			} else if (var7 == 8211) { // L: 40
				var5[var6] = -106;
			} else if (var7 == 8212) { // L: 41
				var5[var6] = -105;
			} else if (var7 == 732) { // L: 42
				var5[var6] = -104;
			} else if (var7 == 8482) { // L: 43
				var5[var6] = -103;
			} else if (var7 == 353) { // L: 44
				var5[var6] = -102;
			} else if (var7 == 8250) { // L: 45
				var5[var6] = -101;
			} else if (var7 == 339) { // L: 46
				var5[var6] = -100;
			} else if (var7 == 382) { // L: 47
				var5[var6] = -98;
			} else if (var7 == 376) { // L: 48
				var5[var6] = -97;
			} else {
				var5[var6] = 63; // L: 49
			}
		}

		var0.writeSmartByteShort(var5.length); // L: 54
		var0.offset += class405.huffman.compress(var5, 0, var5.length, var0.array, var0.offset); // L: 55
		return var0.offset - var2; // L: 56
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1490202891"
	)
	public static void method4204() {
		Arrays.fill(Varps.Varps_temp, 0); // L: 72
		Arrays.fill(Varps.Varps_main, 0); // L: 73
	} // L: 74

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1925726734"
	)
	static final void method4199(int var0) {
		if (ArchiveLoader.field1070.method6437(var0)) { // L: 12262
			Widget[] var1 = ArchiveLoader.field1070.field3633[var0]; // L: 12263

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12264
				Widget var3 = var1[var2]; // L: 12265
				if (var3 != null) { // L: 12266
					var3.modelFrame = 0; // L: 12267
					var3.modelFrameCycle = 0; // L: 12268
				}
			}

		}
	} // L: 12270
}
