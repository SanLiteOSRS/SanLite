import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = 1501018991
	)
	static int field985;
	@ObfuscatedName("aa")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	static GameBuild field984;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1984155091
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 756623687
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lkd;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "897874246"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method5270(var1) || this.archive.method5269(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Lef;",
		garbageValue = "-1421588196"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-67"
	)
	static void method2056(int var0) {
		Client.oculusOrbState = var0;
	}
}
