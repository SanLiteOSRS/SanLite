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
	@ObfuscatedName("h")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("e")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("m")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("q")
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "898320509"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;B)Lfl;",
		garbageValue = "-5"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lfl;",
		garbageValue = "1"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1); // L: 108
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;IS)Lfl;",
		garbageValue = "228"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1336568457"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 2321
		Login.Login_response2 = var1; // L: 2322
		Login.Login_response3 = var2; // L: 2323
	} // L: 2324

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "81"
	)
	public static String method3447(CharSequence var0) {
		return HealthBar.method2525('*', var0.length()); // L: 218
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2117100344"
	)
	public static boolean method3443() {
		return Client.staffModLevel >= 2; // L: 12692
	}
}
