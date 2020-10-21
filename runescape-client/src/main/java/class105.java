import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class105 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Ljs;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("z")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = 998916811
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Ljg;",
		garbageValue = "-595128316"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
