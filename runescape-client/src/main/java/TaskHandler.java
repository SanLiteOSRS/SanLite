import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("f")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("o")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lep;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lep;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("b")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("e")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null;
		this.task = null;
		this.isClosed = false;
		javaVendor = "Unknown";
		javaVersion = "1.6";

		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.isClosed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "732898192"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIILjava/lang/Object;I)Lep;",
		garbageValue = "743067634"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;IB)Lep;",
		garbageValue = "-31"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Runnable;IB)Lep;",
		garbageValue = "-100"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1532861557"
	)
	static void method2524() {
		Players.Players_count = 0;

		for (int var0 = 0; var0 < 2048; ++var0) {
			Players.field1352[var0] = null;
			Players.field1351[var0] = 1;
		}

	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "800079546"
	)
	static void method2523() {
		if (class105.field1331 != null) {
			Client.field623 = Client.cycle;
			class105.field1331.method4657();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					class105.field1331.method4656(ItemLayer.baseX * 64 + (Client.players[var0].x >> 7), Tile.baseY * 64 + (Client.players[var0].y >> 7));
				}
			}
		}

	}
}
