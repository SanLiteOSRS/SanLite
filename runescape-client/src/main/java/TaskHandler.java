import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("ac")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("al")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "[Lun;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("ao")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("ah")
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;B)Lhi;",
		garbageValue = "99"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IS)Lhi;",
		garbageValue = "-20310"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1); // L: 108
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lhi;",
		garbageValue = "-1310826122"
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

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Lnm;III)V",
		garbageValue = "-23690326"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 12019
			if (var0 != null && class275.method5566(var0) != null) { // L: 12020
				Client.clickedWidget = var0; // L: 12021
				Client.clickedWidgetParent = class275.method5566(var0); // L: 12022
				Client.widgetClickX = var1; // L: 12023
				Client.widgetClickY = var2; // L: 12024
				FriendsChatManager.widgetDragDuration = 0; // L: 12025
				Client.isDraggingWidget = false; // L: 12026
				int var3 = AttackOption.method2714(); // L: 12027
				if (var3 != -1) { // L: 12028
					class133.tempMenuAction = new MenuAction(); // L: 12029
					class133.tempMenuAction.param0 = Client.menuArguments1[var3]; // L: 12030
					class133.tempMenuAction.param1 = Client.menuArguments2[var3]; // L: 12031
					class133.tempMenuAction.opcode = Client.menuOpcodes[var3]; // L: 12032
					class133.tempMenuAction.identifier = Client.menuIdentifiers[var3]; // L: 12033
					class133.tempMenuAction.field920 = Client.field671[var3]; // L: 12034
					class133.tempMenuAction.field913 = Client.menuActions[var3]; // L: 12035
					class133.tempMenuAction.field914 = Client.menuTargets[var3]; // L: 12036
				}

			}
		}
	} // L: 12038
}
