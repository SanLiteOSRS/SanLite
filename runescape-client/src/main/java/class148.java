import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class148 extends class139 {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -448895225
	)
	static int field1702;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("f")
	String field1706;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lex;)V"
	)
	class148(class142 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;S)V",
		garbageValue = "-5782"
	)
	void vmethod3394(Buffer var1) {
		this.field1706 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)V",
		garbageValue = "-26"
	)
	void vmethod3393(ClanSettings var1) {
		var1.name = this.field1706; // L: 237
	} // L: 238

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lln;IIIZI)V",
		garbageValue = "1410945003"
	)
	public static void method3216(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class290.musicPlayerStatus = 1; // L: 32
		class6.musicTrackArchive = var0; // L: 33
		class20.musicTrackGroupId = var1; // L: 34
		class161.musicTrackFileId = var2; // L: 35
		class290.musicTrackVolume = var3; // L: 36
		class423.musicTrackBoolean = var4; // L: 37
		class203.pcmSampleLength = 10000; // L: 38
	} // L: 39
}
