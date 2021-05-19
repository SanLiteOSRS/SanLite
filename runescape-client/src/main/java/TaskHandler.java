import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("h")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("c")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 458627189
	)
	static int field1466;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("l")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("z")
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "92"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lek;",
		garbageValue = "684176071"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lek;",
		garbageValue = "-33"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lek;",
		garbageValue = "523573283"
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

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-822022696"
	)
	static void method2515(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) {
			if ((long)var0 == (var1.key >> 48 & 65535L)) {
				var1.remove();
			}
		}

	}
}
