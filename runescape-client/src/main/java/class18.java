import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
class class18 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	final class10 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ll;)V"
	)
	class18(class10 var1) {
		this.this$0 = var1; // L: 50
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I",
		garbageValue = "-16"
	)
	int method261(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 52
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 60
	}

	public int compare(Object var1, Object var2) {
		return this.method261((Entry)var1, (Entry)var2); // L: 56
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-827032220"
	)
	public static void method267() {
		class37.reflectionChecks = new IterableNodeDeque(); // L: 24
	} // L: 25

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Llg;IIIZB)V",
		garbageValue = "55"
	)
	public static void method266(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class283.musicPlayerStatus = 1; // L: 34
		DevicePcmPlayerProvider.musicTrackArchive = var0; // L: 35
		class283.musicTrackGroupId = var1; // L: 36
		class283.musicTrackFileId = var2; // L: 37
		Messages.musicTrackVolume = var3; // L: 38
		GrandExchangeEvents.musicTrackBoolean = var4; // L: 39
		class19.pcmSampleLength = 10000; // L: 40
	} // L: 41

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method268() {
		NPCComposition.NpcDefinition_cached.clear(); // L: 291
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 292
	} // L: 293
}
