import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lle;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("f")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("b")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "22"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "19"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-2492664"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var2) {
			return ServerPacket.method3740();
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-623024875"
	)
	static final int method2252(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		signature = "([Lht;IIIZI)V",
		garbageValue = "1783989616"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				WorldMapIcon_0.alignWidgetSize(var6, var2, var3, var4);
				FileSystem.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					UserComparator9.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}
