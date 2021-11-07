import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("i")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("o")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("g")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null;
		this.task = null;
		this.isClosed = false;
		javaVendor = "Unknown";
		GrandExchangeOfferAgeComparator.javaVersion = "1.6";

		try {
			javaVendor = System.getProperty("java.vendor");
			GrandExchangeOfferAgeComparator.javaVersion = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.isClosed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1038367564"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lev;",
		garbageValue = "-1716880810"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task();
		var5.type = var1;
		var5.intArgument = var2;
		var5.objectArgument = var4;
		synchronized(this) {
			if (this.task != null) {
				this.task.next = var5;
				this.task = var5;
			} else {
				this.task = this.current = var5;
			}

			this.notify();
			return var5;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lev;",
		garbageValue = "-137947903"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lev;",
		garbageValue = "-1680555194"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1);
	}

	public final void run() {
		while (true) {
			Task var1;
			synchronized(this) {
				while (true) {
					if (this.isClosed) {
						return;
					}

					if (this.current != null) {
						var1 = this.current;
						this.current = this.current.next;
						if (this.current == null) {
							this.task = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var8) {
					}
				}
			}

			try {
				int var5 = var1.type;
				if (var5 == 1) {
					var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
				} else if (var5 == 2) {
					Thread var3 = new Thread((Runnable)var1.objectArgument);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.intArgument);
					var1.result = var3;
				} else if (var5 == 4) {
					var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
				}

				var1.status = 1;
			} catch (ThreadDeath var6) {
				throw var6;
			} catch (Throwable var7) {
				var1.status = 2;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Lff;",
		garbageValue = "-1590739193"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DirectByteArrayCopier.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!BuddyRankComparator.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				var1.name = "Members object";
				var1.isTradable = false;

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						var1.inventoryActions[var3] = null;
					}
				}

				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = Buffer.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}

					if (!var6) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1243234471"
	)
	public static int method2881(CharSequence var0) {
		return AttackOption.method2304(var0, 10, true);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lko;II)Loe;",
		garbageValue = "1045837880"
	)
	public static IndexedSprite method2882(AbstractArchive var0, int var1) {
		byte[] var3 = var0.takeFileFlat(var1);
		boolean var2;
		if (var3 == null) {
			var2 = false;
		} else {
			Script.SpriteBuffer_decode(var3);
			var2 = true;
		}

		return !var2 ? null : WorldMapArea.method3654();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-753625264"
	)
	public static int[] method2879() {
		int[] var0 = new int[KeyHandler.field135];

		for (int var1 = 0; var1 < KeyHandler.field135; ++var1) {
			var0[var1] = KeyHandler.field127[var1];
		}

		return var0;
	}
}
