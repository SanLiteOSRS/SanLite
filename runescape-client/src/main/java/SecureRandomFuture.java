import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("a")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("f")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-625717415"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "366693464"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var2) { // L: 30
			return class9.method74(); // L: 31
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[Lcj;",
		garbageValue = "-12"
	)
	static class86[] method2104() {
		return new class86[]{class86.field1068, class86.field1075, class86.field1067, class86.field1070, class86.field1069}; // L: 16
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lay;I)V",
		garbageValue = "-473917535"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 270
		if (var0.sound != null) { // L: 271
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 272
		}

	} // L: 273

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-740882914"
	)
	static Object method2108(int var0) {
		return class203.method4050((class453)DecorativeObject.findEnumerated(class453.method8268(), var0)); // L: 5124
	}
}
