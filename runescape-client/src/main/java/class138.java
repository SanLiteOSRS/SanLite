import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
class class138 implements Callable {
	@ObfuscatedName("we")
	@Export("foundItemIds")
	static short[] foundItemIds;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	final class139 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lfh;"
	)
	final class131[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfk;II[Lfh;)V"
	)
	class138(class139 var1, int var2, int var3, class131[] var4) {
		this.this$0 = var1; // L: 97
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) { // L: 100
			this.val$curveLoadJobs[var1].call(); // L: 101
		}

		return null; // L: 103
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;Lom;I)V",
		garbageValue = "1994646383"
	)
	public static void method3079(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		class295.SequenceDefinition_archive = var0;
		SequenceDefinition.SequenceDefinition_animationsArchive = var1;
		SequenceDefinition.SequenceDefinition_skeletonsArchive = var2; // L: 53
	} // L: 54

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1830136563"
	)
	public static void method3081(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0; // L: 51
	} // L: 52

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1629606373"
	)
	static int method3083() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1444
			int var0 = 0; // L: 1445

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1446
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1447
			}

			return var0 * 10000 / Client.field819; // L: 1449
		} else {
			return 10000;
		}
	}
}
