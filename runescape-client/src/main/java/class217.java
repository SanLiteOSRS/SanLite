import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
public class class217 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 338729147
	)
	@Export("clientType")
	public static int clientType;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "0",
		signature = "(Lig;B)V"
	)
	public static void method4154(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-2092030193",
		signature = "(Ljava/lang/CharSequence;I)I"
	)
	@Export("parseInt")
	public static int parseInt(CharSequence var0) {
		return LoginScreenAnimation.parseIntCustomRadix(var0, 10, true);
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		garbageValue = "2062536839",
		signature = "(Liy;Ljava/lang/String;I)V"
	)
	static void method4155(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field934 += var2.groupCount;
	}
}
