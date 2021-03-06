import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = 1859145773
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("n")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("v")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "767065272",
		signature = "(I)V"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "10550",
		signature = "(S)Z"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "0",
		signature = "(B)Ljava/security/SecureRandom;"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var2) {
			return class39.method643();
		}
	}
}
