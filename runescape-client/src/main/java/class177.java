import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public abstract class class177 {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("s")
	String field1903;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfs;Ljava/lang/String;)V"
	)
	class177(class166 var1, String var2) {
		this.this$0 = var1; // L: 345
		this.field1903 = var2; // L: 346
	} // L: 347

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "1024"
	)
	public abstract int vmethod3537();

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1616244476"
	)
	public String vmethod3540() {
		return null; // L: 356
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "64"
	)
	public int vmethod3539() {
		return -1; // L: 360
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "10"
	)
	public String method3535() {
		return this.field1903; // L: 350
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1253975547"
	)
	public static void method3538() {
		class290.midiPcmStream.clear(); // L: 42
		class290.musicPlayerStatus = 1; // L: 43
		class6.musicTrackArchive = null; // L: 44
	} // L: 45
}
