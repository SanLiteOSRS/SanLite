import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lex;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -921079377
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(Lkx;I)V",
		garbageValue = "-1864493120"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(Lkx;IB)V",
		garbageValue = "54"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "498467917"
	)
	static boolean method4552() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			}

			return true;
		} else {
			return true;
		}
	}
}
