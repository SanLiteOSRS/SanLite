import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		signature = "Lkx;"
	)
	@Export("clanChat")
	static FriendsChatManager clanChat;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -282434447
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)Ler;",
		garbageValue = "-2026237468"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("cb")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel();
		if (var11 != null) {
			this.height = var11.height;
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lic;Lic;B)V",
		garbageValue = "28"
	)
	public static void method3381(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0;
		KitDefinition.KitDefinition_modelsArchive = var1;
		KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
	}
}
