import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("aj")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("al")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -2026807571
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("an")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("ao")
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "23"
	)
	@Export("close")
	public final void close() {
		synchronized(this) { // L: 35
			this.isClosed = true; // L: 36
			this.notifyAll(); // L: 37
		} // L: 38

		try {
			this.thread.join();
		} catch (InterruptedException var3) { // L: 42
		}

	} // L: 43

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lgf;",
		garbageValue = "216202968"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lgf;",
		garbageValue = "2"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1); // L: 108
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lgf;",
		garbageValue = "572645137"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1);
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lct;",
		garbageValue = "-127"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 39
		return var2.getMessage(var1); // L: 40
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "881208565"
	)
	public static void method3460() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 112
			if (ArchiveDiskActionHandler.field4162 != 0) { // L: 113
				ArchiveDiskActionHandler.field4162 = 1; // L: 114

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 116
				} catch (InterruptedException var3) { // L: 118
				}
			}

		}
	} // L: 121

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lfl;",
		garbageValue = "-755195342"
	)
	static class134 method3458(int var0) {
		class134 var3 = (class134)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 360
		class134 var2;
		class134 var4;
		AbstractArchive var5;
		AbstractArchive var6;
		boolean var7;
		byte[] var8;
		int var9;
		byte[] var10;
		if (var3 != null) { // L: 361
			var2 = var3; // L: 362
		} else {
			var5 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 366
			var6 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 367
			var7 = true; // L: 369
			var8 = var5.getFile(var0 >> 16 & 65535, var0 & 65535); // L: 370
			if (var8 == null) { // L: 371
				var7 = false; // L: 372
				var4 = null; // L: 373
			} else {
				var9 = (var8[1] & 255) << 8 | var8[2] & 255; // L: 376
				var10 = var6.getFile(var9, 0); // L: 379
				if (var10 == null) { // L: 380
					var7 = false;
				}

				if (!var7) { // L: 381
					var4 = null; // L: 382
				} else {
					if (UserComparator7.field1413 == null) { // L: 385
						class134.field1573 = Runtime.getRuntime().availableProcessors(); // L: 386
						UserComparator7.field1413 = new ThreadPoolExecutor(0, class134.field1573, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class134.field1573 * 100 + 100), new class181()); // L: 387
					}

					try {
						var4 = new class134(var5, var6, var0, false); // L: 395
					} catch (Exception var13) { // L: 397
						var4 = null; // L: 398
					}
				}
			}

			if (var4 != null) { // L: 402
				SequenceDefinition.SequenceDefinition_cachedModel.put(var4, (long)var0);
			}

			var2 = var4; // L: 403
		}

		int var1;
		if (var2 == null) { // L: 406
			var1 = 2; // L: 407
		} else {
			var1 = var2.method3044() ? 0 : 1; // L: 410
		}

		if (var1 != 0) { // L: 412
			return null; // L: 413
		} else {
			var3 = (class134)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 417
			if (var3 != null) { // L: 418
				var2 = var3; // L: 419
			} else {
				var5 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 423
				var6 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 424
				var7 = true; // L: 426
				var8 = var5.getFile(var0 >> 16 & 65535, var0 & 65535); // L: 427
				if (var8 == null) { // L: 428
					var7 = false; // L: 429
					var4 = null; // L: 430
				} else {
					var9 = (var8[1] & 255) << 8 | var8[2] & 255; // L: 433
					var10 = var6.getFile(var9, 0); // L: 436
					if (var10 == null) { // L: 437
						var7 = false;
					}

					if (!var7) { // L: 438
						var4 = null; // L: 439
					} else {
						if (UserComparator7.field1413 == null) { // L: 442
							class134.field1573 = Runtime.getRuntime().availableProcessors(); // L: 443
							UserComparator7.field1413 = new ThreadPoolExecutor(0, class134.field1573, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class134.field1573 * 100 + 100), new class199()); // L: 444
						}

						try {
							var4 = new class134(var5, var6, var0, false); // L: 452
						} catch (Exception var12) { // L: 454
							var4 = null; // L: 455
						}
					}
				}

				if (var4 != null) { // L: 459
					SequenceDefinition.SequenceDefinition_cachedModel.put(var4, (long)var0);
				}

				var2 = var4; // L: 460
			}

			return var2; // L: 462
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "433390522"
	)
	public static void method3446() {
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 555
	} // L: 556

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1665222999"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class36.getWidgetChild(var0, var1); // L: 9561
		if (var4 != null && var4.onTargetEnter != null) { // L: 9562
			ScriptEvent var5 = new ScriptEvent(); // L: 9563
			var5.widget = var4; // L: 9564
			var5.args = var4.onTargetEnter; // L: 9565
			class9.runScriptEvent(var5); // L: 9566
		}

		Client.selectedSpellItemId = var3; // L: 9568
		Client.isSpellSelected = true; // L: 9569
		class18.selectedSpellWidget = var0; // L: 9570
		Client.selectedSpellChildIndex = var1; // L: 9571
		class90.selectedSpellFlags = var2; // L: 9572
		class69.invalidateWidget(var4); // L: 9573
	} // L: 9574

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1645174054"
	)
	static void method3457(int var0) {
		ViewportMouse.tempMenuAction = new MenuAction(); // L: 11510
		ViewportMouse.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 11511
		ViewportMouse.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 11512
		ViewportMouse.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 11513
		ViewportMouse.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 11514
		ViewportMouse.tempMenuAction.field875 = Client.field628[var0]; // L: 11515
		ViewportMouse.tempMenuAction.field871 = Client.menuActions[var0]; // L: 11516
		ViewportMouse.tempMenuAction.field877 = Client.menuTargets[var0]; // L: 11517
	} // L: 11518
}
