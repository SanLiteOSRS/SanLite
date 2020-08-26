import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("z")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("k")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1936171902"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "11"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(S)Ljava/security/SecureRandom;",
		garbageValue = "2000"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var2) {
			return BoundaryObject.method3387();
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-531384694"
	)
	public static void method2225(int var0) {
		if (var0 != -1) {
			if (Bounds.Widget_loadedInterfaces[var0]) {
				Widget.Widget_archive.clearFilesGroup(var0);
				if (Widget.Widget_interfaceComponents[var0] != null) {
					boolean var1 = true;

					for (int var2 = 0; var2 < Widget.Widget_interfaceComponents[var0].length; ++var2) {
						if (Widget.Widget_interfaceComponents[var0][var2] != null) {
							if (Widget.Widget_interfaceComponents[var0][var2].type != 2) {
								Widget.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false;
							}
						}
					}

					if (var1) {
						Widget.Widget_interfaceComponents[var0] = null;
					}

					Bounds.Widget_loadedInterfaces[var0] = false;
				}
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "116037374"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-1418698978"
	)
	static void method2211(int var0, int var1) {
		class2.method39(TaskHandler.tempMenuAction, var0, var1);
		TaskHandler.tempMenuAction = null;
	}
}
